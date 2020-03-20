
public abstract class Animal {
	private float weight;
	private int numberOfLegs;
	
	
	public float getWeight() {
		return weight;
	}
	
	public void setWeight(float weight) {
		this.weight = weight;
	}
	
	public int getNumberOfLegs() {
		return numberOfLegs;
	}
	
	public void setNumberOfLegs(int numberOfLegs) {
		this.numberOfLegs = numberOfLegs;
	}
	
	public abstract void speak();
}
