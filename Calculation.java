import java.util.Scanner;

class Demo{
    
    public int sum(int a,int b,int c){
        return a+b+c;
    
    }
    public int sub(int a,int b,int c){
        return a-b-c;
    }
    public int product(int a,int b,int c){
        return (a*b)*c;
    }
    public int max(int a,int b,int c){
        if(a>b&&b>c){
            return a;
        }
        else if(b>c){
            return b;
        }
        else
        return c;
    }
    public int min(int a,int b,int c){
        if(a<b&&a<c){
            return a;
        }
        else if(b<c){
            return b;
        }
        else
        return c;
    }
}
public class Calculation {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number : ");
        int a = sc.nextInt();
        System.out.println("Enter second number : ");
        int b = sc.nextInt();
        System.out.println("Enter third number : ");
        int c = sc.nextInt();

        Demo obj=new Demo();
        System.out.println("Addition " + obj.sum(a, b, c));
        System.out.println("Subtraction " + obj.sub(a, b, c));
        System.out.println("Multiplication " + obj.product(a, b, c));
        System.out.println("Maximum " + obj.max(a, b, c));
        System.out.println("Minimum " + obj.min(a, b, c));
        sc.close();

    }
}
