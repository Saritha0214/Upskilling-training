package com.cg.question4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CardController {
	
	@Autowired
	private CardService cardService;
	
	@RequestMapping(value="/{cardNumber}")
	public String checkCard(@PathVariable String cardNumber) {
		return cardService.checkCard(cardNumber);
	}

}