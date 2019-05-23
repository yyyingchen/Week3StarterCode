/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3startercode;

/**
 *
 * @author mehta
 */
public class Week3StarterCode {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Student s1=new Student();
        s1.setFirstName("John");
        s1.setID(4);
        
        System.out.println(s1.getFirstName() + " "+s1.getID());
        System.out.println("See you again!");
    }
    
}
