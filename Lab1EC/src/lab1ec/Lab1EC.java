/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1ec;

/**
 *
 * @author lisanjoroge
 */
public class Lab1EC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //attributes
        int a=15, b=12;
        String name;
        Lab1EC obj1=new Lab1EC();
        
        System.out.println("a+b="+obj1.add(a,b));
        System.out.println("a-b="+obj1.subtract(a,b));
        System.out.println("a*b="+obj1.multiply(a,b));
        System.out.println("a/b="+obj1.divide(a,b));
        
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
    float divide(int numberOne,int numberTwo){
        return numberOne/(float)numberTwo;
    }
}
