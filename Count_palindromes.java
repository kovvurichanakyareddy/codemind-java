import java.util.*;
class Count_palindromes{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int c=0;
        for(int i=0;i<n;i++)
        {
            int temp=arr[i],r,rev=0;
            while(temp!=0)
            {
                r=temp%10;
                rev=(rev*10)+r;
                temp/=10;
            }
            if(arr[i]==rev)
            {
                c++;
            }
        }
        System.out.print(c);
    }
}