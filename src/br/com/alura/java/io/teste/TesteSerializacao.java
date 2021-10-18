package br.com.alura.java.io.teste;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TesteSerializacao {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
//		Cliente c = new Cliente();
//		c.setNome("Nico");
//		c.setProfissao("Dev");
//		c.setCpf("234113131");
//
//
//		
//		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cliente.bin"));		
//		oos.writeObject(c);		
//		oos.close();
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cliente.bin"));
		Cliente c = (Cliente) ois.readObject();
		
		System.out.println(c.getNome());
		ois.close();

	}

}
