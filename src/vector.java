import java.util.*;
public class vector {
    public static void main(String[] args) {
        System.out.println("Enter vector elements:");
       Vector<String> v = new Vector<>();
       Scanner sc = new Scanner(System.in);
       for(int i=0;i<10;i++)
       {
           String str = sc.next();
           v.add(str);
       }
       Iterator<String> itr = v.iterator();
        System.out.println("Vector after addition of values:");
       while(itr.hasNext())
       {
           System.out.print(itr.next()+" ");
       }
        System.out.println("");
       v.remove("h");
       v.remove(0);
        System.out.println("Vector after removal of values:");
        for (String c:v) {
            System.out.print(c+" ");
        }
        System.out.println("");
        //updating vector elements
        v.setElementAt("AK",3);
        v.set(2,"Krish");
        System.out.println("Vector after updation");
        for (String c:v) {
            System.out.print(c+" ");
        }
        //Getting elements using get method
        Iterator<String> it = v.iterator();
        System.out.println("\nIterating over Vector elements:");
      for(int i=0;i<v.size();i++)
      {
          System.out.print(v.get(i)+" ");
      }
    }
}
