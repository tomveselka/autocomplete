package com.tomveselka.autocomplete.addresses.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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

	@Override
	public String toString() {
		return "AddressRelationsEntity [admKod=" + admKod + ", uliceKod=" + uliceKod + ", cobceKod=" + cobceKod
				+ ", momcKod=" + momcKod + ", opKod=" + opKod + ", spravobvKod=" + spravobvKod + ", obecKod=" + obecKod
				+ ", pouKod=" + pouKod + ", orpKod=" + orpKod + ", okresKod=" + okresKod + ", vuscKod=" + vuscKod
				+ ", voKod=" + voKod + "]";
	}
	

}
