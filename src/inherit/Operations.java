package inherit;
import java.util.ArrayList;

import poly.Car;
import poly.Maruthi;

public class Operations {

	
	public static void main(String[] args) {
		
	/*	Cat ca = new Cat();
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
		*/
		
		Deer d = new Deer();
		d.eat();
		d.beautiful();
		d.legs();
		d.sleep();
		
		String str = "bharath";
		String str2 = new String();
		String str3 = new String("bharath2");
		
		System.out.println(str);
		System.out.println(str2);
		System.out.println(str3);
		int size = str.length();
		System.out.println(size);
		
		boolean b = str.equals(str3);
		System.out.println(b);
		
		BB bb = new BB();
		Car car = new Car();
		Maruthi m = new Maruthi();
		
		ArrayList list = new ArrayList();
		list.add("dsfsf");
	}
}
