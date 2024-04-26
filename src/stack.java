import java.util.*;
public class stack {
    static void push(Stack<Integer> stack){
        for(int i=0;i<6;i++)
        {
            stack.push(i);
        }
    }
    static void pop(Stack<Integer> stack)
    {
        for(int i=0;i<4;i++)
        {
            Integer a = (Integer)stack.pop();
            System.out.println("popped element: "+a);
        }
    }
    static void peek(Stack<Integer> stack)
    {
        Integer a = (Integer)stack.peek();
        System.out.println("Element on top of the stack:"+a);
    }
    static void search(Stack<Integer> stack,int element)
    {
        int pos = (int)stack.search(element);
        if(pos==-1)
        {
            System.out.println("Element "+element+" is not found");
        }
        else {
            System.out.println("Element is found at "+pos);
        }
    }
    static void display(Stack<Integer> stack)
    {
        Iterator<Integer> itr = stack.iterator();
        System.out.println("Stack Elements:");
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        push(stack);
        display(stack);
        pop(stack);
        display(stack);
        peek(stack);
        push(stack);
        pop(stack);
        push(stack);
        display(stack);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter element to search in stack:");
        int s = sc.nextInt();
        search(stack,s);

    }
}
