package aaaHackerRank;

import java.util.ArrayList;
import java.util.List;

public class CheckandSplitToPlaindromicSubStrings {

    public static void main(String[] args) {

//        System.out.println(checkSameChars("yd"));
        for (String a :
                threePalindromicSubstrings("uuuuuuuuuuuuuuuuuuuuuukkkkkkkkkkkkkkkkkkkkkkkkkkkkoooooooooooooooooooooooooooooooooooooooooooooooooo")) {
            System.out.println(a);
        }

    }

    public static List<String> threePalindromicSubstrings(String word) {
        // Write your code here
        List<String> arr = new ArrayList<String>();
        String palin = "";
        int k = 0;
        for (int i = 0; i < word.length(); i++) {
            if(i==0 || i==k) {
                palin += word.charAt(i);
            }
            else{
                palin += word.charAt(i);
                if(checkPalindrome(palin)){
                    if(checkSameChars(palin)){
                        if((i+1) == word.length()){
                            arr.add(palin);
                            palin = "";
                        }
                        else if(!checkPalindrome(palin + word.charAt(i+1))){
                            arr.add(palin);
                            palin = "";
                            k = i+1;
                        }
                    } else {
                        arr.add(palin);
                        palin = "";
                        k = i+1;
                    }
                }
            }
        }
        if (arr.size() != 3){
            arr.clear();
            arr.add("Impossibe");
            return arr;
        }
        else{
            return arr;
        }
    }
    public static boolean checkPalindrome(String word){
        String reverseWord = "";
        for (int i = word.length()-1; i >= 0; i--) {
            reverseWord += word.charAt(i);
        }
        if(reverseWord.equalsIgnoreCase(word)){
            return true;
        }
        else {
            return false;
        }
    }
    public static boolean checkSameChars(String word){
        char char1 = word.charAt(0);
        for (int i = 1; i < word.length(); i++) {
            char char2 = word.charAt(i);
            if(char2 == char1){
                char1 = char2;
            }
            else{
                return false;
            }
        }
        return true;
    }

}
