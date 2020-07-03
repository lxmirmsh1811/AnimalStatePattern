//
///**
// * The Dog class.
// * 
// * It Inherits from Animal Class.
// */
//public class Dog extends AnimalContext{
//		
//	Dog(String _name, String _color, int _currentState) {
//		super(_name, _color, _currentState);
//	}
//	
//	/**
//     * A dog can run, while other animals mighn't.
//     * 
//     */
//	public void run(){
//		heartBeat = heartBeat + 50;
////		System.out.println("The dog with the name " + this.name + " is running.");
//		if(currentState == AnimalContext.AWAKE) {
//			System.out.println(this.name + " is running now");	
//			currentState = AnimalContext.OTHERWISE;
//		}	
//		else if(currentState == AnimalContext.SLEEPING) {
//			System.out.println(this.name + " is sleeping, cannot run!");
//		}
//	}
//	
//	public void stop() {
//		heartBeat = heartBeat - 50;
//		
//		if(currentState == AnimalContext.OTHERWISE) {
//			System.out.println(this.name + " has stopped running!");
//			currentState = AnimalContext.AWAKE;
//		}
//	}
//}
