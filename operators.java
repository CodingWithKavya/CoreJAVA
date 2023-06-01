public class operators {
    
    public static void main(String arg[])
    {
        int num = 5;
        int result = num++ ;//First feltch the value of nume and then increment it
        System.out.println(result);
        int num2 = 5 ;
        int outcome = ++num2 ;
        System.out.println(outcome); // First increment 

        int x= 5 ;
        int y = 7 ;
        boolean compare = x > y;
        boolean compare1 = x >= y && x==y ;
        boolean compare2 = x != y ;
        boolean compare3 = x == y ;
        System.out.println(compare);
        System.out.println(compare1);
        System.out.println(compare2);
        System.out.println(compare3);

        //Ternary operator  ?:
        int n = 10 ;
        int output1  = n%2==0 ? 10 : 20 ; // if the condition is true value of variable out is 10 , if the condition is false then value will be 20 
    

    }
}
