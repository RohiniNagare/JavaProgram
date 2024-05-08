class A{
    public A(){
        super();
        System.out.println("In A");
    }
    public A(int r){
        super();
        System.out.println("In int A");
    }
}
class B extends A{
    public B(){
        super(7);
        System.out.println("In B");
    }
    public B(int r){
        super();
        System.out.println("In int B");
    }
}
public class Demo1 {
    public static void main(String args[]){
        B obj=new B();          //when we create a object of class it will call the constructor automatically

    }
    
}
