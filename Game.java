import java.util.*;
class Arr{
    int top=-1;
    int [] arr;
    Arr(int n)
    {
        arr = new int[n];
    }
    public void push(int id)
    {
        if(top==arr.length-1)
        {
            System.out.println("Full");
        }
        top++;
        arr[top]=id;
    }
    public int pop(int flag)
    {
        if(top==-1)
        {
            System.out.println("Empty");
        }
        int temp=arr[top];
        top=top+flag;
        return temp;
    }

}
public class Game {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);      
        int n=sc.nextInt();
        int ip=sc.nextInt();
        Arr a=new Arr(n);
        int flag=0;
        for(int i=0;i<n;i++)
        {
            char ch=sc.next().charAt(0);
            if(ch=='F')
            {
                int id=sc.nextInt();
                a.push(id);
                flag=-1;
            }
            else if(ch=='R')
            {
                a.pop(flag);
                flag=1;
            }
        }
        System.out.println("Player"+a.pop(flag));

    }
}
