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
public abstract class Reptile implements Animal{
            
    // this class implements the abstract methods from the Animal intervafe, 
    
    // However being an abstract class it does not need to delcare them.
    
    
     private String name = "Giuseppe";
     private String msg = "You Win I'm Giuseppe the Gecko!";

    public String getName() {
        return name;
    }

    public String getMsg() {
        return msg;
    }

}
