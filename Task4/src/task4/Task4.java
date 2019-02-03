/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task4;

/**
 *
 * @author lisanjoroge
 */
public class Task4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //attributes
      
        float temperatureInFahrenheit=212;
        float temperatureInCelcius;
        Task4 obj1=new Task4();
        
    System.out.println("Enter temperature in Fahrenheit");
 
    temperatureInCelcius = (((temperatureInFahrenheit - 32)*5)/9);
 
    System.out.println(temperatureInFahrenheit + " degree Fahrenheit is equal = " + temperatureInCelcius);
  }
}
