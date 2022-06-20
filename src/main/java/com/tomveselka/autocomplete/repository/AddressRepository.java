package com.tomveselka.autocomplete.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import com.tomveselka.autocomplete.addresses.entities.AddressEntity;
import com.tomveselka.autocomplete.addresses.entities.StreetEntity;
import com.tomveselka.autocomplete.dto.ObecDictionaryObject;

public interface AddressRepository extends PagingAndSortingRepository<AddressEntity, String> {
	
	AddressEntity findByKodADM (String kodADM);
	
	@Query(value="SELECT * FROM adresni_mista a WHERE (a.Kod_obce = :obecKod) AND (a.Kod_ulice = :streetKod) AND ((a.Cislo_domovni LIKE concat(:cislo,'%')) OR (a.Cislo_orientacni LIKE concat(:cislo,'%')))", nativeQuery=true)
	List<AddressEntity> findByNazevAndObecKod(@Param("obecKod") String obecKod,@Param("streetKod") String streetKod, @Param("cislo")String cislo);

}
