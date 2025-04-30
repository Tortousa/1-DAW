package EjemploRock;
import javax.swing.JFrame;

public class Formulario extends JFrame implements ActionListener{
	private Container contenedor;
	private JLabel titulo, labelNombre, labelGrupo, labelPrecio, labelError, labelInfo, labelFallo;
	
	private JTextField campoNombre, campoGrupo, campoPrecio;
	private JButton botonEnviar, botonLimpiar;
	
	public Formulario() {
		this.setTitle("Ejemplo 4. Formulario");
		this.setBounds(150,100,700,500);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		this.contenedor = this.getContentPane();
		this.contenedor.setLayout(null);
		
		this.titulo = new JLabel("Formulario de prueba");
		this.titulo.setFont(new Font("Arial", Font.PLAIN,24));
		this.titulo.setBounds(50, 50, 500, 30);
		this.contenedor.add(this.titulo);
		
		this.labelNombre = new JLabel("Titulo");
		this.labelNombre.setFont(new Font("Arial", Font.PLAIN,24));
		this.labelNombre.setBounds(50, 300, 200, 30);
		this.contenedor.add(this.labelNombre);
		
		this.campoNombre = new JTextField("Formulario de prueba");
		this.campoNombre.setFont(new Font("Arial", Font.PLAIN,24));
		this.campoNombre.setBounds(50, 100, 200, 30);
		this.contenedor.add(this.campoNombre);
		
		this.labelGrupo = new JLabel("Grupo");
		this.labelGrupo.setFont(new Font("Arial", Font.PLAIN,24));
		this.labelGrupo.setBounds(50, 160, 200, 30);
		this.contenedor.add(this.labelGrupo);
		
		this.campoGrupo = new JTextField("");
		this.campoGrupo.setFont(new Font("Arial", Font.PLAIN,24));
		this.campoGrupo.setBounds(50, 130, 200, 30);
		this.contenedor.add(this.campoGrupo);
		
		this.labelPrecio = new JLabel("Precio");
		this.labelPrecio.setFont(new Font("Arial", Font.PLAIN,24));
		this.labelPrecio.setBounds(50, 220, 200, 30);
		this.contenedor.add(this.labelPrecio);
		
		this.campoGrupo = new JTextField("OWO");
		this.campoGrupo.setFont(new Font("Arial", Font.PLAIN,24));
		this.campoGrupo.setBounds(50, 250, 200, 30);
		this.contenedor.add(this.campoGrupo);
		
		this.botonEnviar = new JButton("Enviar");
		this.botonEnviar.setFont(new Font("Arial", Font.PLAIN,24));
		this.botonEnviar.setBounds(50, 295, 200, 30);
		this.botonEnviar.addActionListener(this);
		this.contenedor.add(this.botonEnviar);
		
		this.botonLimpiar = new JButton("Limpiar");
		this.botonLimpiar.setFont(new Font("Arial", Font.PLAIN,24));
		this.botonLimpiar.setBounds(155, 295, 200, 30);
		this.botonLimpiar.addActionListener(this);
		this.contenedor.add(this.botonLimpiar);
		
		this.labelInfo = new JLabel("");
		this.labelInfo.setFont(new Font("Arial", Font.PLAIN,24));
		this.labelInfo.setBounds(330, 100, 350, 30);
		this.labelInfo.setVerticalAlignment(JLabel.TOP);
		this.contenedor.add(this.labelInfo);
		
		this.labelExito = new JLabel("");
		this.labelExito.setFont(new Font("Arial", Font.PLAIN,24));
		this.labelExito.setBounds(330, 100, 350, 30);
		this.labelExito.setVerticalAlignment(JLabel.TOP);
		this.contenedor.add(this.labelExito);
		
		this.labelFallo = new JLabel("Ha fallado");
		this.labelFallo.setFont(new Font("Arial", Font.PLAIN,24));
		this.labelFallo.setBounds(330, 100, 350, 30);
		this.labelFallo.setVerticalAlignment(JLabel.TOP);
		this.contenedor.add(this.labelFallo);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == this.botonEnviar) {
			this.enviar;
		} else if(e.getSource() == this.botonLimpiar) {
			this.limpiar;
		}
	}
	
	private void limpiar() {
		this.campoNombre.setText("");
		this.campoGrupo.setText("");
		this.campoPrecio.setText("");
	}
	
	private void enviar() {
		String nombre = this.campoNombre.getText().trim();
		String grupo = this.campoGrupo.getText().trim();
		String precio = this.campoPrecio.getText().trim();
		
		Database db = new Database();
		boolean resultado = db.InsertarDisco(nombre, grupo, Double.parseDouble(precio));
		
		if(resultado) {
			this.labelExito.setVisible(true);
			this.labelFallo.setVisible(false);
		} else {
			this.labelExito.setVisible(false);
			this.labelFallo.setVisible(true);
		}
	}
}
