import java.util.*;
class Program_to_check_whether_the_given_integer_is_posittive_or_negative{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<0)
        {
            System.out.print("Negative Number");
        }
        else
        {
            System.out.print("Positive Number");
        }
    }
}