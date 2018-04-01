package com.epam.lab.AbstractFactory.FurnitureFactory;

import com.epam.lab.AbstractFactory.Chair.Chair;
import com.epam.lab.AbstractFactory.Sofa.Sofa;
import com.epam.lab.AbstractFactory.Table.Table;

public interface FurnitureFactory {
    Chair createChair();

    Sofa createSofa();

    Table createTable();
}
