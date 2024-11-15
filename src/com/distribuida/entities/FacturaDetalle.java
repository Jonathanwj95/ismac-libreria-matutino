package com.distribuida.entities;

public class FacturaDetalle {

	private int idFacturaDetalle;
	private int cantidad;
	private double subtotal;
	//private int idFactura;
	//private int idLibro;
	
	private Libro libro;
	private Factura factura;
	


public FacturaDetalle() {
		
}

public FacturaDetalle(int idFacturaDetalle, int cantidad, double subtotal, Libro libro, Factura factura) {
	
	this.idFacturaDetalle = idFacturaDetalle;
	this.cantidad = cantidad;
	this.subtotal = subtotal;
	this.factura = factura;
}

public int getIdFacturaDetalle() {
	return idFacturaDetalle;
}

public void setIdFacturaDetalle(int idFacturaDetalle) {
	this.idFacturaDetalle = idFacturaDetalle;
}

public int getCantidad() {
	return cantidad;
}

public void setCantidad(int cantidad) {
	this.cantidad = cantidad;
}

public double getSubtotal() {
	return subtotal;
}

public void setSubtotal(double subtotal) {
	this.subtotal = subtotal;
}

public Libro getLibro() {
	return libro;
}

public void setLibro(Libro libro) {
	this.libro = libro;
}

public Factura getFactura() {
	return factura;
}

public void setFactura(Factura factura) {
	this.factura = factura;
}



}

