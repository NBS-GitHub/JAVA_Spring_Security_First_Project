package com.frontepic.springsecurity.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api")
public class QuotationController {
	
	private List<Quotation> quotations;
	
	//////////////////////////////////////////////////////////////////////
	
	public QuotationController() {
		this.quotations = new ArrayList<>();
		quotations.add(new Quotation("Simplicity is the ultimate sophistication.", "Leonardo da Vinci"));
		quotations.add(new Quotation("If you are going through hell, keep going.", "Winston S. Churchill"));
	}
	
	//////////////////////////////////////////////////////////////////////

	@GetMapping
	public List<Quotation> getQuotations(){
		return quotations;
	}
	
	@PostMapping
	public boolean addQuotation(@RequestBody Quotation quotation){
		return quotations.add(quotation);
	}
	
	@DeleteMapping
	public void removeQuotation(@RequestParam int index){
		quotations.remove(index);
	}
	
}
