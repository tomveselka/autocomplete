package com.tomveselka.autocomplete.repository;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import com.tomveselka.autocomplete.addresses.entities.StreetEntity;

public interface StreetRepository extends PagingAndSortingRepository<StreetEntity, String>{
	StreetEntity findByKod(String code);

	@Query(value="SELECT * FROM street s WHERE (lower(s.NAZEV) LIKE lower(concat(:nazevUlice,'%')) AND (s.OBEC_KOD=:obecKod))", nativeQuery=true)
	List<StreetEntity> findByNazevAndObecKod(@Param("nazevUlice")String nazevUlice,@Param("obecKod") String obecKod);

}
