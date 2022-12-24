import java.util.*;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        // int n=sc.nextInt();
        int n=5;
        int a[]=new int[n];
        int i=0,j=0;
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n-1;i++)
        {
            for(j=0;j<n-1-i;j++)
            {
                if(a[j]>a[j+1])
                {
                    int temp = a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        long max=0,min=0;
        for(i=1;i<n;i++)
        {
            max=max+a[i];
        }
        for(i=0;i<n-1;i++)
        {
            min=min+a[i];
        }
        System.out.print(min+" "+max);
    }
}