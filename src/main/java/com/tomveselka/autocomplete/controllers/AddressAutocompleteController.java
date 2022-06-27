package com.tomveselka.autocomplete.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tomveselka.autocomplete.addresses.entities.AddressEntity;
import com.tomveselka.autocomplete.addresses.entities.ObecEntity;
import com.tomveselka.autocomplete.addresses.entities.StreetEntity;
import com.tomveselka.autocomplete.addresses.services.PrepareHouseNumberService;
import com.tomveselka.autocomplete.addresses.services.PrepareObecListService;
import com.tomveselka.autocomplete.dto.HouseDictionaryObject;
import com.tomveselka.autocomplete.dto.ObecDictionaryObject;
import com.tomveselka.autocomplete.repository.AddressRepository;
import com.tomveselka.autocomplete.repository.ObecRepository;
import com.tomveselka.autocomplete.repository.StreetRepository;

@Controller
@RequestMapping("address_autocomplete")
public class AddressAutocompleteController {

	@Autowired
	ObecRepository obecRepo;

	@Autowired
	StreetRepository streetRepo;

	@Autowired
	AddressRepository addressRepo;
	
	@Autowired
	PrepareObecListService listPreparationObec;

	@Autowired
	PrepareHouseNumberService listPreparationHouse;
	
	@GetMapping(value = "/obec")
	@ResponseBody
	public List<ObecDictionaryObject> getObecList(
			@RequestParam(value = "obecInput", required = false, defaultValue = "") String obecInput) {
		System.out.println("Received request for obec with input " + obecInput);
		List<ObecEntity> obecEntityList = obecRepo.findByNazevIgnoreCaseStartsWith(obecInput);
		List<ObecDictionaryObject> dictList = listPreparationObec.prepareList(obecEntityList);
		System.out.println("List of found obce:");
		for (ObecDictionaryObject object : dictList) {
			System.out.println(object.getNazevDisplay() + " " + object.getNazev() + " " + object.getKod());
		}
		System.out.println("Returning back");
		return dictList;
	}

	@GetMapping(value = "/street")
	@ResponseBody
	public List<StreetEntity> getStreetList(
			@RequestParam(value = "obecKod", required = false, defaultValue = "") String obecKod,
			@RequestParam(value = "streetInput", required = false, defaultValue = "") String streetInput) {
		System.out.println("Received request for street with input obeckod " + obecKod + " streetInput " + streetInput);
		if (obecKod == null || obecKod.isBlank()) {
			return null;
		}
		List<StreetEntity> streetEntityList = streetRepo.findByNazevAndObecKod(streetInput, obecKod);

		for (StreetEntity entity : streetEntityList) {
			System.out.println(entity.getNazev() + " " + entity.getKod());
		}
		System.out.println("Returning back");
		return streetEntityList;
	}

	@GetMapping(value = "/house")
	@ResponseBody
	public List<HouseDictionaryObject> getHouseNumberList(
			@RequestParam(value = "obecKod", required = false, defaultValue = "") String obecKod,
			@RequestParam(value = "streetKod", required = false, defaultValue = "") String streetKod,
			@RequestParam(value = "numberInput", required = false, defaultValue = "") String numberInput) {
		System.out.println("Received request for street with input obeckod " + obecKod + " streetkod " + streetKod
				+ " numberInput " + numberInput);
		if (obecKod == null || obecKod.isBlank()) {
			return null;
		}
		if (streetKod == null || streetKod.isBlank()) {
			return null;
		}
		List<AddressEntity> addressEntityList = addressRepo.findByNazevAndObecKodAndStreetKod(obecKod, streetKod, numberInput);
		List<HouseDictionaryObject> dictList = listPreparationHouse.prepareList(addressEntityList);
		
		for (HouseDictionaryObject object : dictList) {
			System.out.println(object.getCisloDisplay()+ " "+object.getZipCode()+" "+object.getKodADM());
		}
		System.out.println("Returning back");
		
		return dictList;
	}
}
