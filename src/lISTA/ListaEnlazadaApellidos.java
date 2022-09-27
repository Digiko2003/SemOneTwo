package lISTA;

//by Diego Arturo Enriquez Mercado
public class ListaEnlazadaApellidos {
    private NodoLista P;

    private class NodoLista {
        private String calificacion;
        private NodoLista sig; // Referencia al siguiente lISTA.Nodo en la lista

        public NodoLista(String calificacionX) {
            this.calificacion = calificacionX;
            this.sig = null;
        }
    }

    public void mostrarLista() {
        NodoLista nodoAuxiliar = P;
        System.out.print("P --> ");
        while (nodoAuxiliar != null) {
            System.out.print(nodoAuxiliar.calificacion+ " --> ");
            nodoAuxiliar = nodoAuxiliar.sig;
        }
        System.out.println("null");
    }

    public void insertarInicio(String valor) {
        NodoLista nodoNuevo = new NodoLista(valor);
        nodoNuevo.sig = P;
        P = nodoNuevo;
    }
}//by Diego Arturo Enriquez Mercado