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
public class Ring implements TowerInterface {
    
    Ring(){
    }
    
    @Override
    public int cost() { return 4;}
    
    @Override
    public String bild(){ return "    0|0\n";}
}
