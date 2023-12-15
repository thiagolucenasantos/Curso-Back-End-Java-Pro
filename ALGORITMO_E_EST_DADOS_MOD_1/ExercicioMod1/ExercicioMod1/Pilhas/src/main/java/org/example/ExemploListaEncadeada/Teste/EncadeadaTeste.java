package org.example.ExemploListaEncadeada.Teste;

import org.example.ExemploListaEncadeada.Encadeada;

public class EncadeadaTeste {
    public static void main(String[] args) {
        Encadeada<Integer> lista = new Encadeada<>();
        lista.adiciona(1);
        lista.adiciona(2);
        System.out.println(lista);
    }
}
