import java.util.*;
class Node {
    int data;
    Node next;
    Node(int data)
    {
        this.data=data;
    }
}
class list 
{
    Node top=null;
    public void push(int data)
    {
        Node n=new Node(data);
        n.next=top;
        top=n;
    }
    public void count()
    {
        int count=0;
        Node temp=top;
        while(temp!=null)
        {
            count++;
            temp=temp.next;
        }
        System.out.println("the count is "+count);
    }
    public void pop()
    {
        Node temp=top;
        top=top.next;
        System.out.println("the element popped is"+temp);
        temp=null;
    }
    public void display()
    {
        Node temp=top;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public void peek()
{
    System.out.println(top.data);
}
}

public class Stacklist {
    public static void main(String[] args) {
        list l= new list();
        Scanner sc=new Scanner(System.in);
        int n;
        do{
            System.out.println("Enter your choice");
            System.out.println("1.push\n 2.pop\n3.display\n4.count");
            n=sc.nextInt();
            switch(n)
            {
                case 1:
                    System.out.println("Enter element");
                    int a=sc.nextInt();
                    l.push(a);
                    break;
                case 2:
                    l.pop();
                    break;
                case 3:
                    System.out.println("the elements are ");
                    l.display();
                    break;
                case 4:
                    l.count();
            }

        }while(n!=5);
    }
}