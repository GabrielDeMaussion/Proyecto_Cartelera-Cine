package com.personal.carteleraCine.Enums;

public enum CategoriaEnum {
    ATP("ATP"),
    PG13("+13"),
    PG16("+16"),
    PG18("+18");

    private final String valor;

    CategoriaEnum(String valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return valor;
    }
}
