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

}
