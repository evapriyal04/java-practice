
    import java.util.Scanner;

    public class lpyear {
        public static void main(String[] args) {
            System.out.println("Enter a year:");
            Scanner input = new Scanner(System.in);
            int year = input.nextInt();

            // Leap year conditions
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println("It is a leap year");
            } else {
                System.out.println("Not a leap year");
            }

            input.close();
            
        }
    }


