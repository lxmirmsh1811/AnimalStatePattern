
public class AnimalContext {
	
	protected String name;
	protected String color;
	protected int heartBeat;
	protected AnimalKind animalKind;
	
	protected State currentState;
		
	AnimalContext(State initialState){
//		currentState.setHistory(initialState);
		currentState = initialState; 
		currentState.setHistory(initialState);
	}
	
	public void setheartBeat(int heartBeat) {
		this.heartBeat = heartBeat;
	}
	
	public void setColor(String color) {
		this.color = color;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	public int getheartBeat() {
		return this.heartBeat;
	}
	
	public AnimalKind getAnimalKind() {
		return animalKind;
	}
	
	public void setAnimalKind(AnimalKind animalKind) {
		this.animalKind = animalKind;
	}
	public void display(){
		
		currentState.setHistory(currentState);
		currentState = currentState.display(this.name, this.animalKind.name(), this.color, this.heartBeat);
		
//		currentState = currentState.display(this.name, this.color, this.heartBeat);
		
	}
	
	public void sleep() {
		
		currentState.setHistory(currentState);
		currentState = currentState.sleep(this.name);
//		System.out.println(this.name + " is sleeping now!");
		heartBeat = 100;
		
	}
	
	public void wake_up() {
		currentState.setHistory(currentState);
//		System.out.println(this.name +" I'm awake!");
		currentState = currentState.wake_up(this.name);
		
	}
	
	public void stop() {
		
		heartBeat = heartBeat - 50;
		currentState.setHistory(currentState);
//		System.out.println(this.name + " has stopped!");
		currentState = currentState.stop(this.name);
		
	}
	
	public void run() {
		
		currentState.setHistory(currentState);
		heartBeat = heartBeat + 50;
//		System.out.println(this.name + " is running");
		currentState = currentState.run(this.name);
		
		
	}
	
	public void jump() {
		
		currentState.setHistory(currentState);
		heartBeat = heartBeat * 2;
//		System.out.println(this.name + " is running");
		currentState = currentState.jump(this.name);
	
	}
	
	public void quack() {
		currentState.setHistory(currentState);
		heartBeat = heartBeat + 1;
//		System.out.println(this.name + " is running");
		currentState = currentState.quack(this.name);
		
		
	}
	
}
