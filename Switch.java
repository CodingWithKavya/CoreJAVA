public class Switch {
    public static void main(String a[])
    {
        int n = 5 ;
// The moment switch maches with case it will execute everything after the match statement , Other wise we need to use break statement
        switch(n){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            default :
                System.out.println("Enter a valid number");

        }
    }
}
