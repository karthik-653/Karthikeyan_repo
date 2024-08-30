package com.factory;

import com.restraunt.Indian;
import com.restraunt.Italian;
import com.restraunt.Restraunt;

public class RestrauntFactory {
	public static Restraunt create(char res) {
		switch(res) {
		case 'A':
			return new Indian();
		
		case 'B':
			return new Italian();
		}
		return null;
		
	}

}
