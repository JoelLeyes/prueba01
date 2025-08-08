package presentacion;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JToolBar;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class Pantalla extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public Pantalla() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JMenu mnNewMenu = new JMenu("registro");
		contentPane.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("registrar usuario");
		mnNewMenu.add(mntmNewMenuItem);
		
		JToolBar toolBar = new JToolBar();
		contentPane.add(toolBar);
		
		JLabel hola = new JLabel("hola");
		toolBar.add(hola);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		toolBar.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		toolBar.add(lblNewLabel_1);

	}

}
