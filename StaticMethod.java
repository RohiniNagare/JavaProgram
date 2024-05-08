/*we can not call static method by non-static variable 
to solve this we has to create a object of that class and call by the reference of that object*/


class Demo{
    int price;
    String brand;
    static String name;         //Static variable 

    public void show(){
        System.out.println(price + " : " + brand + " : " + name);
    }

    public static void show1(Demo obj){                 //static method 
        System.out.println(obj.price + " : " + obj.brand + " : " + name);
    }
}


public class StaticMethod {
    public static void main(String args[]){
        Demo obj1=new Demo();
        obj1.brand="ABC";
        obj1.price=1200;
        Demo.name="HP";             //static variable value should be declare using class name not using object

        Demo obj2=new Demo();
        obj2.brand="XYZ";
        obj2.price=1500;
        Demo.name="HP";

        Demo.name="DELL";

        obj1.show();
        obj2.show();
        Demo.show1(obj1);

    }
    
}
