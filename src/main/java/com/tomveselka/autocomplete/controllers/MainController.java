package com.tomveselka.autocomplete.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.tomveselka.autocomplete.model.AddressData;

@Controller
@SessionAttributes("clientData")
public class MainController {

	@ModelAttribute("addressData")
	public AddressData clientData() {
		return new AddressData();
	}
	
	// PAGEONE
	@GetMapping({ "", "/", "/address" })
	public String addressPage(Model model) {
		model.addAttribute("addressData", new AddressData());
		return "address";
	}

	@PostMapping(value = "/address", params = "goToResults")
	public String results(AddressData addressData, Model model) {
		System.out.println("Got here");
		//model.addAttribute("addressData", addressData);
		return "results";
	}
}
