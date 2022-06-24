package com.tomveselka.autocomplete.model;

import com.tomveselka.autocomplete.addresses.entities.AddressEntity;
import com.tomveselka.autocomplete.addresses.entities.ObecEntity;
import com.tomveselka.autocomplete.addresses.entities.StreetEntity;
import com.tomveselka.autocomplete.dto.HouseDictionaryObject;
import com.tomveselka.autocomplete.dto.ObecDictionaryObject;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class AddressData {

	private ObecDictionaryObject obec;
	private String obecName;
	private String obecNameDisplay;
	private String obecKod;
	private StreetEntity street;
	private HouseDictionaryObject house;
	private String zipCode;
	public ObecDictionaryObject getObec() {
		return obec;
	}
	public void setObec(ObecDictionaryObject obec) {
		this.obec = obec;
	}
	public StreetEntity getStreet() {
		return street;
	}
	public void setStreet(StreetEntity street) {
		this.street = street;
	}
	public HouseDictionaryObject getHouse() {
		return house;
	}
	public void setHouse(HouseDictionaryObject house) {
		this.house = house;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public String getObecName() {
		return obecName;
	}
	public void setObecName(String obecName) {
		this.obecName = obecName;
	}
	public String getObecNameDisplay() {
		return obecNameDisplay;
	}
	public void setObecNameDisplay(String obecNameDisplay) {
		this.obecNameDisplay = obecNameDisplay;
	}
	public String getObecKod() {
		return obecKod;
	}
	public void setObecKod(String obecKod) {
		this.obecKod = obecKod;
	}
	
	
}
