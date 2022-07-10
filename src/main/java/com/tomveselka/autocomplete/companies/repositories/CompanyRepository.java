package com.tomveselka.autocomplete.companies.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import com.tomveselka.autocomplete.companies.entities.CompanyEntity;

public interface CompanyRepository extends PagingAndSortingRepository<CompanyEntity, String>{
	List<CompanyEntity >findByIcoIgnoreCaseStartsWith (String ico);
	List<CompanyEntity> findByFirmaIgnoreCaseStartsWith (String name);
	
	/*
	@Query(value="SELECT * FROM res_data s WHERE (lower(s.FIRMA) LIKE lower(concat(:firma,'%')) OR (s.ICO LIKE lower(concat(:ico,'%')))", nativeQuery=true)
	List<CompanyEntity> findByNameOrIco (@Param("firma")String name, @Param("ico")String ico);
	*/
}
