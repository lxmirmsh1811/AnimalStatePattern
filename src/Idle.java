
public class Idle extends Awake{
	
	public State run(String name) {
		System.out.println(name + " is running now!");
		return new Running();
	}
	
	public State jump(String name) {
		System.out.println(name + " is jumping now!");
		return new Jumping();
	}
	public State quack(String name) {
		System.out.println(name + " is quacking now!");
		return new Quacking();
	}
	
	public State stop(String name) {
		System.out.println( name + " has already stopped!");
		return this;
	}
}
