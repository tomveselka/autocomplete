package com.tomveselka.autocomplete.companies.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import com.tomveselka.autocomplete.companies.entities.NaceEntity;

public interface NaceRepository extends PagingAndSortingRepository <NaceEntity, String>{
	NaceEntity findByChodnota (String chodnota);
}
