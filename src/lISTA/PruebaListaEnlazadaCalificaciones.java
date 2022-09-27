package lISTA;

import lISTA.ListaEnlazadaCalificaciones;

//Diego Arturo Enriquez Mercado
public class PruebaListaEnlazadaCalificaciones {
    public static void main(String[] args) {
        ListaEnlazadaCalificaciones listaCalificacion = new ListaEnlazadaCalificaciones();

        listaCalificacion.insertarInicio(3.2);
        listaCalificacion.insertarInicio(10.0);
        listaCalificacion.insertarInicio(6.7);
        listaCalificacion.insertarInicio(5.1);
        listaCalificacion.insertarInicio(4.6);
        listaCalificacion.insertarInicio(7.8);
        listaCalificacion.insertarInicio(8.2);
        listaCalificacion.insertarInicio(7.5);
        listaCalificacion.insertarInicio(5.8);
        listaCalificacion.insertarInicio(8.7);
        listaCalificacion.mostrarLista();

        System.out.println("");
        System.out.println("--------------------------");
        Nodo V1=new Nodo(3.2);
        Nodo V2=new Nodo(10.0);
        Nodo V3=new Nodo(6.7);
        Nodo V4=new Nodo(5.1);
        Nodo V5=new Nodo(4.6);
        Nodo V6=new Nodo(7.8);
        Nodo V7=new Nodo(8.2);
        Nodo V8=new Nodo(7.5);
        Nodo V9=new Nodo(5.8);
        Nodo V10=new Nodo(8.7);

        //PROMEDIO

        double suma= V1.dato+ V2.dato+ V3.dato+V4.dato+V5.dato+ V6.dato+ V7.dato+ V8.dato+ V9.dato+ V10.dato;
        double promedio=suma/10;
        System.out.println("La promedio es: ");
        System.out.println(promedio);
        System.out.println("Fin del programa ");
    }
}