package com.mclebtec.java.prototype.bonus;

import java.util.EnumMap;
import java.util.Map;

public class SpecimenCache {

    public static SpecimenCache specimenCache = null;

    private final Map<Cell.CellProtoTypes, Cell> prototypeSamples = new EnumMap<>(Cell.CellProtoTypes.class);

    public static final SpecimenCache getInstance() {
        if (specimenCache == null)
            specimenCache = new SpecimenCache();
        return specimenCache;
    }

    private SpecimenCache() {
    }

    public void loadSpecimenCache() {
        prototypeSamples.put(Cell.CellProtoTypes.AMOEBA, new Amoeba());
        prototypeSamples.put(Cell.CellProtoTypes.BACTERIA, new Bacteria());
        prototypeSamples.put(Cell.CellProtoTypes.SINGLE_CELL_ORG, new SingleCell());
    }

    public Cell getSpecimens(Cell.CellProtoTypes cellProtoTypes) {
        return prototypeSamples.get(cellProtoTypes);
    }
}
