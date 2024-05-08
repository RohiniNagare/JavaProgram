class Human{
    private int age;
    private String name;

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
public class Encapsulation {
    public static void main(String args[]){
        Human obj = new Human();
        obj.setAge(22);
        obj.setName("Rohini");
        System.out.println("Name : " + obj.getName());
        System.out.println("Age : " + obj.getAge());

    }
    
}
