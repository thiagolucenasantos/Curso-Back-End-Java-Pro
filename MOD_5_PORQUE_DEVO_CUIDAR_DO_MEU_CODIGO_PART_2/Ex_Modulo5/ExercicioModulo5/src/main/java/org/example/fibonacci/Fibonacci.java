package org.example.fibonacci;

public class Fibonacci {
    //
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

        public Fibonacci() {
        }

        public static int encontrarElemento(int n) {
            return n <= 1 ? n : encontrarElemento(n - 1) + encontrarElemento(n - 2);
        }

        public static void main(String[] args) {
            int n = 10;
            System.out.println("Elemento " + n + ": " + encontrarElemento(n));
        }
    }


