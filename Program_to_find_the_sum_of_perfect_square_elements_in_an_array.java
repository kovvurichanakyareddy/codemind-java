import java.util.*;
class Sum_of_perfect_sq_in_arr{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            for(int j=0;j<=arr[i];j++)
            {
                if(arr[i]==j*j)
                {
                    sum+=arr[i];
                }
            }
        }
        System.out.print(sum);
    }
}