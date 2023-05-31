package Ejercicio1;

public interface GlamourFinancial {
    double getAcciones(String mercado);
    void updateAcciones(String mercado, double valor);
    double calcularValorMercado();
    double calcularPrecioValorLibros();
}
