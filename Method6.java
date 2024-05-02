public class Method6 {
    public static void main(String[] args)
    {
        
        System.out.println("From Main");
        test(10, 20, 30);
        test(12.4f, 20, 2.45670);
    }

    public static void test(int a,int b, int c)
    {
        int sum=a+b+c;
        System.out.println(sum);
        
        
    }

    public static void test(float a , int b ,double c)
    {
        double prod = a*b*c;
        System.out.println(prod);
        
    }
}
