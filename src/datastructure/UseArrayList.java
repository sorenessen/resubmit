package datastructure;
import java.util.*;


public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
            ArrayList<Object> sandwich= new ArrayList<Object>();
            sandwich.add("beef");
            sandwich.add("PB&J");
            sandwich.add("cheese steak");
            sandwich.add("knuckle");
            sandwich.add("monte cristo");


            System.out.print(sandwich+" ");
            System.out.println();
            sandwich.remove("PB&J");
            System.out.println("post removing");
            System.out.print(sandwich+" ");
            System.out.println();
            sandwich.add("chicken");
            Iterator<Object>
                    list =sandwich.listIterator();
            while(list.hasNext()){
                    System.out.print(list.next()+" ");
            }
            System.out.println();
            for(Iterator LN = sandwich.iterator(); LN.hasNext();){
                    System.out.print(LN.next()+" ");
            }

    }

}