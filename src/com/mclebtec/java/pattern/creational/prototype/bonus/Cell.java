package com.mclebtec.java.pattern.creational.prototype.bonus;

public abstract class Cell implements Cloneable {

    public Cell() {
    }

    public void setCellType(String cellType) {
        this.cellType = cellType;
    }

    public String getCellType() {
        return cellType;
    }

    private String cellType;

    public enum CellProtoTypes {
        AMOEBA, BACTERIA, SINGLE_CELL_ORG
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return cellType + " with id " + hashCode();
    }

    public Object split() {
        Object cloneObject = null;
        try {
            cloneObject = this.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return cloneObject;
    }
}

class Amoeba extends Cell {
    public Amoeba() {
        setCellType("Amoeba");
        System.out.println("Constructor of Amoeba is called...");
    }
}

class Bacteria extends Cell {
    public Bacteria() {
        setCellType("Bacteria");
        System.out.println("Constructor of Bacteria is called ... ");
    }
}

class SingleCell extends Cell {
    public SingleCell() {
        setCellType("SingleCell");
        System.out.println("Constructor of SingleCell is called ... ");
    }
}
