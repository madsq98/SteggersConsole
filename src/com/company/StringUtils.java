package com.company;

public class StringUtils {
    public static String exc1(String input) {
        return "<" + input + ">";
    }

    public static String exc2(String input) {
        int len = input.length();

        return input + " Længde: " + len;
    }

    public static String exc3(String input) {
        char[] arr = input.toCharArray();

        String returnString = "";
        for(char t : arr) {
            returnString += t + "@";
        }

        return returnString.substring(0, returnString.length() - 1);
    }

    public static String exc4(String input) {
        StringBuilder s = new StringBuilder(input);
        s.reverse();
        return s.toString();
    }

    public static String exc5(String input) {
        return "lorteopgave";
    }

    public static String exc6(String input) {
        String returnString = input;
        if(input.contains("horse")) {
            returnString = returnString.replace("horse","*****");
        }
        if(input.contains("saddle")) {
            returnString = returnString.replace("saddle","******");
        }
        if(input.contains("spores")) {
            returnString = returnString.replace("spores","******");
        }
        return returnString;
    }

    public static String exc7(String input) {
        return input + exc4(input);
    }

    public static String exc8(String input) {
        char[] arr = input.toCharArray();

        int even = 1;
        String returnString = "";
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] != ' ') {
                if (even == 1) {
                    String a = String.valueOf(arr[i]);
                    returnString += a.toUpperCase();
                    even = 2;
                } else {
                    returnString += arr[i];
                    even = 1;
                }
            }
            else {
                returnString += ' ';
            }
        }

        return returnString;
    }

    public static String exc9(String input) {
        String[] l33t = {"4", "|3", "(", "|)", "3", "|=", "6", "|-|", "|", "9", "|<", "1", "|v|", "|\\|", "0", "|*", "0,", "|2", "5", "7", "|_|", "|/", "|/|/", "><", "`/", "2"};

        char[] arr = (input.toLowerCase()).toCharArray();
        String returnString = "";
        for(char t : arr) {
            int temp = (int) t;
            int temp_int = 96;
            if(temp<=122 & temp>=97) {
                returnString += l33t[(temp - temp_int)-1];
            }
        }

        return returnString;
    }

    public static String exc10(String data, String filter) {
        return data.replaceAll("[^"+filter+"]","x");
    }

    public static String exc11(String input) {
        String[] splitted = input.split("[^*]");
        return splitted.toString();
    }
}
