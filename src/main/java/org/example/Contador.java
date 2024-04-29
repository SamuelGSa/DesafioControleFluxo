package org.example;

import org.example.exception.ParametrosInvalidosException;

import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        System.out.print("Digite o primeiro parâmetro: ");
        int parametroUm = scanner().nextInt();
        System.out.print("Digite o segundo parâmetro: ");
        int parametroDois = scanner().nextInt();

        try {
            //chamando o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);

        }catch (ParametrosInvalidosException exception) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

    }
    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException(" O segundo parâmetro deve ser maior que o primeiro");
        }

        for (int i = parametroUm; i < parametroDois; i++){
            System.out.println("Imprimindo o número 1: " + parametroUm++);
        }
    }

    static Scanner scanner() {
        return new Scanner(System.in);
    }
}