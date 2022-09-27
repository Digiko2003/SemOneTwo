package lISTA;//By Jesus Maldonado Cruz and Diego Arturo enriquez Mercado
import lISTA.ListaEnlazadaTrabajadores;

import java.util.Scanner;
public class Main {
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        int opcion;
        String name1= "Jose Luis";
        String puesto= "Licenciado";
        double salario= 5600;
        ListaEnlazadaTrabajadores myLinkedList = new ListaEnlazadaTrabajadores(name1,puesto,salario);
        do{
            menu();
            opcion = entrada.nextInt();
            switch(opcion){
                case 1:
                    System.out.println("----------------------------------");
                    System.out.println("Ingrese los datos del empleado: ");
                    name1 = entrada.nextLine();

                    System.out.println("Ingrese el nombre: ");
                    name1 = entrada.nextLine();
                    System.out.println("Ingrese el puesto: ");
                    puesto = entrada.nextLine();
                    System.out.println("Ingrese el salario");
                    salario = entrada.nextDouble();
                    myLinkedList.prepend(name1,puesto,salario);
                    myLinkedList.printllist();
                    myLinkedList.sumar();
                    break;
                case 2:
                    System.out.print("Ingrese los datos del empleado: ");
                    name1 = entrada.nextLine();
                    System.out.print("Dame el nombre: ");
                    name1 = entrada.nextLine();
                    System.out.println("Ingrese el puesto: ");
                    puesto = entrada.nextLine();
                    System.out.println("Ingrese el salario");
                    salario = entrada.nextDouble();
                    myLinkedList.append(name1,puesto,salario);
                    myLinkedList.printllist();
                    myLinkedList.sumar();
                    break;
                case 3:
                    myLinkedList.printllist();
                    myLinkedList.sumar();
                    break;
                case 4:
                    System.out.println();
                    System.out.println("Buscar Empleado: ");
                    name1 = entrada.nextLine();
                    System.out.println("Dame el nombre del empleado: ");
                    name1 = entrada.nextLine();
                    int entrada = myLinkedList.buscar(name1);
                    if (entrada != -1){
                        System.out.println("Empleado encontrado en la posicion "+name1+" "+entrada);
                    }else{
                        System.out.println("Empleado no encontrado!!!!");
                    }
                    break;
                case 5:
                    if(!myLinkedList.isEmpty()){
                        System.out.println("El empleado que se elimino: "+myLinkedList.removeFirst().name);
                    }else {
                        System.out.println("La lista ya esta vacia: ");
                    }
                    myLinkedList.printllist();
                    break;
                case 6:
                    if(!myLinkedList.isEmpty()){
                        System.out.println("El empleado que se elimino es: "+myLinkedList.removeLast().name);
                    }else {
                        System.out.println("La lista ya esta vacia: ");
                    }
                    myLinkedList.printllist();
                    break;
                case 7:
                    System.out.println("Numero de empleados: ");
                    myLinkedList.getLength();
                    break;
                case 8:
                    break;
                default:
                    System.out.println("Opcion no valida: ");
                    break;
            }
        }while(opcion !=8);
    }
    public static void menu(){
        System.out.println("----------------------");
        System.out.println("Menu Lista Enlazada Trabajadores");
        System.out.println("1. Meter empleado al principio");
        System.out.println("2. Meter empleado al final");
        System.out.println("3. Mostrar lista de empleados");
        System.out.println("4. Buscar un empleado en la lista");
        System.out.println("5. Borrar al empleado del inicio");
        System.out.println("6. Borrar al empleado del final");
        System.out.println("7. Obtener numero de empleados");
        System.out.println("8. Salir");
        System.out.print("Dame tu opcion: ");
    }
}

