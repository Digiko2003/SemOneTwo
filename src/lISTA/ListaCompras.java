package lISTA;

import java.util.ArrayList;

public class ListaCompras {
    public static void main (String[] args){
        //Double: 30.0, 15.0, 12.50, 10.0, 1.00
        //Meter los precios en un ArrayLidt
        //Cual es el total
        ArrayList<Double>numero = new ArrayList<>();
        numero.add(30.0);
        numero.add(15.0);
        numero.add(12.50);
        numero.add(10.0);
        numero.add(1.0);
        Double Total = 0.0;
        Double total=0.0;

        for(Double precio : numero) {
            total = total + precio;
        }
            System.out.println("El total es: " + total);


    }
}
