public class p20 {
    public static void main(String[] args) {


        int a=10,b=20;
        int choice=2;
        System.out.println("1.Square 2.Circle 3.Rectangle");

        switch (choice)
         {
            case 1: System.out.println("Area of Square "+(a*a));
                    break;
            case 2: System.out.println("Area of circle "+(2*3.14*a));
                    break;
            case 3: System.out.println("Area of Rectangle "+(a*b));
                    break;
            default:System.out.println("Invalid Input");
                    break;
        }

    }
    
}
