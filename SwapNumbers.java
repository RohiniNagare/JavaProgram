public class SwapNumbers {
    public static void main(String[] args) {
        
        int a = 10;
        int b = 20;

        System.out.println("Before Swapping "+a +"    "+ b);


        //Logic 1- Using third variable
        // int t=a;  
        // a=b;
        // b=t;

        //Logic 2 - Without using third variable

        a=a+b;      //a=10+20=30
        b=a-b;      //b=30-20=10
        a=a-b;      //a=30-10=20

        /* //Logic 3 - Without using third variable(here the numbers should not be zero)
        
        a=a*b;
        b=a/b;
        a=a/b;

        //Logic 4 - Bitwise XOR

        a=a^b;
        b=a^b;
        a=a^b;

        //Logic 5 -Single Statement

        b=a+b-(a=b);    */



        System.out.println("After Swapping "+a +"    "+ b);

    }
}
