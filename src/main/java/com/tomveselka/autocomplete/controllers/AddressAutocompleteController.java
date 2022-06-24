package com.tomveselka.autocomplete.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tomveselka.autocomplete.addresses.entities.ObecEntity;
import com.tomveselka.autocomplete.addresses.services.PrepareObecListService;
import com.tomveselka.autocomplete.dto.ObecDictionaryObject;
import com.tomveselka.autocomplete.repository.ObecRepository;

@Controller
@RequestMapping("address_autocomplete")
public class AddressAutocompleteController {

	@Autowired
	ObecRepository obecRepo;

	@Autowired
	PrepareObecListService listPreparationObec;

	@GetMapping(value = "/obec")
	@ResponseBody
	public List<ObecDictionaryObject> getObecList(@RequestParam(value = "obecInput", required = false, defaultValue = "")String obecInput) {
		System.out.println("Received request with input "+obecInput);
		List<ObecEntity> obecEntityList = obecRepo.findByNazevIgnoreCaseStartsWith(obecInput);
		List<ObecDictionaryObject> dictList = listPreparationObec.prepareList(obecEntityList);
		System.out.println("List of found obce:");
		for(ObecDictionaryObject object: dictList) {
			System.out.println(object.getNazevDisplay()+" "+object.getNazev()+" "+object.getKod());
		}
		System.out.println("Returning back");
		return dictList;
	}
}
