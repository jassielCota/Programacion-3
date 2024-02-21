import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
public class Ventana extends JFrame {
	//constructor que define atributos basicos de mi ventana
	public Ventana() {
		
		this.setSize(1000,500);
		this.setLocation(100,100);
		this.setTitle("ventana 1");
		this.setLocationRelativeTo(null);
		this.setMinimumSize (new Dimension(300,300));
		this.setMinimumSize(new Dimension(450,450));
		this.setResizable(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//quitar molde 
		this.setLayout(null);
		//llamar al metodo iniciar componentes
		this.iniciarComponentes();	
		this.setVisible(true);
	}
	public void iniciarComponentes() {
		JPanel login=new JPanel();
		login.setSize(this.getWidth()/2,this.getHeight());
		login.setBackground(Color.gray);
		this.add(login);
		login.setLayout(null);
		//crear titulo "acceder"
		JLabel login_tag=new JLabel("Acceder",0);
		login_tag.setSize(200,60);
		login_tag.setFont(new Font("Arial",Font.BOLD,20));
		login_tag.setLocation(145,30);
		login_tag.setOpaque(true);
		login_tag.setBackground(Color.blue);
		login.add(login_tag);
		
		
		//panel derecho
		JPanel registro=new JPanel();
		registro.setSize(this.getWidth()/2,this.getHeight());
		registro.setLocation(500,0);
		registro.setBackground(Color.pink);
		this.add(registro);
		//boton "ingresar"
		JButton ingresar=new JButton ("ingresar");
		ingresar.setBounds(165,390,170,40);
		login.add(ingresar);
		//texto "nombre de usuario"
		JLabel userName= new JLabel("Nombre de usuario");
		userName.setFont(new Font("Arial",Font.BOLD,15));
		userName.setLocation(20,70);
		userName.setSize(145,100);
		userName.setOpaque(false);
		login.add(userName);
		//caja de texto del nombre de ususario
		JTextField userBox=new JTextField();
		userBox.setBounds(20,140,290,35);
		login.add(userBox);
		//texto "contraseña"
		JLabel password=new JLabel("Contraseña");
		password.setFont(new Font("Arial",Font.BOLD,15));
		password.setLocation(20,150);
		password.setSize(145,100);
		password.setOpaque(false);
		login.add(password);
		 //linea de texto de la contraseña
		JPasswordField passwordBox=new JPasswordField();
		passwordBox.setBounds(20,220,290,35);
		login.add(passwordBox);
		//recuadro "¿olvido su contraseña?"
		JLabel forgotPassword=new JLabel("¿olvido su contraseña?");
		forgotPassword.setFont(new Font("Arial",Font.BOLD,12));
		forgotPassword.setBounds(180,270,200,35);
		forgotPassword.setOpaque(false);
		login.add(forgotPassword);
		
		//recuadro tachable de "recordarme"		
		JCheckBox recordarme=new JCheckBox("Recordarme");
		recordarme.setFont(new Font("Arial",Font.BOLD,12));
		recordarme.setBounds(20,270,100,35);
		recordarme.setOpaque(false);
		login.add(recordarme);
		
	}

}
