//This is happens only in runtime polymorphism that is method overriding only called DYNAMIC METHOD DISPATCH

class A{
    public void show(){
        System.out.println("IN A SHOW");
    }
}
class B extends A{
    public void show(){
        System.out.println("IN B SHOW");
    }
}
class C extends A{
    public void show(){
        System.out.println("IN C SHOW");
    }
}


public class DynamicMethodDispatch {
    public static void main(String args[]){
        A obj = new A();
        obj.show();

        obj = new B();          //when we create object of particular class then it calls method of that class only
        obj.show();

        obj = new C();
        obj.show();
    }
    
}
