import java.util.*;
class Area_of_the_Triangle{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float a= sc.nextFloat(),b=sc.nextFloat(),c=sc.nextFloat();
        float s=(a+b+c)/2;
        double res=s*(s-a)*(s-b)*(s-c);
        res=Math.pow(res, 0.5);
        System.out.printf("%.2f",res);
    }
}