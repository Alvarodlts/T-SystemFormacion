/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.curso.usermanagement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author alvdelat
 */
public class Inbox {
    
   
    public void readMessage(User user){
        System.out.println(user.getInbox());   
        
        
    }
    public void writeMessage(User writer, User receptor){
        Scanner smessage = new Scanner(System.in);
        String message = smessage.nextLine();

        
        if(!receptor.getInbox().containsKey(writer.getName())){
            ArrayList <String> totalmessage = new ArrayList ();
            totalmessage.add(message);
            receptor.getInbox().put(writer.getName(), totalmessage);
        }
        else{
            ArrayList <String> totalmessage = receptor.getInbox().get(writer.getName());
            totalmessage.add(message);
            receptor.getInbox().put(writer.getName(), totalmessage);
        }
        
    }
    
    
    
    
}
