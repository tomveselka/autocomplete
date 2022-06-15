package com.tomveselka.autocomplete.addresses.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "okres")
public class OkresEntity {

	@Id
	@Column(name = "Kód")
	private String kod;
	
	@Column(name = "Název_Okresu")
	private String nazevOkresu;
	
	@Column(name = "Kód_Kraje_VÚSC")
	private String kodKrajeVUSC;
	
	@Column(name = "Název_Kraje_VÚSC")
	private String nazevKrajeVUSC;

	@Override
	public String toString() {
		return "OkresEntity [kod=" + kod + ", nazevOkresu=" + nazevOkresu + ", kodKrajeVUSC=" + kodKrajeVUSC
				+ ", nazevKrajeVUSC=" + nazevKrajeVUSC + "]";
	}

	public String getKod() {
		return kod;
	}

	public void setKod(String kod) {
		this.kod = kod;
	}

	public String getNazevOkresu() {
		return nazevOkresu;
	}

	public void setNazevOkresu(String nazevOkresu) {
		this.nazevOkresu = nazevOkresu;
	}

	public String getKodKrajeVUSC() {
		return kodKrajeVUSC;
	}

	public void setKodKrajeVUSC(String kodKrajeVUSC) {
		this.kodKrajeVUSC = kodKrajeVUSC;
	}

	public String getNazevKrajeVUSC() {
		return nazevKrajeVUSC;
	}

	public void setNazevKrajeVUSC(String nazevKrajeVUSC) {
		this.nazevKrajeVUSC = nazevKrajeVUSC;
	}
}
