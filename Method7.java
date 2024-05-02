public class Method7 {
    
    public static void main(String[] args)
    {
        
        System.out.println("From Main");
        int res1 = test(10, 20, 30);
        double res2 = test(12.4f, 20, 2.45670);
        System.out.println("Result in main "+res1);
        System.out.println("Result in main "+res2);
    }

    public static int test(int a,int b, int c)
    {
        int sum=a+b+c;
        System.out.println(" Sum in method is "+sum);
        return sum;
        
        
    }

    public static double test(float a , int b ,double c)
    {
        double prod = a*b*c;
        System.out.println(" Product in method is "+prod);
        return prod;
        
    }
}
