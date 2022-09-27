package lISTA;

public class RecursionNumeros {
    public static void main(String [] args){
        imprimir(1);

    }
    public static void imprimir(int n){
        System.out.println(n);
        if(n==10){
            return;
        }
        imprimir(n+1);
    }
}
