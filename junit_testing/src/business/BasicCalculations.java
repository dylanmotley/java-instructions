package business;

public class BasicCalculations {
	
	// Accept an int and return a square
	public static int square(int nbr) {
		return nbr * nbr;
	}
	
	public static int countA(String str ) {
		int aCount = 0;

		str = str.toLowerCase();
		
		for(int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a') {
				aCount++;
			}
		}
		return aCount;
	}

}
