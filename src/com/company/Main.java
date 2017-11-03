package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner kbinput = new Scanner(System.in);
        System.out.println("Enter a word.");
        String word = kbinput.nextLine();
        Code myster = new Code(word);
        myster.hide(1,(word.length()-1));
        System.out.println(myster.getCode());
        myster.recover(1,(word.length()-1));
        System.out.println(myster.getCode());
    }
}
