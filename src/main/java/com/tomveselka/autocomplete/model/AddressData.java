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
	private StreetEntity street;
	private HouseDictionaryObject house;
	
	private String obecName;
	private String obecNameDisplay;
	private String obecKod;
	private String streetName;
	private String streetKod;
	private String houseNumber;
	private String zipCode;
	private String kodADM;
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
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getHouseNumber() {
		return houseNumber;
	}
	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}
	public String getKodADM() {
		return kodADM;
	}
	public void setKodADM(String kodADM) {
		this.kodADM = kodADM;
	}
	public String getStreetKod() {
		return streetKod;
	}
	public void setStreetKod(String streetKod) {
		this.streetKod = streetKod;
	}
	
	
}
