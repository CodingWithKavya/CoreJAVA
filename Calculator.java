
class Addnumbers
{
    public int add(int n1, int n2)
    {
        //int result = n1 + n2 ;
        //return result ;
        return n1 + n2 ;
    }
}

public class Calculator {

    public static void main(String arg[])
    {
        //int a = 10 ;
        // int b = 1 ;
        Addnumbers s1 = new Addnumbers();
        int r = s1.add(2 , 5);
        System.out.println("Addition of the given number is" + r);
    }
}
