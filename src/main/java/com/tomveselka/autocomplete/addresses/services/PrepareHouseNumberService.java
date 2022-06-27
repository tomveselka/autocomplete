package com.tomveselka.autocomplete.addresses.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tomveselka.autocomplete.addresses.entities.AddressEntity;
import com.tomveselka.autocomplete.addresses.entities.StreetEntity;
import com.tomveselka.autocomplete.dto.HouseDictionaryObject;
import com.tomveselka.autocomplete.repository.AddressRepository;

@Service
public class PrepareHouseNumberService {

	@Autowired
	AddressRepository addressRepo;
	
	public List<HouseDictionaryObject> prepareList (List<AddressEntity> addressList){
		List<HouseDictionaryObject> dictionaryList = new ArrayList<HouseDictionaryObject>();
		for (AddressEntity entity : addressList) {
			//could have used mapper, but for those few fields felt like overkill
			HouseDictionaryObject object = new HouseDictionaryObject();
			object.setCisloDomovni(entity.getCisloDomovni());
			object.setCisloOrientacni(entity.getCisloOrientacni());
			object.setZnakCislaOrientacniho(entity.getZnakCislaOrientacniho());
			object.setKodADM(entity.getKodADM());
			object.setZipCode(entity.getPsc());
			
			StringBuilder str = new StringBuilder();
			str.append(entity.getCisloDomovni());
			if (entity.getCisloOrientacni() != null && !entity.getCisloOrientacni().isBlank()) {
				str.append("/"+entity.getCisloOrientacni());
			}
			if(entity.getZnakCislaOrientacniho() != null && !entity.getZnakCislaOrientacniho().isBlank()) {
				str.append(entity.getZnakCislaOrientacniho());
			}
			String cisloDisplay=str.toString();
			object.setCisloDisplay(cisloDisplay);
			
			dictionaryList.add(object);
		}
		return dictionaryList;
	}
}
