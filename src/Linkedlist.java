import java.util.*;
public class Linkedlist {
    public static void main(String[] args) {
        LinkedList<String> li = new LinkedList<>();
        li.add("Arish");
        li.add("Krish");
        li.add(1,"Mahesh");
        li.add(0,"Krish");
        li.add("himesh");
        li.add("harish");
        for(String a:li)
        {
            System.out.println(a+" ");
        }
        li.remove(0);
        li.remove("Krish");
        for(String a:li)
        {
            System.out.println(a+" ");
        }
        li.remove();
        for(String a:li)
        {
            System.out.println(a+" ");
        }
        li.removeFirst();
        for(String a:li)
        {
            System.out.println(a+" ");
        }
        li.removeLast();
        for(String a:li)
        {
            System.out.println(a+" ");
        }
        li.removeFirstOccurrence("Krish");
        li.removeLastOccurrence("Arish");
        for(String a:li)
        {
            System.out.println(a+" ");
        }
    }
}