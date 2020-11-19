package com.safero.regexsimplifier;

import android.content.Context;
import android.widget.Toast;

public class Regexsimplifier {

    public static Regexsimplifier instance = new Regexsimplifier();

    private static int passlength = 10;


    private Regexsimplifier(){

    }


    //Check for a valid email
    //return false if the email syntax is incorrect


    public static Regexsimplifier getinstance() {

        return instance;

    }

    public boolean checkgmail(Context context,String gmail) {

        if(gmail.matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$")) {

            return true;

        }
        // Toast will be here
        Toast.makeText(context,"Please enter a valid email",Toast.LENGTH_SHORT).show();
        return false;
    }

    public boolean checkphonenumber(Context context , String number) {

        if(number.matches("^[+]*[(]{0,1}[0-9]{1,4}[)]{0,1}[-\\s\\./0-9]*$")) {


            return true;
        }
        // Toast will be here
        Toast.makeText(context,"Please enter a valid Phone number",Toast.LENGTH_SHORT).show();

        return false;

    }

    public boolean checkpassword(Context context , String password) {
        if(password.length() == passlength) {
            if(password.matches("^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[a-zA-Z]).{8,}$")) {

                return true;
            }
            else {

                // Toast will be here
                Toast.makeText(context,"Please enter a valid Password",Toast.LENGTH_SHORT).show();

                return false;

            }

        }
        else {

            // Toast will be here
            Toast.makeText(context,"Password should of length "+passlength,Toast.LENGTH_SHORT).show();

            return false;

        }


    }

    public static void setpasslength(int len) {

        passlength = len;


    }
    public boolean checkfordate(Context context , String date) {



        if(date.matches("^([0-2][0-9]|(3)[0-1])(\\/)(((0)[0-9])|((1)[0-2]))(\\/)\\d{4}$")) {
            return true;
        }


        // Toast will be here

        Toast.makeText(context,"Please enter a valid date ",Toast.LENGTH_SHORT).show();

        return false;



    }



}
