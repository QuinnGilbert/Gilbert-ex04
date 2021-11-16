/*
 *  UCF COP3330 Fall 2021 Exercise 4
 *  Copyright 2021 Quinn Gilbert
 */
import java.util.*;
public class Solution04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //prompt noun
        System.out.print("Enter a noun: ");
        //input noun
        String noun = in.next();
        //prompt verb
        System.out.print("Enter a past tense verb: ");
        //input noun
        String verb = in.next();
        //prompt adjective
        System.out.print("Enter an adjective: ");
        //input noun
        String adjective = in.next();
        //print mad-lib
        System.out.printf("I once %s a %s %s, and I regret it.",verb,adjective,noun);
    }
}
