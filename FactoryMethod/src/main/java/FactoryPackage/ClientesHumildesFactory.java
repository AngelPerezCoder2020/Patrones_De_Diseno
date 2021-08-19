package FactoryPackage;
import PizzasPackage.PizzaPeperoni;
import PizzasPackage.Pizza;
import PizzasPackage.PizzaJamón;

public class ClientesHumildesFactory implements Factory {
    @Override
    public Pizza getPizza(int x){
        Pizza pizza = null;
        String[] c = {"salsa","Piña"};
        if(x==1){
            pizza = new PizzaJamón("Hawaiana",50,c);
        }else if(x==2){
            pizza = new PizzaPeperoni("Peperoni", 30, c);
        }
        return pizza;
    }    
}