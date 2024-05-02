public class Method3 {

    public static void main(String[] args) {
        
        System.err.println("Main begin");
        test("abc",'a',true);
    }

    public static void test(String a , char b , boolean c)
    {
        String sum = a+b+c;
        System.err.println(sum);
    }
}
