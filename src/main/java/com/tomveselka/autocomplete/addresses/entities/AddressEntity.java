package com.tomveselka.autocomplete.addresses.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.OneToOne;
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

}
