/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queueexeversion2;
import java.util.*;

/**
 *
 * @author root
 */
public class QueueExeVersion2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //Version 2 using for loop
        // create and initialize a  Queue using a linkedList
        Queue<String> attenteQueue = new LinkedList<>();
        
        // Adding new elements to the queue (Enqueue operation)
        attenteQueue.add("Nelson");
        attenteQueue.add("kevin");
        attenteQueue.add("Charbel");
        attenteQueue.add("Muriel");
        attenteQueue.add("Toussaint");
        

        System.out.println("attenteQueue : " +attenteQueue);
        
        // display element of a Queue using  for loop
        for(int i = attenteQueue.size()-1; i>=0; i--){
        String name = attenteQueue.remove();  
        System.out.println("Removed from attenteQueue : " + name +" | New attenteQueue : " + attenteQueue + "\n" );
        
        }
        
       
        
        
        
        
        
    }
    
}

