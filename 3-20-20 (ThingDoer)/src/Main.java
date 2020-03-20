//import java.util.ArrayList;
//import java.util.LinkedList;
//import java.util.List;

public class Main {

	public static void main(String[] args) {
		Animal unicorn = new Unicorn();
		Animal pig = new Pig();
		
		unicorn.setNumberOfLegs(4);
		unicorn.setWeight(2000);
		
		pig.setNumberOfLegs(4);
		pig.setWeight(200);
		
		speak(unicorn);
		speak(pig);
//////////////////////////////////////////////////////////////////////////		
//		List<String> ls1 = new ArrayList<>();
//		List<String> ls2 = new LinkedList<>();
//		
//		ls1.add("Hello");
//		ls1.add("World");
//		ls2.add("Goodbye");
//		ls2.add("Hello");
//		
//		printList(ls1);
//		printList(ls2);
//////////////////////////////////////////////////////////////////////////		
//		ThingDoer td = new ConcreteThingDoer();
//		ThingDoer td2 = new DifferentThingDoer();
//		
//		doIt(td);
//		doIt(td2);
	}
	
	public static void speak(Animal a) {
		a.speak();
	}
//////////////////////////////////////////////////////////////////////////
//	public static void printList(List<String> aList) {
//		for(String s : aList) {
//			System.out.println(s);
//		}
//	}
//////////////////////////////////////////////////////////////////////////
//	public static void doIt(ThingDoer td) {
//		td.doAThing();
//	}

}
