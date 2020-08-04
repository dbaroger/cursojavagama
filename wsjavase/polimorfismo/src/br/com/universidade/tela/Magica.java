package br.com.universidade.tela;

import javax.swing.JOptionPane;

public class Magica {

	public static String t(String msg) {
		return JOptionPane.showInputDialog(msg).toUpperCase();
	}
	
	public static int i(String msg) {
		return Integer.parseInt(t(msg));
	}
	
	public static float f(String msg) {
		return Float.parseFloat(t(msg));
	}
	
	public static float d(String msg) {
		return Float.parseFloat(t(msg));
	}
	
	public static boolean b(String msg) {
		if(JOptionPane.showConfirmDialog(null, msg, "Aplicacao Polimorfismo", JOptionPane.YES_NO_OPTION)==0) {
			return true;
		}
		return false;
	}
	
}