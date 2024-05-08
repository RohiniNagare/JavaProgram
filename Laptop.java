class Demo{
    int price;
    String brand;
    static String name;         //Static variable 

    public void show(){
        System.out.println(price + " : " + brand + " : " + name);
    }
}
public class Laptop {
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




    }
}
