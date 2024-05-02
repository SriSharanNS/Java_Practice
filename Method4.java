public class Method4 {

    public static void main(String[] args) {
        
        System.out.println("Main begin");
        test1(10,20,30);


        int res_final = test2(100,200,300);
        System.out.println(res_final);
        
    }

    public static void test1(int a,int b,int c)
    {
        int sum=a+b+c;
        System.out.println(sum);
    }

    public static int test2(int a,int b,int c)
    {
        int res=a+b+c;
        System.out.println("res " +res );
        return res;
    }
    
}
