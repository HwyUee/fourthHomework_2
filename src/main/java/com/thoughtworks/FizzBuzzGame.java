package com.thoughtworks;

import java.util.ArrayList;
import java.util.List;


public class FizzBuzzGame {
    private List<String> results = new ArrayList();
    private int count;

    public void start(int count) {
        this.count = count;
    }

    public List<String> getResults() {
        for (int i = 1; i <= count; i++) {
            if (isContain3(i)) {
                results.add("Fizz");
            } else if (isThreeOfTimes(i)) {
                if (isFixOfTimes(i)) {
                    if (isSevenOfTimes(i) ) {
                        results.add("FizzBuzzWhizz");
                    }
                    else {
                        results.add("FizzBuzz");
                    }
                }
                else if (isSevenOfTimes(i)){
                    results.add("FizzWhizz");
                }
                else {
                    results.add("Fizz");
                }
            }else if (isFixOfTimes(i)){
                if (isSevenOfTimes(i) ) {
                    results.add("BuzzWhizz");
                }
                else {
                    results.add("Buzz");
                }
            }else if (isSevenOfTimes(i)){
                results.add("Whizz");
            }
            else {
                results.add(i+"");
            }
        }
        return results;
    }

    public boolean isContain3(int i) {
        int fir = i % 10;
        int sec = (i / 10) % 10;
        int tir = i / 10;
        if (fir == 3 || sec == 3 || tir == 3) {
            return true;
        }
        return false;
    }

    public boolean isThreeOfTimes(int i) {
        if (i % 3 == 0) {
            return true;
        }
        return false;
    }

    public boolean isFixOfTimes(int i) {
        if (i % 5 == 0) {
            return true;
        }
        return false;
    }

    public boolean isSevenOfTimes(int i) {
        if (i % 7 == 0) {
            return true;
        }
        return false;
    }
}


