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
public class Curso {
    
    private int codigo;
    private String codigoBase;
    private String nombre;
    private Plan plan;
    private int ciclo;
    private int creditos;

    public Curso(int codigo, String codigoBase, String nombre, Plan plan, int ciclo, int creditos) {
        this.codigo = codigo;
        this.codigoBase = codigoBase;
        this.nombre = nombre;
        this.plan = plan;
        this.ciclo = ciclo;
        this.creditos = creditos;
    }

    public Curso() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCodigoBase() {
        return codigoBase;
    }

    public void setCodigoBase(String codigoBase) {
        this.codigoBase = codigoBase;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Plan getPlan() {
        return plan;
    }

    public void setPlan(Plan plan) {
        this.plan = plan;
    }

    public int getCiclo() {
        return ciclo;
    }

    public void setCiclo(int ciclo) {
        this.ciclo = ciclo;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }
    
    
}
