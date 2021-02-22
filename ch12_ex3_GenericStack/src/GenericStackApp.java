public class GenericStackApp {

    public static void main(String[] args) {
    	Stack<String> stack = new Stack<>();
    	
    	stack.push("Apples");
    	System.out.println("Push: apples");
    	stack.push("Oranges");
    	System.out.println("Push: oranges");
    	stack.push("Bananas");
    	System.out.println("Push: bananas");
    	System.out.println("The stack contains " + stack.size() + " items.\n");

    	//the stacks contains x items
    	System.out.println("Peek: " + stack.peek());
    	System.out.println("The stack contains " + stack.size() + " items.\n");
    	
    	
    	System.out.println("pop: " + stack.pop());
    	System.out.println("pop: " + stack.pop());
    	System.out.println("pop: " + stack.pop());
    	System.out.println("The stack contains " + stack.size() + " items.\n");
    	
    	System.out.println("bye");
    }
    
}
