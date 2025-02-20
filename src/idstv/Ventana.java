package idstv;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Ventana extends JFrame{

	public Ventana() {
		this.setTitle("Login");//para el titulo de la ventana
		this.setVisible(true);
		this.setSize(1000,1000);
		
		this.setLocationRelativeTo(null);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//para cerrar todas las ventanas/dejar de correr el programa
		
		//this.setResizable(true);//para cambiar el tamaño de la ventana
		this.setMaximumSize(new Dimension(1000,1000));
		this.setMinimumSize(new Dimension(400,400));
		
		this.add(this.login());//add permite añadir todo en la ventana del frame
		this.add(this.registro());
		this.repaint();
	}
	
	public JPanel login()
	{
		JPanel panel = new JPanel();
		panel.setBackground(Color.decode("#ffe5dd")); //PARA PONER OTRO COLOR 
		//Color.decode("numero del color que quieres"));
		panel.setOpaque(true);//para habilitar el fondo de pantalla
		panel.setSize(500,1000);
		panel.setLocation(0,0);
		panel.setLayout(null);//quita el molde
		
		JLabel lblBienvenido = new JLabel("Bienvenido");
		lblBienvenido.setSize(230,40); //tamaño
		lblBienvenido.setOpaque(true);
		lblBienvenido.setBackground((Color.decode("#bd9892")));
		lblBienvenido.setLocation(130,60);//DONNDE VAMOS A LOCALIZAR LA ETIQUETA
		lblBienvenido.setHorizontalAlignment(JLabel.CENTER);//CENTRAR LA ETIQUETA
		lblBienvenido.setFont(new Font("American TYpewrite", Font.BOLD, 30));
		panel.add(lblBienvenido);
		
		JLabel lblEmail = new JLabel("Ingrese su email:");
		lblEmail.setSize(200,135);//tamaño de email
		lblEmail.setLocation(60,80);
		lblEmail.setFont(new Font("American TYpewrite", Font.BOLD, 20));
		panel.add(lblEmail);
		
		JTextField txtEmail = new JTextField();
		txtEmail.setSize(350,30); //tamaño del recuadro
		txtEmail.setLocation(60,165);
		txtEmail.setFont(new Font("American TYpewrite", Font.BOLD, 20));
		panel.add(txtEmail);	
		
		JLabel lblContra = new JLabel("Ingrese su contraseña:");
		lblContra.setSize(250,30);
		lblContra.setLocation(60,195);
		lblContra.setFont(new Font("American TYpewrite", Font.BOLD, 20));
		panel.add(lblContra);
		
		JTextField txtcontra = new JTextField();
		txtcontra.setSize(350,30); //tamaño del recuadro
		txtcontra.setLocation(60,225);
		txtcontra.setFont(new Font("American TYpewrite", Font.BOLD, 20));
		panel.add(txtcontra);
		
		Checkbox cheRecordarme = new Checkbox("Recordarme");
		cheRecordarme.setSize(100,30);
		cheRecordarme.setLocation(60,250);
		cheRecordarme.setFont(new Font("American TYpewrite", Font.BOLD, 10));
		panel.add(cheRecordarme);
		
		
		JLabel lblOlvContra = new JLabel("¿Olvido su contraseña?");
		lblOlvContra.setSize(500,30);
		lblOlvContra.setLocation(290,250);
		lblOlvContra.setFont(new Font("American TYpewrite", Font.BOLD, 10));
		panel.add(lblOlvContra);
		
		Button btnAcceder = new Button("ACCEDER");
		btnAcceder .setSize(350,40); //tamaño
		btnAcceder .setLocation(60,300);
		btnAcceder.setBackground((Color.decode("#bd9892")));
		//btn1.setHorizontalAlignment(JLabel.CENTER);
		btnAcceder .setFont(new Font("American TYpewrite", Font.BOLD, 20));
		panel.add(btnAcceder );
		
		
		
		
		
		
		return panel;
	}

	
	public JPanel registro() {
		
		JPanel panel = new JPanel();
		
		panel.setBackground(Color.decode("#bd9892")); //PARA PONER OTRO COLOR 
		//Color.decode("numero del color que quieres"));
		panel.setOpaque(true);//para habilitar el fondo de pantalla
		panel.setSize(500,1000);
		panel.setLocation(500,0);
		panel.setLayout(null);//quita el molde
		
		JLabel lblRegistro = new JLabel("Registro");
		lblRegistro.setSize(230,40); //tamaño
		lblRegistro.setOpaque(true);
		lblRegistro.setBackground(Color.decode("#ffe5dd"));
		lblRegistro.setLocation(130,60);//DONNDE VAMOS A LOCALIZAR LA ETIQUETA
		lblRegistro.setHorizontalAlignment(JLabel.CENTER);//CENTRAR LA ETIQUETA
		lblRegistro.setFont(new Font("American TYpewrite", Font.BOLD, 30));
		panel.add(lblRegistro);
		
		JLabel lblNomUsuario = new JLabel("Nombre del usuario:");
		lblNomUsuario.setOpaque(true);
		lblNomUsuario.setBackground(Color.decode("#ffe5dd"));
		lblNomUsuario.setSize(350,30);//tamaño de email
		lblNomUsuario.setLocation(70,130);
		lblNomUsuario.setHorizontalAlignment(JLabel.CENTER);
		lblNomUsuario.setFont(new Font("American TYpewrite", Font.BOLD, 20));
		panel.add(lblNomUsuario);
		
		JTextField txtNomUsuario = new JTextField();
		txtNomUsuario.setSize(350,30); //tamaño del recuadro
		txtNomUsuario.setLocation(70,165);
		txtNomUsuario.setFont(new Font("American TYpewrite", Font.BOLD, 20));
		panel.add(txtNomUsuario);
		
		JLabel lblBio = new JLabel("B I O");
		lblBio.setSize(348,30);
		lblBio.setLocation(70,210);
		lblBio.setHorizontalAlignment(JLabel.CENTER);
		lblBio.setFont(new Font("American TYpewrite", Font.BOLD, 20));
		panel.add(lblBio);
		lblBio.setBorder(BorderFactory.createLineBorder(Color.BLACK,3));
		
		JTextArea txtAreaBio = new JTextArea("");
		txtAreaBio.setSize(350,80);
		txtAreaBio.setLocation(70,250);
		txtAreaBio.setFont(new Font("American TYpewrite", Font.BOLD, 20));
		panel.add(txtAreaBio);
		
		JLabel lblPreferencias = new JLabel("PREFERENCIAS");
		lblPreferencias.setSize(200,30);
		lblPreferencias.setLocation(130,350);
		lblBio.setHorizontalAlignment(JLabel.CENTER);
		lblPreferencias.setFont(new Font("American TYpewrite", Font.BOLD, 20));
		panel.add(lblPreferencias);
		
		JCheckBox checkDulce = new JCheckBox("Dulce");
		checkDulce.setSize(100,30);
		checkDulce.setLocation(70,380);
		checkDulce.setOpaque(false);
		lblBio.setHorizontalAlignment(JLabel.CENTER);
		checkDulce.setFont(new Font("American TYpewrite", Font.BOLD, 15));
		panel.add(checkDulce);

		
		//checkDulce.setBorder(BorderFactory.createLineBorder(Color.BLACK,8));
		
		JCheckBox checkSalado = new JCheckBox("Salado");
		checkSalado.setSize(110,30);
		checkSalado.setLocation(160,380);
		checkSalado.setOpaque(false);
		checkSalado.setFont(new Font("American TYpewrite", Font.BOLD, 15));
		panel.add(checkSalado);
		
		JCheckBox checkSaludable = new JCheckBox("Saludable");
		checkSaludable.setSize(140,30);
		checkSaludable.setLocation(280,380);
		checkSaludable.setOpaque(false);
		checkSaludable.setFont(new Font("American TYpewrite", Font.BOLD, 15));
		panel.add(checkSaludable);
		
		JLabel lblTerminos = new JLabel("TERMINOS");
		lblTerminos.setOpaque(true);
		lblTerminos.setBackground(Color.decode("#ffe5dd"));
		lblTerminos.setSize(350,30);
		lblTerminos.setLocation(70,420);
		lblTerminos.setHorizontalAlignment(JLabel.CENTER);
		lblTerminos.setFont(new Font("American TYpewrite", Font.BOLD, 20));
		panel.add(lblTerminos);
		
		
		JRadioButton jrbAcepTerm = new JRadioButton("Acepto los terminos");
		jrbAcepTerm.setSize(200,40);
		jrbAcepTerm.setLocation(70,450);
		jrbAcepTerm.setOpaque(false);
		panel.add(jrbAcepTerm);
		
		JRadioButton jrbNoAcepTerm = new JRadioButton("No acepto los terminos", true);
		jrbNoAcepTerm.setSize(200,40);
		jrbNoAcepTerm.setLocation(230,450);
		jrbNoAcepTerm.setOpaque(false);
		panel.add(jrbNoAcepTerm);
		
		ButtonGroup termsGrupo = new ButtonGroup();
		termsGrupo.add(jrbNoAcepTerm);
		termsGrupo.add(jrbAcepTerm);
		
		String dataset []= {"Camino Real", "Pedrenal", "Olas altas", "Santa Fe"};
		JComboBox colonias = new JComboBox();
		colonias.setSize(350,40);
		colonias.setLocation(70,500);
		colonias.setOpaque(true);
		panel.add(colonias);
		
		Button btnCrearCuenta = new Button("Crear Cuenta");
		btnCrearCuenta.setSize(350,40); //tamaño
		btnCrearCuenta.setLocation(70,550);
		//btnCrearCuenta.setOpaque(true);
		btnCrearCuenta.setBackground(Color.decode("#ffe5dd"));
		//btn1.setHorizontalAlignment(JLabel.CENTER);
		btnCrearCuenta.setFont(new Font("American TYpewrite", Font.BOLD, 20));
		panel.add(btnCrearCuenta);
	
		return panel;
	}
}

