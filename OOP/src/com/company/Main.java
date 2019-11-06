package com.company;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
		List<Principle> SOLID = new ArrayList<Principle>();
		Name name = new Name();

		SOLID.add(new SingleRes());
		SOLID.add(new OpenClosed());
		SOLID.add(new Liskov());
		SOLID.add(new InterfaceSeg());
		SOLID.add(new DependencyInv());

		System.out.println("From now you can find an easter egg in each my homework. \n" +
			"It is 'SOLID' this time. It's easy... I know. I'll try to make my homework more interesting next time )))\n\n");
			//KEY FOR THE NEXT

		for (Principle p : SOLID) {
		    System.out.println(name.ClassName(p) + " is used by me in my work project - " + p.IsUsed());
		}
    }
}
