package org.example;

import java.util.LinkedList;
import java.util.Queue;

public class FIFO {

    public static void main(String[] args) {

        Queue<Integer> fifo = new LinkedList<>();
        fifo.offer(2);
        fifo.offer(3);
        fifo.offer(4);
        fifo.offer(5);
        fifo.offer(6);

        System.out.println("Itens na lista " + fifo);
        System.out.println("Removendo item da lista FIFO, primeiro que entra é o primeiro que sai n° " + fifo.remove());
        System.out.println(fifo);
        System.out.println("Olha o primeiro elemento da lista " + fifo.peek());
        System.out.println("Olha o primeiro elemento da lista igual o peek " + fifo.poll());
        System.out.println("Elemento a frente da fila " + fifo.element());
    }

}
