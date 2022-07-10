package com.tomveselka.autocomplete.enums;

public enum NumberOfEmployeesEnum {
	E0("Neuvedeno"),
	E1("Bez zaměstnanců"),
	E2("1-49"),
	E3("50-249"),
	E4("250-999"),
	E5("1 000-9 999"),
	E6("10 000+");
	
	private final String displayValue;
    
    private NumberOfEmployeesEnum(String displayValue) {
        this.displayValue = displayValue;
    }
    
    public String getDisplayValue() {
        return displayValue;
    }
}
