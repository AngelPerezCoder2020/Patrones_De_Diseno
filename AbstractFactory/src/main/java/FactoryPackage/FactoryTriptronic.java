/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryPackage;

import CarroPackage.Carro;
import CarroPackage.CarroTriptronic;
import MotoPackage.Moto;
import MotoPackage.MotoTripTronic;

/**
 *
 * @author angel
 */
public class FactoryTriptronic implements AbstractFactory{

    @Override
    public Carro getCarro() {
        return new CarroTriptronic("2012","blanco"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Moto getMoto() {
        return new MotoTripTronic("2021","Roja");//To change body of generated methods, choose Tools | Templates.
    }
    
}
