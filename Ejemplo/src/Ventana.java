import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
public class Ventana extends JFrame {
	//constructor que define atributos basicos de mi ventana
	public Ventana() {
		
		this.setSize(1000,750);
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
		
		//this.login();
		//this.registro();
		//this.admin();
		this.cal();
	}
	public void login() {
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
	
	public void registro () {
		//panel derecho
				JPanel registro=new JPanel();
				registro.setSize(this.getWidth()/2,this.getHeight());
				registro.setLocation(500,0);
				registro.setBackground(Color.pink);
				registro.setLayout(null);
				this.add(registro);
				
				//crear titulo "registro"
				JLabel regis=new JLabel("Registro",0);
			    regis.setSize(200,60);
			    regis.setFont(new Font("Arial",Font.BOLD,20));
			    regis.setLocation(145,30);
				regis.setOpaque(true);
				regis.setBackground(Color.blue);
				regis.setLayout(null);
				registro.add(regis);
				
				//recuadro "nombre de usuario"
				JLabel nomUsuario=new JLabel("Nombre de usuario");
				nomUsuario.setFont(new Font("Arial",Font.BOLD,12));
				nomUsuario.setBounds(145,120,200,35);
				nomUsuario.setLayout(null);
				nomUsuario.setOpaque(true);
				nomUsuario.setHorizontalAlignment(0);
				registro.add(nomUsuario);
				
				JTextField userBox=new JTextField();
				userBox.setBounds(100,160,290,35);
				userBox.setHorizontalAlignment(0);
				registro.add(userBox);
				
				//recuadro "bio"
				JLabel bio=new JLabel("Bio");
				bio.setFont(new Font("Arial",Font.BOLD,12));
				bio.setBounds(145,200,200,35);
				bio.setLayout(null);
				bio.setOpaque(true);
				bio.setHorizontalAlignment(0);
				registro.add(bio);
				
				JTextArea userBoxBio=new JTextArea();
				userBoxBio.setBounds(100,245,290,60);
				userBoxBio.setFont(new Font("Arial",Font.BOLD,14));
				registro.add(userBoxBio);
				
				//recuadro tachable de "Dulces"		
				JCheckBox item_1=new JCheckBox("Dulces");
				item_1.setFont(new Font("Arial",Font.BOLD,12));
				item_1.setBounds(20,350,100,35);
				item_1.setOpaque(false);
				registro.add(item_1);
				
				//recuadro tachable de "Dulces"		
				JCheckBox item_2=new JCheckBox("salado");
				item_2.setFont(new Font("Arial",Font.BOLD,12));
				item_2.setBounds(100,350,100,35);
				item_2.setOpaque(false);
				registro.add(item_2);
				
				//recuadro tachable de "saludable"		
				JCheckBox item_3=new JCheckBox("saludable");
				item_3.setFont(new Font("Arial",Font.BOLD,12));
				item_3.setBounds(200,350,100,35);
				item_3.setOpaque(false);
				registro.add(item_3);
				
				//leyenda "preferencias"
				JLabel prefer=new JLabel("Preferencias");
				prefer.setFont(new Font("Arial",Font.BOLD,16));
				prefer.setBounds(145,320,200,35);
				prefer.setLayout(null);
				prefer.setOpaque(false);
				prefer.setHorizontalAlignment(0);
				registro.add(prefer);
				
				//recuadro "Terminos"
				JLabel terminos=new JLabel("Terminos");
				terminos.setFont(new Font("Arial",Font.BOLD,12));
				terminos.setBounds(145,390,200,35);
				terminos.setLayout(null);
				terminos.setOpaque(true);
				terminos.setHorizontalAlignment(0);
				registro.add(terminos);
				
				JRadioButton acepto_radio=new JRadioButton("Acepto los terminos");
				acepto_radio.setBounds(20,430,200,35);
				acepto_radio.setFont(new Font("Arial",Font.BOLD,12));
				acepto_radio.setOpaque(false);
				registro.add(acepto_radio);
				
				JRadioButton noAcepto_radio=new JRadioButton("No Acepto los terminos");
				noAcepto_radio.setBounds(200,430,200,35);
				noAcepto_radio.setFont(new Font("Arial",Font.BOLD,12));
				noAcepto_radio.setOpaque(false);
				registro.add(noAcepto_radio);
				
				ButtonGroup grupo=new ButtonGroup();
				grupo.add(acepto_radio);
				grupo.add(noAcepto_radio);
				
				String colonias[]= {"Ninguna","Centro","Pedregal","Conchalito","Camino real"};
				
				JComboBox location =new JComboBox(colonias);
				location.setBounds(200,500,200,35);
				location.setFont(new Font("Arial",Font.BOLD,12));
				registro.add(location);
				
		
	}
	
	public void admin() {
		JPanel admin_panel =new JPanel();
		admin_panel.setSize(this.getWidth(),this.getHeight());
		admin_panel.setLocation(0,0);
		admin_panel.setBackground(Color.pink);
		admin_panel.setLayout(null);
		this.add(admin_panel);
		
		JMenuBar barra =new JMenuBar();
		
		JMenu menu_file=new JMenu("Archivo");
		
		JMenuItem open_item =new JMenuItem ("Abrir archivo...");
		JMenuItem create_item =new JMenuItem ("Crear archivo...");
		
		barra.add(menu_file);
		menu_file.add(open_item);
		menu_file.add(create_item);
		
		this.setJMenuBar(barra);
		//contenido del panel
		JLabel regis=new JLabel("Usuarios",0);
	    regis.setSize(160,60);
	    regis.setFont(new Font("Arial",Font.BOLD,20));
	    regis.setLocation(400,30);
		regis.setOpaque(true);
		regis.setBackground(Color.blue);
		regis.setLayout(null);
		admin_panel.add(regis);
		this.add(admin_panel);
		
		JLabel title_widget=new JLabel("total de Usuarios");
		title_widget.setBounds(60,80,200,100);
		title_widget.setFont(new Font("Arial",Font.BOLD,20));
		title_widget.setOpaque(false);
		title_widget.setBackground(Color.white);
		admin_panel.add(title_widget);
		
		JLabel usuarios_widget=new JLabel("100");
		usuarios_widget.setBounds(120,120,200,100);
		usuarios_widget.setFont(new Font("Arial",Font.BOLD,20));
		usuarios_widget.setOpaque(false);
		usuarios_widget.setBackground(Color.white);
		admin_panel.add(usuarios_widget);
		
		JLabel widget=new JLabel("");
		widget.setBounds(40,120,200,100);
		widget.setOpaque(true);
		widget.setBackground(Color.blue);
		widget.setLayout(null);
		admin_panel.add(widget);
		
		JButton exportar=new JButton ("Exportar");
		exportar.setBounds(670,270,100,20);
		admin_panel.add(exportar);
		
		JButton añadir=new JButton ("Añadir");
		añadir.setBounds(770,270,100,20);
		admin_panel.add(añadir);
		
		String title[]= {"No.control","nombre","apellidos","semestre","promedio","acciones"};
		String tableData[][]= {
				{"No.control","nombre","apellidos","semestre","promedio","acciones"},
				{"No.control","nombre","apellidos","semestre","promedio","acciones"},
				{"No.control","nombre","apellidos","semestre","promedio","acciones"},
				{"No.control","nombre","apellidos","semestre","promedio","acciones"},
				{"No.control","nombre","apellidos","semestre","promedio","acciones"},
		};
		JTable tabla=new JTable(tableData,title);
		JScrollPane scroll=new JScrollPane (tabla);
		scroll.setBounds(30,400,800,100);
		admin_panel.add(scroll);
		
		
		
		
		
		
		
		
		
		
	}

	public void cal() {
		JPanel cal_panel =new JPanel();
		cal_panel.setSize(280,400);
		cal_panel.setLocation(0,0);
		cal_panel.setBackground(Color.gray);
		cal_panel.setLayout(null);
		this.add(cal_panel);
		
		JLabel capturaNum=new JLabel("0");
		capturaNum.setSize(240,35);
		capturaNum.setFont(new Font("Arial",Font.BOLD,20));
		capturaNum.setLocation(20,20);
		capturaNum.setOpaque(true);
		capturaNum.setBackground(Color.blue);
		capturaNum.setLayout(null);
		cal_panel.add(capturaNum);
		
		//botones
		JButton numC=new JButton ("C");
		numC.setBounds(20,80,60,60);
		cal_panel.add(numC);
		
		JButton numDiv=new JButton ("/");
		numDiv.setBounds(80,80,60,60);
		cal_panel.add(numDiv);
		
		JButton numMult=new JButton ("*");
		numMult.setBounds(140,80,60,60);
		cal_panel.add(numMult);
		
		JButton numRes=new JButton ("-");
		numRes.setBounds(200,80,60,60);
		cal_panel.add(numRes);
		
		JButton numSuma=new JButton ("+");
		numSuma.setBounds(200,140,60,120);
		cal_panel.add(numSuma);
		
		JButton numIgual=new JButton ("=");
		numIgual.setBounds(200,260,60,120);
		cal_panel.add(numIgual);
		
		JButton num7=new JButton ("7");
		num7.setBounds(20,140,60,60);
		cal_panel.add(num7);
		
		JButton num8=new JButton ("8");
		num8.setBounds(80,140,60,60);
		cal_panel.add(num8);
		
		JButton num9=new JButton ("9");
		num9.setBounds(140,140,60,60);
		cal_panel.add(num9);
		
		JButton num4=new JButton ("4");
		num4.setBounds(20,200,60,60);
		cal_panel.add(num4);
		
		JButton num5=new JButton ("5");
		num5.setBounds(80,200,60,60);
		cal_panel.add(num5);
		
		JButton num6=new JButton ("6");
		num6.setBounds(140,200,60,60);
		cal_panel.add(num6);
		
		JButton num1=new JButton ("1");
		num1.setBounds(20,260,60,60);
		cal_panel.add(num1);
		
		JButton num2=new JButton ("2");
		num2.setBounds(80,260,60,60);
		cal_panel.add(num2);
		
		JButton num3=new JButton ("3");
		num3.setBounds(140,260,60,60);
		cal_panel.add(num3);
		
		JButton num0=new JButton ("0");
		num0.setBounds(20,320,120,60);
		cal_panel.add(num0);
		
		JButton numPunto=new JButton (".");
		numPunto.setBounds(140,320,60,60);
		cal_panel.add(numPunto);
		
		
		
		
		
		
		
		
		
		
		
	}
}
