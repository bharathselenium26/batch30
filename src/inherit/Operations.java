package inherit;

public class Operations {

	
	public static void main(String[] args) {
		
		Cat ca = new Cat();
		ca.drink();
		ca.eat();
		ca.legs();
		ca.sleep();
		
		Dog dog = new Dog();
		dog.eat();
		dog.legs();
		dog.sleep();
		
		dog.wave();
		
		Lion lion = new Lion();
		lion.eat();
		lion.legs();
		lion.sleep();
		lion.king();
		
		
		C cc = new C();
		cc.testc();
		cc.useAmeth1();
		cc.getName();
	}
}
