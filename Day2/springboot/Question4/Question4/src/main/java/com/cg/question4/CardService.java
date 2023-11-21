package com.cg.question4;

import org.springframework.stereotype.Service;

@Service
public class CardService {
	
	public String checkCard(String cardNumber) {
		
		if(cardNumber.length()>= 16) {
			if(cardNumber.charAt(0) == '5') {
				return "MasterCard";
			}
			else
				return "Visa";
		}
		else if(cardNumber.length() == 15) {
			return "EnRoute";
		}
		return "JCB";
	}

	public String checkCard1(String cardNumber) {
		// TODO Auto-generated method stub
		return null;
	}
}

