package com.tomveselka.autocomplete.companies.other;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.tomveselka.autocomplete.companies.services.PrepareCompanyList;

@SpringBootTest
public class CompaniesTests {

	@Autowired
	PrepareCompanyList prepComp;
	
	/*
	@Test
	public void testCompanyPreparation() {
		System.out.println(prepComp.prepareNumberOfEmpl("130"));
	}*/
}
