package com.javadummies.authenticator101; /**
 * Created by cdramos on 2017-04-27.
 */

import javax.swing.JOptionPane;

public class Authenticator {
    public static void main(String args[]){
        String username=JOptionPane.showInputDialog("Username:");
        String password=JOptionPane.showInputDialog("Password:");

        if(
                !(username==null || password==null) &&
                        (
                                (username.equals("bburd") && password.equals("swordfish")) ||
                                        (username.equals("hritter") && password.equals("preakston")) ||
                                        (username.equals("chris") && password.equals("momma"))
                        )
                )
        {
            JOptionPane.showMessageDialog(null,"You're in.");
        }else{
            JOptionPane.showMessageDialog(null,"You're username or password is wrong");
        }
    }
}
