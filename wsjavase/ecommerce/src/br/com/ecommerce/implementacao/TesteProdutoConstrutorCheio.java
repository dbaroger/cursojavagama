package br.com.ecommerce.implementacao;

import javax.swing.JOptionPane;

import br.com.ecommerce.modelo.Produto;

public class TesteProdutoConstrutorCheio {

	public static void main(String[] args) {
		Produto produto = new Produto(
				Integer.parseInt(JOptionPane.showInputDialog("ID")),
				JOptionPane.showInputDialog("Descricao").toUpperCase(),
				Integer.parseInt(JOptionPane.showInputDialog("Qtde")),
				Float.parseFloat(JOptionPane.showInputDialog("Valor Compra")),
				Float.parseFloat(JOptionPane.showInputDialog("Valor Venda"))
				);
		System.out.println(produto.getTudo());

	}

}
