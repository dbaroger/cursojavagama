package br.com.ecommerce.implementacao;

import javax.swing.JOptionPane;
import br.com.ecommerce.modelo.Cliente;
import br.com.ecommerce.modelo.Endereco;
import br.com.ecommerce.modelo.Produto;
import br.com.ecommerce.modelo.Venda;
import br.com.ecommerce.tela.Magica;

public class TesteVenda {

	public static void main(String[] args) {
	
		Venda venda = new Venda(
				Magica.i("NF"),
				new Cliente(
						Magica.t("Digite o CPF"),
						Magica.t("Digite o Nome"),
						Magica.t("Digite o Fone"),
						Magica.f("Digite o Limite"),
						new Endereco(
								Magica.t("Logradouro"),
								Magica.t("Numero"),
								Magica.t("Complemento"),
								Magica.t("Bairro"),
								Magica.t("Cidade"),
								Magica.t("UF"),
								Magica.t("CEP")
								)
						),
				new Produto(
						Integer.parseInt(JOptionPane.showInputDialog("ID")),
						JOptionPane.showInputDialog("Descricao").toUpperCase(),
						Integer.parseInt(JOptionPane.showInputDialog("Qtde")),
						Float.parseFloat(JOptionPane.showInputDialog("Valor Compra")),
						Float.parseFloat(JOptionPane.showInputDialog("Valor Venda"))
						),
				Float.parseFloat(JOptionPane.showInputDialog("Total")),
				JOptionPane.showInputDialog("Data")
				);

		System.out.println(venda.getAll());
	}

}
