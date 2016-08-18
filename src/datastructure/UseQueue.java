package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		Queue<Object> rice=new LinkedList<>();
		rice.add("Red Rice");
		rice.add("Yellow Rice,");
		rice.add("Brown Rice,");
		rice.add("White Rice,");
		rice.add("Sushi Rice,");
//peek is showing which object is on the top
		System.out.println(rice.peek());
		System.out.println(rice);
//poll shows which object is on the top and then removes it
		System.out.println(rice.poll());
		System.out.println(rice);
		System.out.println(rice.peek());
		rice.offer("Red Rice");
		System.out.println(rice.element());

///size of the queue
		System.out.println("the size of the queue is"+rice.size());

		rice.remove("White Rice");
		System.out.println(rice);

		Iterator<Object> list=rice.iterator();
		while(list.hasNext()){
			System.out.print(list.next()+" ");
		}
		System.out.println();
		System.out.println("for loop with the ricenator iterator!");
		for(Iterator riceIt=rice.iterator();riceIt.hasNext();){
			System.out.print(riceIt.next()+" ");
		}
		System.out.println();
		System.out.println("simple data retrieval");
		System.out.println();
		for(Object r:rice){
			System.out.print(r+" " );
		}




	}

}




