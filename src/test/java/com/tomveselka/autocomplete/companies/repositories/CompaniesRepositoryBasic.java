package com.tomveselka.autocomplete.companies.repositories;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.tomveselka.autocomplete.companies.entities.CompanyEntity;
import com.tomveselka.autocomplete.companies.entities.CompanyFormEntity;
import com.tomveselka.autocomplete.companies.entities.NaceEntity;


@SpringBootTest
public class CompaniesRepositoryBasic {

	@Autowired
	CompanyRepository companyRepo;
	
	@Autowired
	CompanyFormRepository formRepo;
	
	@Autowired
	NaceRepository naceRepo;
	
	@Test
	public void getCompanyByIco() {
		// Škoda auto
		String ico = "00177041";
		List<CompanyEntity> entityList = companyRepo.findByIcoIgnoreCaseStartsWith(ico);
		assertTrue(entityList.size()>0);
	}
	
	@Test
	public void getCompanyFormByChodnota() {
		// s.r.o.
		String chodnota = "112";
		CompanyFormEntity entity = formRepo.findByChodnota(chodnota);
		System.out.println(entity.toString());
		assertNotNull(entity);
	}
	
	@Test
	public void getNaceByChodnota() {
		// Obchod s automobily a jinými lehkými motorovými vozidly
		String chodnota = "45110";
		NaceEntity entity = naceRepo.findByChodnota(chodnota);
		System.out.println(entity.toString());
		assertNotNull(entity);
	}
}
