package MainPackage;
import FactoryPackage.AbstractFactory;
import FactoryPackage.FactoryStandar;
import FactoryPackage.FactoryAutomatico;
import FactoryPackage.FactoryTriptronic;
import java.util.Scanner;

public class Agencia {
    public static AbstractFactory fabrica;
    public static String opc;
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Bienvenido a la Agencia \n\nQue clase de transimision en Vehiculos Busca?\n 1. Automatica \n 2. Standar");
        opc = scanner.nextLine();
        if(opc.equals("1")){
            fabrica = new FactoryAutomatico();
            System.out.println("Ingrese el tipo de Vehiculo que busca: \n1. Carro \n 2. Moto");
        }else if(opc.equals("2")){
            fabrica = new FactoryStandar();
            System.out.println("Ingrese el tipo de Vehiculo que busca: \n1. Carro \n 2. Moto");
        }else if(opc.equals("3")){
            fabrica = new FactoryTriptronic();
        }
        opc = scanner.nextLine();
        if(opc.equals("1")){
            System.out.println("Usted a Recibido: "+fabrica.getCarro().toString());
        }else if(opc.equals("2")){
            System.out.println("Usted a Recibido: "+fabrica.getMoto().toString());
        }
        scanner.nextLine();
    }
}