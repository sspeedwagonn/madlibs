package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to MadLibs! I'll ask for a word, you give it, \nand by the end, we'll have a story! Send OK when you're ready to start.");
        String confirmation = scanner.nextLine();
        System.out.println("First, I need a name.");
        String name = scanner.nextLine();
        System.out.println("Now an adjective!");
        String adjective = scanner.nextLine();
        System.out.println("Now give me an verb!");
        String verb = scanner.nextLine();
        System.out.println("Lastly, a location!");
        String location = scanner.nextLine();

        System.out.println("Alright, here's your story:");
        System.out.println(name + " woke up and looked out the window. It was " + adjective + ". " + name + " got up and began " + verb + ". Soon enough, it was time to go to " + location + ".");
    }
}