package com.tomveselka.autocomplete.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.tomveselka.autocomplete.addresses.entities.KrajEntity;

public interface KrajRepository extends PagingAndSortingRepository<KrajEntity, String>{
	KrajEntity findByKod(String code);
}
