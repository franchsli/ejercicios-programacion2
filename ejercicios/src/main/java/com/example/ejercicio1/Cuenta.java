package com.example.ejercicio1;

public class Cuenta {

    protected float saldo;
    protected int numeroConsignaciones = 0;
    protected int numeroRetiros = 0;
    protected float tasaAnual;
    protected float comisionMensual = 0;

    public Cuenta(float saldo, float tasaAnual){
        this.saldo = saldo;
        this.tasaAnual = tasaAnual;
    }

    public void consignar(float cantidad){
        this.saldo += cantidad;
        this.numeroConsignaciones++;
    }

    public void retirar(float cantidad){
        if (cantidad <= this.saldo) {
            this.saldo -= cantidad;
            this.numeroRetiros++;
        }
    }

    public void calcularInteres(){
        float interesMensual = saldo * ((tasaAnual / 12) / 100);
        this.saldo += interesMensual;

    }

    public void extractoMensual(){
        this.saldo -= this.comisionMensual;
        this.calcularInteres();
        this.numeroConsignaciones = 0;
        this.numeroRetiros = 0;

    }

}
