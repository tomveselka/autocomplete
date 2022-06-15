package com.tomveselka.autocomplete.addresses.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "kraj")
public class KrajEntity {
	
	@Id
	@Column(name = "Kód")
	private String kod;
	
	@Column(name = "Název_Kraje_VÚSC")
	private String nazevKrajeVUSC;
	
	@Column(name = "Kód_Regionu_soudržnosti")
	private String kodRegionuSoudrznosti;
	
	@Column(name = "Název_Regionu_soudržnosti")
	private String nazevRegionuSoudrznosti;

	@Override
	public String toString() {
		return "KrajEntity [kod=" + kod + ", nazevKrajeVUSC=" + nazevKrajeVUSC + ", kodRegionuSoudrznosti="
				+ kodRegionuSoudrznosti + ", nazevRegionuSoudrznosti=" + nazevRegionuSoudrznosti + "]";
	}

	public String getKod() {
		return kod;
	}

	public void setKod(String kod) {
		this.kod = kod;
	}

	public String getNazevKrajeVUSC() {
		return nazevKrajeVUSC;
	}

	public void setNazevKrajeVUSC(String nazevKrajeVUSC) {
		this.nazevKrajeVUSC = nazevKrajeVUSC;
	}

	public String getKodRegionuSoudrznosti() {
		return kodRegionuSoudrznosti;
	}

	public void setKodRegionuSoudrznosti(String kodRegionuSoudrznosti) {
		this.kodRegionuSoudrznosti = kodRegionuSoudrznosti;
	}

	public String getNazevRegionuSoudrznosti() {
		return nazevRegionuSoudrznosti;
	}

	public void setNazevRegionuSoudrznosti(String nazevRegionuSoudrznosti) {
		this.nazevRegionuSoudrznosti = nazevRegionuSoudrznosti;
	}

}
