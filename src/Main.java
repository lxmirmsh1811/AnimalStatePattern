import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		AnimalContext animalContext = new AnimalContext(new Idle());
		animalContext.setName("Jack");
		animalContext.setColor("Beige");
		animalContext.setheartBeat(100);
		animalContext.setAnimalKind(AnimalKind.DOG);
		while(true) {
			int actionControl = 0;	
			System.out.println("Press 1 to display\nPress 2 to sleep\nPress 3 to wake_up\nPress 4 to stop\n");
			
			if(animalContext.getAnimalKind() == AnimalKind.DOG) {	
				System.out.println("Press 5 to run\n");
				actionControl = 5;
			}
			
			else if(animalContext.getAnimalKind() == AnimalKind.DUCK) {
				System.out.println("Press 5 to quack\n");
				actionControl = 6;
			}
			
			else if(animalContext.getAnimalKind() == AnimalKind.KANGAROO) {
				System.out.println("Press 5 to jump\n");
				actionControl = 7;
			}
			
			Scanner sc = new Scanner(System.in);
			int op = sc.nextInt();
			
			if(op == 1) animalContext.display();
			else if(op == 2) animalContext.sleep();
			else if(op == 3) animalContext.wake_up();
			else if(op == 4) animalContext.stop();
			else if(op == 5) {
				if(actionControl == 5) animalContext.run();
				else if(actionControl == 6) animalContext.quack();
				else if(actionControl == 7) animalContext.jump();
			}
		}	
	}
}
