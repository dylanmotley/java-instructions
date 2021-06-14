
public abstract class Animal implements Countable {
	private int count = 0;

	public Animal(int count) {
		this.count = count;
	}

	@Override
	public void incrementCount() {
		count += 1;

	}

	@Override
	public void resetCount() {
		count = 1;

	}

	@Override
	public int getCount() {
		return count;
	}

}
