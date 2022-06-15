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
}
