package com.javafordummies.justswitchit101;

/**
 * Created by cdramos on 2017-05-01.
 */

import java.util.Scanner;

import static java.lang.System.out;

public class JustSwitchIt2 {
    public static void main(String args[]){
        Scanner keyboard=new Scanner(System.in);
        out.print("Which verse (one, two or three)? ");
        String verse=keyboard.next();

        switch (verse) {
            case "one":
                out.println("That's because he has no brian.");
                break;

            case "two":
                out.println("That's because he is a pain.");
                break;

            case "three":
                out.println("'Cause this is the last refrain.");
                break;

            default:
                out.println("No such verse. Please try again.");
                break;
        }

        out.println("End of verse");

        keyboard.close();

    }
}
