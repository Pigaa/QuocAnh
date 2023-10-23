/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author PIGA
 */
public class BeeColony extends Colony implements Role {
    private final String type;

    public BeeColony(int size, String type, String place) {
        super(size, place);
        this.type = type;
    }

    @Override
    public String toString() {
        return "the colony's type is " + type + ", size is about " + size + ", and the place is " + place;
    }

    @Override
    public void createWorker() {
        System.out.println("Worker bees perform all the work of the bees");
    }
}


