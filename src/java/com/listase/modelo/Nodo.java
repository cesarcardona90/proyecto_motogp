package com.listase.modelo;

import java.io.Serializable;


public class Nodo implements Serializable{
    private Infante dato;
    private Nodo siguiente;

    public Nodo(Infante dato) {
        this.dato = dato;
    }

    public Infante getDato() {
        return dato;
    }

    public void setDato(Infante dato) {
        this.dato = dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    
    
}