package com.personal.carteleraCine.Enums;

public enum TipoEnum {
    Sala2D("2D"),
    Sala3D("3D"),
    Sala4D("XD"),
    SalaIMAX("IMAX"),
    SalaVIP("VIP");

    private final String valor;

    // Constructor
    TipoEnum(String valor) {
        this.valor = valor;
    }
    @Override
    public String toString() {
        return valor;
    }
}
