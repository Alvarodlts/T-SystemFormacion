/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.curso.usermanagement;

import java.util.ArrayList;

/**
 *
 * @author alvdelat
 */
public class LogicSystem {

    private ArrayList<User> users = new ArrayList();

    //getter
    public ArrayList<User> getUsers() {
        return users;
    }

    //setter
    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }

    public void addUser(User user) {
        this.users.add(user);
    }
    
    public User userLog(String name, String password) {
        User user = new User();
        for (int i = 0; i < users.size(); i++) {
            if ((users.get(i).getName().equals(name)
                    || users.get(i).getMail().equals(name))
                    && users.get(i).getPassword().equals(password)) {
                user = users.get(i);
            }
        }
        return user;
    }
    public boolean checkLog(String name, String password) {
        boolean bool = false;
        //user = null;
        for (int i = 0; i < users.size(); i++) {
            if ((users.get(i).getName().equals(name)
                    || users.get(i).getMail().equals(name))
                    && users.get(i).getPassword().equals(password)) {
                //user = users.get(i);
                bool = true;
            }
        }
        return bool;
    }

    public boolean checkAnswer(String answer, User user) {
        boolean check = false;
        System.out.println("user " + user.getAnswer());
        if (user.getAnswer().equals(answer)) {
            check = true;
        }
        return check;
    }

}
