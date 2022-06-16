package com.tomveselka.autocomplete.addresses.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "obec")
public class ObecEntity {

	@Id
	@Column(name = "KOD")
	private String kod;
	
	@Column(name = "NAZEV")
	private String nazev;
	
	@Column(name = "STATUS_KOD")
	private String statusKod;
	
	@Column(name = "POU_KOD")
	private String pouKod;
	
	@Column(name = "OKRES_KOD")
	private String okresKod;

	@Column(name = "CLENENI_SM_ROZSAH_KOD")
	private String cleneniSmRozsahKod;

	@Column(name = "CLENENI_SM_TYP_KOD")
	private String cleneniSmTypKod;

	@Column(name = "PLATI_OD")
	private String platiOd;

	@Column(name = "PLATI_DO")
	private String platiDo;

	@Column(name = "DATUM_VZNIKU")
	private String datumVzniku;

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

	public String getStatusKod() {
		return statusKod;
	}

	public void setStatusKod(String statusKod) {
		this.statusKod = statusKod;
	}

	public String getPouKod() {
		return pouKod;
	}

	public void setPouKod(String pouKod) {
		this.pouKod = pouKod;
	}

	public String getOkresKod() {
		return okresKod;
	}

	public void setOkresKod(String okresKod) {
		this.okresKod = okresKod;
	}

	public String getCleneniSmRozsahKod() {
		return cleneniSmRozsahKod;
	}

	public void setCleneniSmRozsahKod(String cleneniSmRozsahKod) {
		this.cleneniSmRozsahKod = cleneniSmRozsahKod;
	}

	public String getCleneniSmTypKod() {
		return cleneniSmTypKod;
	}

	public void setCleneniSmTypKod(String cleneniSmTypKod) {
		this.cleneniSmTypKod = cleneniSmTypKod;
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

	public String getDatumVzniku() {
		return datumVzniku;
	}

	public void setDatumVzniku(String datumVzniku) {
		this.datumVzniku = datumVzniku;
	}

	@Override
	public String toString() {
		return "ObecEntity [kod=" + kod + ", nazev=" + nazev + ", statusKod=" + statusKod + ", pouKod=" + pouKod
				+ ", okresKod=" + okresKod + ", cleneniSmRozsahKod=" + cleneniSmRozsahKod + ", cleneniSmTypKod="
				+ cleneniSmTypKod + ", platiOd=" + platiOd + ", platiDo=" + platiDo + ", datumVzniku=" + datumVzniku
				+ "]";
	}

}
