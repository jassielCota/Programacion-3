import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.GridLayout;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JButton;

public class Proyecto extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
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
					Proyecto frame = new Proyecto();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Proyecto() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 255, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("Registro de Usuario");
		contentPane.add(lblNewLabel, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 255, 255));
		panel.add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_1 = new JLabel("Datos generales");
		panel_1.add(lblNewLabel_1, BorderLayout.NORTH);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(0, 255, 255));
		panel_1.add(panel_5, BorderLayout.CENTER);
		panel_5.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel lblNewLabel_2 = new JLabel("Nombres");
		panel_5.add(lblNewLabel_2);
		
		textField = new JTextField();
		panel_5.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Apellido paterno");
		panel_5.add(lblNewLabel_3);
		
		textField_1 = new JTextField();
		panel_5.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Apellido materno");
		panel_5.add(lblNewLabel_4);
		
		textField_2 = new JTextField();
		panel_5.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Fecha de nacimiento");
		panel_5.add(lblNewLabel_5);
		
		textField_3 = new JTextField();
		panel_5.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Sexo");
		panel_5.add(lblNewLabel_6);
		
		JPanel panel_6 = new JPanel();
		panel_5.add(panel_6);
		panel_6.setLayout(new GridLayout(0, 1, 0, 0));
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Masculino");
		panel_6.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Femenino");
		panel_6.add(rdbtnNewRadioButton_1);
		
		JLabel lblNewLabel_7 = new JLabel("Nacionalidad");
		panel_5.add(lblNewLabel_7);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setToolTipText("colombia\r\nmexico\r\nperu\r\nargentina\r\n\r\n");
		panel_5.add(comboBox);
		
		JLabel lblNewLabel_19 = new JLabel("      ");
		panel_1.add(lblNewLabel_19, BorderLayout.SOUTH);
		
		JLabel lblNewLabel_20 = new JLabel("     ");
		panel_1.add(lblNewLabel_20, BorderLayout.WEST);
		
		JLabel lblNewLabel_21 = new JLabel("     ");
		panel_1.add(lblNewLabel_21, BorderLayout.EAST);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 128, 192));
		panel.add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_8 = new JLabel("Perfil de usuario");
		panel_2.add(lblNewLabel_8, BorderLayout.NORTH);
		
		JLabel lblNewLabel_9 = new JLabel("            ");
		panel_2.add(lblNewLabel_9, BorderLayout.WEST);
		
		JLabel lblNewLabel_10 = new JLabel("            ");
		panel_2.add(lblNewLabel_10, BorderLayout.EAST);
		
		JLabel lblNewLabel_11 = new JLabel("Foto de perfil");
		lblNewLabel_11.setOpaque(true);
		lblNewLabel_11.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lblNewLabel_11, BorderLayout.CENTER);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(new Color(255, 128, 192));
		panel_2.add(panel_7, BorderLayout.SOUTH);
		panel_7.setLayout(new GridLayout(0, 1, 0, 0));
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Mostrar foto ");
		chckbxNewCheckBox.setBackground(new Color(255, 128, 192));
		chckbxNewCheckBox.setHorizontalAlignment(SwingConstants.CENTER);
		panel_7.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Mostrar fecha de nacimiento");
		chckbxNewCheckBox_1.setBackground(new Color(255, 128, 192));
		chckbxNewCheckBox_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel_7.add(chckbxNewCheckBox_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 0, 0));
		panel.add(panel_3);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_12 = new JLabel("Datos opcionales");
		panel_3.add(lblNewLabel_12, BorderLayout.NORTH);
		
		JPanel panel_8 = new JPanel();
		panel_3.add(panel_8, BorderLayout.CENTER);
		panel_8.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel lblNewLabel_13 = new JLabel("Descripcion");
		panel_8.add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("Preferencias");
		lblNewLabel_14.setBackground(new Color(255, 0, 0));
		panel_8.add(lblNewLabel_14);
		
		JScrollPane scrollPane = new JScrollPane();
		panel_8.add(scrollPane);
		
		JTextArea txtrHolaAmigosDe = new JTextArea();
		scrollPane.setViewportView(txtrHolaAmigosDe);
		txtrHolaAmigosDe.setText("Hola amigos de youtube gracias por compartir mi video\r\n");
		
		JScrollPane scrollPane_1 = new JScrollPane();
		panel_8.add(scrollPane_1);
		
		JTextArea txtrCantarEscucharMusica = new JTextArea();
		scrollPane_1.setViewportView(txtrCantarEscucharMusica);
		txtrCantarEscucharMusica.setText("Cantar\r\nEscuchar musica \r\nLeer\r\nDeportes\r\nOtros");
		txtrCantarEscucharMusica.setToolTipText("");
		
		JLabel lblNewLabel_22 = new JLabel("     ");
		panel_3.add(lblNewLabel_22, BorderLayout.SOUTH);
		
		JLabel lblNewLabel_23 = new JLabel("     ");
		panel_3.add(lblNewLabel_23, BorderLayout.WEST);
		
		JLabel lblNewLabel_24 = new JLabel("     ");
		panel_3.add(lblNewLabel_24, BorderLayout.EAST);
		
		JPanel panel_4 = new JPanel();
		panel.add(panel_4);
		panel_4.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_15 = new JLabel("            ");
		lblNewLabel_15.setOpaque(true);
		lblNewLabel_15.setBackground(new Color(128, 255, 255));
		panel_4.add(lblNewLabel_15, BorderLayout.WEST);
		
		JLabel lblNewLabel_16 = new JLabel("            ");
		lblNewLabel_16.setOpaque(true);
		lblNewLabel_16.setBackground(new Color(128, 255, 255));
		panel_4.add(lblNewLabel_16, BorderLayout.NORTH);
		
		JLabel lblNewLabel_17 = new JLabel("           ");
		lblNewLabel_17.setOpaque(true);
		lblNewLabel_17.setBackground(new Color(128, 255, 255));
		panel_4.add(lblNewLabel_17, BorderLayout.EAST);
		
		JLabel lblNewLabel_18 = new JLabel("             ");
		lblNewLabel_18.setOpaque(true);
		lblNewLabel_18.setBackground(new Color(128, 255, 255));
		panel_4.add(lblNewLabel_18, BorderLayout.SOUTH);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBackground(new Color(128, 255, 255));
		panel_4.add(panel_9, BorderLayout.CENTER);
		panel_9.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton btnNewButton = new JButton("Nuevo");
		panel_9.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Guardar");
		panel_9.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Salir");
		panel_9.add(btnNewButton_2);
	}

}
