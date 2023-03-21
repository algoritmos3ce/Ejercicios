package org.example;

import java.util.ArrayList;
import java.util.List;

public class Alumno {

    private String nombre;

    private int padron;

    private ArrayList<Materia> materiasAprobadas;

    private ArrayList<Carrera> carrerasInscripto;

    public Alumno(String nombre, int padron){
        this.nombre = nombre;
        this.padron = padron;
        this.materiasAprobadas = new ArrayList<Materia>();
        this.carrerasInscripto = new ArrayList<Carrera>();
    }

    public void inscribirCarrera(Carrera carrera){
        boolean yaInscripto = false;
        for (int i=0; i<this.carrerasInscripto.size(); i++){
            if (this.carrerasInscripto.get(i).getCodigo().equals(carrera.getCodigo())) {
                yaInscripto = true;
                break;
            }
        }
        if (!yaInscripto){
            this.carrerasInscripto.add(carrera);
        }
    }

    public void agregarMateriaAprobada(Materia materia){
        boolean yaAprobada = false;
        for (int i=0; i<this.materiasAprobadas.size();i++){
            if (this.materiasAprobadas.get(i).getCodigo().equals(materia.getCodigo())) {
                yaAprobada = true;
                break;
            }
        }
        if (!yaAprobada){
            this.materiasAprobadas.add(materia);
        }
    }

    public List<Materia> getMateriasAprobadas(){
        return this.materiasAprobadas;
    }
}
