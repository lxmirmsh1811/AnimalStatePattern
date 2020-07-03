
public abstract class State {
	//Default implementations -- Remain where you are
	private State History;
	
	public State getHistory() {
		return History;
	}

	public void setHistory(State history) {
		History = history;
	}
	
	public State sleep(String name){
		return this;
	}
	
	public State run(String name) {
		return this;
	}
	
	public State wake_up(String name) {
		return this;
	}
	
	public State stop(String name) {
		return this;
	}
	
	public State display(String name, String animalKind, String color, int heartBeat) {
		
		System.out.println("My name is " + name + ". I am a " + animalKind + " and my color is " + color+ ". My heart beats "+ heartBeat+ " times");
		return History==null? new Idle():History ;
//		State reEnter = getHistory();
//		return reEnter;
	}
	
	public State jump(String name) {
		System.out.println(name + " is jumping!");
		return new Jumping();
	}
	
	public State quack(String name) {
		System.out.println(name + " is quacking!");
		return new Quacking();
	}

	
}
