package com.tomveselka.autocomplete.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.tomveselka.autocomplete.addresses.entities.OkresEntity;

public interface OkresRepository extends PagingAndSortingRepository<OkresEntity, String>{
	OkresEntity findByKod(String code);
}
