/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decoratortower;

/**
 *
 * @author User
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   TowerInterface tower;
        tower = new Ring4(new Ring3(new Ring2(new Ring())));
        System.out.println(tower.bild());
        if (tower.cost() == 1){System.out.println("+");}
        else {System.out.println("-");}
   TowerInterface tower2;
        tower2 = new Ring4(new Ring2(new Ring3(new Ring())));
        System.out.println(tower2.bild());
        if (tower2.cost() == 1){System.out.println("+");}
        else {System.out.println("-");}
    }
    
}
