package com.tomveselka.autocomplete.companies.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.tomveselka.autocomplete.companies.entities.CompanyFormEntity;

public interface CompanyFormRepository extends PagingAndSortingRepository <CompanyFormEntity, String>{
	CompanyFormEntity findByChodnota (String chodnota);
}
