package com.epam.lab.AbstractFactory.FurnitureFactory;

import com.epam.lab.AbstractFactory.Chair.ModernChair;
import com.epam.lab.AbstractFactory.Chair.Chair;
import com.epam.lab.AbstractFactory.Sofa.ModernSofa;
import com.epam.lab.AbstractFactory.Sofa.Sofa;
import com.epam.lab.AbstractFactory.Table.ModernTable;
import com.epam.lab.AbstractFactory.Table.Table;

public class ModernFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }

    @Override
    public Table createTable() {
        return new ModernTable();
    }
}
