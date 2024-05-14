package homework.programme_23_method_overriding;

public class Bike extends Vehicle {
    //defining the same method as in the parent class
    public void run(){
        System.out.println("Bike is running safely");
    }

    public static void main(String[] args) {
       //Creating object
        Bike obj = new Bike();
        //calling object
        obj.run();
    }
}
