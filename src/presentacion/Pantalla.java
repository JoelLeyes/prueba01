package presentacion;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JToolBar;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JTextPane;
import javax.swing.JTextArea;

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
		setBounds(100, 100, 497, 317);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenu mnNewMenu = new JMenu("registro");
		mnNewMenu.setBounds(130, 10, 99, 26);
		contentPane.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("registrar usuario");
		mnNewMenu.add(mntmNewMenuItem);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(288, 138, 39, 11);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(130, 124, 39, 11);
		contentPane.add(lblNewLabel_2);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(322, 16, 30, 13);
		contentPane.add(toolBar);
		
		JLabel hola = new JLabel("hola");
		toolBar.add(hola);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(322, 81, 112, 26);
		contentPane.add(textPane);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(237, 42, 90, 42);
		contentPane.add(textArea);

	}
}
