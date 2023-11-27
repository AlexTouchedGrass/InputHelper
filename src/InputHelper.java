import java.util.Scanner;

public class InputHelper {
    public static void main(String[] args) {
        //Test Methods
        Scanner scan = new Scanner(System.in);

        //Size Checker
        System.out.println(getInt(scan, "Please enter your size.")); //Results are confidential.

        //Range Checker
        int iRange = getRangedInt(scan,"Please enter an int between 1 and 10.",1,10);
        System.out.println("Your number is " + iRange);

        //Double Range Checker
        double dRange = getDoubleRangedInt(scan, "Please enter a double between 1 and 10",1,10);
        System.out.println(getDoubleRangedInt(scan,"Please enter an double between 1 and 10.",1,10));

        //Social Security Check
        String ssn = getRegExString(scan, "Please enter your SSN [xxx-xx-xxxx]", "\\d{3}-\\d{2}-\\d{4}");
        System.out.println("Your SSN: " + ssn);

        //Date Of Birth Check
        String dob = getRegExString(scan, "Enter your date of birth [mm.dd.yyyy]","\\d{2}\\d{2}\\d{4}");
        System.out.println("Your date of birth is " + dob);


    }
        //This method loops until a valid integer input is received. Returns int value.
        public static int getInt(Scanner in, String prompt){
            boolean done = false;
            int x = 0;

            System.out.println(prompt);
            do{
                if(in.hasNextInt()){
                    x = in.nextInt();
                    done = true;
                }
                in.nextLine(); //buffer
            } while (!done);
            return x;
        }

        public static int getRangedInt(Scanner in, String prompt, int min, int max){
            boolean done = false;
            int x = 0;

            System.out.println(prompt);
            do{
                if(in.hasNextInt()){
                    x = in.nextInt();
                    //Check to see if number is in range
                    if (x<= max && x >= min) {
                        done = true;
                 }
                done = true;
            }
                in.nextLine(); //buffer
            } while (!done);
            return x;
    }

    public static String getRegExString(Scanner in, String prompt, String regEx) {
        boolean done = false;
        String input;
        do {
            System.out.println(prompt);
            input = in.nextLine();
            if (input.matches(regEx)) {
                done = true;
            } else {
                System.out.println("Invalid Input.");
            }

        } while(!done);
        return input;

    }

    public static double getDoubleRangedInt(Scanner in, String prompt, double min, double max){
        boolean done = false;
        double dx = 0;
        do{
            System.out.println(prompt);
            if(in.hasNextDouble()){
                dx = in.nextInt();
                //Check to see if number is in range
                if (dx<= max && dx >= min) {
                    done = true;
                }
                done = true;
            }
        }while(!done);
        return dx;
    }


}
