package com.tomveselka.autocomplete.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.tomveselka.autocomplete.addresses.entities.StreetEntity;

public interface StreetRepository extends PagingAndSortingRepository<StreetEntity, String>{
	StreetEntity findByKod(String code);

}
