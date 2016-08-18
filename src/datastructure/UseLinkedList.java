package datastructure;
import java.util.Iterator;
import java.util.LinkedList;
public class UseLinkedList {

    public static void main(String[] args) {


        LinkedList<String> highInSodium = new LinkedList<>();
        highInSodium.add("Hamburger");
        //list.add("John Candy can't eat hamburgers(because he's no longer with us) :(");
        highInSodium.add("Hotdog");
        //list.add("John Goodman should not eat hotdogs or he'll end up like John Candy");
        highInSodium.add("Cheese Burger and fries");
        //list.add("John Waters can eat all the cheese burgers he wants");
        highInSodium.remove("Hotdog");

            System.out.println(highInSodium + " ");
            System.out.println(highInSodium.peek() + " ");
            System.out.println(highInSodium.peekFirst() + " ");
            System.out.println(highInSodium.peekLast() + " ");
            Iterator<String> list = highInSodium.listIterator();
            System.out.println();
            while (list.hasNext()) {
                System.out.println(list.next() + " ");

            }
            System.out.println();
            for (Iterator list2 = highInSodium.iterator(); list2.hasNext(); ) {
                System.out.println(list2.next() + " ");
            }

            for (Object meat : highInSodium) {
                System.out.println(meat);
            }
        }
    }





