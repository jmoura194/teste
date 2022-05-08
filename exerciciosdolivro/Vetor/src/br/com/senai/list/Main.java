package br.com.senai.list;
import java.util.ArrayList;
public class Main {
	
	public static void main (String[]args) {
		
		ArrayList <String> cars =new ArrayList <String> ();
		cars.add("Ford");
		cars.add("Volvo");
		cars.add("Hunday");
		System.out.println(cars);
		System.out.println(cars.get(0));
		System.out.println(cars.set(0, "VOLSKS"));
		cars.remove(1);
		System.out.println(cars.get(0));
		System.out.println(cars.size());
		cars.clear();
		System.out.println(cars);
	}
	

}
