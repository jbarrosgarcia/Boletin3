/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin3;

/**
 *
 * @author Jose Barros
 */
public class Consumo {
    private float kms;
    private float litros;
    private float vMed;
    private float pGas;
    
    
    public Consumo() {
        this.kms = 0;
        this.litros = 0;
        this.vMed = 0;
        this.pGas = 0;
    }

    public Consumo(float kms, float litros, float vMed, float pGas) {
        this.kms = kms;
        this.litros = litros;
        this.vMed = vMed;
        this.pGas = pGas;
    }

    public float getKms() {
        return kms;
    }

    public void setKms() {
        this.kms = kms;
    }

    public float getLitros() {
        return litros;
    }

    public void setLitros(float litros) {
        this.litros = litros;
    }

    public float getvMed() {
        return vMed;
    }

    public void setvMed(float vMed) {
        this.vMed = vMed;
    }

    public float getpGas() {
        return pGas;
    }

    public void setpGas(float pGas) {
        this.pGas = pGas;
    }
    public float getTiempo(){
        float tempo;
        tempo=kms/vMed;
        return tempo;
    }
    public float consumoMed(){
        float consumoMed=0;
        consumoMed=this.litros/(this.kms/100);
        return consumoMed;
    }
    public float consumoEuros(){
        float consumoEur=0;
        consumoEur=this.litros/(this.kms/100);
        consumoEur=consumoEur*this.pGas;
        return consumoEur;
    }

    @Override
    public String toString() {
        return "Consumo{" + "kms=" + kms + ", litros=" + litros + ", vMed=" + vMed + ", pGas=" + pGas + '}';
    }
}
