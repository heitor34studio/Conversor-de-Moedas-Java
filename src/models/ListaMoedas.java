package src.models;

import java.util.Map;

public class ListaMoedas {
    public String retornaStringViaNumero(int numero){
        Map<Integer, String> listaMoedas = Map.of(
                1, "USD",
                2, "ARS",
                3, "BRL",
                4, "COP",
                5, "CLP",
                6, "EUR"
        );

        if (listaMoedas.containsKey(numero)){
            return listaMoedas.get(numero);
        } else {
            return "Erro, o número informado, (" + numero + "), não está na lista!";
        }
    }
}
