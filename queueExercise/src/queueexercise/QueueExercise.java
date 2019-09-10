/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queueexercise;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author root
 */
public class QueueExercise {
   
    public static void main(String[] args) {
       
        // create and initialize a  Queue using a linkedList
        Queue<String> attenteQueue = new LinkedList<>();
        
        // Adding new elements to the queue (Enqueue operation)
        attenteQueue.add("Nelson");
        attenteQueue.add("kevin");
        attenteQueue.add("Charbel");
        attenteQueue.add("Muriel");
        attenteQueue.add("Toussaint");
        
        System.out.println("attenteQueue : " +attenteQueue);
        
        //Removing an element from the Queue using remove() the dequeueu operation
        //the remove method throws NoSuchElementException if the queue is empty
        
        String name = attenteQueue.remove();
        
        System.out.println("Removed from attenteQueue : " + name +" | New attenteQueue : " + attenteQueue + "\n" );
        
        //using the poll method we can remove elemnt as in remove except that it's return null if the Queue is empty
        name = attenteQueue.poll();
        
        System.out.println("Removed from attenteQueue : " + name +  " | New attenteQueue : " + attenteQueue + "\n" );
         name = attenteQueue.poll();
         
        System.out.println("Removed from attenteQueue : " + name +  " | New attenteQueue : " + attenteQueue + "\n" );
         name = attenteQueue.poll();
         
        System.out.println("Removed from attenteQueue : " + name +  " | New attenteQueue : " + attenteQueue + "\n" );
         name = attenteQueue.poll();
         
        System.out.println("Removed from attenteQueue : " + name +  " | New attenteQueue : " + attenteQueue + "\n" );
        
             
        
    }
    
}
