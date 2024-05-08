public class NestedWhile{
    public static void main(String args[]){
        int i=1;
        
        while(i<=3){
           System.out.println("Hey" + i);
            int j=1;
            while(j<=3){
                System.out.println("Hello" + j);
                j++;
            }
             i++;
           
        }
        System.out.println("Bye" + i);

    }
}