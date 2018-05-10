package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionAgregar implements ActionListener {
	private ParaUI paraUI;

	public ActionAgregar(ParaUI paraUI) {
		this.paraUI = paraUI;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//Lo que se va a ejecutar cada vez que pulse el boton introducir
		if (paraUI.validarCampos()) {
			paraUI.agregarCliente();
			paraUI.actualizarLista();
		}
		
	
		
	}

}