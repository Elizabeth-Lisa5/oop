/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2ec;

/**
 *
 * @author lisanjoroge
 */
public class Lab2EC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String countries[] = new String[204];
        countries[0] = "Kenya";
        countries[countries.length-1] = "Malta";
        
        String departments[] = {"FIT","MGT","SBS"};
        int length=departments.length;
        
        int x = 8, y = 7;
        if(y>x){
            System.out.println("y > x");
            System.out.println("y > x");
        }
        else
            System.out.println("y < x");
            boolean result = (y>x)? true : false;
    }
}
