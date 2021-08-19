package FactoryPackage;

import CarroPackage.Carro;
import MotoPackage.Moto;

public interface AbstractFactory {
    public Carro getCarro();
    public Moto getMoto();
}
