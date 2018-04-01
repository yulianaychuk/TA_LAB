package com.epam.lab.AbstractFactory;

import com.epam.lab.AbstractFactory.FurnitureFactory.ArtdecoFurnitureFactory;
import com.epam.lab.AbstractFactory.FurnitureFactory.FurnitureFactory;
import com.epam.lab.AbstractFactory.FurnitureFactory.ModernFurnitureFactory;
import com.epam.lab.AbstractFactory.FurnitureFactory.VictorianFurnitureFactory;

public class FactorySelector {
    public FurnitureFactory getFactory(FurnitureType furnitureType){
        FurnitureFactory factory = null;
        switch (furnitureType){
            case MODERN:
                factory = new ModernFurnitureFactory();
                break;
            case ARTDECO:
                factory = new ArtdecoFurnitureFactory();
                break;
            case VICTORIAN:
                factory = new VictorianFurnitureFactory();
                break;
        }
        return factory;
    }
}
