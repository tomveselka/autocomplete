package com.tomveselka.autocomplete.companies.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.tomveselka.autocomplete.addresses.entities.AddressEntity;

@Entity
@Table(name = "number_of_employees_579")
public class NumberOfEmplyEntity {
	
	@Column(name = "KODJAZ")
	private String kodjaz;
	
	@Column(name = "AKRCIS")
	private String akrcis;
	
	@Column(name = "KODCIS")
	private String kodcis;
	
	@Id
	@Column(name = "CHODNOTA")
	private String chodnota;
	
	@Column(name = "ZKRTEXT")
	private String zkrtext;
	
	@Column(name = "TEXT")
	private String text;
	
	@Column(name = "ADMPLOD")
	private String admplod;
	
	@Column(name = "ADMNEPO")
	private String admnepo;

	
	@OneToMany (mappedBy = "employeeEntity")
	List<CompanyEntity> companyEntity;
	
	public String getKodjaz() {
		return kodjaz;
	}

	public void setKodjaz(String kodjaz) {
		this.kodjaz = kodjaz;
	}

	public String getAkrcis() {
		return akrcis;
	}

	public void setAkrcis(String akrcis) {
		this.akrcis = akrcis;
	}

	public String getKodcis() {
		return kodcis;
	}

	public void setKodcis(String kodcis) {
		this.kodcis = kodcis;
	}

	public String getChodnota() {
		return chodnota;
	}

	public void setChodnota(String chodnota) {
		this.chodnota = chodnota;
	}

	public String getZkrtext() {
		return zkrtext;
	}

	public void setZkrtext(String zkrtext) {
		this.zkrtext = zkrtext;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getAdmplod() {
		return admplod;
	}

	public void setAdmplod(String admplod) {
		this.admplod = admplod;
	}

	public String getAdmnepo() {
		return admnepo;
	}

	public void setAdmnepo(String admnepo) {
		this.admnepo = admnepo;
	}

	@Override
	public String toString() {
		return "NumberOfEmplyEntity [kodjaz=" + kodjaz + ", akrcis=" + akrcis + ", kodcis=" + kodcis + ", chodnota="
				+ chodnota + ", zkrtext=" + zkrtext + ", text=" + text + ", admplod=" + admplod + ", admnepo=" + admnepo
				+ "]";
	}
}
