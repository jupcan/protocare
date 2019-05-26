package Presentacion;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSpinner;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AñadirPaciente {

	private JFrame frmAadirPaciente;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AñadirPaciente window = new AñadirPaciente();
					window.frmAadirPaciente.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AñadirPaciente() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAadirPaciente = new JFrame();
		frmAadirPaciente.setTitle("ProtoCare - A\u00F1adir Paciente");
		frmAadirPaciente.getContentPane().setForeground(Color.BLACK);
		frmAadirPaciente.getContentPane().setBackground(Color.WHITE);
		frmAadirPaciente.getContentPane().setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(24, 25, 46, 14);
		frmAadirPaciente.getContentPane().add(lblNombre);
		
		textField = new JTextField();
		textField.setBounds(73, 22, 86, 20);
		frmAadirPaciente.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblId = new JLabel("ID:");
		lblId.setBounds(24, 54, 46, 14);
		frmAadirPaciente.getContentPane().add(lblId);
		
		textField_1 = new JTextField();
		textField_1.setBounds(73, 50, 86, 20);
		frmAadirPaciente.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Hombre", "Mujer"}));
		comboBox.setBounds(73, 81, 86, 20);
		frmAadirPaciente.getContentPane().add(comboBox);
		
		JLabel lblSexo = new JLabel("Sexo:");
		lblSexo.setBounds(24, 84, 46, 14);
		frmAadirPaciente.getContentPane().add(lblSexo);
		
		JLabel lblEdad = new JLabel("Edad:");
		lblEdad.setBounds(180, 25, 46, 14);
		frmAadirPaciente.getContentPane().add(lblEdad);
		
		JSpinner spinnerEdad = new JSpinner();
		spinnerEdad.setBounds(219, 22, 29, 20);
		frmAadirPaciente.getContentPane().add(spinnerEdad);
		
		JPanel panelEstado = new JPanel();
		panelEstado.setBorder(new TitledBorder(null, "Estado", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelEstado.setBounds(24, 128, 234, 93);
		frmAadirPaciente.getContentPane().add(panelEstado);
		
		JRadioButton rdbtnVacunas = new JRadioButton("Cirugias anterios");
		panelEstado.add(rdbtnVacunas);
		
		JRadioButton rdbtnEnfermedadesCrnicas = new JRadioButton("Enfermedades cr\u00F3nicas");
		panelEstado.add(rdbtnEnfermedadesCrnicas);
		
		JRadioButton rdbtnAlergias = new JRadioButton("Alergias");
		panelEstado.add(rdbtnAlergias);
		
		JPanel panelDescripcion = new JPanel();
		panelDescripcion.setBackground(UIManager.getColor("Button.background"));
		panelDescripcion.setBorder(new TitledBorder(null, "Situaci\u00F3n actual y consideraciones", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelDescripcion.setBounds(24, 228, 440, 105);
		frmAadirPaciente.getContentPane().add(panelDescripcion);
		panelDescripcion.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setForeground(Color.BLACK);
		textArea.setBounds(10, 21, 420, 73);
		panelDescripcion.add(textArea);
		
		JScrollPane scrollPaneFotoPaciente = new JScrollPane();
		scrollPaneFotoPaciente.setBounds(329, 25, 135, 137);
		frmAadirPaciente.getContentPane().add(scrollPaneFotoPaciente);
		
		JButton btnAadirFoto = new JButton("A\u00F1adir Foto");
		btnAadirFoto.setBounds(349, 177, 89, 23);
		frmAadirPaciente.getContentPane().add(btnAadirFoto);
		
		JButton btnAadirPaciente = new JButton("A\u00F1adir Paciente");
		btnAadirPaciente.setBounds(24, 344, 116, 23);
		frmAadirPaciente.getContentPane().add(btnAadirPaciente);
		
		JButton btnLimpiarCampos = new JButton("Limpiar Campos");
		btnLimpiarCampos.setBounds(202, 344, 116, 23);
		frmAadirPaciente.getContentPane().add(btnLimpiarCampos);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCancelar.setBounds(375, 344, 89, 23);
		frmAadirPaciente.getContentPane().add(btnCancelar);
		frmAadirPaciente.setBounds(100, 100, 518, 441);
		frmAadirPaciente.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
