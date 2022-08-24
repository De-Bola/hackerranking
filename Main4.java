package com.andela.challenge;

import java.util.HashSet;

public class Main2 {
//  can you make a palindrome?
    public static void main(String[] args) {
        // write your code here
        String input = "cdecd";
        String output = "acbaacabbbbbacabbcbccccaacccababccbccbbbacaccbabbbaacababaababccabcbcbabbaabcbaccccccbaacbcacba" +
                "aaabbbccccababccbbcbbbccbabcabcabaacccccaabbbbabacabbcacaabacbbabcbacbaaccbbabcbbccacbaccaabbacbcbbbacb" +
                "acababbbbbccbbcbaaabcabaaaccbabbaacbbbcabcccaabaaccaacbbccbaaacaacbabcacbbcccbaccabcccacccacacaabcbabaa" +
                "bbaaacbabccbbccbcccccbabbcccbcacbbacabbcbabaabaaacabcacaccababbcabcbbabcbaaccacaaabcabaacaccaacacbcacba" +
                "bbabbcbccbacbccbcaabacabcaccaaababababaacccacbababababbcbacaaacbcaaabbbbaaccaabacbcaaabcbbcccabcabcbaaa" +
                "bcbccbaabaccabbaccbcbbbbbcbaacbabacbbacaacababacbbcbcacbabccbacabcaaccbbbbccacabbaaabaccbcbaaabcabaaabb" +
                "aababbaacbbbcbbcaaabccabccbaaabbabcbaabcccbbbabcbcbaccccbbabbcbbaacbacbabacabaaaabbabbaccbbcbcaaabbcaac" +
                "bbbcaaabbcacacaccccbacaaabccbcbabbbccbbbcbbcbbacbabccbacaccbacacaccabbbaaabacccbcabbabbacaaacbaaaabbcba" +
                "acbabaaaabcbcbccbbcbbacabcbbccbabaabbbcbaacccacacacabbaacabbaabaaacccbaccacbacbccbbcabaccbbacaaabccabca" +
                "bccabccaaabcbbcaababbabbbbacbacaacabbaabbcbabacaccbacbbbacabcabacccaccabcbaaacbcbabbbcababbcbcaacabaabb" +
                "abbcbbabcacbcabcbcaabccbacbacccbbcacaacbbccbacabcaacbcabbccbcbcababcbbbaabbbbcacaabcccabcaabaacbbbbacca" +
                "bcccacccaaacaabccccbcabbcaccaaabcabacbaacbbcccbcbbacacaaaaaabbabbbccaacccaacacbacaccaacbbabaccbbbbabcac" +
                "cbccccbabbcbcacabcacccbbaaccaabacbccabacacbaaabbabbabaccaccbabbaabaaaaabccbccacacbbbbaacaacbbbcbaacbaaa" +
                "bacbaaabcbabaabaccabbbaccaabbbbcbbabccccacbcbaabaacbccccacacaabcbcabbbaabbaacababbbacbcaabcbbbaaacbabcb" +
                "abbcbbbcaabacaacabcaaababbbcaaacccbbbabbbacbaabbcabcbbcaababccaabcbaabccbbabbcaaacacbcabaaababbcbaacbcb" +
                "cccabcbabbaaaabbbcacabacabacccbacbabccbabcbbccbcbcccabcaccacacccbbbabaababacbbcabcacbcababababbcaaccaaa" +
                "acbbbabccbcccccaaacbcbbccbcbcaabbbcccbbbabaacbbccbcbcabccbabcacaccacbcbcbacbbaaacacbbbbaacacacbaacabbba" +
                "abcbcbaaabaaacbbcbbcabbbbabaacbbcbabcbcbcacacbccbaabcccbbbbbbaaacaaccabababbaabbccabbcbcbabcbcaaabcbbbb" +
                "ccabcbabbababbbcccbcaaabcbbacacaaccabaccabbcacbccbcacccbbbccbccccbabbaccbabcababccbbacbcaabcaacacabbbbb" +
                "abaaababbaacbcbbacaaababbbabcccababbbbccabacabbbbcccacacbcbbbcbacacbccbaacaccbbbaabbaccbbacacbbcbbbcaac" +
                "cbccacabcbabbabccbcacaccabbcbbbbcbaaabcacccaaaaaaababbcccabbccbabbacbababacbccccbbcccccccabcacccbaccbab" +
                "cbabaababaabccacbbbacabbcbbcccaabbbbbacbacaabcaaabacccbbaabbccbaaacaabccbcacbacccabcaaabbaaaccbaaabccab" +
                "acbaccabcbabcbccccccaabaabcabcbccaabcaababaccabaacaaccbabacaaaaacbcccaccbccbabbbaacaccbbcacbbabbbbbbbab" +
                "cabcccbbabaabccaaccbcaaacbcbbacacaabcccabababbbbcbabcbccaaabbaaababcabccabababaaaabacbaccacbccbaabababb" +
                "acbbaabaaccbbcbcbcccbccacbabbbcccbbabaccabaabccbccabbacbbaaaaaaccbaaccaacbaaaabacacbbccacabcbccbaacbaab" +
                "cbcbaaabaabbcabaaccbbbaccbbaccccbcbcccbaacbacbaaaabcbabbbabbabccaacbaabbcbbccaaaaccacabbbabccbbacbcabab" +
                "bbabbbcbabaabbcaacbccacaabcaaacccabbcaaabaaacaaacacbaccabbbccabcccacabcccaccaaccaccaaccbbabbcabbacbbbab" +
                "baabbbabbaaaaacccaabcbabcacacccaaabbbcbbabbbcbbcbcbcbbaacacbabacccbbccaacbbbaccbaaabacccccbabbcbcbabaac" +
                "ccbccbcbcaaaaaaacccacbabacbcaccbcbbcaaacabccbacbacacbbacacabbccbabaaccabbaaabacbaccbacbbabaccabcabbcaba" +
                "acbaacaccabbbbaababbccaccbacaaaacabbcbacccbbbbcbbbabaabacbaacbaabcbbccabccaacabbbcaacbacabcbcbbcbaaacca" +
                "bcbcbccbbbbbbacbbabcbcbacbbcaaacaccccbaaccabcccbbbbcbbaacbbbababbaaabcccbcabcbaaacabaaaaaccbacccaaacccc" +
                "bcaacbbcbababcbcaabbcbbccccacacaccbbbccaaacccacabacbcbacaccacbbccabbaaabacabcccbabcccccaabbcbacabbcbbca" +
                "ababcabbbcbbababcaaabbccabbcacababaaabcbbbabacbacbabacbbcaaacbbbabbaaacbbabaccacbabbaccccbcccbbaacaabba" +
                "abcabbabcacccccccaccbaabcaacbcabbcccbabbbbbbaaaacaaacacbaaacccbabbaabbcaaabbaaccacaccbabbcabbbbacaaccac" +
                "aaccbcbbcbacbbaccccbacbccbcbaababbaaacccbacabacbacaccbbccbbcccbbacbbcbbabbaccababbcaaaccbbcbbbcaabbaaab" +
                "baaccabcbcbaacccbbcabbacbbbcbccbacacccacbbccccbbcabacbccabbaaacbaabbcbabaaacabacccacbabacaaacaccabacaba" +
                "acabaccacaccbabccacbccbcacbcccaacbcaacbbaabccaccbbaaccacbbabcaabcccacacccbcbcbbaacbabcbbbbaacaccbcbaaab" +
                "acacccbcaabccbabaccbccacacbcacabcbababcbcbacaaaaacbaacabcbaaaabaccacbacabcaabbacbaccaababcbaaaaccaabaac" +
                "aaaabcbcccbbaaabbaccbcabcbcbacbbabbccabbabcbbacaabacbbabcacacbbabaaabcbcbbbacabacccbaacaaababcbaacacbcc" +
                "bbababcbacaccbbabcbabbbccaabccbabcaaaabaacacccaaccaabcbaababbcbaccbcaabaabacbbbbbccccabcccabbacaaabaacb" +
                "abcbabcccbbaaabbcbcbcaabbbccccbbabcacbacacacabbccacaccbacbccabaacacccccaccaccbacbcabcbbcaccababbbbabaac" +
                "bacaaabaaabbbababbaccbbaaccbbcbcaaaaccccaaacabbccbcccaaabccccbccccbbcaabbbabaccbbbabcbcabbabacbcacbcacb" +
                "baabccaaacbccccbabbcbbbabbcbccaaabccacaccbccbbaccbcbabbccccbcaacbcacaabcabcbccbccbaacaacccbbccbbacaabaa" +
                "bbaababbaacbaccacbabbccacaaabaccaaababcbccaabcbabbbabcabababacbacbcaacbbccbbbaaccbcbbcabbaabaccaabbcaaa" +
                "cacbbcbccabaacbcbcaaaccabacaaabaaabccabcababacbbcbbababcbbabcbbabaccbccaacbbaccaabaccccababbbbbbccabcab" +
                "cacaacaaacbabcacabacccbacabbccacacabcacbabbbacacacbaccbbbbabaabbbbaaaababbaaabcbbacbabababbbbcacbabcaab" +
                "abbaaacbcababcababccbbcbabcacabccaacaababcaaccbabaacccccbbcbcbbcbabaaabaaaaacbaacabbbaaacabccbcbbbcccac" +
                "aacaabccaabccbaabbcaaaacccbcbaccbaaabacaaaabcabbbbaacaccccbcacbbcccaabbbccacacbaabaacaacaccabbaacccccba" +
                "babbcaacbcabbacabcacaccbbcaabbcaabcccccabccaacbcbaacacaccbabbaacccbbabccbcaccaaaaaabcbaaaaccbcbaaacabca" +
                "abbcbbccccaaacbbabacabbbbbbbcacacacbccacccaabbbcbaccbabcbabbbabbcbccbacbcccbcbbbcaaabcaaaccbabacaccbaca" +
                "bbacbcccbaaccacaabacbcccccbcaacbcabbcbaacbaccccabaabbcaacccaaaccabbaaabcccbbcbabaacbaaccccacaccabcbbcab" +
                "cacccbcbccbacbaaaaaaababacaccbabcaabbcbbccccbaabbbcccabaacccbcbacccccabcaaccccaaaabbbabbcbaababbcaacbbb" +
                "ccabbacacbbbcbcbbbccbcaccaacccbcbabbabcccaaccbbaacabbabcbcccbabbaaabccbcaabccbaaaaacbbbccabacbccbcbacbc" +
                "cbbcbccbcabcbbbcaaabcbcbacbaccacbccccbbcabcbcaaaacccbbcccaabccaaccabcbbacaccbaacaaaccccbcbccabaababbcab" +
                "aabcccbaabacbccacaabbcbbbcacbacccaacabcaaccbcccbaaabcbabbbcbcbabcaccccccccbbcababbccbcbcbabbcaacbcbbcba" +
                "cccbcbccabbaccccaacbacccacccbbabaaaccccbbbbbaaccbbbcaabbabbcacbaabbabbbbcccbbbbacccaabababbbaacacabbbac" +
                "cbcacbbcbbcacaaabcaaaaaaaaacaacabbbbaabababbcccbbccbbcccaabbbbbaaccccaabcbacbcaacccbbbaacbbbaabacbaaaac" +
                "acccabcabcacbccbcbabcbaababbacbbbaaaaabcacaccabcacacabacbcbccaaababcbbcbaabaaacacabbcbbbbcaaabcacbcacca" +
                "acbabcacababbaccbcaaabcacbacbaabaacbaacacccaacaacaaaaabcbbcacbcbbcabccabaacaaabacbacccccbcccababbabbbca" +
                "bcbccbbcaaaaaacaacacccccaabcbabaacaaabacbcccaaaacbccbcccbaccbaaccbaacaabaacbaccaaccbccbaabbccbccacccabb" +
                "bbaacaccbccbacaabcbabaaaacaacbcbaaccbacacacaacbbbacaccaabbbcbbabbacaacbacabaaaccbccabacabbcccacbabcbabc" +
                "bcbcccbbaabcabbabcabcaabcbbaaaacacbcbacacbccbaacabacbcabbcabaaaabcacbacacbaacbaccbcbaaaccabcbcaccbaabcb" +
                "bcbbcccacbcbbcbaacccacbaccabbacaaccaccacbcacabbaababbbbabcbaacbabbbabcccccacbcacbabccaabaacbcacaacbbbbc" +
                "bbabbcbaaccacbabcbbbacabcaaccccaaccccabaabaacbcbaaababaacbabaacbccbcaaabbacbcbaacbcaaabcbbcccbbbbabbaba" +
                "ccbbccbaaaaaabcbabacacacbbacccbbbccaccbcccabaaaabacbabbbabbcaccccbbabccbcbaababbbbabacaabbbccacccacbbca" +
                "abbaabcbcbcbbcbaaacacaaaaaccccccaabccbaccaacccaaacaacbacabccacacbcbaacabbbaababcaaacccccacabcaabacbaccb" +
                "bbcbaabaacbabbbcbacbaacbacabcaaabcccbbabaccaabaababcbbababcacaabbbbcccbbbaccccabacbbabccbccabbcccbcbbaa" +
                "ccccbcacccaaaaacbacccabbcaacbbcbacccbccbcababaacaccabababccabccccbcabbcaccbaccaacaaabcbabbbabbcacbbbbba" +
                "aabccbccbbcccbbaacbabcbcccbcaccccbbccbbbcbbccaaaacaaabcacacacbccaacacaabcbbbcccabbacaaacbcabcacabbababc" +
                "cabcabbbbccaaaaabbbabccbbbccbbcbccacacbcbaacbbacacabbacccccabccabcaccccbbcbcbcaccbaabbbbbaccccabaabcbab" +
                "caacbccacacaaacbbcbaabbbcbabcabcbccbcbbcabaabccababcccbbcbbcaccbcbcbacabbabaabacccbccabbaabaaacccabaacc" +
                "babcbabbabacacbccbaacbabbbbcbbcbbcaacccaababacaabbacaabcaccbacaabbababccccaccbccaabbbcabccbccbcbabacccb" +
                "bcbbcabbaccbacccccbbcccbabccabbcbabbaacbcacaccccbbbbbabccacacaababaacabbabcabcccbbcacacabbaabbcbaccaabc" +
                "baccbccbbbabcbbcaccbbaaacaacbbbcbcccbababacbbaacaabbbbcbccabaacccccbcabcabaabbabcbabacabbbccbcbbcacbbba" +
                "ccbcbacaabbbbabccaabccacbbcbabbcbacbbcbbaaacbcababaaacaaacbaaaaacabbaaaabbbaacccaaabcabacabbcaccbbacbaa" +
                "bbbbaabcbbaacacacacbacacbbcaababcaaabcaababaaabbbbcbbaacbaacccbbacabbbcacabacacabacaaaacbbaabcabcbbacab" +
                "ccaacbacaacabbbccbabccbbbcaabbbbbccababcbbaaccccacbaaccbcccbabaabcabbbacabacbaccaacaacacccbbbbbbcbcabaa" +
                "ccbcbccaaabbcaccbaacbaaaacababccbaccaccbabcccacaaaacbaababcbcbbbaaaaabbbcbbcbbacaacbbaacbaacacbabcabbca" +
                "baababbcbacbbacaacbaacbaaabbcaabcaacccccccacacaacaaaccbcaabbbbcabcaccabcabcabccaccbccabaaacbcbacbabaaca" +
                "bbcacacaabcaccbaaccccbcccaaabacbbbbacaaacaabcccccbcccbbccbbcbaaaccbcacccacccbbcbbcbabcbbbcbaccabbbbcbab" +
                "cabbabbbcaaacacbcbaabcbbbacacacbabbbacaabbaabacbcccbbbcabcaccabbbccccacabbbbcbabacacbaaaaaaaabbabcabcac" +
                "cbaaacaccbaccbcacaaabaccbbaabacbcccacaccbabccbcbcbcaccbaabaccaabcabcbbbccaccbabbbbbababbbccbcaacbbbcbac" +
                "aacabcbcbabcbcbbbaaaaaaccabbcbccbcaacbaaacabcbcbbacbcabbbcbabaaaaaacaacaaccabaccabbacaccabcbcbbccbbccba" +
                "abaacbcccbbabbaabbacbbbbbaabcccaaababbaaabbccbaaabacbbacbabbcbbabcbacbcacaccaacbbcbcabcbacaaacbaccbbcab" +
                "ccbcabcbbaaaaabaaababacbaaacabbcbacbccbbcbcacabcbabaabcbccbccaaaaccabbbbcbccbbcbbbbabbcabaabbabcabcccbb" +
                "aabcbacacbcacbbaacbbbbaaccacbcbbcabcbbcbaaaabbacacabbacbabbcabbacaaacaccacabbbacbbbbaccaaccaacbccbabcab" +
                "abbccaaccacaababbaccbbcbaabcaaacbccbccbcabaaabacbcbbaacbcbaacacaabbacaaccabcccbcbaabbccbbaaabcabcabcbcc" +
                "babaaaccbacabaabbababbacbbcaabbccccabbcccabcabaccccbabbacbbaaccaacbbbbabccaabbabaccbbbbccacbaabaaabccaa" +
                "ccbcbaacaacccabbabbbacaacbcbaaaaacacaabbbaabbaaccbbcbbabaaaaabbbbcabacaccbbbbbacbbbaabcabcccbbbcbcbbbcb" +
                "cbaabcbabcbbbaabcababcccabbcbabaccbabcaaaabbbaabacbacbcabaacbcaabbcacaaaaaccbcbbcaccababcbbbabacacaaaca" +
                "bccbaccccacbabcccaaaccacaacbbbbabcbbcbcbccbaaacaccbbccacaabccacacaaccaabcbbaaabcaabaccbacccbabaaabccbab" +
                "bcabccaccbabbccccbcbcbccbbabaaabaabacccabbcabbcaacaababacbcccabcbaabcacacbaaabccaccbcaaccccbabccbcbbcbc" +
                "caaacbcbacacccccbabbbcabbcccabcacbabaaaacaaaaaccabbcbcacbaccbcabbbabcacccaacacccbbbcaacaaacccacbcaccccc" +
                "bcabbacacaccbccbacbaccaacaacaabbcbbacabbabbcaaabaccacabcbcbcacbcbcbbaaabbbbaaccbccaccbbabaabcccbbbaabac" +
                "baabacbccacccbaaabbabacacbbacbcacaccaacbabaaacccabccccacbcaabccbababcaaaaacacbabcaabcbaaaaccbbabaaaacab" +
                "ccaaccbabbcacaaabccbabbcccacbbbabccbbacacbababccacabbbabbbbabbbcaaacbbcbcaaacacaacbcbcbaccaaacacaccbaca" +
                "acbbcbaccabbccccbaacbaaaacccacbbcccabcabacaacbcbbbbabbcccbccbaacacccacbaccbbacccaaabacbcbabbccaccaccabb" +
                "bbccccaccbabbaabcbabaacaccacbbacaacaaaaacbabcabbbbacbcababaccbbbabbbccbcacbcacbcbccaaacabaaaabbacacccab" +
                "aaaabacacbcccaccbaacbbbccabbacbcaccbcbccbcaaacbbabbcbbbbccaccbbcabbbabacbaabbcbcaacccaababcaaacccbababa" +
                "cabbbaabcbabacccabbabcaaacbbaaccabbccbabacbbbabccac";
        System.out.println(output.length());
        int[] startIdx = {0,5124,8000,1000};
        int[] endIdx = {10239,9999,9219,3000};
        int[] subs = {6000,2000,1000,500};
        int L = 100000;

        long startTime = System.nanoTime();

//        input = input.trim();
//        input = input.toLowerCase();

//        if (!constraintChecker(input, startIdx, endIdx, subs)) {
//            System.out.println("constraint failure!!");
//        } else {
//            System.out.println(palindromeChecker(input, startIdx.length, startIdx, endIdx, subs));
//        }

        if(input.isEmpty() || input.length() > L || startIdx.length > L || endIdx.length > L || subs.length > L) {
            System.out.println(0);
        } else {
            System.out.println(palindromeChecker(output, startIdx.length, startIdx, endIdx, subs));
        }

//        System.out.println(createDict(output));
//        System.out.println(prelimCheck(output, 5000));

        long endTime = System.nanoTime();
        long duration = (endTime - startTime);

        System.out.println((duration / 1000000000.000) + " " + "secs");
    }

    public static String palindromeChecker(String s, int lengthOfQuery, int[] startIndex, int[] endIndex, int[] subs){
        StringBuilder interimOutput = new StringBuilder();

        boolean isPalindromeable;

        for (int i = 0; i < lengthOfQuery; i++){
            if((startIndex[i] < lengthOfQuery && startIndex[i] >= 0) || (endIndex[i] < lengthOfQuery && endIndex[i] >= 0)
            || (startIndex[i] < endIndex[i]) || (subs[i] < (endIndex[i] - startIndex[i]) && subs[i] >= 0)){
                String inputStr = s.substring(startIndex[i], endIndex[i] + 1);
                System.out.println(inputStr.length() + " " + "iteration " + i);
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

    public static String createDict(String s){
        HashSet<Character> unique = new HashSet<Character>();

        for (int i = 0; i < s.length(); i++){
            unique.add(s.charAt(i));
        }
        Object[] uniqueStr = unique.toArray();
        StringBuilder interimGlossary = new StringBuilder();

        for (int i = 0; i < uniqueStr.length; i++){
            int count = 0;
            for (int j = 0; j < s.length(); j++){
                if ((char)uniqueStr[i] == s.charAt(j)) count++;
                if (count > 99) {
                    count = 0;
                }
            }
            System.out.println(count + " " + "iteration " + i);
            if((count & 1) != 0) {
                interimGlossary.append(uniqueStr[i]);
            }
        }
        String output = String.valueOf(interimGlossary);
        System.out.println(output);
        System.out.println();
        return output;
    }

   /* public static int countOccurrence(String s, char n){
        int lengthOfS = s.length();
        int count = 0;

        for (int i = 0; i < lengthOfS; i++){
            if (n == s.charAt(i)) count++;
        }

        return count;
    }*/

/*    public static String findUnique(String s){
        int lengthOfS = s.length();
        HashSet<Character> unique = new HashSet<Character>();

        for (int i = 0; i < lengthOfS; i++){
            unique.add(s.charAt(i));
        }

        return String.valueOf(unique);
    }*/

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
