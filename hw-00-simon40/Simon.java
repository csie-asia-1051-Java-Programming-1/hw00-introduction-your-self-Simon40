import java.util.*;
public class Simon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        System.out.println("Please input a =");
        int a=scn.nextInt();
        System.out.println("Please input b =");
        int b=scn.nextInt();
        int c=a+b;
        int d=a-b;
        int e=a*b;
        int f=(int)a/b;
        float g=(float)a%b;
        System.out.println("a+b="+c);
        System.out.println("a-b="+d);
        System.out.println("a*b="+e);
        System.out.println("a/b="+f);
        System.out.println("a%b="+g);        
	}

}
