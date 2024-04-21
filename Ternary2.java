public class Ternary2 {
    public static void main(String[] args) {
        

        int a=50,b=20,c=-50;

        int second_largest = a>b ? ( a<c ? a : b>c ? b : c ) : ( b<c ? b : a<c ? c : a );

        System.out.println(second_largest);


    }
}
 