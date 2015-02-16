/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package messageservice;

/**
 *
 * @author ryancorbin
 */
public class ConsoleStrategy implements MessageOutput {

    @Override
    public void output(String message) {
        System.out.println(message);
    }
    
    
    
    
}
