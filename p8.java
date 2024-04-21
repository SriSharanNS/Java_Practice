public class p8 {
    public static void main(String[] args) {
        
        int a=20,b=30,c=45;

        int greatest = a>b ? ( a>c?a:c ) : ( b>c?b:c );

        System.out.println(greatest);

        System.out.println(a>b ? ( a>c?a:c ) : ( b>c?b:c ));

    }
}

  