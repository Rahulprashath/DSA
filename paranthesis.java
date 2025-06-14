import java.util.*;
public class paranthesis {
    public static boolean isvalid(String s)
    {
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
           char ch=s.charAt(i);
        if(ch=='(' || ch=='{'||ch=='[')
        {
            stack.push(ch);
        }
        else
        {
            if(stack.isEmpty())
            {
                return false;
            }
            char top=stack.pop();
            if((ch==')' && top!='(' || 
            ch=='}' && top!='{' ||
            ch==']' && top!='[' ))
            {
                return false;
            }
        }
    }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String[] s= new String[n];
        for(int i=0;i<n;i++)
        {
            s[i]=sc.nextLine();
        }
        for(int i=0;i<n;i++)
        {
            if(isvalid(s[i]))
            {
                System.out.println("Valid");
            }
            else{
                System.out.println("Invalid");
            }
        }
    }


    }

