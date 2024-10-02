// Create a program to convert Fahrenheit to Celsius
//°C = (°F-32) x 5/9
import java.util.Scanner;
public class convert {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter temperature in Fahrenheit");
        float fahrenheit = input.nextFloat();
        float celsius=(fahrenheit-32)*5/9.0f;
        System.out.println(" temperature in celsius is\t"+celsius);

    }
}
