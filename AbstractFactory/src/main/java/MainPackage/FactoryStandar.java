package MainPackage;

public class FactoryStandar implements AbstractFactory {
    @Override
    public Carro getCarro(){
        return new CarroStandar("2017","azul");
    }
    @Override
    public Moto getMoto(){
        return new MotoStandar("2011", "roja");
    }   
}
