
public class Jumping extends Awake {
	
	
	public State jump(String name) {  
		System.out.println(name + " is already jumping!");
		return this;
	}
	
	public State stop(String name) {
		System.out.println(name + " was jumping and has stopped now!");
		return new Idle();
	}
	public State sleep(String name) {
		System.out.println(name + " cannot sleep now!");
		return this;
	}
}
