import java.util.*;
class stack{
    int top=-1;
    int arr[];
    public void initstack(int size)
    {
        arr=new int[size];
    }
    public void push(int data) {
        if (top == arr.length - 1) {  
            System.out.println("The stack is full");
        } else {
            top++; 
            arr[top] = data; 
        }
    }
    
    public void pop()
    {
        if(top==-1)
        {
            System.out.println("Stack is empty");
        }
        else{
        int temp=arr[top];
        top--;
        System.out.println("the element popped is"+temp);
        }
    }
    public void peek ()
    {
        System.out.println(arr[top]+" ");
    }
    public void display()
    {
        if(top==-1)
        {
            System.out.println("Stack is empty");
            return;
        }
        for(int i=0;i<=top;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
public class stack2 {

    public static void main(String[] args)
    {
        stack s=new stack();
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        s.initstack(size);
        int n;
        do{
            System.out.println("Enter your choice");
            System.out.println("Choice 1:push \n Choice 2:pop\n Choice 3:display \n choice 4: EXIT");
            n=sc.nextInt();
            int count=0;
            switch (n) {
                case 1:
                    System.out.println("Enter the element to be pushed");
                    int a=sc.nextInt();
                    s.push(a);  
                    count++;
                        System.out.println("Stack is full");
                    break;
                case 2:
                count--;
                    s.pop();
                    break;
                case 3:
                    System.out.print("The stack elements are ");
                    s.display();
                    break;
                default:
                    break;
            }
        }while(n!=4);
        sc.close();
    }
}