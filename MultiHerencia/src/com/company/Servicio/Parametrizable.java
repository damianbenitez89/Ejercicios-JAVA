package com.company.Servicio;

public interface Parametrizable {
    double IVA=21;
    double CIF=0.06;
    boolean verificarExistencia(int cant);
    void actualizarStock (int cant);

}
