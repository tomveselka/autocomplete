package com.tomveselka.autocomplete.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tomveselka.autocomplete.companies.dto.CompanyDto;
import com.tomveselka.autocomplete.companies.entities.CompanyEntity;
import com.tomveselka.autocomplete.companies.repositories.CompanyRepository;
import com.tomveselka.autocomplete.companies.services.PrepareCompanyList;

@Controller
@RequestMapping("company_autocomplete")
public class CompaniesAutocompleteController {
	
	@Autowired
	CompanyRepository companyRepo;
	
	@Autowired
	PrepareCompanyList prepList;
	
	@GetMapping(value = "/name")
	@ResponseBody
	public List<CompanyDto> getCompanyListByName(
			@RequestParam(value = "companyName", required = false, defaultValue = "") String name){
			System.out.println("Received request with name="+name);
			List<CompanyEntity> entityList = companyRepo.findByFirmaIgnoreCaseStartsWith(name);
			System.out.println("List of found companies");
			for (CompanyEntity entity:entityList) {
				System.out.println(entity.getFirma());
			}
			List<CompanyDto> dto = prepList.prepareCompanyData(entityList);
		return dto;
	}
	
	@GetMapping(value = "/ico")
	@ResponseBody
	public List<CompanyDto> getCompanyListByIco(
			@RequestParam(value = "companyIco", required = false, defaultValue = "") String ico){
			System.out.println("Received request with ico="+ico);
			List<CompanyEntity> entityList = companyRepo.findByIcoIgnoreCaseStartsWith(ico);
			System.out.println("List of found companies");
			for (CompanyEntity entity:entityList) {
				System.out.println(entity.getFirma());
			}
			List<CompanyDto> dto = prepList.prepareCompanyData(entityList);
		return dto;
	}
			
}
