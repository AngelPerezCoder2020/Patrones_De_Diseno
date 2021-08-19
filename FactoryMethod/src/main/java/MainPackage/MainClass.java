package MainPackage;
import FactoryPackage.*;
import java.util.Scanner;

public class MainClass {
    public static Factory fabrica;
    public static String opc;
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Bienvenido a la Pizzeria \n\nQue menú deseas usar para ordenar su pizza? \n 1.Menú Humilde \n 2.Menú Naco");
        opc = scanner.nextLine();
        if(opc.equals("1")){
            fabrica = new ClientesHumildesFactory();
            System.out.println("Las pizzas en este menú son: \n\n1. Pizza de Jamón \n2. Pizza de Peperoni \n\nIngrese una opcion válida");
        }else if(opc.equals("2")){
            fabrica = new ClienteNacoFactory();
            System.out.println("Las pizzas en este menú son: \n\n1. Pizza hawaiana \n2. Pizza Carbonara \n3. Pizza Napolitana \n\nIngrese una opcion válida");
        }
        opc = scanner.nextLine();
        System.out.println("La pizza que usted a obtenido es: "+fabrica.getPizza(Integer.parseInt(opc)).getNombre());
        scanner.nextLine();
    }
}