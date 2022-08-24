import java.util.*;
class Count_elements_divisible_by_k{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),k=sc.nextInt(),c=0;
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            if(arr[i]%k==0){
                c++;
            }
        }
        System.out.print(c);
    }
}