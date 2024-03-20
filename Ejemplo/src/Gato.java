import java.awt.Color;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Gato extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JButton button1, button2, button3, button4, button5, button6, button7, button8, button9;

    private boolean turnoGato = true; 

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Gato frame = new Gato();
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
    public Gato() {
        setTitle("Juego del gato");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(new GridLayout(1, 0, 0, 0));

        JPanel panel = new JPanel();
        contentPane.add(panel);
        panel.setLayout(new GridLayout(3, 3, 0, 0));

        button1 = new JButton(" ");
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                marcarBoton(button1);
                
            }
        });
        panel.add(button1);

        button2 = new JButton(" ");
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                marcarBoton(button2);
            }
        });
        panel.add(button2);

        button3 = new JButton(" ");
        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                marcarBoton(button3);
            }
        });
        panel.add(button3);

        button4 = new JButton(" ");
        button4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                marcarBoton(button4);
            }
        });
        panel.add(button4);

        button5 = new JButton(" ");
        button5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                marcarBoton(button5);
            }
        });
        panel.add(button5);

        button6 = new JButton(" ");
        button6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                marcarBoton(button6);
            }
        });
        panel.add(button6);

        button7 = new JButton(" ");
        button7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                marcarBoton(button7);
            }
        });
        panel.add(button7);

        button8 = new JButton(" ");
        button8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                marcarBoton(button8);
            }
        });
        panel.add(button8);

        button9 = new JButton(" ");
        button9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                marcarBoton(button9);
            }
        });
        panel.add(button9);
    }

    private void marcarBoton(JButton button) {
        if (!button.getText().equals(" ")) {
            return; 
        }
        
        if (turnoGato) {
            button.setText("X");
            button.setBackground(Color.red);
        } else {
            button.setText("O");
            button.setBackground(Color.blue);
        }
        button.setEnabled(false); 
        turnoGato = !turnoGato; 
        verificarGanador();
    }

    private void verificarGanador() {
       
        if (botonTieneTexto(button1) && button1.getText().equals(button2.getText()) && button1.getText().equals(button3.getText())) {
            mostrarGanador(button1.getText());
        } else if (botonTieneTexto(button4) && button4.getText().equals(button5.getText()) && button4.getText().equals(button6.getText())) {
            mostrarGanador(button4.getText());
        } else if (botonTieneTexto(button7) && button7.getText().equals(button8.getText()) && button7.getText().equals(button9.getText())) {
            mostrarGanador(button7.getText());
        } else if (botonTieneTexto(button1) && button1.getText().equals(button4.getText()) && button1.getText().equals(button7.getText())) {
            mostrarGanador(button1.getText());
        } else if (botonTieneTexto(button2) && button2.getText().equals(button5.getText()) && button2.getText().equals(button8.getText())) {
            mostrarGanador(button2.getText());
        } else if (botonTieneTexto(button3) && button3.getText().equals(button6.getText()) && button3.getText().equals(button9.getText())) {
            mostrarGanador(button3.getText());
        } else if (botonTieneTexto(button1) && button1.getText().equals(button5.getText()) && button1.getText().equals(button9.getText())) {
            mostrarGanador(button1.getText());
        } else if (botonTieneTexto(button3) && button3.getText().equals(button5.getText()) && button3.getText().equals(button7.getText())) {
            mostrarGanador(button3.getText());
        }
    }

    private boolean botonTieneTexto(JButton button) {
        return !button.getText().equals(" ");
    }

    private void mostrarGanador(String ganador) {
     
       
    	
    	JOptionPane.showMessageDialog(null,ganador + " ha ganado!");
      
        button1.setEnabled(false);
        button2.setEnabled(false);
        button3.setEnabled(false);
        button4.setEnabled(false);
        button5.setEnabled(false);
        button6.setEnabled(false);
        button7.setEnabled(false);
        button8.setEnabled(false);
        button9.setEnabled(false);
        
    }
}
