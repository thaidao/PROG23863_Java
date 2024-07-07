package com.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello assignment 1st" );

        int numA = 20;
        int numB = 100;
        int sum = numA - numB;

        //Demonstrate "if statement" knowledge
        System.out.println("Demonstrate \"if statement\" knowledge");
        if(sum > 0)
        {
            System.out.println( "Num A is greater than num B" ); 
        }else if (sum == 0){
            System.out.println( "Num A is equal to num B" ); 
        }else{
            System.out.println( "Num A is smaller than num B" ); 
        }

        //Demonstrate "loop" knowledge - do while
        //print cnt from 0 to 5
        System.out.println("Demonstrate \"loop\" knowledge - do while");
        int cnt = 0;
        do{    
            cnt++;
            // if cnt is greater than 5, ignore the rest of loop
            if (cnt > 5)
                continue;
            
            //print out cnt
            System.out.print(cnt);
            System.out.print(",");

        }while(cnt < 10);
        System.out.println();

        //Demonstrate "loop" knowledge - while
        //print even number from 0 to 10
        System.out.println("Demonstrate \"loop\" knowledge - while");
        int idx = 0;
        while (idx<20)
        {
            System.out.println(idx);
            idx += 2;
            // if idx is greater than 10, exit the loop
            if (idx > 10)
            {
                break;
            }
        }

        //Demonstrate "loop" knowledge - for
        //print odd number from 10 to 0
        System.out.println("Demonstrate \"loop\" knowledge - for");
        for(int i = 10; i > 0; i--)
        {
            if(i%2 != 0)
            {
                System.out.println(i);
            }
        }

        //show the shortcut if statement
        System.out.println("Show the shortcut if statement");
        boolean cond1 = true;
        boolean cond2 = false;
        boolean result = (cond1 == cond2) ? true : false;
        
        if (result)
        {
            System.out.println("2 conditions are same");
        }else{
            System.out.println("2 conditions are difference");
        }
    }
}
