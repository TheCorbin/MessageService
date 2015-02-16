/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package messageservice;

/**
 *
 * @author Alex
 */
public class Startup {

    public static void main(String[] args) {
        
        MessageStrategy metaphor = new MetaphorOfTheDayStrategy();
        MessageStrategy greeting = new MorningGreetingStrategy();
        MessageOutput consOutput = new ConsoleStrategy();
        MessageOutput gui = new GuiStrategy();
        
        MessageService messenger = new MessageService(greeting, gui);
        
        messenger.message();
        
    }   
}
