package NivelIntermediario.DesafioLinkedList;

import java.util.LinkedList;

public class NinjaUtils {
    //Classe criada para métodos auxiliares do main

    /*
    * Metodo para listar cada objeto da lista, apenas para estilização da lista
    * */
    public static void imprimirLista(LinkedList<Ninja> lista) {
        for (Ninja n : lista) {
            System.out.print(n);
        }
    }

}
