class Calculator{
    public int Add(int n1, int n2){
        int result = n1 + n2;
        return result;
    }
}
public class Add{
    public static void main(String args[]){
        int num1=4;
        int num2=5;

        Calculator calc = new Calculator();
        int r =calc.Add(num1, num2);
        System.out.println(r);


    }
}