import java.util.*;
class array_of_odd_and_even_elements{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(),t=0;
        int[] arr=new int[n];
        int[] res=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            if(arr[i]%2!=0)
            {
                res[t]=arr[i];
                t++;
            }
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]%2==0)
            {
                res[t]=arr[i];
                t++;
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(res[i]+" ");
        }
    }
}