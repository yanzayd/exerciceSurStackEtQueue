/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queueexercise;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author root
 */
public class QueueExercise {
   
    public static void main(String[] args) throws IOException {
       
        // create and initialize a  Queue using a linkedList
        Queue<String> attenteQueue = new LinkedList<>();
        
        // Adding new elements to the queue (Enqueue operation)
        attenteQueue.add("Nelson");
        attenteQueue.add("kevin");
        attenteQueue.add("Charbel");
        attenteQueue.add("Muriel");
        attenteQueue.add("Toussaint");
        
        //System.out.println("attenteQueue : " +attenteQueue);

        System.out.println("attenteQueue : " +attenteQueue);
        
        //Removing an element from the Queue using remove() the dequeueu operation
        //the remove method throws NoSuchElementException if the queue is empty
       // Queue<String> empty = null;
        
  while(!attenteQueue.isEmpty()){
  String name = attenteQueue.remove();  
  System.out.println("Removed from attenteQueue : " + name +" | New attenteQueue : " + attenteQueue + "\n" );
  
  }
	
             
        
    }
    
}
