public class StaticMethod {

    public static void myMethod(){

        System.out.println("This is a static method");
    }

    public static void main(String[] args) {   //doesn't require an object in order to be called
        myMethod();
    }
}
