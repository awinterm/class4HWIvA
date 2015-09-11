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
public class Dog implements Animal {

    private String name = "Jasper";
    private String msg = "You Win I'm Jasper the Dog!";

    public String getMsg() {
        return msg;
    }

    public String getName() {
        return name;
    }

    @Override
    public void speak() {
        System.out.println("Woof woof!");
    }

    @Override
    public void readMind() {
        System.out.println("Hey! Hey you! Hey! Hey! Hey you! DO you maybe wanna feed me? Hey! Hey You! Do you wan.. SQUIRREL!");
    }

    @Override
    public void doSomething() {
        System.out.println("This pet sneaks off into another room and pees on something. then returns and wants to sit in your lap.");
    }
}
