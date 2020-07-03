
public class Sleeping extends Alive {
	
	public State wake_up(String name) {
		System.out.println(name + " was sleeping and is awake now\n");
		return new Idle();
	}
	public State sleep(String name) {
		System.out.println(name + " is already sleeping\n");
		return this;
	}
	
}
