public class Ternary4 {
    public static void main(String[] args) {
        
        int year = 2024;

        String res = (year%4==0 && year%100!=0) || (year%400==0) ? "Leap Year":"Not Leap Year";

        System.out.println(res);
    }
}
