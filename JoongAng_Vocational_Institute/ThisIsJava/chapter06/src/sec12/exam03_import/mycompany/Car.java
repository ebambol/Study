package sec12.exam03_import.mycompany;

import sec12.exam03_import.hankook.*;
import sec12.exam03_import.hyndai.*;
import sec12.exam03_import.kumho.*;

public class Car {
	
	public static void main(String[] args) {
		//ÇÊµå
		Engine engine = new Engine();
		SnowTire tire1 = new SnowTire();
		BigWidthTire tire2 = new BigWidthTire();
		sec12.exam03_import.hankook.Tire tire3 = new sec12.exam03_import.hankook.Tire();
		sec12.exam03_import.kumho.Tire tire4 = new sec12.exam03_import.kumho.Tire();

		System.out.println("hankoo.Tire : " + tire3.model);
		System.out.println("kumho.Tire : " + tire4.model);
	}
}
