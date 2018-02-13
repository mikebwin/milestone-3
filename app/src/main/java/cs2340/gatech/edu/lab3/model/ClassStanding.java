package cs2340.gatech.edu.lab3.model;

/**
 * Created by Yuan Zhang on 1/31/2018.
 */

public enum ClassStanding {

    FRESHMAN ("FR"), SOPHOMORE("SO"), JUNIOR("JR"), SENIOR("SR");

    private final String standing;

    ClassStanding(String grade) {
        standing = grade;
    }

    public String toString() {
        return standing;
    }
}
