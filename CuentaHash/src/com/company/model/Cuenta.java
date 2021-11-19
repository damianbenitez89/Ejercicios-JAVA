package com.company.model;

public class Cuenta {
    private int codigo;
    private String tipo;
    private int saldo;

    public Cuenta() {
    }

    public Cuenta(int codigo, String tipo, int saldo) {
        this.codigo = codigo;
        this.tipo = tipo;
        this.saldo = saldo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "codigo=" + codigo +
                ", tipo='" + tipo + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
