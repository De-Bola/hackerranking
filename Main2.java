package com.andela.challenge;

import java.util.HashSet;

public class Main2 {
//  can you make a palindrome?
    public static void main(String[] args) {
        // write your code here
        String input = "cdecd";
        int[] startIdx = {0,0,0,0};
        int[] endIdx = {0,1,2,3};
        int[] subs = {0,1,1,0};
        int L = 100000;

        long startTime = System.nanoTime();

        input = input.trim();
        input = input.toLowerCase();

//        if (!constraintChecker(input, startIdx, endIdx, subs)) {
//            System.out.println("constraint failure!!");
//        } else {
//            System.out.println(palindromeChecker(input, startIdx.length, startIdx, endIdx, subs));
//        }

        if(input.isEmpty() || input.length() > L || startIdx.length > L || endIdx.length > L || subs.length > L) {
            System.out.println(0);
        } else {
            System.out.println(palindromeChecker(input, startIdx.length, startIdx, endIdx, subs));
        }

        long endTime = System.nanoTime();
        long duration = (endTime - startTime);

        System.out.println(duration / 1000000.000);

    }

    public static String palindromeChecker(String s, int lengthOfQuery, int[] startIndex, int[] endIndex, int[] subs){
        StringBuilder interimOutput = new StringBuilder();

        boolean isPalindromeable;

        for (int i = 0; i < lengthOfQuery; i++){
            if((startIndex[i] < lengthOfQuery && startIndex[i] >= 0) || (endIndex[i] < lengthOfQuery && endIndex[i] >= 0)
            || (startIndex[i] < endIndex[i]) || (subs[i] < (endIndex[i] - startIndex[i]) && subs[i] >= 0)){
                String inputStr = s.substring(startIndex[i], endIndex[i] + 1);

                String interimStr = createDict(inputStr);
                if(interimStr.isEmpty()){
                    interimOutput.append(1);
                } else{
                    isPalindromeable = prelimCheck(interimStr, subs[i]);
                    if (isPalindromeable) {
                        interimOutput.append(1);
                    } else interimOutput.append(0);
                }
            }
            else interimOutput.append(0);

        }

        return new String(interimOutput);
    }

    public static boolean prelimCheck(String s, int subs){
        int lengthOfS = s.length();
        if (lengthOfS == 1) { //make sure string is not empty/null
            return true;
        } else return subs >= lengthOfS / 2;
    }

    public static int countOccurrence(String s, char n){
        int lengthOfS = s.length();
        int count = 0;

        for (int i = 0; i < lengthOfS; i++){
            if (n == s.charAt(i)) count++;
        }

        return count;
    }

    public static String findUnique(String s){
        int lengthOfS = s.length();
        HashSet<Character> unique = new HashSet<Character>();

        for (int i = 0; i < lengthOfS; i++){
            unique.add(s.charAt(i));
        }

        return String.valueOf(unique);
    }

    public static String createDict(String s){
        String uniqueStr = findUnique(s);
        StringBuilder interimGlossary = new StringBuilder();

        for (int i = 0; i < uniqueStr.length(); i++){
            int count = countOccurrence(s, uniqueStr.charAt(i));
            if((count & 1) != 0) {
                interimGlossary.append(uniqueStr.charAt(i));
            }
        }

        return String.valueOf(interimGlossary);
    }

/*    public static String deleteDuplicate(HashMap<Character, Integer> glossary){
        StringBuilder output = new StringBuilder();

        for (Map.Entry<Character, Integer> entry : glossary.entrySet()) {
            if ((entry.getValue() & 1) != 0){
                output.append(entry.getKey().toString());
            }
        }
        String resultStr = String.valueOf(output);

        if (resultStr.isEmpty()) {
            return "";
        }
        return resultStr;
    }*/

    /*    public static boolean constraintChecker(String s, int[] startIndex, int[] endIndex, int[] subs){
        int L = 100000;
        int strLen = s.length();
        int len_startIdx = startIndex.length;
        int len_endIdx = endIndex.length;
        int len_subs = subs.length;

        int stopFlag_1 = 0; int stopFlag_2 = 0; int stopFlag_3 = 0; int stopFlag_4 = 0;

        if (strLen > L || strLen < 1){
            return false;
        }
        if (len_startIdx > L || len_endIdx > L || len_subs > L) {
            return false;
        }

        for(int i = 0; i < len_subs; i++){
            if (startIndex[i] >= strLen || startIndex[i] < 0){
                stopFlag_1++;
            }

            if (endIndex[i] >= strLen || endIndex[i] < 0){
                stopFlag_2++;
            }

            if (subs[i] > (endIndex[i] - startIndex[i]) || subs[i] < 0){
                stopFlag_3++;
            }

            if (startIndex[i] > endIndex[i]){
                stopFlag_4++;
            }
        }

        if (!asciiLowKeyChecker(s)) return false;

        return stopFlag_1 + stopFlag_2 + stopFlag_3 + stopFlag_4 <= 0;
    }

    public static boolean asciiLowKeyChecker(String s){
        int counter = 0;
        for (int i = 0; i < s.length(); i++) {
            if ((int) s.charAt(i) < 97 || (int) s.charAt(i) > 122){
                counter++;
            }
        }

        return counter == 0;
    }*/

}
