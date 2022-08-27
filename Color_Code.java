import java.util.*;
class Color_Code {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		char s=sc.next().charAt(0);
		if(s=='V'||s=='v')
		{
			System.out.print("Violet");
		}
		else if(s=='I'||s=='i')
		{
			System.out.print("Indigo");
		}
		else if(s=='B'||s=='b')
		{
			System.out.print("Blue");
		}
		else if(s=='G'||s=='g')
		{
			System.out.print("Green");
		}
		else if(s=='Y'||s=='y')
		{
			System.out.print("Yellow");
		}
		else if(s=='O'||s=='o')
		{
			System.out.print("Orange");
		}
		else if(s=='R'||s=='r')
		{
			System.out.print("Red");
		}
		else
		{
			System.out.print(-1);
		}
	}

}