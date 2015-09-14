/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dogorcat;

/**
 *
 * @author andre_000
 */
public class Cat implements Animal {

    private final String name = "Athena";
    private final String msg = "You win I am Athena the Cat.";

    public String getMsg() {
        return msg;
    }

    public String getName() {
        return name;
    }

    @Override
    public void speak() {
        System.out.println("Meow.");
    }

    @Override
    public void readMind() {
        System.out.println("I am planning on coming into the bedroom at exactly "
                + "2:13 AM to sing the song of my people as loudly as I can.");
    }

    @Override
    public void doSomething() {
        System.out.println("Cleans the coffee table by pushing everything onto the floor.");
    }
}
