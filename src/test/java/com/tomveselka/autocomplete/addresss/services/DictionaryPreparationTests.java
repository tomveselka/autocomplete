package com.tomveselka.autocomplete.addresss.services;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.tomveselka.autocomplete.addresses.entities.AddressEntity;
import com.tomveselka.autocomplete.addresses.entities.ObecEntity;
import com.tomveselka.autocomplete.addresses.services.PrepareHouseNumberService;
import com.tomveselka.autocomplete.addresses.services.PrepareObecListService;
import com.tomveselka.autocomplete.dto.HouseDictionaryObject;
import com.tomveselka.autocomplete.dto.ObecDictionaryObject;
import com.tomveselka.autocomplete.repository.AddressRepository;
import com.tomveselka.autocomplete.repository.ObecRepository;

@SpringBootTest
public class DictionaryPreparationTests {

	@Autowired
	ObecRepository obecRepo;
	
	@Autowired
	PrepareObecListService listPreparation;
	
	@Autowired
	AddressRepository addressRepo;
	
	@Autowired
	PrepareHouseNumberService listPreparationHouse;
	
	@Test
	public void prepareListOfObec() {
		List<ObecEntity> entityList = obecRepo.findByNazevIgnoreCaseStartsWith("Hoř");
		System.out.println("Retrieved entities, number: "+entityList.size());
		List<ObecDictionaryObject> dictList = listPreparation.prepareList(entityList);
		System.out.println("Retrieved dictionary, number: "+entityList.size());
		for (ObecDictionaryObject dictObject : dictList) {
			System.out.println(dictObject.getNazevDisplay());
		}
		assertNotNull(dictList);
	}
	
	@Test
	public void preapareListOfHouse() {
		//Praha
		String obecKod = "554782";
		//Pernerova
		String uliceKod = "463906";
		//Cislo
		String cislo = "4";
		List<AddressEntity> addressEntities = addressRepo.findByNazevAndObecKodAndStreetKod(obecKod, uliceKod, cislo);
		List<HouseDictionaryObject> dictList =  listPreparationHouse.prepareList(addressEntities);
		for (HouseDictionaryObject object : dictList) {
			System.out.println(
					object.getCisloDomovni() + " " + object.getCisloOrientacni() + " " + object.getZnakCislaOrientacniho() + " " +object.getCisloDisplay());
		}
		assertTrue(addressEntities.size()>0);
	}
}
