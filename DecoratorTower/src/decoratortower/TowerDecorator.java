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
public abstract class TowerDecorator implements TowerInterface {
    TowerInterface tower;
    TowerDecorator(TowerInterface tower){this.tower = tower;}
    
    @Override
    public abstract int cost();
    
    @Override 
    public abstract String bild();
}
