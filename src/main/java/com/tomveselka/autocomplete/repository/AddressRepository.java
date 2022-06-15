package com.tomveselka.autocomplete.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.tomveselka.autocomplete.addresses.entities.AddressEntity;

public interface AddressRepository extends PagingAndSortingRepository<AddressEntity, String> {

	AddressEntity findByKodADM (String kodADM);
	
}
