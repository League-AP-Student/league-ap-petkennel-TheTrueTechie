
public class LoudDog extends Dog {
	String dog_sound;

	LoudDog(String petName) {
		super(petName);
	}

	public String speak() {
		return dog_sound + dog_sound;
	}
}
