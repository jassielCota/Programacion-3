import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ventana extends JFrame {
	//constructor que define atributos basicos de mi ventana
	public Ventana() {
		this.setVisible(true);
		this.setSize(100,100);
		this.setLocation(100,100);
		this.setTitle("ventana 1");
		this.setLocationRelativeTo(null);
		this.setMinimumSize (new Dimension(300,300));
		this.setMinimumSize(new Dimension(450,450));
		this.setResizable(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//llamar al metodo iniciar componentes
		this.iniciarComponentes();
	}
	public void iniciarComponentes() {
		JPanel login=new JPanel();
		login.setSize(this.getWidth(),this.getHeight());
		login.setBackground(Color.red);
		this.add(login);
	}

}
