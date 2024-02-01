package org.example.view;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MyIo {
    private BufferedReader user = new BufferedReader(new InputStreamReader(System.in));
    public String getUserString(String prompt, boolean required){
        String input = "";
        boolean loop = true;
        while (loop) {
            if (prompt != null) {
                System.out.print(prompt);
            }
            try {
                input = user.readLine();
                loop = (required && (input.length() < 1));
            }
            catch (Exception ex){
                System.out.println("Invalid Input");
            }
        }
        return input;
    }

    public int getUserInt(String prompt, boolean required){
        int input = 0;
        boolean loop = true;
        while (loop){
            try {
                input = Integer.parseInt(getUserString(prompt,required));
                loop = false;
            } catch (Exception ex){
                System.out.println("Invalid Input, Try Again");
            }
        }
        return input;
    }

    public int int_Min_MAx(String prompt, int min, int max, boolean isRequired){
        boolean bLoop = true;
        int iReturn = 0;
        while (bLoop) {
            try {
                iReturn = getUserInt(prompt,isRequired);
                if (iReturn >= min && iReturn <= max)
                    return iReturn;
            } catch (Exception zz) {

            }
        }
        return iReturn;
    }
}
