import java.util.*;
class Compare_Triplets{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] a=new int[3];
        int[] b=new int[3];
        for(int i=0;i<3;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<3;i++)
        {
            b[i]=sc.nextInt();
        }
        int alice=0,bob=0;
        for(int i=0;i<3;i++)
        {
            if(a[i]>b[i])
            {
                alice++;
            }
            if(a[i]<b[i])
            {
                bob++;
            }
        }
        System.out.print(alice+" "+bob);
        sc.close();
    }
}