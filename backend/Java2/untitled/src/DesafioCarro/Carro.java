package DesafioCarro;

public class Carro {
    private String nomeMotorista;
    private String Modelo;

    Carro(String nome, String Modelo) {
        this.nomeMotorista = nome;
        this.Modelo = Modelo;
    }

    String getNomeMotorista()
    {
        return this.nomeMotorista;
    }

    String getModelo() {
        return this.Modelo;
    }


}