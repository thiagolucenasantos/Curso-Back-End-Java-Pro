package org.example.ExemploListaEncadeada;

public class Encadeada<T> {
    private No<T> inicio;

    public void adiciona(T elemento){
        No<T> celula = new No<T>(elemento);
        this.inicio = celula;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Lista Encadeada [inicio = ").append(inicio).append("]");
        return builder.toString();
    }
}
