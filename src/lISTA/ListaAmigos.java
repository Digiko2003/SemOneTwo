package lISTA;

import java.util.ArrayList;

public class ListaAmigos {
    public static void main(String[] args){
        ArrayList<String>amigos = new ArrayList<>();
        amigos.add("Ana");
        amigos.add("Rox");
        amigos.add("Jesus");
        amigos.add("Jose");
        amigos.add("Carolina");
        for(String amigo : amigos) {
            System.out.println(amigo);
        }
    }
}
