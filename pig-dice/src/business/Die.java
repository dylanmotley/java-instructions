package business;

public class Die {

	private final int value;

	// Only need empty constructor
	// Will never manually set value
//	public Die(int value) {
//		super();
//		this.value = value;
//	}

	public Die() {
		super();
		value = roll();
	}

	public int getValue() {
		return value;
	}

	// Disabling setter to protect integrity of the roll
//	public void setValue(int value) {
//		this.value = value;
//	}
	
	private int roll() {
		return (int)(Math.random() * 6) + 1;
	}

}
