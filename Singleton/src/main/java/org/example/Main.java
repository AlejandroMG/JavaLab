package org.example;

public class Main {
    public static void main(String[] args) {
        Impresora uniqueInstance = Impresora.getInstance();
        Impresora uniqueInstance2 = Impresora.getInstance();

        uniqueInstance.imprimirLine("Hola");
        uniqueInstance2.imprimirLine("Hola 2");

        if (uniqueInstance.equals(uniqueInstance2)) {
            System.out.println(true + " Misma instancia de Impresora");
        }
//Prueba
    }
}