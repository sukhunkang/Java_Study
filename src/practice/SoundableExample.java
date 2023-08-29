package practice;

public class SoundableExample {

	private static void printSound(Soundable soundable) {
		System.out.println(soundable.sound());
	} // printSound
	
	public static void main(String[] args) {
		printSound(new Cat());
		printSound(new Dog());
	} // main

} // end class
