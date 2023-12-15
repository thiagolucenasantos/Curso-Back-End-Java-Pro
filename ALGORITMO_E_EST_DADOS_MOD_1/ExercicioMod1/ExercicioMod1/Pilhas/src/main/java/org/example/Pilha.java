package org.example;

import java.util.Stack;

public class Pilha {

    public static void main(String[] args) {


        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println("Mostrando lista completa" + stack);
        System.out.println("Retirando último elemento com pop, no caso o último elemento a entrar é o primeiro a sair, n° " + stack.pop());
        System.out.println("Olha o número que está no topo da lista e o retorna sem alterar a lista");
        System.out.println(stack.peek());
        System.out.println("Retorna true ou false, se a lista está vazia ou não");
        System.out.println(stack.empty());
        System.out.println("Retorna o tamanho da pilha");
        System.out.println(stack.size());
        System.out.println("search: Retorna a posição do elemento n caso pesquisado o n° 1 e sua posição atual é 3");
        System.out.println(stack.search(1));


    }

}
