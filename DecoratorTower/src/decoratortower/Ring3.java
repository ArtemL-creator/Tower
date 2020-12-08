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
public class Ring3 extends TowerDecorator{
    Ring3(TowerInterface ring){
        super(ring);
    }
    
    @Override
    public int cost() {if(tower.cost()==3) return tower.cost()-1; else return -1;}
    
    @Override 
    public String bild() {return tower.bild()+"  000|000\n";}
}

