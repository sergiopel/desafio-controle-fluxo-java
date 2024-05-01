package com.codigonaweb;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com o parâmetro 1: ");
        int parametroUm = scanner.nextInt();
        System.out.println("Entre com o parâmetro 2: ");
        int parametroDois = scanner.nextInt();

        try {
            contar(parametroUm, parametroDois);
        } catch(ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }

    }

    static void contar(int paramUm, int paramDois) throws ParametrosInvalidosException {
        if (paramDois < paramUm) {
            throw new ParametrosInvalidosException();
        }
        int contagem = paramDois - paramUm;

        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }

    }
}
