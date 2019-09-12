/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackexeversion2;

import java.util.Stack;

/**
 *
 * @author root
 */
public class StackExeVersion2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a stack
        Stack<String> toolStack = new Stack<>();
        
        //pushing new items to the stack
        toolStack.push("pen");
        toolStack.push("book");
        toolStack.push("pencil");
        toolStack.push("copy-book");
        
        System.out.println("Stack => " + toolStack);
        System.out.println();
        
        //poping items from the stack
        for(int i = toolStack.size()-1; i>=0; i--){
        String toolAtTop = toolStack.pop(); // throw the EmptyStackException if the stack is empty 
        System.out.println("stack.pop() => " + toolAtTop + "Curent Stack => " + toolStack);
        System.out.println();
        
        }
        
       
        
        
        
        
        
    }
    
}

