public class Sheep extends Animal implements Cloneable {
	String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	String getCountString(){
		return name + "sheep";
	}

	@Override
	public void incrementCount() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resetCount() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String GetCountString() {
		// TODO Auto-generated method stub
		return null;
	}
}
