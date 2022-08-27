import java.util.*;
class Grades_of_Rides{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int h=sc.nextInt(),s=sc.nextInt(),sd=sc.nextInt();
        if(h>50 && s>60 && sd>100)
        {
            System.out.print(10);
        }
        else if(h>50 && s>60 && sd<=100)
        {
            System.out.print(9);
        }
        else if(h<=50 && s>60 && sd>100)
        {
            System.out.print(8);
        }
        else if(h>50 && s<=60 && sd>100)
        {
            System.out.print(7);
        }
        else if(h>50 || s>60 || sd>100)
        {
            System.out.print(6);
        }
        else
        {
            System.out.print(5);
        }
    }
}