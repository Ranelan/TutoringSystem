/*
Helper.java
Author: Ranelani Engel (221813853)
Date: 24 March 2025
 */

package za.ac.cput.Utility;

import java.util.regex.Pattern;

public class Helper {

    public static boolean isNullOrEmpty(String str) {
        return (str == null || str.trim().isEmpty());
    }

    public static boolean isValid(int id){
        return (id >= 0);
    }

    public static boolean isValidContactNumber(String contactNumber){
        return (contactNumber != null && contactNumber.matches("^0[6789]\\d{8}$"));
    }

    public static boolean isValidEmail(String email){
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@" +
                "(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern p = Pattern.compile(emailRegex);
        return email != null && p.matcher(email).matches();
    }

    public static boolean isValidDate(String date) {
        return date != null && date.matches("^\\d{4}-\\d{2}-\\d{2}$");
    }

    public static boolean isValidTime(String time) {
        return time != null && time.matches("^([01]\\d|2[0-3]):([0-5]\\d)$");
    }

    public static boolean isValidMaxPoints(int points) {
        return points > 0;
    }




}
