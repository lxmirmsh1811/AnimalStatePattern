
public abstract class Alive extends State {
	
		public State run(String name) {
			System.out.println(name + " cannot run now!\n");
			return this; 
		}
		

		public State jump(String name) {
			System.out.println(name + " cannot jump now!\n");
			return this; 
		}
		

		public State quack(String name) {
			System.out.println(name + " cannot quack now!\n");
			return this; 
		}
		
		public State sleep(String name) {
			System.out.println(name + " cannot sleep now!\n");
			return this;
		}
		
		public State stop(String name) {
			System.out.println(name +" cannot stop now!\n");
			return this;
		}
	
		public State wake_up(String name) {
			System.out.println(name + " is already awake!\n");
			return this;
		}
		
		
}
