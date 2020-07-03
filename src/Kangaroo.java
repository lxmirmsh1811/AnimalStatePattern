//
///**
// * The Kangaroo class.
// * 
// * It Inherits from Animal Class.
// */
//public class Kangaroo extends AnimalContext{
//	
//    /**
//     * The height of the kangaroo
//     * 
//     * This attribute is specific to kangaroo animals.
//     * 
//     * @var double
//     */
//	private double height;
//	
//	Kangaroo(String _name, String _color, double _height, int _currentState) {
//		super(_name, _color, _currentState);
//		this.height = _height;
//	}
//	
//	/**
//     * A kangaroo can jump, while other animals mighn't.
//     * 
//     */
//	public void jump(){
//		heartBeat = heartBeat * 2;
////		System.out.println("The kangaroo with the name " + this.name + " is jumping.");
//		
//		if(currentState == 0) {
//			System.out.println(this.name + " is jumping now");	
//		}	
//		else if(currentState == 1) {
//			System.out.println(this.name + " is sleeping, cannot jump!");
//		}
//	}
//	
//	public void stop() {
//		heartBeat = heartBeat / 50;
//		
//		if(currentState == 2) {
//			System.out.println(this.name + " has stopped running!");
//			currentState = 0;
//		}
//	}
//	
//	/**
//     * This is an overridden version of the method in the parent class.
//     * 
//     */
//	public void display(){
//		System.out.println("My name is " + this.name 
//				+ ", color " + this.color + " and height " + this.height 
//				+". I can jump up to 30 feet high"+" and my heart beats " + this.heartBeat+ " times");
//	}
//}
