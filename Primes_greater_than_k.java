import java.util.*;
class Primes_greater_than_k{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(),k,c=0,f;
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        k=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(arr[i]>=k)
            {
                f=0;
                for(int j=1;j<=arr[i];j++)
                {
                    if(arr[i]%j==0)
                    {
                        f++;
                    }
                }
                if(f==2)
                {
                    c++;
                }
            }
        }
        System.out.print(c);
    }
}