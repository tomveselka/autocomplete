package com.tomveselka.autocomplete.repository;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.tomveselka.autocomplete.addresses.entities.AddressEntity;
import com.tomveselka.autocomplete.addresses.entities.AddressRelationsEntity;
import com.tomveselka.autocomplete.addresses.entities.KrajEntity;
import com.tomveselka.autocomplete.addresses.entities.ObecEntity;
import com.tomveselka.autocomplete.addresses.entities.OkresEntity;
import com.tomveselka.autocomplete.addresses.entities.StreetEntity;

@SpringBootTest
public class AddressRepositoryTestBasic {

	@Autowired
	AddressRepository addressRepo;

	@Autowired
	OkresRepository okresRepo;

	@Autowired
	KrajRepository krajRepo;
	
	@Autowired
	AddressRelationsRepository relationsRepo;

	@Autowired
	StreetRepository streetRepo;
	
	@Autowired
	ObecRepository obecRepo;
	
	@Test
	public void getAddressEntityByKodADMNotNull() {
		// code for Pernerova 691/42
		String code = "77976096";
		AddressEntity entity = addressRepo.findByKodADM(code);
		System.out.println(entity.toString());
		assertNotNull(entity);
	}

	@Test
	public void getOkresEntityNotNull() {
		String okresCode = "3100";
		OkresEntity okresEntity = okresRepo.findByKod(okresCode);
		assertNotNull(okresEntity);
	}

	@Test
	public void getKrajNotNull() {
		String krajCode = "19";
		KrajEntity krajEntity = krajRepo.findByKod(krajCode);
		assertNotNull(krajEntity);
	}
	
	@Test
	public void getRelationInfoNotNull() {
		String admCode = "8668922";
		AddressRelationsEntity relationsEntity = relationsRepo.findByAdmKod(admCode);
		System.out.println(relationsEntity.toString());
		assertNotNull(relationsEntity);
	}
	
	@Test
	public void getObecInfoNotNull() {
		String kod = "598925";
		ObecEntity obecEntity = obecRepo.findByKod(kod);
		System.out.println(obecEntity.toString());
		assertNotNull(obecEntity);
	}
	
	@Test
	public void getStreetInfoNotNull() {
		String kod = "7064";
		StreetEntity streetEntity = streetRepo.findByKod(kod);
		System.out.println(streetEntity.toString());
		assertNotNull(streetEntity);
	}

}
