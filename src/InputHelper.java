
import com.sun.xml.internal.fastinfoset.tools.XML_SAX_StAX_FI;

import java.util.Scanner;

public class InputHelper {
    public static void main(String[] args) {
        //Test Methods
        Scanner scan = new Scanner(System.in);
        System.out.println(getInt(scan,"Please enter an int between 1 and 10.",1,10));


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


}
