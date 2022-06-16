package com.tomveselka.autocomplete.addresses.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "adresni_mista_vazby_cr")
public class AddressRelationsEntity {

	@Id
	@Column(name = "ADM_KOD")
	private String admKod;
	
	@Column(name = "ULICE_KOD")
	private String uliceKod;
	
	@Column(name = "COBCE_KOD")
	private String cobceKod;
	
	@Column(name = "MOMC_KOD")
	private String momcKod;
	
	@Column(name = "OP_KOD")
	private String opKod;	
	
	@Column(name = "SPRAVOBV_KOD")
	private String spravobvKod;
	
	@Column(name = "OBEC_KOD")
	private String obecKod;
	
	@Column(name = "POU_KOD")
	private String pouKod;
	
	@Column(name = "ORP_KOD")
	private String orpKod;	
	
	@Column(name = "OKRES_KOD")
	private String okresKod;
	
	@Column(name = "VUSC_KOD")
	private String vuscKod;
	
	@Column(name = "VO_KOD")
	private String voKod;

	@OneToOne (fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "relationsEntity")
	AddressEntity addressEntity;
	
	//https://www.baeldung.com/hibernate-one-to-many
	@ManyToOne
	@JoinColumn(name="OKRES_KOD", referencedColumnName = "Kód", insertable=false, updatable=false)
	private OkresEntity okresEntity;
	
	@ManyToOne
	@JoinColumn(name="VUSC_KOD", referencedColumnName = "Kód", insertable=false, updatable=false)
	private KrajEntity krajEntity;

	public String getAdmKod() {
		return admKod;
	}

	public void setAdmKod(String admKod) {
		this.admKod = admKod;
	}

	public String getUliceKod() {
		return uliceKod;
	}

	public void setUliceKod(String uliceKod) {
		this.uliceKod = uliceKod;
	}

	public String getCobceKod() {
		return cobceKod;
	}

	public void setCobceKod(String cobceKod) {
		this.cobceKod = cobceKod;
	}

	public String getMomcKod() {
		return momcKod;
	}

	public void setMomcKod(String momcKod) {
		this.momcKod = momcKod;
	}

	public String getOpKod() {
		return opKod;
	}

	public void setOpKod(String opKod) {
		this.opKod = opKod;
	}

	public String getSpravobvKod() {
		return spravobvKod;
	}

	public void setSpravobvKod(String spravobvKod) {
		this.spravobvKod = spravobvKod;
	}

	public String getObecKod() {
		return obecKod;
	}

	public void setObecKod(String obecKod) {
		this.obecKod = obecKod;
	}

	public String getPouKod() {
		return pouKod;
	}

	public void setPouKod(String pouKod) {
		this.pouKod = pouKod;
	}

	public String getOrpKod() {
		return orpKod;
	}

	public void setOrpKod(String orpKod) {
		this.orpKod = orpKod;
	}

	public String getOkresKod() {
		return okresKod;
	}

	public void setOkresKod(String okresKod) {
		this.okresKod = okresKod;
	}

	public String getVuscKod() {
		return vuscKod;
	}

	public void setVuscKod(String vuscKod) {
		this.vuscKod = vuscKod;
	}

	public String getVoKod() {
		return voKod;
	}

	public void setVoKod(String voKod) {
		this.voKod = voKod;
	}

	@Override
	public String toString() {
		return "AddressRelationsEntity [admKod=" + admKod + ", uliceKod=" + uliceKod + ", cobceKod=" + cobceKod
				+ ", momcKod=" + momcKod + ", opKod=" + opKod + ", spravobvKod=" + spravobvKod + ", obecKod=" + obecKod
				+ ", pouKod=" + pouKod + ", orpKod=" + orpKod + ", okresKod=" + okresKod + ", vuscKod=" + vuscKod
				+ ", voKod=" + voKod + ", okresEntity=" + okresEntity.toString() + ", krajEntity=" + krajEntity.toString() + "]";
	}
	

}
