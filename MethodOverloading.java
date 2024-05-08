class Calculator{
    public int add(int n1,int n2,int n3){
        return n1+n2+n3;            //same method name but different number of parameters
    }
    public int add(int n1,int n2){
        return n1+n2;
    }
    public double add(int n1,double n2){
        return n1+n2;
    }
}
public class MethodOverloading {
    public static void main(String args[]){
        int num1=3;
        int num2=4;
        int num3=5;
        Calculator calc = new Calculator();
        double result = calc.add(num1, num2);
        int r = calc.add(num1, num2);
        int s = calc.add(num1, num2, num3);
        System.out.println(result);
        System.out.println(r);
        System.out.println(s);


    }
    
}
