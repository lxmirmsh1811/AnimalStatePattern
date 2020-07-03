
public abstract class Awake extends Alive {
	
	public State sleep(String name) {
		System.out.println(name + " is sleeping now!");
		return new Sleeping(); // Return the target of the transition sleep()
	}
	
	
	
}
