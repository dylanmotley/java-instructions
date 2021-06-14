
public class AnimalCounterApp {

	public static void main(String[] args) {
		Countable c = null;
		count(c, 3);

	}

	public static void count(Countable c, int maxCount) {
		System.out.println("Counting alligators. . .");
		System.out.println();

		c = new Alligator(maxCount);
		for (int i = 1; i <= c.getCount(); i++) {
			System.out.println(i + " " + c.getCountString());
		}
		System.out.println();
		System.out.println("Counting sheep . . .");
		System.out.println();

		c = new Sheep(maxCount - 1, "Blackie");
		for (int i = 1; i <= c.getCount(); i++) {
			System.out.println(i + " " + c.getCountString());
		}

		System.out.println();

		c = new Sheep(maxCount, "Dolly");
		for (int i = 1; i <= c.getCount(); i++) {
			System.out.println(i + " " + c.getCountString());
		}
		System.out.println();

		c = new Sheep(maxCount - 2, "Blackie");
		for (int i = 1; i <= c.getCount(); i++) {
			System.out.println(i + " " + c.getCountString());
		}
	}
}
