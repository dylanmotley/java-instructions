import com.util.Console;

public class CodingChallengeApp {

	public static void main(String[] args) {
		
		int one = Console.getInt("Small: ");
		int two = Console.getInt("Big: ");
		int three = Console.getInt("Total: ");
		
		String rem = makeChocolate(one, two, three);
		System.out.println(rem);

	}

	private static String makeChocolate(int small, int big, int total) {
		int nug = 0;
		if(total > ((big*5)+small)) {
			String msg1 = "Cannot be done";
			return msg1;
		} else if ((total-(big*5))<0) {
			String msg2 = "Bigs: "+big;
			return msg2;
		} else {
			big = total / 5;
			nug = total - (big*5);
			String msg = "Nugs: "+nug+" Bigs: "+big;
			return msg;
		}
		
	}
}

