/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.curso.usermanagement;

import java.util.Scanner;

/**
 *
 * @author alvdelat
 */
public class UserManagementInterface {

    public void systemInterface() {
        Scanner soption = new Scanner(System.in);
        Scanner sname = new Scanner(System.in);
        Scanner smail = new Scanner(System.in);
        Scanner spassword = new Scanner (System.in);
        LogicSystem system = new LogicSystem();
        User userload = new User();
        
        boolean exit = false;
        while(!exit){
            System.out.println("Welcome to the Users Management\n"
                    + "Press 1 to register your new user        Press 2 to login        Press 3 to exit");

            int option = soption.nextInt();

            if (option == 1) {

                System.out.println("Introduce your user name: ");
                String name = sname.nextLine();
                
                System.out.println("Introduce your mail: ");
                String mail = smail.nextLine();
                
                System.out.println("Introduce your password: ");
                String password = spassword.nextLine();

                User user = new User(name, password, mail); // SE CREA EL USUARIO
                system.addUser(user); // SE AÑADE A LA BD

                System.out.println("\n The user " + user.getName() + " has been created, with"
                        + " " + user.getMail() + " " + user.getPassword() );

                /*for (User user1 : system.getUsers()) {
                    System.out.println(user1);
                }*/
            }

            //LOGEAR
            if (option == 2) {
                System.out.println("Introduce your user name or mail");
                String name = sname.nextLine();
                
                System.out.println("Introduce your password: ");
                String password = spassword.nextLine();
                if(system.checkLog(name,password)){
                    userload = system.userLog(name, password);
                    logInterface(system, userload); // INTRODUCIR LA FUNCION DENTRO
                }
                
                else{
                    Scanner sanswer = new Scanner(System.in);
                    System.out.println("Your user data was wrong, try with your security question\n"
                            + "QUESTION: " + userload.getQuestion()
                            + "\n Introduce your answer: ");

                    String answer = sanswer.nextLine();
                    
                    if (system.checkAnswer(answer, userload)) {
                        logInterface(system, userload); //TODO: Error 
                    } 
                    else {
                        System.out.println("Wrong answer, back to home page");
                    }
                }
            }
            if(option==3){
                System.out.println("EXIT  ...");
                exit = true;
            }
        }
    }// FIN INTERFAZ

    public void logInterface(LogicSystem system, User user) {

        Scanner soption = new Scanner(System.in);
        Scanner squestion = new Scanner(System.in);
        Scanner sanswer = new Scanner(System.in);
        Scanner smail = new Scanner(System.in);
        Scanner spassword = new Scanner (System.in);        
        
        boolean exit = false;
       
        while (!exit) {
            System.out.println("Welcome to your profile\n"
                    + "Press 1 to set a security question       Press 2 to modify the email     Press 3 modificar contraseña"
                    + "     Press 4 to log out ");
            int option2 = soption.nextInt();
            if (option2 == 1) {
                System.out.println("Introduce your sercurity question");
                String question = squestion.nextLine();
                user.setQuestion(question);
                System.out.println("Introduce your answer");
                String answer = sanswer.nextLine();
                user.setAnswer(answer);

                System.out.println("\n " + user.getName() + " has " );
                System.out.println("your question is: " + user.getQuestion());
                System.out.println("your answer is: " + user.getAnswer());
                System.out.println("Your security question was save successfully");
            }

            if (option2 == 2) {
                System.out.println("Introduce your new mail");
                String mail = smail.nextLine();
                user.setMail(mail);
                System.out.println("your mail is: " + user.getMail());
                System.out.println("Your mail was save successfully");
            }
            if (option2 == 3) {
                System.out.println("Introduce your new password");
                String password = spassword.nextLine();
                user.setMail(password);
                System.out.println("your password is: " + user.getPassword());
                System.out.println("Your password was save successfully");
            }

            if (option2 == 4) {
                System.out.println("Closing session ...");
                exit = true;
            }
        }

    }

}//FIN DE LA CLASE
