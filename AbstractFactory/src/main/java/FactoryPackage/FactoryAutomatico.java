package FactoryPackage;

import CarroPackage.Carro;
import CarroPackage.CarroAutomatico;
import MotoPackage.MotoAutomatica;
import MotoPackage.Moto;

public class FactoryAutomatico implements AbstractFactory {
    @Override
    public Carro getCarro(){
        return new CarroAutomatico("2021","blanco");
    }
    public Moto getMoto(){
        return new MotoAutomatica("2020","morado");
    }
}