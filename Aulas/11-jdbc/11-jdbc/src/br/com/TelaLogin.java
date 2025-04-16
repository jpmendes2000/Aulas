/*package br.com.SUN_pdv.telas;



import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JEditorPane;
import java.awt.event.KeyEvent;
import java.awt.Component;
import java.awt.ComponentOrientation;
import java.awt.Rectangle;
import javax.swing.DebugGraphics;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.Dialog.ModalExclusionType;

public class TelaLogin extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaLogin frame = new TelaLogin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public TelaLogin() {
		setResizable(false);
		setTitle("X System - Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 302);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SUN PDV");
		lblNewLabel.setFont(new Font("Palatino Linotype", Font.BOLD, 35));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(175, 238, 238));
		lblNewLabel.setMinimumSize(new Dimension(142, 0));
		lblNewLabel.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		lblNewLabel.setBounds(new Rectangle(10, 10, 516, 60));
		lblNewLabel.setBackground(new Color(0, 255, 255));
		lblNewLabel.setDisplayedMnemonic(KeyEvent.VK_ALL_CANDIDATES);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nome");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Microsoft Himalaya", Font.PLAIN, 30));
		lblNewLabel_1.setForeground(new Color(224, 255, 255));
		lblNewLabel_1.setBounds(47, 91, 60, 23);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Senha");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setForeground(new Color(224, 255, 255));
		lblNewLabel_1_1.setFont(new Font("Microsoft Himalaya", Font.PLAIN, 30));
		lblNewLabel_1_1.setBounds(47, 149, 60, 23);
		contentPane.add(lblNewLabel_1_1);
		
		textField = new JTextField();
		textField.setBounds(128, 92, 221, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Logar");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton.setForeground(new Color(0, 0, 128));
		btnNewButton.setBackground(new Color(176, 224, 230));
		btnNewButton.setBounds(410, 210, 85, 21);
		contentPane.add(btnNewButton);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(128, 150, 221, 19);
		contentPane.add(passwordField);
	}
	
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                TelaLogin tela = new TelaLogin();
                tela.setVisible(true);
            }
        });
}*/