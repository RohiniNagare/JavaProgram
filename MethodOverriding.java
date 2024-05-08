//Method Overriding is same method name and same number of parameters but performs different operations


class Calc{
    public int add(int n1, int n2){
        return n1+n2;
    }
}
class AdvCalc extends Calc{
    public int add(int n1, int n2){
        return n1+n2+2;                          //It will override the add method of parent class
    }
}

public class MethodOverriding {
    public static void main(String args[]){
        AdvCalc obj = new AdvCalc();
        System.out.println(obj.add(5, 6));
    }
}
