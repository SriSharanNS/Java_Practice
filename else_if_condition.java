public class else_if_condition {
    public static void main(String[] args) {
        

        int year = 2016;

        if(year%4==0 && year%100!=0)
        {
            System.out.println(year+" is leap year");
        }
        else if (year%400==0)
        {
            System.out.println(year+" is leap year");
        }
        else
        {
            System.out.println(year+" is not leap year");
        }

    }
}
