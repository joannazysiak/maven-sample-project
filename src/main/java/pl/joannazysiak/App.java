package pl.joannazysiak;

import com.google.gson.Gson;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Object to Json" );
        
        Discount discount = new Discount(10);

        // Gson included in pom dependency
        System.out.println(new Gson().toJson(discount));
        System.out.println(discount.getValue());
    }
}
