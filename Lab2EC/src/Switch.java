/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lisanjoroge
 */
public class Switch {
    public static void main(String[] args){
        int drinkType = 1;
        String drinkName;
        switch( drinkType ){
            case 0:
                drinkName = "Pepsi";
                break;
            case 1:
                drinkName = "Mountain Dew";
                break;
            case 2:
                drinkName = "Water";
                break;
            case 3:
                drinkName = "Milkshake";
                break;
            default:
                drinkName = "Unkwnown";
        }
        System.out.println("Drink Type" + drinkName);
    }
}
