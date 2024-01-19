package com.arquiteturajava.Lambda001.ejemplo1;

import java.util.ArrayList;
import java.util.Collections;

public class Principal {

    public static void main(String[] args) {
        ArrayList<Persona> listsPersonas = new ArrayList<>();
        listsPersonas.add(new Persona("pedro","gomez",30));
        listsPersonas.add(new Persona("ana","sanchez",40));
        listsPersonas.add(new Persona("gema","blanco",20));

        Collections.sort(listsPersonas);
        for(Persona p: listsPersonas){
            System.out.printf("persona: %s %s %s %n",p.getNombre(), p.getApellido(), p.getEdad());
        }
    }
}
