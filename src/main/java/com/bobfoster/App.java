package com.bobfoster;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello Bob!" );
        // change
        int indx = justNull().indexOf('a');
        System.out.println(indx);
        double a = 0.0;
        if (a == Double.NaN) System.out.println("NaN");
    }
    
    private static String justNull() {
        return null;
    }
}
