/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task5;

/**
 *
 * @author lisanjoroge
 */
public class Task5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //attributes
        int a=25, b=5;
        String name;
        Task5 obj1=new Task5();
        
        System.out.println("a+b="+obj1.add(a,b));
        System.out.println("a-b="+obj1.subtract(a,b));
        System.out.println("a*b="+obj1.multiply(a,b));
        System.out.println("(a+b)/2="+obj1.average(a,b));
        System.out.println("a-b="+obj1.distance(a,b));
        System.out.println("(a>b)="+obj1.maxInt(a,b));
        System.out.println("(a<b)="+obj1.minInt(a,b));

        
    }
    int add(int numberOne,int numberTwo){
        return numberOne+numberTwo;
    }
    int subtract(int numberOne,int numberTwo){
        return numberOne-numberTwo;   
    }
    int multiply(int numberOne,int numberTwo){
        return numberOne*numberTwo;
    }
    float average(int numberOne,int numberTwo){
        return (numberOne+numberTwo)/2;
    }
    int distance(int numberOne,int numberTwo){
        return numberOne-numberTwo;
    } 
    int maxInt(int numberOne,int numberTwo) {
        if ( numberOne > numberTwo ) {
            return numberOne;
        } else {
            return numberTwo;
        }
     }
    int minInt(int numberOne,int numberTwo) {
        if ( numberOne < numberTwo ) {
            return numberOne;
        } else {
            return numberTwo;
        }
     }
}
