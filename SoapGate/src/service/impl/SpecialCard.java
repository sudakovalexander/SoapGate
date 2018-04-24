package service.impl;

public class SpecialCard {
	
	public static boolean isSpecial(String card){
		if (card.equals("4256911071000062")) return true;
		if (card.equals("4256901060020908")) return true;
		if (card.equals("4256901070102977")) return true;
		return false;
	}

}
