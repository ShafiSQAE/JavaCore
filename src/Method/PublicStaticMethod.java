package Method;

public class PublicStaticMethod {

    static void staticMethod(){
        System.out.println("Static Method can be accessed without creating an object");
    }

    public void publicMethod(){
        System.out.println("Public Method cannot be accessed without creating an object");
    }

    public static void main(String[] args) {
        PublicStaticMethod publicStaticMethod=new PublicStaticMethod();

        staticMethod();
        publicStaticMethod.publicMethod();
    }
}
