/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.curso.usermanagement;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author alvdelat
 */
public class User {

    private String name;
    private String password;
    private String mail;
    private String question;
    private String answer;
    //private Inbox inbox;
    private HashMap<String, ArrayList <String>> inbox = new HashMap<String, ArrayList <String>>();
    
    
    //Constructor
    public User(String name, String password, String mail) {
        this.name = name;
        this.password = password;
        this.mail = mail;
    }

    public User() {
    }

    //Getters
    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getMail() {
        return mail;
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }

    public HashMap<String, ArrayList<String>> getInbox() {
        return inbox;
    }


    //Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public void setInbox(HashMap<String, ArrayList<String>> inbox) {
        this.inbox = inbox;
    }







}
