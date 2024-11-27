package com.distribuida.principaldao;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.ClienteDAO;
import com.distribuida.entities.Cliente;

public class ClienteDAOPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		ClienteDAO clienteDAO = context.getBean("clienteDAOImpl", ClienteDAO.class);
		
		// INSERT
		Cliente cliente = new  Cliente(0,"1754668711","Juan","Taipe","Quito","09987844640", "jtaipe@correo.com");
		//clienteDAO.add(cliente);
		
		// UPDATE
		Cliente cliente2 = new  Cliente(39,"1754668712","David","Chuquimarca","Afganistan","09987844643", "afgano@correo.com");
		//clienteDAO.up(cliente2);
				

		//findOne
		try {
			Cliente cliente3 = clienteDAO.findOne(39);
			System.out.println(cliente3.toString());
		}catch(Exception e) {
			//TODO: handle exception
			e.printStackTrace();
		}
		
		// DELETE
		//clienteDAO.del(39);	
		
				
		
		//findAll
		List<Cliente> clientes = clienteDAO.findAll();
		
		for (Cliente item : clientes) {
			System.out.println(item.toString());
		}
		
		
		
		context.close();
	}
	
}
