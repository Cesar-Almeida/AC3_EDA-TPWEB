package br.com.bandtec.ac3veiculos.dominio;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

@Entity
public class Veiculo {

    @Id
    @NotBlank
    @NotNull
    private String chassi;

    @Positive
    private int rodas;

    @Positive
    private double tanqueLitros;

    @NotNull
    @NotBlank
    private String modelo;


    @NotBlank
    private String marca;

    @Positive
    private int ano;

    @Positive
    private double quilometragem;

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public int getRodas() {
        return rodas;
    }

    public void setRodas(int rodas) {
        this.rodas = rodas;
    }

    public double getTanqueLitros() {
        return tanqueLitros;
    }

    public void setTanqueLitros(double tanqueLitros) {
        this.tanqueLitros = tanqueLitros;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(double kilometragem) {
        this.quilometragem = kilometragem;
    }
}

