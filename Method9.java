public class Method9 {
    public static void main(String[] args) {
        
        System.out.println("Main 1");
        main(10,20);
       

        float res= main(10, 20.5f);
        System.out.println(res);

        System.out.println( main(10, 20.5f));
        
        
    }

    public static void main(int a,int b) {
        
        System.out.println("Main 2");
        int sum=a+b;
        System.out.println(sum);
    }

    public static float main(int a , float b) {
        
        System.out.println("Main 3");
        float prod = a*b;
        System.out.println(prod);
        return prod;
        
    }
}
