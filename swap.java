import java.util.Scanner;
public class swap{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int a,b,temp;
        System.out.println("Enter the value of a and b");
        a = s.nextInt();
        b = s.nextInt();
        System.out.println("Before swapping");
        System.out.println("a : "+a);
        System.out.println("b : "+b);
        temp = a; 
        a = b;   
        b = temp; 
        System.out.println("After swapping");
        System.out.println("a : "+a);
        System.out.println("b : "+b);
    }
}
