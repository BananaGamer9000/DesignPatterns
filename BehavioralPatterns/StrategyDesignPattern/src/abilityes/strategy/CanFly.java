package abilityes.strategy;

import abilityes.Fly;


//Class that separates the necessity of interface method implementation
public class CanFly implements Fly {
    @Override
    public String fly() {
        System.out.println(" can Fly");
        return null;
    }
}
