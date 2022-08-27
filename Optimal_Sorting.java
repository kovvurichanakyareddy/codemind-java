import java.util.*;
class Optimal_Sorting{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int nt=sc.nextInt();
        for(int e=0;e<nt;e++)
        {
            int n=sc.nextInt();
            int[] arr= new int[n];
            int[] ar2= new int[n];
            int c=0,i,j,min=999,max=-999;
            for(i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
                ar2[i]=arr[i];
                if(arr[i]>max)
                {
                    max=arr[i];
                }
                if(arr[i]<min)
                {
                    min=ar2[i];
                }
            }
            for(i=0;i<n-1;i++)
            {
                for(j=i+1;j<n;j++)
                {
                    if(ar2[i]>ar2[j])
                    {
                        int temp=ar2[i];
                        ar2[i]=ar2[j];
                        ar2[j]=temp;
                    }
                }
            }
            for(i=0;i<n;i++)
            {
                if(arr[i]!=ar2[i])
                {
                    c=1;
                }
            }
            if(c==0)
            {
                System.out.println(c);
            }
            else
            {
                System.out.println(max-min);
            }
        }
    }
}