import javax.swing.JFrame;
import java.awt.Dimension;

public class Main {

	public static void main(String[] args) {
		JFrame ventana=new JFrame("example");
		//la ventan sea visible
		ventana.setVisible(true);
		//tamaño de la ventana
		ventana.setSize(100,100);
		//ubicacion de la ventana
		ventana.setLocation(100,100);
		ventana.setTitle("ventana 1");
		//centrar la ventana
		ventana.setLocationRelativeTo(null);
		
		ventana.setMinimumSize (new Dimension(300,300));
		ventana.setMinimumSize(new Dimension(450,450));
		
		
		ventana.setResizable(false);
		//es para poder cerrar la venta por defecto
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		

	}

}
