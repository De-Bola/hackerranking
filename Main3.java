package com.andela.challenge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main3 {
// closest numbers
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(6);
        numbers.add(2);
        numbers.add(4);
        numbers.add(10);
        findClosestNumbers(numbers);
    }

    public static void findClosestNumbers(List<Integer> numbers){
        Collections.sort(numbers, Collections.reverseOrder());
        int minDiff = 2000000000;

        for(int i = 0; i < numbers.size() - 2; i++){
            int currentDiff = numbers.get(i) - numbers.get(i + 1);
            if (currentDiff < minDiff) minDiff = currentDiff;
        }

        Collections.sort(numbers);
        for(int i = 0; i < numbers.size() - 1; i++){
            int currentDiff = numbers.get(i + 1) - numbers.get(i);
            if (currentDiff == minDiff) System.out.println(numbers.get(i) + " " + numbers.get(i + 1));;
        }
    }

}
