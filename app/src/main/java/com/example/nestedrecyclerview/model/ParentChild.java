package com.example.nestedrecyclerview.model;

import java.util.ArrayList;

public class ParentChild {
    ArrayList<Child> child;

    public ParentChild() {}

    public ArrayList<Child> getChild() {
        return child;
    }

    public void setChild(ArrayList<Child> child) {
        this.child = child;
    }
}
