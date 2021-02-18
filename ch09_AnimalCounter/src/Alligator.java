public class Alligator extends Animal {
	String getCountString(){
		return "Alligators";
	}

	@Override
	public void incrementCount() {
		count++;
		
	}

	@Override
	public void resetCount() {
		count = 0;
	}

	@Override
	public int getCount() {
		return count;
	}

	@Override
	public String GetCountString() {
		String countString = count + " alligator";
		return countString;
	}
	
	
}
