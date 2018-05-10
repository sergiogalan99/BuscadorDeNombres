package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLayeredPane;
import javax.swing.JTabbedPane;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Dimension;
import javax.swing.BoxLayout;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.GridLayout;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.border.LineBorder;
import java.awt.Cursor;

public class UI extends JFrame {

	protected JPanel contentPane;
	protected JTextField textNombreCliente;
	protected JTextField textNombreDireccion;
	protected JButton btnDarDeAlta;
	protected JComboBox comboBoxBuscar;
	protected JTabbedPane tabbedPaneAlta;
	protected JTextField textDireccion;

	
	public UI() {
		setMaximumSize(new Dimension(600, 600));
		setMinimumSize(new Dimension(300, 539));
		setSize(new Dimension(537, 299));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 537, 299);
		contentPane = new JPanel();
		contentPane.setBorder(null);
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		tabbedPaneAlta = new JTabbedPane(JTabbedPane.TOP);
		tabbedPaneAlta.setBackground(new Color(32, 178, 170));
		contentPane.add(tabbedPaneAlta);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new EmptyBorder(20, 20, 20, 20));
		panel_1.setBackground(new Color(0, 128, 128));
		tabbedPaneAlta.addTab("ALTA", null, panel_1, null);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new EmptyBorder(0, 0, 0, 0));
		panel_2.setForeground(new Color(255, 255, 255));
		panel_2.setBackground(new Color(0, 128, 128));
		panel_1.add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNombre = new JLabel("NOMBRE");
		lblNombre.setBorder(new EmptyBorder(0, 0, 0, 0));
		lblNombre.setPreferredSize(new Dimension(70, 61));
		lblNombre.setForeground(new Color(255, 255, 255));
		lblNombre.setBackground(new Color(192, 192, 192));
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNombre.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lblNombre, BorderLayout.NORTH);
		
	

		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(128, 0, 0));
		panel_3.setBorder(null);
		panel_2.add(panel_3, BorderLayout.CENTER);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		textNombreCliente = new JTextField();
		textNombreCliente.setFont(new Font("Arial", Font.BOLD, 16));
		textNombreCliente.setMargin(new Insets(2, 7, 2, 2));
		textNombreCliente.setBackground(new Color(192, 192, 192));
		textNombreCliente.setPreferredSize(new Dimension(6, 40));
		panel_3.add(textNombreCliente, BorderLayout.NORTH);
		textNombreCliente.setColumns(10);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new EmptyBorder(20, 0, 20, 0));
		panel_4.setBackground(new Color(0, 128, 128));
		panel_3.add(panel_4, BorderLayout.CENTER);
		panel_4.setLayout(new BorderLayout(0, 0));
		
		JLabel lblDireccion = new JLabel("DIRECCION");
		lblDireccion.setPreferredSize(new Dimension(57, 61));
		lblDireccion.setForeground(new Color(255, 255, 255));
		lblDireccion.setBackground(new Color(128, 0, 0));
		lblDireccion.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblDireccion.setHorizontalAlignment(SwingConstants.CENTER);
		panel_4.add(lblDireccion, BorderLayout.NORTH);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new EmptyBorder(20, 0, 20, 0));
		panel_5.setBackground(new Color(0, 128, 128));
		panel_4.add(panel_5, BorderLayout.CENTER);
		panel_5.setLayout(new BorderLayout(0, 0));
		
		textNombreDireccion = new JTextField();
		textNombreDireccion.setFont(new Font("Arial", Font.BOLD, 16));
		textNombreDireccion.setBackground(new Color(192, 192, 192));
		textNombreDireccion.setPreferredSize(new Dimension(6, 40));
		panel_5.add(textNombreDireccion, BorderLayout.NORTH);
		textNombreDireccion.setColumns(10);
		
		btnDarDeAlta = new JButton("DAR DE ALTA");
		btnDarDeAlta.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnDarDeAlta.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnDarDeAlta.setPreferredSize(new Dimension(131, 100));
		btnDarDeAlta.setForeground(new Color(105, 105, 105));
		btnDarDeAlta.setBackground(new Color(238, 232, 170));
		btnDarDeAlta.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel_5.add(btnDarDeAlta, BorderLayout.SOUTH);
		
		JPanel panel = new JPanel();
		tabbedPaneAlta.addTab("BUSCAR", null, panel, null);
		panel.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_7 = new JPanel();
		panel.add(panel_7, BorderLayout.NORTH);
		panel_7.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_8 = new JPanel();
		panel.add(panel_8, BorderLayout.CENTER);
		panel_8.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_9 = new JPanel();
		panel_8.add(panel_9, BorderLayout.CENTER);
		panel_9.setLayout(new BorderLayout(0, 0));
		
		JLabel label = new JLabel("");
		panel_9.add(label, BorderLayout.WEST);
		
		comboBoxBuscar = new JComboBox();
		comboBoxBuscar.setFont(new Font("Arial", Font.BOLD, 16));
		comboBoxBuscar.setToolTipText("");
		comboBoxBuscar.setForeground(new Color(192, 192, 192));
		panel_9.add(comboBoxBuscar, BorderLayout.NORTH);
		comboBoxBuscar.setBackground(new Color(238, 232, 170));
		comboBoxBuscar.setPreferredSize(new Dimension(50, 60));
		comboBoxBuscar.setMinimumSize(new Dimension(40, 40));
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(0, 128, 128));
		panel_9.add(panel_6, BorderLayout.CENTER);
		panel_6.setLayout(new BorderLayout(0, 0));
		
		JLabel lblDireccion_1 = new JLabel("DIRECCION");
		lblDireccion_1.setFont(new Font("Arial", Font.BOLD, 37));
		panel_6.add(lblDireccion_1, BorderLayout.NORTH);
		lblDireccion_1.setForeground(new Color(255, 255, 255));
		lblDireccion_1.setBackground(new Color(0, 128, 128));
		lblDireccion_1.setHorizontalAlignment(SwingConstants.CENTER);
		
		textDireccion = new JTextField();
		textDireccion.setHorizontalAlignment(SwingConstants.CENTER);
		textDireccion.setFont(new Font("Arial", Font.BOLD, 20));
		textDireccion.setBackground(new Color(240, 230, 140));
		panel_6.add(textDireccion, BorderLayout.CENTER);
		textDireccion.setPreferredSize(new Dimension(50, 80));
		textDireccion.setMinimumSize(new Dimension(40, 40));
		textDireccion.setEditable(false);
		textDireccion.setColumns(10);
		
		JLabel lblSergioGalnGmez = new JLabel("Sergio Gal\u00E1n G\u00F3mez  Copyright \u00A9");
		lblSergioGalnGmez.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSergioGalnGmez.setHorizontalAlignment(SwingConstants.CENTER);
		panel_6.add(lblSergioGalnGmez, BorderLayout.SOUTH);
	}

}
