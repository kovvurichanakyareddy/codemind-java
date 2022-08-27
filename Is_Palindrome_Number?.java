import java.util.*;
class Is_Palindrome_Number{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Is_Palindrome_Number fun = new Is_Palindrome_Number();
        System.out.print(fun.ispalindrome(sc.nextInt()));
    }
    public int ispalindrome(int n){
        int temp=n,r,rev=0;
        while(temp!=0)
        {
            r=temp%10;
            rev=(rev*10)+r;
            temp/=10;
        }
        if(n==rev)
        {
            return 2;
        }
        else
        {
            return 1;
        }
    }
}