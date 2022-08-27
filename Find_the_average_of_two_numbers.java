import java.util.*;
class Find_the_average_of_two_numbers{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float a= sc.nextFloat(),b=sc.nextFloat();
        double res=(a+b)/2;
        System.out.printf("%.4f",res);
    }
}