import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ventana extends JFrame {
	//constructor que define atributos basicos de mi ventana
	public Ventana() {
		this.setVisible(true);
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
		
		
		
	}
	public void iniciarComponentes() {
		JPanel login=new JPanel();
		login.setSize(this.getWidth()/2,this.getHeight());
		login.setBackground(Color.red);
		this.add(login);
		login.setLayout(null);
		
		JLabel login_tag=new JLabel("Acceder",0);
		login_tag.setSize(300,80);
		login_tag.setFont(new Font("Arial",Font.BOLD,20));
		login_tag.setLocation(100,20);
		login_tag.setOpaque(true);
		login_tag.setBackground(Color.green);
		login.add(login_tag);
		
		
		
		
		
		JPanel registro=new JPanel();
		registro.setSize(this.getWidth()/2,this.getHeight());
		registro.setLocation(500,0);
		registro.setBackground(Color.gray);
		this.add(login);
		this.add(registro);
		
		
		
		
	}

}
