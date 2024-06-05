package src.main;

import src.models.ConsultaMoeda;
import src.models.DuplaDeMoedas;
import src.models.ListaMoedas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        ConsultaMoeda consultaMoeda = new ConsultaMoeda();
        ListaMoedas listaMoedas = new ListaMoedas();
        var opcao1 = 0;
        var opcao2 = 0;
        double quantidade;
        String mensagem = """
                ****************************
                Seja bem-vindo(a) ao Conversor de Moeda!
                1) Dólar
                2) Peso argentino
                3) Real Brasileiro
                4) Peso Colombiano
                5) Peso Chileno
                6) Euro
                Escolha uma moeda de base pelo seu número na lista acima:
                """;

        int continuar = 1;
        while (continuar == 1){
            try {
                System.out.println(mensagem);
                opcao1 = leitura.nextInt();
                leitura.nextLine();

                String codigoMoedaBase = listaMoedas.retornaStringViaNumero(opcao1);
                if (codigoMoedaBase.length() > 3) {
                    throw new RuntimeException(codigoMoedaBase);
                }

                System.out.println("Agora escolha a moeda alvo pelo seu número na lista acima:");
                opcao2 = leitura.nextInt();
                leitura.nextLine();

                String codigoMoedaAlvo = listaMoedas.retornaStringViaNumero(opcao2);
                if (codigoMoedaAlvo.length() > 3) {
                    throw new RuntimeException(codigoMoedaAlvo);
                }

                if(opcao1 == opcao2){
                    throw new RuntimeException("As moedas não podem ser as mesmas, uai...");
                }

                System.out.println("Agora escolha o valor a converter:");
                quantidade = leitura.nextDouble();
                leitura.nextLine();

                DuplaDeMoedas duplaDeMoedas = new DuplaDeMoedas(codigoMoedaBase, codigoMoedaAlvo, quantidade);
                consultaMoeda.realizaConsulta(duplaDeMoedas);

                System.out.println("Insira 1 para fazer outra conversão ou 0 para sair:");
                continuar = leitura.nextInt();
                leitura.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Erro, o valor inserido não é um dos números inteiros da lista!");
                continuar = 0;
            } catch (RuntimeException e){
                System.out.println(e.getMessage());
                continuar = 0;
            }
        }
    }
}
