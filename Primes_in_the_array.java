import java.util.*;
class Primes_in_the_array{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];
        int f,i,j,c=0;
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            f=0;
            for(j=1;j<=arr[i]/2;j++)
            {
                if(arr[i]%j==0)
                {
                   f++; 
                }
            }
            if(f==1)
            {
                c++;
            }
        }
        System.out.print(c);
    }
    
}