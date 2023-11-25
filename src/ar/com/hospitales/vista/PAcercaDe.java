package ar.com.hospitales.vista;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;

import ar.com.hospitales.modelo.Miscelanea;

public class PAcercaDe extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;
	
	Miscelanea misc = new Miscelanea();
	
	public PAcercaDe() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 300);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Acerca de",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblInfoFecha = new JLabel("Fecha");
		lblInfoFecha.setHorizontalAlignment(SwingConstants.CENTER);
		lblInfoFecha.setBounds(90, 60, 230, 50);
		contentPane.add(lblInfoFecha);
		lblInfoFecha.setText(misc.getFecha());
		
		JLabel lblNombreAlumno = new JLabel("Nombre y Apellido del alumno");
		lblNombreAlumno.setHorizontalAlignment(SwingConstants.CENTER);
		lblNombreAlumno.setBounds(90, 127, 230, 50);
		contentPane.add(lblNombreAlumno);
		lblNombreAlumno.setText(misc.getNombreAlumno());
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PMenuPrincipal mp = new PMenuPrincipal();
				mp.setVisible(true);
				dispose();
			}
		});
		btnVolver.setBounds(310, 200, 89, 23);
		contentPane.add(btnVolver);
		
		JLabel label = new JLabel("");
		label.setBounds(90, 222, 46, 14);
		contentPane.add(label);
	}
	
}