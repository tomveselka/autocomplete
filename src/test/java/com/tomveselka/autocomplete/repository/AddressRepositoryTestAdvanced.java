package com.tomveselka.autocomplete.repository;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.tomveselka.autocomplete.addresses.entities.AddressEntity;
import com.tomveselka.autocomplete.addresses.entities.ObecEntity;
import com.tomveselka.autocomplete.addresses.entities.StreetEntity;

@SpringBootTest
public class AddressRepositoryTestAdvanced {


	@Autowired
	ObecRepository obecRepo;
	
	@Autowired
	StreetRepository streetRepo;
	
	@Autowired
	AddressRepository addressRepo;
	
	@Test
	public void getObecStartsWith() {
		String kod = "Pra";
		List<ObecEntity> obecEntityList = obecRepo.findByNazevIgnoreCaseStartsWith(kod);
		for (ObecEntity entity : obecEntityList) {
			System.out.println(entity.getNazev()+" "+entity.getKod());
		}
		assertTrue(obecEntityList.size()>0);
	}
		
	@Test
	public void getStreetStartsWithAndKod() {
		String nazev = "Per";
		//Praha
		String kod = "554782";
		List<StreetEntity> streetEntities = streetRepo.findByNazevAndObecKod(nazev, kod);
		//List<StreetEntity> streetEntities = streetRepo.findByNazevAndObecKod(nazev, kod);
		for (StreetEntity entity : streetEntities) {
			System.out.println(entity.getNazev()+" "+entity.getKod());
		}
		assertTrue(streetEntities.size()>0);
	}
	
	@Test
	public void getAdresniMisto() {
		//Praha
		String obecKod = "554782";
		//Pernerova
		String uliceKod = "463906";
		//Cislo
		String cislo = "42";
		List<AddressEntity> addressEntities = addressRepo.findByNazevAndObecKod(obecKod, uliceKod, cislo);
		for (AddressEntity entity : addressEntities) {
			System.out.println(entity.getKodADM());
		}
		assertTrue(addressEntities.size()>0);
	}
	
	
}
