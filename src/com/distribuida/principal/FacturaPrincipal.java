package com.distribuida.principal;

import java.util.Date;

import com.distribuida.entities.Cliente;
import com.distribuida.entities.Factura;

public class FacturaPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cliente cliente = new Cliente(1,"1754668711","Juan","Taipe","Tumbaco","0995703166","jtaipe@correo.com");
		
		Factura factura = new Factura();
		
		factura.setIdFactura(1);
		factura.setFecha(new Date());
		factura.setNumFactura("FAC-0001");
		factura.setTotalNeto(100.25);
		factura.setIva(15.25);
		factura.setTotal(116.25);
		
		// inyeccion de independencias
		factura.setCliente(cliente);
		
		System.out.println(factura.toString());
		
		
	}

}
