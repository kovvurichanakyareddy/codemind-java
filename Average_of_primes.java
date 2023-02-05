import java.util.*;
class Average_of_primes{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];
        int f,i,j;
        double avg,s=0.00,c=0.00;
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
                s+=arr[i];
                c++;
            }
            //System.out.println(s+" "+c);
        }
        if(c==0)
        {
            System.out.print("0.00");
        }
        else
        {
        avg=s/c;
        System.out.format("%.2f",avg);
        }
    }
    
}