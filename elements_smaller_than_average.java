import java.util.*;
class Elements_smaller_than_average{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];
        int f,i,j,c=0;
        double avg,s=0.00,t=0.00;
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            s+=arr[i];
            t++;
        }
        avg=s/t;
        for(i=0;i<n;i++)
        {
            if(arr[i]<=avg)
            {
                c++;
            }
        }
        System.out.print(c);
    }
    
}