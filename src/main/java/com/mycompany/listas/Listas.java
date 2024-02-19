package com.mycompany.listas;
import java.util.ArrayList;

public class Listas {

    private ArrayList<String> elementos;

    public Listas() {
        this.elementos = new ArrayList<>();
    }

    // Create
    public void agregarElemento(String elemento) {
        elementos.add(elemento);
        System.out.println("Elemento agregado: " + elemento);
    }

    // Read
    public void mostrarElementos() {
        System.out.println("Elementos en la lista:");
        for (String elemento : elementos) {
            System.out.println(elemento);
        }
    }

    // Update
    public void actualizarElemento(int indice, String nuevoElemento) {
        if (indice >= 0 && indice < elementos.size()) {
            elementos.set(indice, nuevoElemento);
            System.out.println("Elemento actualizado en el índice " + indice + ": " + nuevoElemento);
        } else {
            System.out.println("Índice fuera de rango.");
        }
    }

    // Delete
    public void eliminarElemento(int indice) {
        if (indice >= 0 && indice < elementos.size()) {
            String eliminado = elementos.remove(indice);
            System.out.println("Elemento eliminado en el índice " + indice + ": " + eliminado);
        } else {
            System.out.println("Índice fuera de rango.");
        }
    }

    public static void main(String[] args) {
        Listas lista = new Listas();
        lista.agregarElemento("Diego");
        lista.agregarElemento("Juan");
        lista.mostrarElementos();
        lista.actualizarElemento(0, "Carlos");
        lista.mostrarElementos();
        lista.eliminarElemento(1);
        lista.mostrarElementos();
    }
}
