
public abstract class Animal implements Countable {
	private int count = 0;

	public Animal(int count) {
		this.count = count;
	}

	@Override
	public void incrementCount() {
		count ++;

	}

	@Override
	public void resetCount() {
		count = 0;

	}

	@Override
	public int getCount() {
		return count;
	}

}
