import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
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
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import java.awt.Component;
public class Ventana extends JFrame {
	//constructor que define atributos basicos de mi ventana
	JPanel btPanel=new JPanel();
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
	
	//@Override
	/*public void paint (Graphics g) {
		//         PANTALLA MIDE   X  800 Y  750
		this.setSize(920,750);
		//colores    
		Color cielo =new Color(6, 101, 192);
		Color suelo =new Color(210, 161, 100);
		Color pasto =new Color(20, 148, 36);
		Color ciliFuerte =new Color(78, 142, 176);
		Color roca=new Color(117, 114, 118);
		Color amarillo=new Color(225, 171, 32);
		Color tubos=new Color(112, 106, 181);
		Color ciliClaro=new Color(156, 198, 199);
		Color blanco=new Color(237, 242, 254);
		
		//super.paint(g);
		Graphics2D g2d=(Graphics2D) g;
		
		
		//cielo
		g2d.setColor(cielo);
		g2d.fillRect(0,0,1000,750);
		
		// nubes traseras 
		g2d.setColor(blanco);
		g2d.fillRoundRect(700, 300, 140, 35,50, 50);
		
		g2d.setColor(blanco);
		g2d.fillRoundRect(750, 265, 140, 35,50, 50);
		
		g2d.setColor(blanco);
		g2d.fillRoundRect(325, 595, 140, 35,50, 50);
		g2d.setColor(blanco);
		g2d.fillRoundRect(325, 525, 140, 35,50, 50);
		
		g2d.setColor(blanco);
		g2d.fillRoundRect(200, 560, 140, 35,50, 50);
		
		
		
		//cilindros claros
		//cilindro 1 
		g2d.setColor(ciliClaro);
		g2d.fillRoundRect(50, 250, 175, 750,200, 200);
		//Focos blancos
		g2d.setColor(blanco);
		g2d.fillRoundRect(150, 300, 20, 30,200, 200);
		
		g2d.setColor(blanco);
		g2d.fillRoundRect(150, 370, 20, 30,200, 200);
		
		g2d.setColor(blanco);
		g2d.fillRoundRect(60, 430, 20, 30,200, 200);
		//cilindro 2
		g2d.setColor(ciliClaro);
		g2d.fillRoundRect(400, 250, 175, 750,200, 200);
		//Focos blancos
		g2d.setColor(blanco);
		g2d.fillRoundRect(420, 330, 20,30,200, 200);
		
		g2d.setColor(blanco);
		g2d.fillRoundRect(480, 300, 20, 30,200, 200);
		
		g2d.setColor(blanco);
		g2d.fillRoundRect(420, 430, 20,30,200, 200);
		
		//cilindro 3
		g2d.setColor(ciliClaro);
		g2d.fillRoundRect(575, 150, 175, 600,200, 200);
		//foco blanco
		g2d.setColor(blanco);
		g2d.fillRoundRect(680, 200, 20,30,200, 200);
		
		g2d.setColor(blanco);
		g2d.fillRoundRect(600, 300, 20, 30,200, 200);
		
		//Nubes delanteras 
		
		g2d.setColor(blanco);
		g2d.fillRoundRect(-75, 345, 180, 35,50, 50);
		
		g2d.setColor(blanco);
		g2d.fillRoundRect(250, 380, 180, 35,50, 50);
		
		g2d.setColor(blanco);
		g2d.fillRoundRect(500, 415, 180, 35,50, 50);
		
		
		
		//cilindros fuertes
		//cilindro 1 
		g2d.setColor(ciliFuerte);
		g2d.fillRoundRect(-50, 500, 200, 300,200, 200);
		//cilindro 2
		g2d.setColor(ciliFuerte);
		g2d.fillRoundRect(400, 500, 200, 300,200, 200);
		//cilindro 3
		g2d.setColor(ciliFuerte);
		g2d.fillRoundRect(600, 350, 200, 500,200, 200);
		//focos
		g2d.setColor(blanco);
		g2d.fillRoundRect(650, 400, 20,30,200, 200);
		
		g2d.setColor(blanco);
		g2d.fillRoundRect(720, 550, 20,30,200, 200);
		
		
		
		//suelo
		g2d.setColor(suelo);
		g2d.fillRect(0,650,1000,100);
		
		//pasto
		g2d.setColor(pasto);
		g2d.fillRect(0,630,1000,30);
		
		//rocas 
		g2d.setColor(roca);
		g2d.fillRoundRect(775, 580, 50, 50,20, 20);
		
		//rocas 
		g2d.setColor(roca);
		g2d.fillRoundRect(775, 530, 50, 50,20, 20);
		
		//rocas 
		g2d.setColor(roca);
		g2d.fillRoundRect(775, 480, 50, 50,20, 20);
		
		//rocas 
		g2d.setColor(roca);
		g2d.fillRoundRect(775, 430, 50, 50,20, 20);
		
		//rocas amarillas
		g2d.setColor(amarillo);
		g2d.fillRoundRect(825, 430, 50, 50,20, 20);
		//ojos de roca amarilla
		g2d.setColor(Color.black);
		g2d.fillRoundRect(837, 446, 5, 20,10, 10);
		g2d.setColor(Color.black);
		g2d.fillRoundRect(855, 446, 5, 20,10, 10);
		
		//rocas  amarillas
		g2d.setColor(amarillo);
		g2d.fillRoundRect(875, 430, 50, 50,20, 20);
		
		try {
			BufferedImage imge;
			imge = ImageIO.read(new File("src/plantC.png"));
			g2d.drawImage(imge,430,425,null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

		//Tubos
		//tubo 1
		g2d.setColor(Color.black);
		g2d.fillRect(448, 525, 95, 105);
		g2d.setColor(tubos);
		g2d.fillRect(450, 530, 90, 100);
		
		g2d.setColor(Color.black);
		g2d.fillRect(432, 513, 125, 35);
		g2d.setColor(tubos);
		g2d.fillRect(435, 515, 120, 30);
		
		
		//tubo 2
		g2d.setColor(Color.black);
		g2d.fillRect(845, 525, 95, 105);
		g2d.setColor(tubos);
		g2d.fillRect(848, 530, 90, 100);
		
		g2d.setColor(Color.black);
		g2d.fillRect(837, 513, 125, 35);
		g2d.setColor(tubos);
		g2d.fillRect(840, 515, 120, 30);
		
		
		
				
		
		
		
		
		
		
		
		
		
	}*/
	
	/*public void paint(Graphics g) {
		//colores
		Color cielo =new Color(133, 193, 233);
		Color suelo =new Color(248, 196, 113);
		Color verde =new Color(39, 174, 96);
		Color cobre =new Color(220, 118, 51);
		Color azul =new Color(46, 134, 193);
		Color grisClaro =new Color(117, 117, 117);
		Color rosa =new Color(255, 158, 242);
		Color tubo =new Color(0,120,6);
		Color cafe =new Color(160, 64, 0);
		Color cafeOscuro =new Color(110, 44, 0 );
		
		
		super.paint(g);
		Graphics2D g2d=(Graphics2D) g;
		
		g2d.setColor(cielo);
		g2d.fillRect(0,0,1000,750);
		
		//arbusto
		g2d.setColor(verde);
		g2d.fillOval(50, 565, 100, 50);
		g2d.setColor(verde);
		g2d.fillOval(75, 550, 50, 90);
		
		g2d.setColor(suelo);
		g2d.fillRect(0,600,1000,150);
		//cuadro Flotante
		g2d.setColor(Color.black);
		g2d.fillRect(45,195,90,85);
		g2d.setColor(cobre);
		g2d.fillRect(50,200,85,85);
		//puntos negros
		g2d.setColor(Color.black);
		g2d.fillRect(55,205,5,5);
		g2d.setColor(Color.black);
		g2d.fillRect(125,205,5,5);
		g2d.setColor(Color.black);
		g2d.fillRect(55,275,5,5);
		g2d.setColor(Color.black);
		g2d.fillRect(125,275,5,5);
		//cuadro flotante 2
		g2d.setColor(Color.black);
		g2d.fillRect(200,85,95,95);
		g2d.setColor(cobre);
		g2d.fillRect(205,90,85,85);
		//puntos negros
		g2d.setColor(Color.black);
		g2d.fillRect(210,95,5,5);
		g2d.setColor(Color.black);
		g2d.fillRect(280,95,5,5);
		g2d.setColor(Color.black);
		g2d.fillRect(210,165,5,5);
		g2d.setColor(Color.black);
		g2d.fillRect(280,165,5,5);
		
		//cuadro flotante 2
		g2d.setColor(Color.black);
		g2d.fillRect(290,85,95,95);
		g2d.setColor(cobre);
		g2d.fillRect(295,90,85,85);
		//puntos negros
		g2d.setColor(Color.black);
		g2d.fillRect(300,95,5,5);
		g2d.setColor(Color.black);
		g2d.fillRect(370,95,5,5);
		g2d.setColor(Color.black);
		g2d.fillRect(300,165,5,5);
		g2d.setColor(Color.black);
		g2d.fillRect(370,165,5,5);
		//rectangulo azul
		//sombra
		g2d.setColor(Color.black);
		g2d.fillRect(420,320,153,280);
		g2d.setColor(azul);
		//contorno
		g2d.setColor(Color.black);
		g2d.fillRect(398,298,153,300);
		g2d.setColor(azul);
		g2d.fillRect(400,300,150,300);
		//tornillos cuadro azul
		//sombra tornillo
		g2d.setColor(Color.black);
		g2d.fillArc(405, 305, 17, 17, 0, 360);
		//tornillo
		g2d.setColor(grisClaro);
		g2d.fillArc(405, 305, 15, 15, 0, 360);
		//sombra tornillo
		g2d.setColor(Color.black);
		g2d.fillArc(525, 305, 17, 17, 0, 360);
		//tornillo
		g2d.setColor(grisClaro);
		g2d.fillArc(525, 305, 15, 15, 0, 360);
		//rectangulo rosa
		g2d.setColor(Color.black);
		g2d.fillRect(248,398,204,200);
		//sombra rectangulo rosa
		g2d.setColor(Color.black);
		g2d.fillRect(280,450,200,150);
		g2d.setColor(rosa);
		g2d.fillRect(250,400,200,200);
		
		//sombra tornillo
		g2d.setColor(Color.black);
		g2d.fillArc(253, 403, 17, 17, 0, 360);
		//tornillo
		g2d.setColor(grisClaro);
		g2d.fillArc(253, 403, 15, 15, 0, 360);
		
		g2d.setColor(Color.black);
		g2d.fillArc(430, 403, 17, 17, 0, 360);
		//tornillo
		g2d.setColor(grisClaro);
		g2d.fillArc(430, 403, 15, 15, 0, 360);
		
		g2d.setColor(Color.black);
		g2d.fillArc(430, 580, 17, 17, 0, 360);
		//tornillo
		g2d.setColor(grisClaro);
		g2d.fillArc(430, 580, 15, 15, 0, 360);
		
		g2d.setColor(Color.black);
		g2d.fillArc(253, 580, 17, 17, 0, 360);
		//tornillo
		g2d.setColor(grisClaro);
		g2d.fillArc(253, 580, 15, 15, 0, 360);
		//imagen planta
		try {
			BufferedImage imge;
			imge = ImageIO.read(new File("src/plantC.png"));
			g2d.drawImage(imge,645,355,null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//tuberia
		g2d.setColor(Color.black);
		g2d.fillRect(660,450,100,150);
		g2d.setColor(tubo);
		g2d.fillRect(665,450,90,150);
		//tuberia parte superior
		g2d.setColor(Color.black);
		g2d.fillRect(645,445,130,50);
		g2d.setColor(tubo);
		g2d.fillRect(650,450,120,40);
		
		//rectangulo verde
		g2d.setColor(Color.black);
		g2d.fillRect(846,397,204,203);
		g2d.setColor(verde);
		g2d.fillRect(850,400,200,200);
		
		g2d.setColor(Color.black);
		g2d.fillArc(855, 403, 17, 17, 0, 360);
		//tornillo
		g2d.setColor(grisClaro);
		g2d.fillArc(855, 403, 15, 15, 0, 360);
		
		g2d.setColor(Color.black);
		g2d.fillArc(855, 580, 17, 17, 0, 360);
		g2d.setColor(grisClaro);
		g2d.fillArc(855, 580, 15, 15, 0, 360);
		
		
		
		//suelo cuadriculado
		g2d.setColor(cafe);
		g2d.fillRect(0,650,1000,200);
		g2d.setColor(cafeOscuro);
		for(int i=0;i<=1000;i++) {
			
			g2d.fillRect(0+i,650,5,100);
			g2d.fillRect(0,650+i,1000,5);
			i+=30;
			
		}
		
		//cuadro flotante 4
		g2d.setColor(Color.black);
		g2d.fillRect(850,85,95,95);
		g2d.setColor(cobre);
		g2d.fillRect(855,90,85,85);
		//puntos negros
		g2d.setColor(Color.black);
		g2d.fillRect(860,95,5,5);
		g2d.setColor(Color.black);
		g2d.fillRect(930,95,5,5);
		g2d.setColor(Color.black);
		g2d.fillRect(860,165,5,5);
		g2d.setColor(Color.black);
		g2d.fillRect(930,165,5,5);

		
		//imagen de mario
		try {
			BufferedImage imge;
			imge = ImageIO.read(new File("src/mario.png"));
			g2d.drawImage(imge,500,451,null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	*/
	
	
	/*public void paint(Graphics g)
	{
		//colores
		Color cielo =new Color(133, 193, 233);
		Color tierra =new Color(120, 66, 18 );
		Color arena =new Color(248, 196, 113);
		Color pasto =new Color(51, 102, 0);
		Color plantas =new Color(51, 51, 0);
		Color cercaTrasera =new Color(212, 172, 13 );
		Color cercaD =new Color(244, 208, 63 );
		Color gris =new Color(81, 90, 90 );
		Color crema =new Color(255, 245, 157 );
		Color rojo =new Color(198, 40, 40 );
		Color grisClaro =new Color(117, 117, 117);
		Color cafeOs =new Color(120, 66, 18);
		Color cafePuerta =new Color(156, 100, 12);
		
		
		//tabajo casita
		super.paint(g);
		
		Graphics2D g2d=(Graphics2D) g;
		//background
		g2d.setColor(cielo);
		g2d.fillRect(0,0,1000,750);
	
		g2d.setColor(tierra);
		g2d.fillRect(0,650,1000,100);
		
		g2d.setColor(arena);
		g2d.fillRect(0,600,1000,50);
		
		g2d.setColor(pasto);
		g2d.fillRect(0,525,1000,75);
		
		g2d.setColor(plantas);
		g2d.fillRect(0,500,1000,25);
		
		//cerca
		g2d.setColor(cercaTrasera);
		g2d.fillRect(0,350,1000,75);
		//palets de la cerca
		int xPoints[]= {10  ,10  ,30 ,55 ,55  };
		int yPoints[]= {500,300 ,275,300,500};
		g2d.setColor(cercaD);
		g2d.fillPolygon(xPoints,yPoints,5);
		
		int xPoints2[]= {65,65  ,85 ,110 ,110  };
		int yPoints2[]= {500,300 ,275,300,500};
		g2d.setColor(cercaD);
		g2d.fillPolygon(xPoints2,yPoints2,5);
		
		int xPoints3[]= {120,120  ,140 ,165 ,165 };
		int yPoints3[]= {500,300 ,275,300,500};
		g2d.setColor(cercaD);
		g2d.fillPolygon(xPoints3,yPoints3,5);
		
		int xPoints4[]= {945,945  ,965 ,990 ,990 };
		int yPoints4[]= {500,300 ,275,300,500};
		g2d.setColor(cercaD);
		g2d.fillPolygon(xPoints4,yPoints4,5);
		
		int xPoints5[]= {890,890  ,910 ,935 ,935 };
		int yPoints5[]= {500,300 ,275,300,500};
		g2d.setColor(cercaD);
		g2d.fillPolygon(xPoints5,yPoints5,5);
		
		int xPoints6[]= {835,835  ,855 ,880 ,880 };
		int yPoints6[]= {500,300 ,275,300,500};
		g2d.setColor(cercaD);
		g2d.fillPolygon(xPoints6,yPoints6,5);
		
		//piso de la casa
		g2d.setColor(gris);
		g2d.fillRect(170,475,658,25);
		//pared
		g2d.setColor(crema);
		g2d.fillRect(190,175,620,300);
		//chimenea
		g2d.setColor(grisClaro);
		g2d.fillRect(700,75,80,100);
		
		g2d.setColor(gris);
		g2d.fillRect(690,75,100,25);
		//rayas
		g2d.setColor(cafeOs);
		g2d.fillRect(190,225,620,5);
		
		g2d.setColor(cafeOs);
		g2d.fillRect(190,275,620,5);
		
		g2d.setColor(cafeOs);
		g2d.fillRect(190,325,620,5);
		
		g2d.setColor(cafeOs);
		g2d.fillRect(190,375,620,5);
		
		g2d.setColor(cafeOs);
		g2d.fillRect(190,425,620,5);
		//marco de  puerta
		g2d.setColor(cafeOs);
		g2d.fillRect(205,200,150,275);
		//puerta
		g2d.setColor(cafePuerta);
		g2d.fillRect(215,210,130,260);
		//manija
		g2d.setColor(Color.white);
		g2d.fillArc(315,345, 20, 20, 0,360);
		//marco ventana
		g2d.setColor(rojo);
		g2d.fillRect(600,200,130,130);
		//cristal
		g2d.setColor(Color.white);
		g2d.fillRect(610,210,50,50);
		
		g2d.setColor(Color.white);
		g2d.fillRect(670,210,50,50);
		
		g2d.setColor(Color.white);
		g2d.fillRect(670,270,50,50);
		
		g2d.setColor(Color.white);
		g2d.fillRect(610,270,50,50);
		//repisa
		g2d.setColor(gris);
		g2d.fillRect(590,330,150,25);
		
		
		
		
		
		
		int xPoints0[]= {150,250,900};
		int yPoints0[]= {175,50,175};
		g2d.setColor(rojo);
		g2d.fillPolygon(xPoints0,yPoints0,3);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}*/
	public void iniciarComponentes() {
		
		//this.login();
		//this.registro();
		//this.admin();
		//this.cal();
		//this.calculadoraly();
		//this.calInteres();
		this.botones();
		
		this.repaint();
		this.revalidate();
		
	}
	
	public void botones() {
		
		
		this.setSize(500,750);
		Color colorBlue = new Color(46,134,193);
		Color colorYellow = new Color(244, 208, 63);
		

		btPanel.setSize(this.getWidth(),this.getHeight());
		btPanel.setBackground(colorBlue);
		btPanel.setLayout(null);
		btPanel.setFocusable(true);
		
		JButton click=new JButton ("click me");
		click.setBounds(50,530,400,70);
		click.setBackground(colorYellow);
		btPanel.add(click);
		
		btPanel.addMouseListener(new MouseListener(){

			@Override
			public void mouseClicked(MouseEvent e) {
				Random rand=new Random();
				int x = e.getX();
                int y = e.getY();

                int c1=(int)Math.floor(Math.random()*120+1);
        		int c2=(int)Math.floor(Math.random()*120+1);
        		int c3=(int)Math.floor(Math.random()*120+1);
                JButton boton = new JButton(c1+","+c2+","+c3);
                boton.setLocation(x,y);
                boton.setSize(rand.nextInt(100),rand.nextInt(100));
                boton.setBackground(new Color(c1,c2,c3));
                boton.setOpaque(true);
                btPanel.add(boton);
                
                boton.addActionListener(new ActionListener() {
        			@Override
        			public void actionPerformed(ActionEvent e) {
        				JOptionPane.showMessageDialog(null,"el numero es: "+c1+","+c2+","+c3,"Inane warning",JOptionPane.WARNING_MESSAGE);
        			}
        			});
                
                
                btPanel.revalidate();
                btPanel.repaint();
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
			}

			@Override
			public void mouseReleased(MouseEvent e) {
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				int c1=(int)Math.floor(Math.random()*120+1);
        		int c2=(int)Math.floor(Math.random()*120+1);
        		int c3=(int)Math.floor(Math.random()*120+1);
        		btPanel.setBackground(new Color(c1,c2,c3));
				
				
        	
			}

			@Override
			public void mouseExited(MouseEvent e) {
			}
			
	
	});
			btPanel.addKeyListener(new KeyListener(){

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyPressed(KeyEvent e) {
			System.out.println(e.getKeyCode()+""+e.getKeyChar());
			
			if(e.getKeyCode() == 8) {
				btPanel.removeAll();
				getContentPane().repaint();
				getContentPane().revalidate();	
			
			} if(e.getKeyCode()==87)
			{
				Component[] elementos=btPanel.getComponents();
				for(int i=0; i<elementos.length; i++)
				{
					if(elementos[i].getClass().toString().equals("class javax.swing.JButton"))
					{
						JButton btn=((JButton) elementos[i]);
						btn.setSize(btn.getHeight()+10,btn.getWidth()+10);

						getContentPane().repaint();
						getContentPane().revalidate();
					}
				}
				
			}
                btPanel.repaint();
                btPanel.revalidate();
			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
	
		
		click.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
		int x=(int)Math.floor(Math.random()*450+1);
		int y=(int)Math.floor(Math.random()*650+1);
		
		int w=(int)Math.floor(Math.random()*120+1);
		int h=(int)Math.floor(Math.random()*120+1);
		
		int c1=(int)Math.floor(Math.random()*120+1);
		int c2=(int)Math.floor(Math.random()*120+1);
		int c3=(int)Math.floor(Math.random()*120+1);
		
		JButton otroClick=new JButton (c1+","+c2+","+c3);
		otroClick.setBounds(x,y,w,h);
		otroClick.setBackground(new Color(c1,c2,c3));
		btPanel.add(otroClick);
		
		otroClick.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JButton yo =((JButton)e.getSource());
				btPanel.remove(yo);
				getContentPane().repaint();
				
				
				//JOptionPane.showMessageDialog(null,"el numero es: "+c1+","+c2+","+c3,"Inane warning",JOptionPane.WARNING_MESSAGE);
				
			}
		
			
		});
		
		
		getContentPane().repaint();
		getContentPane().revalidate();
				
			}
		});
		this.add(btPanel);	
	}
	
	
	
	public void calInteres() {
		this.setSize(500,650);
		
		JPanel panel=new JPanel();
		panel.setSize(this.getWidth(),this.getHeight());
		panel.setBackground(Color.black);
		Border bordeCentro = BorderFactory.createLineBorder(Color.white, 50); 
		panel.setBorder(bordeCentro);
		panel.setLayout(new BorderLayout());
		
		JLabel text=new JLabel("Interes");
		text.setFont(new Font("Arial",Font.BOLD,15));
		text.setOpaque(true);
		text.setBackground(Color.white);
		text.setForeground(Color.red);
		panel.add(text,BorderLayout.NORTH);
		
		JPanel centro=new JPanel();
		centro.setLayout(new GridLayout(7,1));
		TitledBorder border= new TitledBorder("calcular interes");
		border.setTitleJustification(TitledBorder.LEFT);
		centro.setBackground(Color.white);
		border.setTitlePosition(TitledBorder.TOP);
		centro.setBorder(border);
		panel.add(centro,BorderLayout.CENTER);
		
		JPanel uno= new JPanel(new FlowLayout(FlowLayout.CENTER));
		uno.setBackground(Color.green);
		centro.add(uno);
		
		JLabel capital=new JLabel("Capital",4);
		capital.setFont(new Font("Arial",Font.BOLD,15));
		capital.setOpaque(true);
		capital.setBackground(Color.green);
		uno.add(capital);
		
		JTextField linea1=new JTextField("");
		linea1.setFont(new Font("Calibri",Font.BOLD,15));
		linea1.setPreferredSize(new Dimension(150,30));
		uno.add(linea1);
		
		JPanel dos= new JPanel(new FlowLayout(FlowLayout.CENTER));
		dos.setBackground(Color.green);
		centro.add(dos);
		
		JLabel tiempo=new JLabel("Tiempo",4);
		tiempo.setFont(new Font("Arial",Font.BOLD,15));
		tiempo.setOpaque(true);
		tiempo.setBackground(Color.green);
		dos.add(tiempo);
		
		JTextField linea2=new JTextField("");
		linea2.setFont(new Font("Calibri",Font.BOLD,15));
		linea2.setPreferredSize(new Dimension(150,30));
		dos.add(linea2);
		
		JPanel tres= new JPanel(new FlowLayout(FlowLayout.CENTER));
		tres.setBackground(Color.green);
		centro.add(tres);
		
		JLabel tasaInteres=new JLabel("Tasa Interes",4);
		tasaInteres.setFont(new Font("Arial",Font.BOLD,15));
		tasaInteres.setOpaque(true);
		tasaInteres.setBackground(Color.green);
		tres.add(tasaInteres);
		
		JTextField linea3=new JTextField("");
		linea3.setFont(new Font("Calibri",Font.BOLD,15));
		linea3.setPreferredSize(new Dimension(150,30));
		tres.add(linea3);
		
		JPanel cuatro= new JPanel(new FlowLayout(FlowLayout.CENTER));
		cuatro.setBackground(Color.green);
		centro.add(cuatro);
		
		JButton calcular=new JButton ("Calcular");
		calcular.setBackground(Color.black);
		calcular.setPreferredSize(new Dimension(120,30));
		calcular.setForeground(Color.white);
		cuatro.add(calcular);
		
		JButton cancelar=new JButton ("Cancelar");
		cancelar.setBackground(Color.black);
		cancelar.setPreferredSize(new Dimension(120,30));
		cancelar.setForeground(Color.white);
		cuatro.add(cancelar);
		
		JPanel cinco= new JPanel(new FlowLayout(FlowLayout.CENTER));
		cinco.setBackground(Color.white);
		centro.add(cinco);
		
		JPanel seis= new JPanel(new FlowLayout(FlowLayout.CENTER));
		seis.setBackground(Color.pink);
		centro.add(seis);
		
		JLabel interes=new JLabel("Interes",4);
		interes.setFont(new Font("Arial",Font.BOLD,15));
		interes.setOpaque(true);
		interes.setBackground(Color.pink);
		seis.add(interes);
		
		JTextField linea4=new JTextField("");
		linea4.setFont(new Font("Calibri",Font.BOLD,15));
		linea4.setPreferredSize(new Dimension(150,30));
		seis.add(linea4);
		
		JPanel siete= new JPanel(new FlowLayout(FlowLayout.CENTER));
		siete.setBackground(Color.pink);
		centro.add(siete);
		
		JLabel monto=new JLabel("Monto",4);
		monto.setFont(new Font("Arial",Font.BOLD,15));
		monto.setOpaque(true);
		monto.setBackground(Color.pink);
		siete.add(monto);
		
		JTextField linea5=new JTextField("");
		linea5.setFont(new Font("Calibri",Font.BOLD,15));
		linea5.setPreferredSize(new Dimension(150,30));
		siete.add(linea5);
	
		
		this.add(panel);
	}
	public void calculadoraly() {
		//tamaño de la ventana
		this.setSize(450,650);
		//colores RGB
		Color violeta =new Color(136, 78, 160);
		//panel principal
		JPanel panel=new JPanel();
		panel.setSize(this.getWidth(),this.getHeight());
		panel.setBackground(Color.black);
		panel.setLayout(new BorderLayout());
		//parte superior de texto "100.00"
		JLabel text=new JLabel("100.00",4);
		text.setFont(new Font("Arial",Font.BOLD,20));
		text.setOpaque(true);
		text.setBackground(Color.white);
		panel.add(text,BorderLayout.NORTH);
		//panel central donde iran las teclas
		JPanel centro=new JPanel();
		centro.setBackground(Color.blue);
		centro.setLayout(new GridLayout(4,3));
		panel.add(centro,BorderLayout.CENTER);
		//arreglo para diseñar botones centrales
		String btns[]= {"7","8","9","6","5","4","3","2","1","0",".","/"};
		//ciclo for para generar los botones centrales
		for(int i=0;i<12;i++) {
			JButton boton=new JButton(btns[i]);
			centro.add(boton);
		}
		//panel derecho 
		JPanel east=new JPanel();
		east.setBackground(Color.blue);
		east.setLayout(new GridLayout(3,1));
		panel.add(east,BorderLayout.EAST);
		//arreglo para los botones de la derecha
		String btDerecha[]= {"  +  ","  -   ","  =  "};
		//ciclo para generar botones de la derecha
		for(int i=0;i<3;i++) {
			JButton boton=new JButton(btDerecha[i]);
			boton.setBackground(violeta);
			east.add(boton);
			}
		//panel izquierdo
		JPanel west=new JPanel();
		west.setBackground(Color.blue);
		west.setLayout(new GridLayout(4,1));
		panel.add(west,BorderLayout.WEST);
		//arreglo para botones izquierdos
		String btIzquierda[]= {"AC","DEL","MC","M+"};
		//ciclo para los botones izquierdos
		for(int i=0;i<4;i++) {
			JButton boton=new JButton(btIzquierda[i]);
			boton.setBackground(violeta);
			west.add(boton);
			}
		//agregar al panel principal
		this.add(panel);
		
	}
	public void login() {
		
		Color colorBlue = new Color(46,134,193);
		Color colorBlueDark = new Color(36, 113, 163);
		Color colorYellow = new Color(244, 208, 63);
		
		
		JPanel login=new JPanel();
		login.setSize(this.getWidth(),this.getHeight());
		login.setBackground(colorBlue);
		this.add(login);
		login.setLayout(null);
		
		//crear titulo "acceder"
		JLabel login_tag=new JLabel("User Login",0);
		login_tag.setSize(200,60);
		login_tag.setFont(new Font("Arial",Font.BOLD,20));
		login_tag.setLocation(400,30);
		login_tag.setOpaque(true);
		login_tag.setBackground(colorBlue);
		login_tag.setForeground(Color.white);
		login.add(login_tag);
		//mi cuenta
		JLabel myAccount=new JLabel("My Account",0);
		myAccount.setSize(200,60);
		myAccount.setFont(new Font("Arial",Font.BOLD,20));
		myAccount.setLocation(400,130);
		myAccount.setOpaque(true);
		myAccount.setBackground(colorBlueDark);
		myAccount.setForeground(colorYellow);
		login.add(myAccount);
	
		JLabel logo =new JLabel();
		logo.setIcon(new ImageIcon(getClass().getResource("lock1.png")));
		logo.setBounds(325,335,24,24);
		login.add(logo);
		
		JLabel logoUsuario =new JLabel();
		logoUsuario.setIcon(new ImageIcon(getClass().getResource("user.png")));
		logoUsuario.setBounds(325,235,24,24);
		login.add(logoUsuario);
		
		//boton "login"
		JButton ingresar=new JButton ("login");
		ingresar.setBounds(425,500,170,40);
		ingresar.setBackground(colorYellow);
		login.add(ingresar);
		//boton "sign up"
		JButton sign=new JButton ("Sign Up");
		sign.setBounds(425,625,170,40);
		sign.setBackground(colorYellow);
		
		login.add(sign);
		
		//texto "nombre de usuario"
		JLabel userName= new JLabel("UserName");
		userName.setFont(new Font("Arial",Font.BOLD,15));
		userName.setLocation(350,160);
		userName.setSize(145,100);
		userName.setOpaque(false);
		login.add(userName);
		
		//caja de texto del nombre de ususario
		JTextField userBox=new JTextField();
		userBox.setBounds(350,230,290,35);
		login.add(userBox);
		
		//texto "contraseña"
		JLabel password=new JLabel("Password");
		password.setFont(new Font("Arial",Font.BOLD,15));
		password.setLocation(350,260);
		password.setSize(145,100);
		password.setOpaque(false);
		login.add(password);
		
		 //linea de texto de la contraseña
		JPasswordField passwordBox=new JPasswordField();
		passwordBox.setBounds(350,330,290,35);
		login.add(passwordBox);
		
		//recuadro "¿olvido su contraseña?"
		JLabel forgotPassword=new JLabel("¿olvido su contraseña?");
		forgotPassword.setFont(new Font("Arial",Font.BOLD,12));
		forgotPassword.setBounds(450,600,200,35);
		forgotPassword.setOpaque(false);
		forgotPassword.setForeground(Color.white);
		login.add(forgotPassword);
		
		ingresar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
			System.out.println("hola");
			String urs=userBox.getText();
			String psw=new String(passwordBox.getPassword());
			
			if(urs.length()<=0) {
				userBox.setBorder(BorderFactory.createLineBorder(Color.red,2));
			}else {
				userBox.setBorder(BorderFactory.createLineBorder(Color.green,2));
			}
			
			if(psw.length()<=0) {
				passwordBox.setBorder(BorderFactory.createLineBorder(Color.red,2));
			}else {
				passwordBox.setBorder(BorderFactory.createLineBorder(Color.green,2));
			}
			
			
			if(urs.equals("SuperUser"))
			{
				if(psw.equals("SuperPass"))
				{
					System.out.println();
				}
				
			}else
			{
				System.out.println("usuario no encontrado");
				userBox.setBorder(BorderFactory.createLineBorder(Color.red,2));
				passwordBox.setBorder(BorderFactory.createLineBorder(Color.red,2));
			}
				
			}
		});
		
		//recuadro tachable de "recordarme"		
		/*JCheckBox recordarme=new JCheckBox("Recordarme");
		recordarme.setFont(new Font("Arial",Font.BOLD,12));
		recordarme.setBounds(20,270,100,35);
		recordarme.setOpaque(false);
		login.add(recordarme);*/
		
		JLabel plano= new JLabel();
		plano.setBackground(colorBlueDark);
		plano.setLocation(250,100);
		plano.setSize(500,500);
		plano.setOpaque(true);
		login.add(plano);
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
		
		JButton crear=new JButton ("Crear");
		crear.setBounds(200,600,140,50);
		registro.add(crear);
		
		crear.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
			System.out.println("hola");
			String urs=userBox.getText();
			String are=new String(userBoxBio.getText());
			
			
			if(urs.length()<=0) {
				userBox.setBorder(BorderFactory.createLineBorder(Color.red,2));
			}else {
				userBox.setBorder(BorderFactory.createLineBorder(Color.green,2));
			}
			
			if(are.length()<=0) {
				userBoxBio.setBorder(BorderFactory.createLineBorder(Color.red,2));
			}else {
				userBoxBio.setBorder(BorderFactory.createLineBorder(Color.green,2));
			}
			if(!acepto_radio.isSelected()) {
				acepto_radio.setBorderPainted(true);
				acepto_radio.setBorder(BorderFactory.createLineBorder(Color.red,2));
			}else {
				acepto_radio.setBorder(BorderFactory.createLineBorder(Color.green,2));
			}
			
			
			
			if(urs.equals("SuperUser"))
			{
				if(userBoxBio.equals("SuperPass"))
				{
					System.out.println();
				}
				
			}/*else
			{
				System.out.println("usuario no encontrado");
				userBox.setBorder(BorderFactory.createLineBorder(Color.red,2));
				userBoxBio.setBorder(BorderFactory.createLineBorder(Color.red,2));
			}*/
				
			}
			
		});
			
		
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
		scroll.setBounds(50,300,820,100);
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
