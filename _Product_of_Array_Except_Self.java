import java.util.*;
public class Product_of_Array_Except_Self {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            int pro=1;
            for(int j=0;j<n;j++)
            {
                if(j!=i)
                {
                    pro*=arr[j];
                }
            }
            System.out.print(pro+" ");
        }
        sc.close();
    }
}