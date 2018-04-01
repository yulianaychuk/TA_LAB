package com.epam.lab.AbstractFactory.FurnitureFactory;

import com.epam.lab.AbstractFactory.Chair.Chair;
import com.epam.lab.AbstractFactory.Sofa.Sofa;
import com.epam.lab.AbstractFactory.Table.Table;

public class ArtdecoFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return null;
    }

    @Override
    public Sofa createSofa() {
        return null;
    }

    @Override
    public Table createTable() {
        return null;
    }
}
