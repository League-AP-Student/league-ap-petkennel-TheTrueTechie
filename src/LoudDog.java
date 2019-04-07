
public class LoudDog extends Dog {
	String dog_sound;

	LoudDog(String petName) {
		super(petName);
	}

	public String speak() {
		return super.speak() + super.speak(); 
	}
}
