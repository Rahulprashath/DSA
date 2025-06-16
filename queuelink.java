import java.util.*;
class Node{
    int data;
    Node next;
    Node(int data)
    {
        this.data=data;
    }
}
class queue 
{
    Node f=null,r=null;
    // public boolean isEmpty()
    // {
    //     if(f==null && r==null)
    //     {
    //         return true;
    //     }
    //     return false;
    // }
    public void Enqueue(int data)
    {
        Node n= new Node(data);
        if(f==null && r==null)
        {
            f=n;
            r=n;
        }
        else{
            r.next=n;
            r=n;
        }
    }
    public void Dequeue()
    {
        if(f==null && r==null)
        {
            System.out.println("Empty");
            return;
        }
        f=f.next;
        if(f==null)
        {
            r=null;
        }
    }
    public void display()
    {
        Node temp=f;
        if(f==null && r==null)
        {
            System.out.println("empty");
            return;
        }
        while (temp!=null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
  
}


public class queuelink {
    public static void main(String[] args) {
        queue q=new queue();
        q.Enqueue(10);
        q.Enqueue(20);
        q.Enqueue(30);
        q.Enqueue(40);
        q.Enqueue(50);
        q.display();
        q.Dequeue();
        q.display();
    }
}
