package me.archiru;

import edu.stanford.nlp.simple.Sentence;
import edu.stanford.nlp.simple.SentimentClass;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Please paste the text you wish to find the intent behind.");
        String inputText = new Scanner(System.in).nextLine();

        Sentence sentence = new Sentence(inputText);

        SentimentClass intent = sentence.sentiment();

        System.out.println("Intent is " + intent.name() + ".");
    }
}