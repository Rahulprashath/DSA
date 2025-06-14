import java.util.*;
public class postfix {
public static int isValid (String s){
    Stack<Integer> stack=new Stack<>();
    for(char ch:s.toCharArray())
    {
        if(Character.isDigit(ch))
        {
            stack.push(ch-'0');
        }
        else
        {
            int b=stack.pop();
            int a=stack.pop();
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
        String s=sc.nextLine();
        System.out.println(isValid(s));
    }
}
