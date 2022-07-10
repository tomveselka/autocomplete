package com.tomveselka.autocomplete.companies.entities;

import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "dict_149_form_ros")
public class CompanyFormEntity {
	
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
	
	@Basic
	@Column(name = "ADMPLOD")
	private java.sql.Date admplod;
	
	@Basic
	@Column(name = "ADMNEPO")
	private java.sql.Date admnepo;

	@OneToMany (mappedBy = "formEntity")
	List<CompanyEntity> companyEntity;
	
	@Override
	public String toString() {
		return "CompanyFormEntity [kodjaz=" + kodjaz + ", akrcis=" + akrcis + ", kodcis=" + kodcis + ", chodnota="
				+ chodnota + ", zkrtext=" + zkrtext + ", text=" + text + ", admplod=" + admplod + ", admnepo=" + admnepo
				+ "]";
	}

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

	public java.sql.Date getAdmplod() {
		return admplod;
	}

	public void setAdmplod(java.sql.Date admplod) {
		this.admplod = admplod;
	}

	public java.sql.Date getAdmnepo() {
		return admnepo;
	}

	public void setAdmnepo(java.sql.Date admnepo) {
		this.admnepo = admnepo;
	}
}
