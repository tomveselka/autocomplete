package com.tomveselka.autocomplete.addresses.services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tomveselka.autocomplete.addresses.entities.ObecEntity;
import com.tomveselka.autocomplete.addresses.entities.OkresEntity;
import com.tomveselka.autocomplete.dto.ObecDictionaryObject;
import com.tomveselka.autocomplete.repository.OkresRepository;

@Service
public class PrepareObecListService {

	@Autowired
	OkresRepository okresRepo;
	
	public List<ObecDictionaryObject> prepareList(List<ObecEntity> obecList){
		List<String> obecNames = new ArrayList<String>();
		for (ObecEntity entity:obecList) {
			obecNames.add(entity.getNazev());
		}
		
		List<ObecDictionaryObject> dictionaryList = new ArrayList<ObecDictionaryObject>();
		for (ObecEntity entity:obecList) {
			ObecDictionaryObject dictObj = new ObecDictionaryObject();
			dictObj.setKod(entity.getKod());
			dictObj.setNazev(entity.getNazev());
			int occurrences = Collections.frequency(obecNames, entity.getNazev());
			//if name exists only once, no need to specify
			if (occurrences == 1) {
				dictObj.setNazevDisplay(entity.getNazev());
			}
			//if multiple same named cities exist, add Okres
			else {
				OkresEntity okresEntity = okresRepo.findByKod(entity.getOkresKod());
				dictObj.setNazevDisplay(entity.getNazev()+" ("+okresEntity.getNazevOkresu()+")");
			}
			dictionaryList.add(dictObj);
		}
		
		
		return dictionaryList;
	}
}
