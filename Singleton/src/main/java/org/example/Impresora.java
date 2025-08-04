package org.example;

public class Impresora {
    private static Impresora instance;

    private Impresora() {}

    public static Impresora getInstance() {
        if (instance == null) {
            instance = new Impresora();
        }
        return instance;
    }

    public void imprimirLine(String texto) {
        System.out.println(texto);
    }
}
