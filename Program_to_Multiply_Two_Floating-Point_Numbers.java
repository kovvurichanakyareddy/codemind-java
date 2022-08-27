import java.util.*;
class Program_to_Multiply_Two_Floating_Point_Numbers{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float a= sc.nextFloat(),b=sc.nextFloat();
        double res=a*b;
        System.out.printf("%.2f",res);
    }
}