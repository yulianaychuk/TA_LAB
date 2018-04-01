package com.epam.lab.AbstractFactory.FurnitureFactory;

import com.epam.lab.AbstractFactory.Chair.VictorianChair;
import com.epam.lab.AbstractFactory.Chair.Chair;
import com.epam.lab.AbstractFactory.Sofa.Sofa;
import com.epam.lab.AbstractFactory.Sofa.VictorianSofa;
import com.epam.lab.AbstractFactory.Table.Table;
import com.epam.lab.AbstractFactory.Table.VictorianTable;

public class VictorianFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new VictorianChair();
    }

    @Override
    public Sofa createSofa() {
        return new VictorianSofa();
    }

    @Override
    public Table createTable() {
        return new VictorianTable();
    }
}
