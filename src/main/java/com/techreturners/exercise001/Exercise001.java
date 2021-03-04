package com.techreturners.exercise001;

import java.util.List;

public class Exercise001 {
    public String capitalizeWord(String word) {
        // Add your code here
        return "";
    }

    public String generateInitials(String firstName, String lastName) {
        // Add your code here

        // VERY SIMILAR TO JS CODE
        return firstName.substring(0, 1).toUpperCase() + "." + lastName.substring(0, 1).toUpperCase();
    }

    public double addVat(double originalPrice, double vatRate) {
        // Add your code here

        // THIS STILL HAS OUR ROUNDIN TO 2 DECIMAL PROBLEM
        //couldn't get our roundToTwo to work

        double percent = vatRate/100;
        double vat = percent * originalPrice;
        double total = originalPrice + vat;

        return total;
    }

    public String reverse(String sentence) {
        // Add your code here

        // I JUST GOOGLED THIS


        byte[] strAsByteArray = sentence.getBytes();
 
        byte[] result = new byte[strAsByteArray.length];
 
        // Store result in reverse order into the
        // result byte[]
        for (int i = 0; i < strAsByteArray.length; i++)
            result[i] = strAsByteArray[strAsByteArray.length - i - 1];

        return new String(result);
    }

    public int countLinuxUsers(List<User> users) {
        // Add your code here

        //THIS TOOK SOME PLAYING AROUND AND I DON'T EXPECT YOU TO KNOW THIS
        // I'LL EXPLAIN SOME WHEN WE TALK
        
        int count = 0;
        int list_size = users.size();
        for (int i = 0; i < list_size; i++) {
            if(users.get(i).getType() == "Linux") {
                count += 1;
            }
        }
        return count;
    }
}
