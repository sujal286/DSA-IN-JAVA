import java.util.Stack;

public class Stacks {
    
    public static void main(String args[])
    {
        Stack<String> stack=new Stack<>();

        stack.push("tiger");
        stack.push("lion");
        stack.push("elephant");
        stack.push("deer");

        System.out.println("Stack: " + stack);

        System.out.println(stack.peek());

        stack.pop();

        System.out.println("Stack: " + stack);
    }
}
