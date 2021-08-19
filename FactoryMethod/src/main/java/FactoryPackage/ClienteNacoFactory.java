package FactoryPackage;
import PizzasPackage.PizzaCarbonara;
import PizzasPackage.Pizza;
import PizzasPackage.PizzaNapolitana;
import PizzasPackage.PizzaHawaina;

public class ClienteNacoFactory implements Factory {
    @Override
    public Pizza getPizza(int x){
        Pizza pizza = null;
        String[] c = {"salsa", "mayonesa", "queso mozarella"};
        if(x==1){
            pizza = new PizzaHawaina("hawaina", 80, c);
        }else if(x==2){
            pizza = new PizzaCarbonara("carbonara", 90, c);
        }else if(x==3){
            pizza = new PizzaNapolitana("Napolitana", 100, c);
        }
        return pizza;
    }
}