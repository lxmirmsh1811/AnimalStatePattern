
public class Running extends Awake{
	
	public State run(String name) {  
		System.out.println(name + " is already running!");
		return this;
	}
	
	public State stop(String name) {
		System.out.println(name + " was running and has stopped now!");
		return new Idle();
	}
	public State sleep(String name) {
		System.out.println(name + " cannot sleep now!");
		return this;
	}
}
