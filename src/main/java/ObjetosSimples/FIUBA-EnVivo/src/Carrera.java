package org.example;

import org.example.Materia;

import java.util.ArrayList;
import java.util.List;

public class Carrera {

    private String nombre;

    private String codigo;

    private int creditosMinimos;

    // ¿por qué "materiasOblitagorias" y no "cursosObligatorios"?
    // -> uniformizar nombres genera un lenguaje técnico propio en el programa!! <- mejora la comunicación contextual
    private ArrayList<Materia> materiasObligatorias;

    private ArrayList<Materia> materiasOptativas;

    public Carrera(String nombre, int creditosMinimos, ArrayList<Materia> obligatorias, ArrayList<Materia> optativas){
        this.nombre = nombre;
        this.creditosMinimos = creditosMinimos;
        this.materiasObligatorias = obligatorias;
        this.materiasOptativas = optativas;
    }

    public String getCodigo()
    {
        return this.codigo;
    }

    public String getNombre(){
        return this.nombre;
    }

    private boolean creditosSuficientes(List<Materia> materiasAprobadas){
        boolean creditosSuficientes = false;

        int creditosTotales = 0;

        for (int i=0; i<materiasAprobadas.size(); i++){
            creditosTotales = creditosTotales + materiasAprobadas.get(i).getCreditos();
        }

        if (creditosTotales >= this.creditosMinimos){
            creditosSuficientes = true;
        }
        return creditosSuficientes;
    }

    private boolean hayMateriasFaltantes(List<Materia> materiasAprobadas){
        boolean materiaFaltante = false;

        for (int i = 0; i<this.materiasObligatorias.size() && !materiaFaltante; i++){
            boolean materiaAprobada = false;
            Materia obligatoria = this.materiasObligatorias.get(i);

            for (int j = 0; j<materiasAprobadas.size(); j++){
                Materia aprobada = materiasAprobadas.get(j);
                if (obligatoria.getCodigo().equals(aprobada.getCodigo())) {
                    materiaAprobada = true;
                    break;
                }
            }
            if (!materiaAprobada) {
                materiaFaltante = true;
            }
        }

        return materiaFaltante;
    }

    public boolean alumnoRecibido(List<Materia> materiasAprobadas){
        return !hayMateriasFaltantes(materiasAprobadas) && creditosSuficientes(materiasAprobadas);
    }
}
