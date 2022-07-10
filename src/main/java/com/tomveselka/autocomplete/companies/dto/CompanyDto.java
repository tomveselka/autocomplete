package com.tomveselka.autocomplete.companies.dto;

public class CompanyDto {
	private String name;
	private String ico;
	private String dateOfCreation;
	private String dateOfEnding;
	private String companyForm;
	private String numberOfEmpl;
	private String sector;
	private String city;
	private String street;
	private String houseNumber;
	private String zipCode;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIco() {
		return ico;
	}
	public void setIco(String ico) {
		this.ico = ico;
	}
	public String getDateOfCreation() {
		return dateOfCreation;
	}
	public void setDateOfCreation(String dateOfCreation) {
		this.dateOfCreation = dateOfCreation;
	}
	public String getDateOfEnding() {
		return dateOfEnding;
	}
	public void setDateOfEnding(String dateOfEnding) {
		this.dateOfEnding = dateOfEnding;
	}
	public String getCompanyForm() {
		return companyForm;
	}
	public void setCompanyForm(String companyForm) {
		this.companyForm = companyForm;
	}
	public String getSector() {
		return sector;
	}
	public void setSector(String sector) {
		this.sector = sector;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getHouseNumber() {
		return houseNumber;
	}
	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public String getNumberOfEmpl() {
		return numberOfEmpl;
	}
	public void setNumberOfEmpl(String numberOfEmpl) {
		this.numberOfEmpl = numberOfEmpl;
	}
	@Override
	public String toString() {
		return "CompanyDto [name=" + name + ", ico=" + ico + ", dateOfCreation=" + dateOfCreation + ", dateOfEnding="
				+ dateOfEnding + ", companyForm=" + companyForm + ", numberOfEmpl=" + numberOfEmpl + ", sector="
				+ sector + ", city=" + city + ", street=" + street + ", houseNumber=" + houseNumber + ", zipCode="
				+ zipCode + "]";
	}

}
