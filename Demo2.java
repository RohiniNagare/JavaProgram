class A{
    public A(){
        super();        //no need to write super it is by default super 
        System.out.println("In A");
    }
    public A(int r){
        super();
        System.out.println("In int A");
    }
}
class B extends A{
    public B(){
        super();        //super will call the constructor of parent class
        System.out.println("In B");
    }
    public B(int r){
        this();         //this will call the constructor of same class
        System.out.println("In int B");
    }
}
public class Demo2 {
    public static void main(String args[]){
        B obj=new B(7);

    }
    
}
