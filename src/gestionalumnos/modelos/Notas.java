/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionalumnos.modelos;

import java.io.Serializable;

/**
 *
 * @author adria
 */
public class Notas implements Serializable{
    
    Asignatura asignatura;
    int notas[];
    int convocatoria;
    
    //Constructor vacio
    public Notas(){}

    public Notas(Asignatura asignatura, int notas[], int convocatoria) {
        this.asignatura = asignatura;
        this.notas = notas;
        this.convocatoria = convocatoria;
    }

    public Asignatura getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(Asignatura asignatura) {
        this.asignatura = asignatura;
    }

    public int[] getNotas() {
        return notas;
    }

    public void setNotas(int notas[]) {
        this.notas = notas;
    }

    public int getConvocatoria() {
        return convocatoria;
    }

    public void setConvocatoria(int convocatoria) {
        this.convocatoria = convocatoria;
    }
    
    
}