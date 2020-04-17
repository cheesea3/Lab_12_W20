package org.nightoff;

public class settings {
    private int FirstTerm; // private = restricted access
    private int CommonDifference; // private = restricted access

    // Getter First Term
    public int getFirstTerm() {
        return FirstTerm;
    }

    // Setter First Term
    public void setFirstTerm(int newName) {
        this.FirstTerm = newName;
    }

    // Getter Common Difference
    public int getCommonDifference() {
        return CommonDifference;
    }

    // Setter Common Difference
    public void setCommonDifference(int newName) {
        this.CommonDifference = newName;
    }

}
