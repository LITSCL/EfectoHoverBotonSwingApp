package cl.inacap.efectohoverbotonswingapp;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class StartFrame extends JFrame {
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StartFrame frame = new StartFrame();
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
	public StartFrame() {
		this.setTitle("EfectoHoverBotonSwingApp");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnBoton1 = new JButton("Boton 1"); //A este boton se le cambian los colores utilizando los colores nativos de Java.
		btnBoton1.setBackground(Color.GREEN);
		btnBoton1.setBounds(10, 78, 149, 76);
		contentPane.add(btnBoton1);
		btnBoton1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnBoton1.setBackground(Color.PINK);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnBoton1.setBackground(Color.GREEN);
			}
		});
		
		JButton btnBoton2 = new JButton("Boton 2"); //A este boton se le cambian los colores utilizando los colores RGB.
		btnBoton2.setBounds(275, 78, 149, 76);
		contentPane.add(btnBoton2);
		btnBoton2.setBackground(new Color(0, 213, 200));
		btnBoton2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) { //Listener que escucha cuando el mouse entra en el botón.
				btnBoton2.setBackground(new Color(0, 234, 220));
			}
			@Override
			public void mouseExited(MouseEvent e) { //Listener que escucha cuando el mouse sale del botón.
				btnBoton2.setBackground(new Color(0, 213, 200));
			}
		});
	}
}
