package com.mclebtec.java.pattern.creational.prototype.bonus;

import com.mclebtec.java.pattern.creational.prototype.bonus.Cell.CellProtoTypes;

import java.util.EnumMap;
import java.util.Map;

import static com.mclebtec.java.pattern.creational.prototype.bonus.Cell.CellProtoTypes.*;

public class SpecimenCache {

    public static SpecimenCache specimenCache = null;

    private final Map<CellProtoTypes, Cell> prototypeSamples = new EnumMap<>(CellProtoTypes.class);

    public static final SpecimenCache getInstance() {
        if (specimenCache == null)
            specimenCache = new SpecimenCache();
        return specimenCache;
    }

    private SpecimenCache() {
    }

    public void loadSpecimenCache() {
        prototypeSamples.put(AMOEBA, new Amoeba());
        prototypeSamples.put(BACTERIA, new Bacteria());
        prototypeSamples.put(SINGLE_CELL_ORG, new SingleCell());
    }

    public Cell getSpecimens(CellProtoTypes cellProtoTypes) {
        return prototypeSamples.get(cellProtoTypes);
    }
}
