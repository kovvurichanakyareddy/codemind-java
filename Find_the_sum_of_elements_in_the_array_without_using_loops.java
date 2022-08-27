import java.util.*;
class Sum_of_elements_without_Loops{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Sum_of_elements_without_Loops fun=new Sum_of_elements_without_Loops();
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.print(fun.sumofarr(n,arr,0,0));
    }
    public int sumofarr(int n,int arr[],int sum,int i){
        sum+=arr[i];
        if(i==n-1)
        {
            return sum;
        }
        else
        {
            return sumofarr(n,arr,sum,i+1);
        }
    }
}