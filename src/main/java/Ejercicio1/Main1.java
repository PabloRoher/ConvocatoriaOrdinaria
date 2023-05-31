package Ejercicio1;

public class Main1 {
    public static void main(String[] args) {
        GlamourFinancial glamourFinancial = new GlamourFinancialImplementation();
        System.out.println("Valor de mercado: " + glamourFinancial.calcularValorMercado());
        System.out.println("Precio de valor en libros: " + glamourFinancial.calcularPrecioValorLibros());
    }
}