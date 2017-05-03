package com.javafordummies.justswitchit101;

/**
 * Created by cdramos on 2017-05-01.
 */

import static java.lang.System.out;
import java.util.Scanner;

public class JustSwitchIt {
    public static void main(String args[]){
        Scanner keyboard=new Scanner(System.in);
        out.print("Which verse? ");
        int verse=keyboard.nextInt();

        switch (verse) {
            case 1:
                out.println("Verse 1 asdfg");
                break;

            case 2:
                out.println("Verse 2 hjkl;");
                break;

            case 3:
                out.println("Verse 3 qwert");
                break;

            default:
                out.println("No such verse");
                break;
        }

        out.println("End of verse");

        keyboard.close();

    }
}
