package Ejemplo03;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.*;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class Ventana extends JFrame   {
	
	public Ventana() {
		this.setTitle("Ejemplo 3. Paneles Java");
		this.setSize(400,200);
		
		//Obtiene el objeto contenedor Frame
		Container contentPane = this.getContentPane();
		//objeto de tipo panel
		JPanel panel = new JPanel();
		
		contentPane.add(panel);
		panel.setBackground(Color.yellow);
		
		//listener que captura el evento "cierre de ventana"
		this.addWindowListener(new WindowAdapter() {
			public void windowClossing(WindowEvent e) {
			System.out.println("Cerrando el programa");
			System.exit(0);
			}
			
			public  void windowOpened(WindowEvent e) {
				System.out.println("Abriendo programa");
				
			}
			
		});
		this.addMouseListener(new MouseAdapter() {
			
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			  System.out.println("Clic detectado");
		}
		});
	}
		
		
	}

	

