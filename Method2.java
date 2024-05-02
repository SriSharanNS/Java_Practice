public class Method2 {

    public static void main(String[] args) {
        
        System.err.println("Main begin");
        test(10,2.5f,30.45);
    }

    public static void test(int a , float b , double c)
    {
        double sum = a+b+c;
        System.err.println(sum);
    }
}
