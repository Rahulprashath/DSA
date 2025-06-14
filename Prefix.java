import java.util.*;
public class Prefix {
    public static int isValid(String s)
    {
        Stack<Integer> stack=new Stack<>();
        for(int i=s.length()-1;i>=0;i--)
        {
            char ch=s.charAt(i);
            if(Character.isDigit(ch))
            {
                stack.push(ch-'0');
            }
            else{
                 int a=stack.pop();
            int b=stack.pop();
            int res=0;
            switch (ch) {
                case '+':
                    res=a+b;
                    break;
                case '-':
                    res=a-b;
                    break;
                case '*':
                    res=a*b;
                    break;
                case '/':
                    res=a/b;
                    break;
                default:
                    break;
            }
            stack.push(res);
        }
    }
    return stack.pop();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(isValid(s));
    }
}
