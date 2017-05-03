package com.javafordummies.justswitchit101;

/**
 * Created by cdramos on 2017-05-01.
 */

import java.util.Scanner;

import static java.lang.System.out;

public class FallThrough {
    public static void main(String args[]){
        Scanner keyboard=new Scanner(System.in);
        out.print("Which verse? ");
        int verse=keyboard.nextInt();

        switch (verse) {
            case 3:
                out.print("Last refrain, ");
                out.println("Last refrain,");

            case 2:
                out.print("He's a pain, ");
                out.println("He's a pain,");

            case 1:
                out.print("Has no brain, ");
                out.println("Has no brain,");

        }

        out.println("In the rain, In the rain.");
        out.println();
        out.println("End of verse");

        keyboard.close();

    }
}
