import java.util.*;
public class SimpleCalculator{
    public static double add(double x, double y){
        return x+y; 
    }
    public static double subtract(double x, double y){
        return x-y;
    }
    public static double mul(double x, double y){
        return x*y;
    }
    public static double div(double x, double y){
        return x/y;
    }
    public static double mod(double x, double y){
        return x%y;
    }
    public static void main(String[] args) {
        System.out.println("Simple Calculator:");
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter first number: ");
        double a = ob.nextDouble();
        System.out.println("Enter second number: ");
        double b = ob.nextDouble();

        System.out.println("Addition of "+a+" and "+b+" is "+ add(a,b));
        System.out.println("Subtraction of "+a+" and "+b+" is "+ subtract(a,b));
        System.out.println("Multiplication of "+a+" and "+b+" is "+ mul(a,b));
        System.out.println("Division of "+a+" and "+b+" is "+ div(a,b));
        System.out.println("Mod of "+a+" and " +b+ " is "+mod(a,b));
        ob.close();
    }
}