/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PIGA
 */
    public class SpecBrick extends Brick {
    protected int color;

    public SpecBrick() {
        super();
        this.color = 0;
    }

    public SpecBrick(String place, int price, int color) {
        super(place, price);
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + color;
    }

    public void setData() {
        super.setPlace(place.substring(0, 1) + "B" + place.substring(1));
    }

    public int getValue() {
        if (color == 0) {
            return price;
        } else {
            return price + color;
        }
    }

    String getMake() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

