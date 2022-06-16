package com.tomveselka.autocomplete.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.tomveselka.autocomplete.addresses.entities.AddressEntity;
import com.tomveselka.autocomplete.dto.AddressSearchResultObject;

public interface AddressRepository extends PagingAndSortingRepository<AddressEntity, String> {
	
	AddressEntity findByKodADM (String kodADM);
	

}
