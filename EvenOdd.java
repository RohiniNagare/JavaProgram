public class EvenOdd
{
    public static void main(String args[]){
        int a = 48;
        boolean result = a%2==0 ? true : false; //ternary operator
        System.out.println(result);
        if(a%2==0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
}
