//[1]problem statment related to the abstract class
//do we need implement 
//[2]problem statement related to the inheriated, all subclass have to implement the overriding function

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        //Computer compGen = new Computer(1);
        Macintosh comp1 = new Macintosh("Green");
        PC comp2 = new PC();
        PC comp3 = new PC();

        //comp1.setType(2);
        System.out.println(comp1.getType());
        System.out.println(comp2.getType());
        
        //update desciption
        comp2.updateDesription("I'm a PC",1);
        comp2.setSubType(2);
        System.out.println(comp2.getDescription());
        comp3.updateDesription("I'm a PC as well",2);
        System.out.println(comp3.getDescription());

        System.out.println("End, World!");

    }
}
