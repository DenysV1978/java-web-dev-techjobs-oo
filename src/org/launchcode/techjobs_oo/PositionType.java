package org.launchcode.techjobs_oo;

import java.util.Objects;

public class PositionType {
    private int id;
    private static int nextId = 1;
    private String value;

    public PositionType() {
        id = nextId;
        nextId++;
    }

    public PositionType(String value) {
        this();
        this.value = value;
    }

    // TODO: Add a custom toString() method that returns the data stored in 'value'.

    @Override
    public String toString() {
        return this.value;
    }

    // TODO: Add custom equals and hashCode methods. Consider two PositionType objects "equal" when
    //  their id fields match.

    @Override
    public boolean equals(Object o) {
        if(o == null) return false; // null check
        if(o.getClass() != this.getClass()) return false; //class check
        if(!(o instanceof PositionType)) return false; // another way to do class check
        if(o == this) return true; //reference check - on the base of address
        PositionType positionType = (PositionType) o; //casting object o to PositionType Class
        return positionType.getId() == this.getId();  //compare two objects on the base of their IDs.
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    // Getters and Setters:

    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
