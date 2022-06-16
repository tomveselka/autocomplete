package com.tomveselka.autocomplete.addresses.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "street")
public class StreetEntity {

	@Id
	@Column(name = "KOD")
	private String kod;
	
	@Column(name = "NAZEV")
	private String nazev;
	
	@Column(name = "OBEC_KOD")
	private String obecKod;
	
	@Column(name = "PLATI_OD")
	private String platiOd;
	
	@Column(name = "PLATI_DO")
	private String platiDo;
	
	public String getKod() {
		return kod;
	}

	public void setKod(String kod) {
		this.kod = kod;
	}

	public String getNazev() {
		return nazev;
	}

	public void setNazev(String nazev) {
		this.nazev = nazev;
	}

	public String getObecKod() {
		return obecKod;
	}

	public void setObecKod(String obecKod) {
		this.obecKod = obecKod;
	}

	public String getPlatiOd() {
		return platiOd;
	}

	public void setPlatiOd(String platiOd) {
		this.platiOd = platiOd;
	}

	public String getPlatiDo() {
		return platiDo;
	}

	public void setPlatiDo(String platiDo) {
		this.platiDo = platiDo;
	}

	@Override
	public String toString() {
		return "StreetEntity [kod=" + kod + ", nazev=" + nazev + ", obecKod=" + obecKod + ", platiOd=" + platiOd
				+ ", platiDo=" + platiDo + "]";
	}


}
