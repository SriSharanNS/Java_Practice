public class Method1 {

    public static void main(String[] args)
    {

        System.err.println("Main Begin1");
        test1();
        System.err.println("Main End1");

    }

    public static void test1()
    {
        System.err.println("Test 1");
        test2();
        
    }

    public static void test2()
    {
        System.err.println("Test 2");
        
    }
    
}
