package com.ufit.ufitapi.entities;

import java.io.Serializable;
import java.util.Objects;

public class Alimento implements Serializable {
    private static final long serialVersionUID = 1L;
    public String id;
    public String name;
    public int calorias;
    public float proteinas;
    public float lipideos;
    public float carboidratos;
    public float fibras;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getCalorias() {
        return calorias;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alimento alimento = (Alimento) o;
        return Objects.equals(id, alimento.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public void setProteinas(float proteinas) {
        this.proteinas = proteinas;
    }

    public void setLipideos(float lipideos) {
        this.lipideos = lipideos;
    }

    public void setCarboidratos(float carboidratos) {
        this.carboidratos = carboidratos;
    }

    public void setFibras(float fibras) {
        this.fibras = fibras;
    }

    public String getName() {
        return name;
    }

    public float getProteinas() {
        return proteinas;
    }

    public float getLipideos() {
        return lipideos;
    }

    public float getCarboidratos() {
        return carboidratos;
    }

    public float getFibras() {
        return fibras;
    }

    public Alimento(){}

    public Alimento(String id, String name, int calorias, float proteinas, float lipideos, float carboidratos, float fibras) {
        this.id = id;
        this.name = name;
        this.calorias = calorias;
        this.proteinas = proteinas;
        this.lipideos = lipideos;
        this.carboidratos = carboidratos;
        this.fibras = fibras;
    }


}
