/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package messageservice;

import java.util.Random;

/**
 *
 * @author Alex
 */
public class MorningGreetingStrategy implements MessageStrategy {

    String[] greetings = {"Hello", "Good Morning", "Would you like some bacon?",
                            "Enjoy your day", "I am bacon cake", "Sure is cold out today..."};

    @Override
    public String returnMessage() {

        Random decider = new Random();

        return greetings[decider.nextInt(greetings.length)];
    }
    
    

}
