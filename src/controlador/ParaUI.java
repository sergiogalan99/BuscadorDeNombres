package controlador;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.StringTokenizer;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.DefaultListModel;
import javax.swing.JTabbedPane;

import controlador.ActionAgregar;
import modelo.Cliente;
import vista.UI;

public class ParaUI extends UI {
	private ActionAgregar agregar = new ActionAgregar(this);
	private ActionComboBox seleccionar= new ActionComboBox(this);
	
	private Control control= new Control();
	public ParaUI() {
		super();
		setListener();
	}

	public void actualizarLista() {
		String texto= control.leer();
		StringTokenizer token=new StringTokenizer(texto,"@");
		String nombre,direccion,clienteTexto;
		while(token.hasMoreTokens()) {
			clienteTexto=token.nextToken();
			nombre=clienteTexto.substring(clienteTexto.indexOf("=")+1, clienteTexto.indexOf(","));
			direccion=clienteTexto.substring(clienteTexto.lastIndexOf("=")+1,clienteTexto.length());
			comboBoxBuscar.addItem(new Cliente(nombre, direccion));
		}
		
		

	}

	public void agregarCliente() {
		control.guardar("nombre=" + textNombreCliente.getText() +",direccion=" + textNombreDireccion.getText());
	}

	public boolean validarCampos() {
		return !textNombreCliente.getText().isEmpty() && !textNombreDireccion.getText().isEmpty();
	}

	// Cada vez que se haga clik se va hasta el metodo de la clase ActionAgregar
	public void setListener() {
		btnDarDeAlta.addActionListener(agregar);
		comboBoxBuscar.addActionListener(seleccionar);
		
	}

	public void mostrarInformacion(Cliente cliente) {
		textDireccion.setText(cliente.getDireccion());
		
	}

}
