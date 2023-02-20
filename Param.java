public class Param {
    public static void pars(int a, double b, double c, boolean d, String e){
        System.out.println("My Bbday is " + a); //date of your birth day
        System.out.println("The current 30-year fized mortgage rate is " + b); //the current 30-year fixed mortgage rate
        System.out.println("The current currency exchange rate in euros for a dollar is " + c); //the current currency exchage rate in euros for a dollar
        System.out.println("Today is Sunday " + d); //whether today is sunday or not, true or false?
        System.out.println("the home country is " + e); //the name of your home state or country
    } 
    public static void main(String[] args){
        pars(2005, 6.38, 0.92, false, "South Korea" );
    }
}    