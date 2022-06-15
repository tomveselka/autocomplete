package com.tomveselka.autocomplete.addresses.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "adresni_mista")
public class AddressEntity {

	@Id
	@Column(name = "Kod_ADM")
	private String kodADM;
	
	@Column(name = "Kod_obce")
	private String kodObce;
	
	@Column(name = "Nazev_obce")
	private String nazevObce;
	
	@Column(name = "Kod_MOMC")
	private String kodMOMC;
	
	@Column(name = "Nazev_MOMC")
	private String nazevMOMC;
	
	@Column(name = "Kod_obvodu_Prahy")
	private String kodObvoduPrahy;
	
	@Column(name = "Nazev_obvodu_Prahy")
	private String nazevObvoduPrahy;
	
	@Column(name = "Kod_casti_obce")
	private String kodCastiObce;
	
	@Column(name = "Nazev_casti_obce")
	private String nazevCastiObce;
	
	@Column(name = "Kod_ulice")
	private String kodUlice;
	
	@Column(name = "Nazev_ulice")
	private String nazevUlice;
	
	@Column(name = "Typ_SO")
	private String typSO;
	
	@Column(name = "Cislo_domovni")
	private String cisloDomovni;
	
	@Column(name = "Cislo_orientacni")
	private String cisloOrientacni;
	
	@Column(name = "Znak_cisla_orientacniho")
	private String znakCislaOrientacniho;
	
	@Column(name = "PSC")
	private String psc;
	
	@Column(name = "Souradnice_Y")
	private String souradniceY;
	
	@Column(name = "Souradnice_X")
	private String souradniceX;
	
	@Column(name = "Plati_Od")
	private String platiOd;

	@Override
	public String toString() {
		return "AddressEntity [kodADM=" + kodADM + ", kodObce=" + kodObce + ", nazevObce=" + nazevObce + ", kodMOMC="
				+ kodMOMC + ", nazevMOMC=" + nazevMOMC + ", kodObvoduPrahy=" + kodObvoduPrahy + ", nazevObvoduPrahy="
				+ nazevObvoduPrahy + ", kodCastiObce=" + kodCastiObce + ", nazevCastiObce=" + nazevCastiObce
				+ ", kodUlice=" + kodUlice + ", nazevUlice=" + nazevUlice + ", typSO=" + typSO + ", cisloDomovni="
				+ cisloDomovni + ", cisloOrientacni=" + cisloOrientacni + ", znakCislaOrientacniho="
				+ znakCislaOrientacniho + ", psc=" + psc + ", souradniceY=" + souradniceY + ", souradniceX="
				+ souradniceX + ", platiOd=" + platiOd + "]";
	}

	public String getKodADM() {
		return kodADM;
	}

	public void setKodADM(String kodADM) {
		this.kodADM = kodADM;
	}

	public String getKodObce() {
		return kodObce;
	}

	public void setKodObce(String kodObce) {
		this.kodObce = kodObce;
	}

	public String getNazevObce() {
		return nazevObce;
	}

	public void setNazevObce(String nazevObce) {
		this.nazevObce = nazevObce;
	}

	public String getKodMOMC() {
		return kodMOMC;
	}

	public void setKodMOMC(String kodMOMC) {
		this.kodMOMC = kodMOMC;
	}

	public String getNazevMOMC() {
		return nazevMOMC;
	}

	public void setNazevMOMC(String nazevMOMC) {
		this.nazevMOMC = nazevMOMC;
	}

	public String getKodObvoduPrahy() {
		return kodObvoduPrahy;
	}

	public void setKodObvoduPrahy(String kodObvoduPrahy) {
		this.kodObvoduPrahy = kodObvoduPrahy;
	}

	public String getNazevObvoduPrahy() {
		return nazevObvoduPrahy;
	}

	public void setNazevObvoduPrahy(String nazevObvoduPrahy) {
		this.nazevObvoduPrahy = nazevObvoduPrahy;
	}

	public String getKodCastiObce() {
		return kodCastiObce;
	}

	public void setKodCastiObce(String kodCastiObce) {
		this.kodCastiObce = kodCastiObce;
	}

	public String getNazevCastiObce() {
		return nazevCastiObce;
	}

	public void setNazevCastiObce(String nazevCastiObce) {
		this.nazevCastiObce = nazevCastiObce;
	}

	public String getKodUlice() {
		return kodUlice;
	}

	public void setKodUlice(String kodUlice) {
		this.kodUlice = kodUlice;
	}

	public String getNazevUlice() {
		return nazevUlice;
	}

	public void setNazevUlice(String nazevUlice) {
		this.nazevUlice = nazevUlice;
	}

	public String getTypSO() {
		return typSO;
	}

	public void setTypSO(String typSO) {
		this.typSO = typSO;
	}

	public String getCisloDomovni() {
		return cisloDomovni;
	}

	public void setCisloDomovni(String cisloDomovni) {
		this.cisloDomovni = cisloDomovni;
	}

	public String getCisloOrientacni() {
		return cisloOrientacni;
	}

	public void setCisloOrientacni(String cisloOrientacni) {
		this.cisloOrientacni = cisloOrientacni;
	}

	public String getZnakCislaOrientacniho() {
		return znakCislaOrientacniho;
	}

	public void setZnakCislaOrientacniho(String znakCislaOrientacniho) {
		this.znakCislaOrientacniho = znakCislaOrientacniho;
	}

	public String getPsc() {
		return psc;
	}

	public void setPsc(String psc) {
		this.psc = psc;
	}

	public String getSouradniceY() {
		return souradniceY;
	}

	public void setSouradniceY(String souradniceY) {
		this.souradniceY = souradniceY;
	}

	public String getSouradniceX() {
		return souradniceX;
	}

	public void setSouradniceX(String souradniceX) {
		this.souradniceX = souradniceX;
	}

	public String getPlatiOd() {
		return platiOd;
	}

	public void setPlatiOd(String platiOd) {
		this.platiOd = platiOd;
	}

}
