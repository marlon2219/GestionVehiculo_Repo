
package com.ceep.domain;

public class vehiculo {
    private String matricula;
    private String marca;
    private String color;
    private double tarifa;
    private boolean disponible;

    public vehiculo(String matricula, String marca, String color, double tarifa, boolean disponible) {
        this.matricula = matricula;
        this.marca = marca;
        this.color = color;
        this.tarifa = tarifa;
        this.disponible = disponible;
    }

    
    

    public String getMatricula() {
        return matricula;
    }

    public String getMarca() {
        return marca;
    }

    public String getColor() {
        return color;
    }

    public double getTarifa() {
        return tarifa;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return  "matricula=" + matricula + ", marca=" + marca + ", color=" + color + ", tarifa=" + tarifa + ", disponible=" + disponible ;
    }

    
    
    
}
