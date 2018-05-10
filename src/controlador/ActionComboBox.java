package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;

import modelo.Cliente;

public class ActionComboBox implements ActionListener {
	private ParaUI paraUI;

	public ActionComboBox(ParaUI paraUI) {
		this.paraUI = paraUI;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JComboBox combo= (JComboBox) e.getSource();
		Cliente cliente=(Cliente) combo.getSelectedItem();
		this.paraUI.mostrarInformacion(cliente);
		
	}

}