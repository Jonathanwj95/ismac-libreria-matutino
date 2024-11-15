package com.distribuida.principal;

import com.distribuida.entities.Factura;
import com.distribuida.entities.FacturaDetalle;
import com.distribuida.entities.Libro;

public class FacturaDetallePrincipal {

    public static void main(String[] args) {
        // Crear instancias de Factura y Libro para usar en FacturaDetalle
        Factura factura = new Factura(1, "FAC-0001", new java.util.Date(), 100.25, 15.25, 116.25, null);
        Libro libro = new Libro(1, "Cien años de soledad", "Editorial XYZ", 400, "1ra edición", "Español", 1967, "Un libro famoso", "Tapa dura", "978-3-16-148410-0", 5, "portada.jpg", "Paperback", 25.50, 1, 1, null);
        
        // Crear una instancia de FacturaDetalle con la Factura y Libro creados
        FacturaDetalle facturaDetalle = new FacturaDetalle(1, 3, 75.50, libro, factura);

        // Imprimir la información del FacturaDetalle usando el método toString
        System.out.println(facturaDetalle.toString());
    }
}
