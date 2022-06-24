package com.tomveselka.autocomplete.dto;

public class ObecDictionaryObject {
	
	private String nazev;
	private String nazevDisplay;
	private String kod;
	
	public String getNazev() {
		return nazev;
	}
	public void setNazev(String nazev) {
		this.nazev = nazev;
	}
	public String getNazevDisplay() {
		return nazevDisplay;
	}
	public void setNazevDisplay(String nazevDisplay) {
		this.nazevDisplay = nazevDisplay;
	}
	public String getKod() {
		return kod;
	}
	public void setKod(String kod) {
		this.kod = kod;
	}
	@Override
	public String toString() {
		return "ObecDictionaryObject [nazev=" + nazev + ", nazevDisplay=" + nazevDisplay + ", kod=" + kod + "]";
	}
}
