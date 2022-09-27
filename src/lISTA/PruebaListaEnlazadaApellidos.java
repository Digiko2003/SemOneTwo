package lISTA;

import lISTA.ListaEnlazadaApellidos;

public class PruebaListaEnlazadaApellidos {
    public static void main(String[] args) {
        ListaEnlazadaApellidos listaApellidos = new ListaEnlazadaApellidos();
        listaApellidos.insertarInicio("Santos");
        listaApellidos.insertarInicio("López");
        listaApellidos.insertarInicio("Pérez");
        listaApellidos.insertarInicio("García");
        listaApellidos.mostrarLista();
    }
}
