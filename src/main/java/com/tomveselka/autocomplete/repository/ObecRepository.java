package com.tomveselka.autocomplete.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import com.tomveselka.autocomplete.addresses.entities.ObecEntity;


public interface ObecRepository extends PagingAndSortingRepository<ObecEntity, String>{
	ObecEntity findByKod(String code);
	//https://www.baeldung.com/spring-jpa-like-queries
	List<ObecEntity> findByNazevIgnoreCaseStartsWith (String nazevObce);
	/*
	@Query("select p from ObecEntity o where lower(o.nazev) like lower(concat(:nazevObce,'%'))")
	List<ObecEntity> findByNazev(@Param ("nazevObce") String nazevObce);
	*/
}
