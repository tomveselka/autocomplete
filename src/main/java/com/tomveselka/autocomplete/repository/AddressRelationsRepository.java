package com.tomveselka.autocomplete.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.tomveselka.autocomplete.addresses.entities.AddressRelationsEntity;


public interface AddressRelationsRepository extends PagingAndSortingRepository<AddressRelationsEntity, String>{
	AddressRelationsEntity findByAdmKod(String codeADM);
}
