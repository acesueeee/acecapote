import java.util.Scanner;
public class RunAnimal {
	
	public static void main(String[] args ){
	Scanner sc = new Scanner (System.in);
	
	System.out.println("choose an Animal. Press B for Bird, Press C for Cat, Press D for Dog");
	String choice = sc.nextLine();	
	
if (choice.equalsIgnoreCase("B")) {
	Bird b = new Bird();
	b.eat();
	b.sleep();
	b.makeSound();
}
else if (choice.equalsIgnoreCase("C")) {
	Cat c = new Cat();
	c.eat();
	c.sleep();
	c.makeSound();
}
else if (choice.equalsIgnoreCase("D")) {
	Dog d = new Dog();
	d.eat();
	d.sleep();
	d.makeSound();
sc.close();
}
	}
}
	
   
