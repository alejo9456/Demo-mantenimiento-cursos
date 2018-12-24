/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fisicursos.core.model;

/**
 *
 * @author Alejandro
 */
public class Plan {
    
    private int idPlan;
    private int codigoEscuela;
    private String nombre;

    public Plan(int idPlan, int codigoEscuela, String nombre) {
        this.idPlan = idPlan;
        this.codigoEscuela = codigoEscuela;
        this.nombre = nombre;
    }

    public Plan() {
    }

    public int getIdPlan() {
        return idPlan;
    }

    public void setIdPlan(int idPlan) {
        this.idPlan = idPlan;
    }

    public int getCodigoEscuela() {
        return codigoEscuela;
    }

    public void setCodigoEscuela(int codigoEscuela) {
        this.codigoEscuela = codigoEscuela;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
    
}
