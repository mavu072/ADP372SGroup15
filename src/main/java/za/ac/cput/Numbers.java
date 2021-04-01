package za.ac.cput;

/*
 *Numbers.java
 *Felecia Zweni - 218330189
 * Date: 31 March 2021
 */

public class Numbers {

    private int add, subtract;

    public int getAdd() {
        return add;
    }

    public void setAdd(int add) {
        this.add = add;
    }

    public int getSubtract() {
        return subtract;
    }

    public void setSubtract(int subtract) {
        this.subtract = subtract;
    }

    @Override
    public String toString() {
        return "Numbers{" +
                "add=" + add +
                ", subtract=" + subtract +
                '}';
    }
}
