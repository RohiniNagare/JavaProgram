import java.util.Scanner;

interface Calculate  {

    int add(int a, int b, int c);
    int sub(int a, int b, int c);
    int product(int a, int b, int c);
    int maximum(int a, int b, int c);
    int minimum(int a, int b, int c);
    
}

abstract class calculateNumbers implements Calculate{
    public int add(int a, int b, int c){
        return a+b+c;
    }
    public int sub(int a, int b, int c){
        return a-b-c;
    }
    public int product(int a, int b, int c){
        return a*b*c;
    }
    public int maximum(int a, int b, int c){
        if(a>b&&b>c){
            return a;
        }
        else if(b>c){
            return b;
        }
        else
        return c;
    }
    public int minimum(int a, int b,int c){
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
 class Operation extends calculateNumbers{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int a = sc.nextInt();
        System.out.println("Enter the second number : ");
        int b = sc.nextInt();
        System.out.println("Enter the third number : ");
        int c = sc.nextInt();

        Operation op = new Operation();
        System.out.println("Addition " + op.add(a, b, c));
        System.out.println("Subtraction " + op.sub(a, b, c));
        System.out.println("Multiplication " + op.product(a, b, c));
        System.out.println("Maximum " + op.maximum(a, b, c));
        System.out.println("Minimum " + op.minimum(a, b, c));
        sc.close();

            
        


    }
}
