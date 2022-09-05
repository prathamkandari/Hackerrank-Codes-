import java.io.*;
import java.util.*;

public class JavaStringReverse 
{

    public static void main(String[] args) 
    {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        String B="";
        int i=0;
        char ch;
        for(i=A.length()-1;i>=0;i--)
        {
            ch=A.charAt(i);
            B=B+ch;
        }
        if(B.equals(A))
        {
            System.out.println("Yes");
        }
        else 
        {
            System.out.println("No");        
        }
    }
}



