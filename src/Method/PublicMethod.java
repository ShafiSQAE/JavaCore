package Method;

public class PublicMethod {

    public void myMethod(){
        System.out.println("To access public method we need to create an object");

    }

    public static void main(String[] args) {
        PublicMethod method=new PublicMethod();
        method.myMethod();
    }
}
