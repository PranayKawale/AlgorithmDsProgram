package com.bridgelabz;
import java.util.Arrays;

public class BinarySearch {
	public static void main(String[] args) {
        String[] words = { "Zero", "Pranay", "Akshay", "Vaishali", "Shilpa", "Manav" };
        Arrays.sort(words);

        System.out.println(words);

        int index, left=0;

        int right = words.length-1;

        while (left<=right){
            int mid = (left+right) / 2;
            if (words[mid].compareTo("Pranay") == 0){
                System.out.println("Index of your word Pranay is : "+mid);
                break;
            }else if (words[mid].compareTo("Pranay") > 0){
                System.out.println("Index of your word Pranay is : " + (mid-1));
                break;
            }
            else{
                System.out.println("Index of your word Pranay is : "+(mid+1));
                break;
            }

        }



    }

}

