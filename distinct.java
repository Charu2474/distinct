import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner d=new Scanner(System.in);
        int n=d.nextInt();
        int a[]=new int[n];
        int count=1;
        for(int i=0;i<n;i++)
        {
            a[i]=d.nextInt();
        }
        Arrays.sort(a);
        for(int i=1;i<n;i++)
        {
                if(a[i]!=a[i-1])
                {
                    count++;
                }
        }
        if(count==1)
        {
            System.out.println("There are "+count+" distinct element in the array.");
        }
        else
        {
            System.out.println("There are "+count+" distinct elements in the array.");
        }
    }
}
