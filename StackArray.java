import java.util.Stack;
public  class StackArray{
    private static final int MAX = 100;
    private int top;
    private int[] arr;

    public StackArray(){
        top = -1;
        arr = new int[MAX];
    }

    public void push(int x)
    {
        if(top == MAX-1)
        {
            System.out.println("Stack is overflow");
        }
        arr[++top] = x;
    }
    public int pop()
    {
        if(top == -1)
        {
            System.out.println("Stack is underOvewFlow");
        }
        return arr[top--];
    }
    public boolean isEmpty() {
        return (top == -1);
    }
    public int peek()
    {
        if(top == -1)
        {
            System.out.println("Stack is empty ");
            return -1;
        }
        return arr[top];
    }
    public static void main(String[] args)
    {
        Stack s = new Stack();

        s.push(4);
        s.push(1);
        s.push(5);
        s.push(7);
        s.push(9);

        System.out.println("poped element fromt the stack is " + s.pop());
        System.out.println("peek element fromt the stack is " + s.peek());
        System.out.println("is empty element fromt the stack is " + s.isEmpty());

    }
}