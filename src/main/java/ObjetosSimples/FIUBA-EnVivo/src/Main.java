package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello FIUBA world! (Ejercicio hecho en clase, 20/03/2023");

        Materia algo1 = new Materia("75.01", "Algoritmos 1", 5);
        Materia algo2 = new Materia("75.02", "Algoritmos 2", 5);
        Materia algo3 = new Materia("75.03", "Algoritmos 3", 5);
        Materia electrotecnia = new Materia("66.01", "Electrotecnia", 5);
        Materia circuitos = new Materia("66.02", "Circtuitos", 5);
        Materia antenas = new Materia("66.03", "Antenas", 5);

        ArrayList<Materia> obligatoriasInformatica = new ArrayList<Materia>();
        obligatoriasInformatica.add(algo1);
        obligatoriasInformatica.add(algo2);
        obligatoriasInformatica.add(algo3);

        ArrayList<Materia> optativasInformatica = new ArrayList<Materia>();
        optativasInformatica.add(electrotecnia);

        ArrayList<Materia> obligatoriasElectronica = new ArrayList<Materia>();
        obligatoriasElectronica.add(electrotecnia);
        obligatoriasElectronica.add(circuitos);
        obligatoriasElectronica.add(antenas);

        ArrayList<Materia> optativasElectronica = new ArrayList<Materia>();
        optativasElectronica.add(algo1);


        Carrera informatica = new Carrera("Informática", 16,
                obligatoriasInformatica, optativasInformatica);
        Carrera electronica = new Carrera("Electrónica", 16,
                obligatoriasElectronica, optativasElectronica);

        Alumno a1 = new Alumno("Ramón", 1);
        Alumno a2 = new Alumno("Juan", 2);

        a1.inscribirCarrera(informatica);
        a1.agregarMateriaAprobada(algo1);
        a1.agregarMateriaAprobada(algo2);
        a1.agregarMateriaAprobada(algo3);
        System.out.println("Ramón aprobó Informática con 3 materias? " +
                informatica.alumnoRecibido(a1.getMateriasAprobadas()));
        a1.agregarMateriaAprobada(circuitos);

        System.out.println("Ahora si, Ramón aprobó Informática con 4 materias? " +
                informatica.alumnoRecibido(a1.getMateriasAprobadas()));

        a2.inscribirCarrera(electronica);
        a2.agregarMateriaAprobada(algo1);
        a2.agregarMateriaAprobada(circuitos);

        System.out.println("Juan está sin recibirse de electrónica; recibido?: " +
                electronica.alumnoRecibido(a2.getMateriasAprobadas()));
        System.out.println("Juan está sin recibirse de informática (ni está inscripto); recibido?: " +
                informatica.alumnoRecibido(a2.getMateriasAprobadas()));

        // deberíamos validar que esté inscripto en la carrera para permitirle cursar materias? No está especificado...

        // terminemos, finalmente, dejando recibirse al pobre de Juan Pérez...
        a2.agregarMateriaAprobada(antenas);
        a2.agregarMateriaAprobada(electrotecnia);
        System.out.println("Juan finalmente se recibió de electrónica; recibido?: " +
                electronica.alumnoRecibido(a2.getMateriasAprobadas()));
        System.out.println("Juan sin embargo, no se recibió en informática (recibido=" +
                informatica.alumnoRecibido(a2.getMateriasAprobadas())+")" );
    }
}