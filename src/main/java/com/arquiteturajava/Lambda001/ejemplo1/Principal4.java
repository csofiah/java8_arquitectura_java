package com.arquiteturajava.Lambda001.ejemplo1;

import com.arquiteturajava.Lambda001.comparadores.ComparadorApellido;

import java.util.ArrayList;
import java.util.Comparator;

public class Principal4 {

    public static void main(String[] args) {
        ArrayList<Persona> listsPersonas = new ArrayList<>();
        listsPersonas.add(new Persona("pedro","gomez",30));
        listsPersonas.add(new Persona("ana","sanchez",40));
        listsPersonas.add(new Persona("gema","blanco",20));

        //listsPersonas.sort(new ComparadorNombre());
        listsPersonas.sort((Persona p1, Persona p2) -> {


                if(p1.getEdad() == p2.getEdad()){
                    return 0;
                }else if(p1.getEdad() > p2.getEdad()){
                    return 1;
                }else{
                    return -1;
                }

        });

        for(Persona p: listsPersonas){
            System.out.printf("persona: %s %s %s %n",p.getNombre(), p.getApellido(), p.getEdad());
        }
    }
}
