class Human{
    private int age;
    private String name;

    public Human(){   // Default Constructor
        age=10;
        name="John";
    }
    public Human(int age){   //  Constructor with one parameter and one default value
        this.age=age;
        this.name="John";
        
    }
    public Human(int age, String name){     //Parameterized Constructor
        this.age=age;
        this.name=name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
}
public class Constructor {
    public static void main(String args[]){
        Human obj = new Human();
        Human obj2 = new Human(30);
        Human obj1 = new Human(20,"Sneha");
        System.out.println(obj.getName() + " : "+ obj.getAge());
        System.out.println(obj1.getName() + " : "+ obj1.getAge());
        System.out.println(obj2.getName() + " : "+ obj2.getAge());

    }
    
}
