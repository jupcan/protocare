package Presentacion;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JToolBar;
import java.awt.BorderLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.ImageIcon;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import java.awt.List;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.JComboBox;
import javax.swing.border.TitledBorder;
import javax.swing.JRadioButton;
import java.awt.SystemColor;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JList;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaPrincipal {

	private JFrame frmProtocare;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPrincipal window = new VentanaPrincipal();
					window.frmProtocare.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public VentanaPrincipal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmProtocare = new JFrame();
		frmProtocare.setTitle("ProtoCare");
		frmProtocare.setBounds(100, 100, 695, 831);
		frmProtocare.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frmProtocare.setJMenuBar(menuBar);
		
		JMenu mnArchivo = new JMenu("Archivo");
		menuBar.add(mnArchivo);
		
		JMenuItem mntmSalir = new JMenuItem("Salir");
		mnArchivo.add(mntmSalir);
		
		JMenu mnConfiguracin = new JMenu("Configuraci\u00F3n");
		menuBar.add(mnConfiguracin);
		
		JMenu mnIdiomas = new JMenu("Idiomas");
		mnConfiguracin.add(mnIdiomas);
		
		JRadioButtonMenuItem rdbtnmntmEspaol = new JRadioButtonMenuItem("Espa\u00F1ol");
		rdbtnmntmEspaol.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/Fotos/es.png")));
		mnIdiomas.add(rdbtnmntmEspaol);
		
		JRadioButtonMenuItem rdbtnmntmEnglish = new JRadioButtonMenuItem("English");
		rdbtnmntmEnglish.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/Fotos/en.png")));
		mnIdiomas.add(rdbtnmntmEnglish);
		
		JMenu mnAyuda = new JMenu("Ayuda");
		menuBar.add(mnAyuda);
		frmProtocare.getContentPane().setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 130, 659, 630);
		frmProtocare.getContentPane().add(tabbedPane);
		
		JPanel panelPacientes = new JPanel();
		tabbedPane.addTab("Pacientes", null, panelPacientes, null);
		panelPacientes.setLayout(null);
		
		JScrollPane scrollPanePacientes = new JScrollPane();
		scrollPanePacientes.setBounds(10, 43, 173, 524);
		panelPacientes.add(scrollPanePacientes);
		
		List list = new List();
		scrollPanePacientes.setViewportView(list);
		
		JLabel lblListaDePacientes = new JLabel("Lista de Pacientes:");
		lblListaDePacientes.setBounds(48, 18, 90, 14);
		panelPacientes.add(lblListaDePacientes);
		
		JPanel panelInfoPaciente = new JPanel();
		panelInfoPaciente.setBounds(206, 43, 438, 524);
		panelPacientes.add(panelInfoPaciente);
		panelInfoPaciente.setLayout(null);
		
		JLabel label = new JLabel("Nombre:");
		label.setBounds(10, 14, 46, 14);
		panelInfoPaciente.add(label);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(66, 11, 86, 20);
		panelInfoPaciente.add(textField);
		
		JLabel label_1 = new JLabel("Edad:");
		label_1.setBounds(162, 14, 46, 14);
		panelInfoPaciente.add(label_1);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(205, 11, 29, 20);
		panelInfoPaciente.add(spinner);
		
		JLabel label_2 = new JLabel("ID:");
		label_2.setBounds(10, 43, 46, 14);
		panelInfoPaciente.add(label_2);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(66, 40, 86, 20);
		panelInfoPaciente.add(textField_1);
		
		JLabel label_3 = new JLabel("Sexo:");
		label_3.setBounds(10, 73, 46, 14);
		panelInfoPaciente.add(label_3);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(66, 70, 86, 20);
		panelInfoPaciente.add(comboBox);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Estado", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(0, 117, 234, 93);
		panelInfoPaciente.add(panel);
		
		JRadioButton radioButton = new JRadioButton("Cirugias anterios");
		panel.add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("Enfermedades cr\u00F3nicas");
		panel.add(radioButton_1);
		
		JRadioButton radioButton_2 = new JRadioButton("Alergias");
		panel.add(radioButton_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new TitledBorder(null, "Situaci\u00F3n actual y consideraciones", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBackground(SystemColor.menu);
		panel_1.setBounds(0, 217, 440, 124);
		panelInfoPaciente.add(panel_1);
		
		JTextArea textArea = new JTextArea();
		textArea.setForeground(Color.BLACK);
		textArea.setBounds(10, 21, 420, 92);
		panel_1.add(textArea);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(264, 14, 164, 187);
		panelInfoPaciente.add(scrollPane);
		
		JButton buttonAñadir = new JButton("A\u00F1adir Paciente");
		buttonAñadir.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/Fotos/nueva.png")));
		buttonAñadir.setBounds(242, 357, 148, 33);
		panelInfoPaciente.add(buttonAñadir);
		
		JButton buttonModPac = new JButton("Modificar Paciente");
		buttonModPac.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/Fotos/editar.png")));
		buttonModPac.setBounds(242, 401, 148, 33);
		panelInfoPaciente.add(buttonModPac);
		
		JButton buttonEliminarPac = new JButton("Eliminar Paciente");
		buttonEliminarPac.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/Fotos/eliminar.png")));
		buttonEliminarPac.setBounds(242, 445, 148, 33);
		panelInfoPaciente.add(buttonEliminarPac);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(44, 352, 128, 129);
		panelInfoPaciente.add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnAcceder = new JButton("Acceder Grafias Paciente");
		btnAcceder.setBounds(0, 0, 128, 129);
		panel_2.add(btnAcceder);
		
		JLabel lblInformacinPaciente = new JLabel("Informaci\u00F3n  Paciente:");
		lblInformacinPaciente.setBounds(206, 18, 112, 14);
		panelPacientes.add(lblInformacinPaciente);
		
		JPanel panelAgenda = new JPanel();
		tabbedPane.addTab("Agenda", null, panelAgenda, null);
		panelAgenda.setLayout(null);
		
		JPanel panelAgUsuario = new JPanel();
		panelAgUsuario.setBorder(new TitledBorder(null, "Usuario", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelAgUsuario.setBounds(26, 11, 162, 95);
		panelAgenda.add(panelAgUsuario);
		panelAgUsuario.setLayout(null);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(66, 22, 86, 20);
		panelAgUsuario.add(textField_2);
		
		JLabel label_4 = new JLabel("ID:");
		label_4.setBounds(10, 25, 46, 14);
		panelAgUsuario.add(label_4);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(66, 53, 86, 20);
		panelAgUsuario.add(textField_3);
		
		JLabel label_5 = new JLabel("Nombre:");
		label_5.setBounds(10, 56, 46, 14);
		panelAgUsuario.add(label_5);
		
		JScrollPane citasPanel = new JScrollPane();
		citasPanel.setBounds(283, 36, 345, 520);
		panelAgenda.add(citasPanel);
		
		JList list_1 = new JList();
		citasPanel.setViewportView(list_1);
		
		JLabel lblCitas = new JLabel("CITAS:");
		lblCitas.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCitas.setBounds(285, 11, 96, 14);
		panelAgenda.add(lblCitas);
		
		Button button = new Button("A\u00F1adir Cita");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button.setFont(new Font("Tahoma", Font.PLAIN, 14));
		button.setBounds(40, 278, 162, 62);
		panelAgenda.add(button);
		
		Button button_1 = new Button("Borrar Cita");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		button_1.setBounds(40, 398, 162, 62);
		panelAgenda.add(button_1);
		
		JPanel panelEspecialistas = new JPanel();
		tabbedPane.addTab("Especialistas", null, panelEspecialistas, null);
		
		JPanel panelSuperior = new JPanel();
		panelSuperior.setBounds(380, 26, 276, 80);
		frmProtocare.getContentPane().add(panelSuperior);
		panelSuperior.setLayout(null);
		
		JLabel lblNombre = new JLabel("Bienvenido de nuevo, <dynamic>! ");
		lblNombre.setBounds(10, 11, 179, 14);
		panelSuperior.add(lblNombre);
		
		JPanel panelUltimoAcc = new JPanel();
		panelUltimoAcc.setBounds(0, 45, 189, 35);
		panelSuperior.add(panelUltimoAcc);
		panelUltimoAcc.setLayout(null);
		
		JLabel lblUltimoAcc = new JLabel("\u00DAltimo acceso: <dynamic>  ");
		lblUltimoAcc.setBounds(10, 11, 141, 14);
		panelUltimoAcc.add(lblUltimoAcc);
		
		JPanel panelLogo = new JPanel();
		panelLogo.setBounds(26, 26, 292, 93);
		frmProtocare.getContentPane().add(panelLogo);
		panelLogo.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/Fotos/ProtoCareLogo1.jpeg")));
		lblNewLabel.setBounds(24, 11, 244, 67);
		panelLogo.add(lblNewLabel);
	}
}
