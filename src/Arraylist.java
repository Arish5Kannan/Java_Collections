import java.util.*;
public class Arraylist {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("arish");
        al.add("arish");
        al.add("arish");
        al.add("arish");
        al.add("arish");
        for (String a:al) {
            System.out.print(a+" ");
        }
        al.add(3,"Sirish");
        al.add(0,"Sarvesh");
        for (String a:al) {
            System.out.println("\n"+a);
        }
        al.remove("arish");
        al.remove(0);
        for (String a:al) {
            System.out.print(a+" ");
        }
        al.remove(3);
        for (String a:al) {
            System.out.print(a+" ");
        }
         al.stream().sorted();
        System.out.println("");
        for (String a:al) {
            System.out.print(a+" ");
        }
    }
}
