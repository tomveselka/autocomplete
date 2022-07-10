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

import lombok.ToString;

@Entity
@Table(name = "dict_nace")
public class NaceEntity {


	@Column(name = "KODJAZ")
	private String kojaz;
	
	@Column(name = "AKRCIS")
	private String akrcis;
	
	@Column(name = "KODCIS")
	private String kodcis;
	
	@Column(name = "UROVEN")
	private String uroven;
	
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
	
	@Column(name = "NADVAZ")
	private String nadvaz;

	/*
	@OneToMany (mappedBy = "naceEntity")
	List<CompanyEntity> companyEntity;
	*/
	public String getKojaz() {
		return kojaz;
	}

	public void setKojaz(String kojaz) {
		this.kojaz = kojaz;
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

	public String getUroven() {
		return uroven;
	}

	public void setUroven(String uroven) {
		this.uroven = uroven;
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

	public String getNadvaz() {
		return nadvaz;
	}

	public void setNadvaz(String nadvaz) {
		this.nadvaz = nadvaz;
	}

	@Override
	public String toString() {
		return "NaceEntity [kojaz=" + kojaz + ", akrcis=" + akrcis + ", kodcis=" + kodcis + ", uroven=" + uroven
				+ ", chodnota=" + chodnota + ", zkrtext=" + zkrtext + ", text=" + text + ", admplod=" + admplod
				+ ", admnepo=" + admnepo + ", nadvaz=" + nadvaz + "]";
	}

}
