/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dogorcat;

import java.util.Random;
import java.util.Scanner;

public class DogorCat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int start;
        int pet;
        int answer;
        String petName;

        Random num = new Random();
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Welcome to guess the Pet 1.0.");
        System.out.println(" ");
        System.out.println("The dogs name is Jasper");
        System.out.println("The cats name is Athena");
        System.out.println("The Gecko's name is Giuseppe");

        System.out.println("A pet is in the room, you however are blind and have"
                + " no sense of touch.");

        System.out.println("Luckly for you can hear, and read the pet's"
                + " mind and have its actions described to you.");
        System.out.println("Guess the correct pet and you win!");

        System.out.println("Press 1 to Start.");
        start = keyboard.nextInt();
        System.out.println("You can... 1. Listen to your pet, 2. Read your pets mind, or 3. Watch your pets behavior.");
        answer = keyboard.nextInt();
        if (start == 1) {
            pet = num.nextInt(3 - 1 + 1) + 1;
            if (pet == 1) {
                Cat cat = new Cat();

                if (answer == 1) {
                    cat.speak();
                } else if (answer == 2) {
                    cat.readMind();
                } else if (answer == 3) {
                    cat.doSomething();
                } else {
                    System.out.println("I don't understand you goodbye.");
                }

                keyboard.nextLine();
                System.out.println(" ");
                System.out.println("What is your pets name?");
                petName = keyboard.nextLine();

                if (cat.getName() == null ? petName == null : cat.getName().equals(petName)) {
                    System.out.println(cat.getMsg());
                } else {
                    System.out.println("You Lose.");
                }

            } else if (start == 2) {
                Dog dog = new Dog();
                if (answer == 1) {
                    dog.speak();
                } else if (answer == 2) {
                    dog.readMind();
                } else if (answer == 3) {
                    dog.doSomething();
                } else {
                    System.out.println("I don't understand you goodbye.");
                }

                keyboard.nextLine();
                System.out.println(" ");
                System.out.println("What is your pets name?");
                petName = keyboard.nextLine();

                if (dog.getName() == null ? petName == null : dog.getName().equals(petName)) {
                    System.out.println(dog.getMsg());
                } else {
                    System.out.println("You Lose.");
                }
            } else {
                Gecko gecko = new Gecko();
                if (answer == 1) {
                    gecko.speak();
                } else if (answer == 2) {
                    gecko.readMind();
                } else if (answer == 3) {
                    gecko.doSomething();
                } else {
                    System.out.println("I don't understand you goodbye.");
                }

                keyboard.nextLine();
                System.out.println(" ");
                System.out.println("What is your pets name?");
                petName = keyboard.nextLine();

                if (gecko.getName() == null ? petName == null : gecko.getName().equals(petName)) {
                    System.out.println(gecko.getMsg());
                } else {
                    System.out.println("You Lose.");
                }
            }

        } else {
            System.out.println("Fine don't play.");
        }
    }
}
