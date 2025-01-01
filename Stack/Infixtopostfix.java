import java.io.*;
class Stacks{

    char arr[]=new char[100];
    int top=-1;

    void push(char c)
    {
        try{
             arr[++top]=c;
        }
        catch(Exception e)
        {
            System.out.println(e);
            System.exit(0);
        }
    }

    char pop()
    {
        return arr[top--];
    }

    char peek()
    {
        return arr[top];
    }

    boolean isEmpty()
    {
        if(top==-1)
        {
            return true;
        }
        return false;
    }
}

class Infixtopostfix{

    static Stacks obj=new Stacks();
    public static void main(String args[]) throws IOException{
        
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Infix expression:");
        String infix=br.readLine();

        System.out.println("Conversion from infix to postfix:"+toPostfix(infix));
    }

    private static String toPostfix(String infix)
    {
      char symbol;
      StringBuilder postfix=new StringBuilder();

      for(int i=0;i<infix.length();i++)
      {
        symbol=infix.charAt(i);

        if(Character.isLetterOrDigit(symbol))
        {
          postfix.append(symbol);
        }
        else if(symbol=='(')
        {
            obj.push(symbol);
        }
        else if(symbol==')')
        {
            while(obj.peek()!='(')
            {
                postfix.append(obj.pop());
            }
            obj.pop();
        }
        else
        {
            while (!obj.isEmpty() && obj.peek() != '(' && prec(symbol) <= prec(obj.peek()))
            {
                postfix.append(obj.pop());
            }
            obj.push(symbol);
        }
      }
      while(!obj.isEmpty())
      {
        postfix.append(obj.pop());
      }
      return postfix.toString();
    }

    static int prec(char c)
    {
        if(c=='+' || c=='-')
        return 1;
        else if(c=='/' || c=='*')
        return 2;

        return 0;
    }
}


