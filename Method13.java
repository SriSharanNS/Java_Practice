public class Method13 {


    static int a=10;
    static
    {
        System.out.println("Static 1");
        System.out.println(a);
        test(20);
    }

    
    public static void main(String[] args) {
        
        System.out.println("From Main");
        test(20);
    }

    public static void test(int x)
    {
        System.out.println("test 3");
        a=30;
        System.out.println(a);
    }
}
