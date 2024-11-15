package com.distribuida.principal;

import com.distribuida.entities.Cliente;

public class ClientePrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cliente cliente = new Cliente(1,"1754668711","Juan","Taipe","Tumbaco","0995703166","jtaipe@correo.com");
		Cliente cliente2 = new Cliente(2,"1788983811","Pedro","Ramirez","Tumbaco","0987844640","pedri@correo.com");
		
		System.out.println(cliente.toString());
		
		
		//Cliente 2
		
		System.out.println(cliente2.toString());
	}

}
