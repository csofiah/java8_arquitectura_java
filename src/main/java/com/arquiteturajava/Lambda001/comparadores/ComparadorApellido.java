package com.arquiteturajava.Lambda001.comparadores;

import com.arquiteturajava.Lambda001.ejemplo1.Persona;

import java.util.Comparator;

//el mismo comparador pero usando comparator
public class ComparadorApellido implements Comparator<Persona> {

    @Override
    public int compare(Persona persona1, Persona persona2) {
        return persona1.getApellido().compareTo(persona2.getApellido());
    }
}
