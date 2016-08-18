package datastructure;

import java.util.Iterator;
import java.util.Stack;

public class UseStack {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Stack that includes push,peek,remove,pop elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		Stack<Object> Burrito=new Stack<>();
		Burrito.push("Bean n' Cheese");
		Burrito.push("Beef n' Bean");
		Burrito.push("Twinky n' Salami");
		Burrito.add("Shrimp n' Peanutbutter");
		Burrito.add("Cigarettes n' Sushi");


		System.out.println(Burrito.peek());
		System.out.println(Burrito);
		System.out.println(Burrito.pop());
		System.out.println(Burrito);
		System.out.println(Burrito.peek());
		System.out.println(Burrito);
		Burrito.remove("Beef n' Bean");
		System.out.println(Burrito);
		Burrito.push("Beef n' Bean");
		System.out.println(Burrito);

		Iterator<Object> list=Burrito.iterator();
		while(list.hasNext()){
			System.out.print(list.next()+" ");
		}
		System.out.println();
		System.out.println("for loop with an iterator");
		for(Iterator Burrito1=Burrito.iterator();Burrito1.hasNext();){
			System.out.print(Burrito1.next()+" ");
		}
	}

}
