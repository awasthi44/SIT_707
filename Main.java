package sit707_tasks;

import java.util.Random;


public class Main 
{
    public static void main( String[] args )
    {   
    	/*
    	 * January max boundary area: max-1, max+1
    	 */
    	System.out.println("January max: increment should go to February.");
    	DateUtil date = new DateUtil(31, 1, 2024);
        System.out.println(date);
        date.increment();
        System.out.println(date);
        
        System.out.println("January max: decrement should be 30 January.");
    	date = new DateUtil(31, 1, 2024);
        System.out.println(date);
        date.decrement();
        System.out.println(date);
        
        /*
         * January nominal (somewhere between min and max)
         */
        System.out.println("January random day between (1, 31): increment should be 1 day next.");
        int rand_day_1_to_31 = 1 + new Random().nextInt(31);
        date = new DateUtil(rand_day_1_to_31, 1, 2024);
        System.out.println(date);
        date.increment();
        System.out.println(date);
        
        /*
         * January min boundary area: min+1, min-1
         */
        System.out.println("January min: increment should be 2nd January.");
    	date = new DateUtil(1, 1, 2024);
        System.out.println(date);
        date.increment();
        System.out.println(date);
        
        System.out.println("January min: decrement should be 31 December previous year.");
        date = new DateUtil(1, 1, 2024);
        System.out.println(date);
        date.decrement();
        System.out.println(date);    
        
        
        
        
    	/*
    	 * February max boundary area: max-1, max+1
    	 */
    	System.out.println("February max: increment should go to March.");
    	DateUtil date1 = new DateUtil(29, 2, 2024);
        System.out.println(date1);
        date1.increment();
        System.out.println(date1);
        
        System.out.println("February max: decrement should be 28 February.");
    	date1 = new DateUtil(29, 2, 2024);
        System.out.println(date1);
        date1.decrement();
        System.out.println(date1);
        
        /*
         * February nominal (somewhere between min and max)
         */
        System.out.println("February random day between (1, 28): increment should be 1 day next.");
        int rand_day_1_to_29 = 1 + new Random().nextInt(31);
        date1 = new DateUtil(rand_day_1_to_29, 2, 2024);
        System.out.println(date1);
        date1.increment();
        System.out.println(date1);
        
        /*
         * February min boundary area: min+1, min-1
         */
        System.out.println("February min: increment should be 2nd February.");
    	date1 = new DateUtil(1, 2, 2024);
        System.out.println(date1);
        date1.increment();
        System.out.println(date1);
        
        System.out.println("February min: decrement should be 31 January previous year.");
        date1 = new DateUtil(1, 2, 2024);
        System.out.println(date1);
        date1.decrement();
        System.out.println(date1);    
    }
}
