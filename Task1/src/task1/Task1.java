/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task1;

/**
 *
 * @author lisanjoroge
 */
public class Task1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         //attributes
        int a=25, b=5;
        String name;
        Task1 obj1=new Task1();
        
        System.out.println("a*b="+obj1.multiply(a,b));
        
    }
    int multiply(int numberOne,int numberTwo){
        return numberOne*numberTwo;
    }
    
}
