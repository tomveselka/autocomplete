package com.tomveselka.autocomplete.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.tomveselka.autocomplete.addresses.entities.ObecEntity;


public interface ObecRepository extends PagingAndSortingRepository<ObecEntity, String>{
	ObecEntity findByKod(String code);

}
