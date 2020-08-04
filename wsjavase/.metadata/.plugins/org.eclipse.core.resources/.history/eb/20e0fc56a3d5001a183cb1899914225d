package br.com.ecommerce.implementacao;

import javax.swing.JOptionPane;

import br.com.ecommerce.modelo.Cliente;
import br.com.ecommerce.modelo.Endereco;

public class TesteCliente {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente(
				JOptionPane.showInputDialog("Digite o CPF"),
				JOptionPane.showInputDialog("Digite o Nome").toUpperCase(),
				JOptionPane.showInputDialog("Digite o Fone"),
				Float.parseFloat(JOptionPane.showInputDialog("Digite o Limite")),
				new Endereco(
						JOptionPane.showInputDialog("Logradouro"),
						JOptionPane.showInputDialog("Numero"),
						JOptionPane.showInputDialog("Complemento"),
						JOptionPane.showInputDialog("Bairro"),
						JOptionPane.showInputDialog("Cidade"),
						JOptionPane.showInputDialog("UF"),
						JOptionPane.showInputDialog("CEP")
						)
				);
		System.out.println(cliente.getAll());
	}

}
