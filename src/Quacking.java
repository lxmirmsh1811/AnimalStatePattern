
public class Quacking extends Awake {
	
	public State quack(String name) {  
		System.out.println(name + " is already quacking!");
		return this;
	}
	
	public State stop(String name) {
		System.out.println(name + " was quacking and has stopped now!");
		return new Idle();
	}
	public State sleep(String name) {
		System.out.println(name + " cannot sleep now!");
		return this;
	}
}
