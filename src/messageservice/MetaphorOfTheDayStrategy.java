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
public class MetaphorOfTheDayStrategy implements MessageStrategy {
    private String newMessage = "";

    String[] greetings = {"Built like a brick House", "The world is a stage", "His heart is cold iron", 
                            "Drink like a fish"};

    @Override
    public String returnMessage() {

        Random decider = new Random();

        return greetings[decider.nextInt(greetings.length)];
    }
    

}
