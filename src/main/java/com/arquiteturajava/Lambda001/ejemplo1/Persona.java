package com.arquiteturajava.Lambda001.ejemplo1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Persona implements Comparable<Persona>{

    private String nombre;
    private String apellido;
    private int edad;

    @Override
    public int compareTo(Persona otro) {
        return this.getNombre().compareTo(otro.getNombre());
    }
}
