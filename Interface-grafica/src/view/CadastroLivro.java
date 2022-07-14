package view;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import javax.swing.JTextField;



public class CadastroLivro {

	private JFrame frmLivrariaHiro;
	private JTextField caixaLivro;
	private JTextField caixaAutor;
	private JTextField caixaEditora;
	private JTextField caixaPaginas;
	private JTextField caixaPublicacao;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JSeparator separator_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroLivro window = new CadastroLivro();
					window.frmLivrariaHiro.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public CadastroLivro() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLivrariaHiro = new JFrame();
		frmLivrariaHiro.setBackground(new Color(255, 255, 255));
		frmLivrariaHiro.setAlwaysOnTop(true);
		frmLivrariaHiro.setFont(new Font("Century Schoolbook", Font.BOLD, 16));
		frmLivrariaHiro.setTitle("Livraria Hiro");
		frmLivrariaHiro.setIconImage(Toolkit.getDefaultToolkit().getImage(CadastroLivro.class.getResource("/images/anya.jpg")));
		frmLivrariaHiro.getContentPane().setBackground(new Color(255, 228, 225));
		frmLivrariaHiro.setBounds(100, 100, 649, 505);
		frmLivrariaHiro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLivrariaHiro.getContentPane().setLayout(null);
		
		JButton botaoLogin = new JButton("Cadastrar");
		botaoLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(botaoLogin, "Livro cadastrado com sucesso!!");
			}
		});
		botaoLogin.setFont(new Font("Gadugi", Font.BOLD, 14));
		botaoLogin.setBounds(71, 297, 106, 23);
		frmLivrariaHiro.getContentPane().add(botaoLogin);
		
		caixaLivro = new JTextField();
		caixaLivro.setBounds(82, 89, 181, 20);
		frmLivrariaHiro.getContentPane().add(caixaLivro);
		caixaLivro.setColumns(10);
		
		caixaAutor = new JTextField();
		caixaAutor.setBounds(92, 120, 166, 20);
		frmLivrariaHiro.getContentPane().add(caixaAutor);
		caixaAutor.setColumns(10);
		
		caixaEditora = new JTextField();
		caixaEditora.setBounds(102, 151, 96, 20);
		frmLivrariaHiro.getContentPane().add(caixaEditora);
		caixaEditora.setColumns(10);
		
		caixaPaginas = new JTextField();
		caixaPaginas.setBounds(101, 192, 45, 20);
		frmLivrariaHiro.getContentPane().add(caixaPaginas);
		caixaPaginas.setColumns(10);
		
		caixaPublicacao = new JTextField();
		caixaPublicacao.setBounds(119, 234, 45, 20);
		frmLivrariaHiro.getContentPane().add(caixaPublicacao);
		caixaPublicacao.setColumns(10);
		
		lblNewLabel = new JLabel("Livro:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel.setBounds(28, 86, 62, 20);
		frmLivrariaHiro.getContentPane().add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Autor:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setBounds(28, 120, 67, 14);
		frmLivrariaHiro.getContentPane().add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Editora:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2.setBounds(28, 152, 65, 20);
		frmLivrariaHiro.getContentPane().add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("P\u00E1ginas:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_3.setBounds(28, 190, 76, 20);
		frmLivrariaHiro.getContentPane().add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("Publica\u00E7\u00E3o");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_4.setBounds(30, 235, 115, 14);
		frmLivrariaHiro.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setIcon(new ImageIcon(CadastroLivro.class.getResource("/images/hirolib.jpg")));
		lblNewLabel_5.setBounds(268, 3, 367, 317);
		frmLivrariaHiro.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Bem-vindo, ");
		lblNewLabel_6.setFont(new Font("Book Antiqua", Font.PLAIN, 36));
		lblNewLabel_6.setBounds(58, 3, 292, 65);
		frmLivrariaHiro.getContentPane().add(lblNewLabel_6);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 61, 270, 34);
		frmLivrariaHiro.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(0, 286, 263, 34);
		frmLivrariaHiro.getContentPane().add(separator_1);
		
		JButton botaoVisualizar = new JButton("Visualizar"); //botao visualizar
		botaoVisualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 boolean continueLoop = true;
				 String qtdPaginas = caixaPaginas.getText();
				 String anoPublicacao = caixaPublicacao.getText();					
				 String nomeLivro = caixaLivro.getText();
				 String nomeAutor = caixaAutor.getText();
				 String editora = caixaEditora.getText();
				 
				 if(continueLoop==true) {
						JOptionPane.showMessageDialog(botaoVisualizar,  "O livro cadastrado foi " +nomeLivro  + " do autor(a) " +nomeAutor + " e da Editora " + editora + " tem " + qtdPaginas + " páginas e foi publicado em " + anoPublicacao, null, JOptionPane.INFORMATION_MESSAGE);
				 } else {
					 JOptionPane.showMessageDialog(botaoVisualizar, "Ops!! Ocorreu um erro", null, JOptionPane.ERROR_MESSAGE);
				 }
				 
				 try {
					 Integer.valueOf(caixaPaginas.getText());	  
					 continueLoop=false;
				 } catch (NumberFormatException e1) {
					 e1.printStackTrace();
					 JOptionPane.showMessageDialog(caixaPaginas, "Você tentou algo inválido e gerou uma exception na qtd de Páginas: "+ e1 +" \n Digite um valor INTEIRO válido!! ", null, JOptionPane.ERROR_MESSAGE); 
				 } 
				 try {
					 Integer.valueOf(caixaPublicacao.getText());
					 
				 } catch (NumberFormatException e2) {
					 e2.printStackTrace();
					
					 JOptionPane.showMessageDialog(caixaPublicacao, "Você tentou algo inválido e gerou uma exception na Publicacao: "+ e2 + "\n Digite um valor INTEIRO válido!!", null, JOptionPane.ERROR_MESSAGE);
				 }
				finally {
	   					JOptionPane.showMessageDialog(botaoVisualizar, "O Finally foi executado com sucesso!", null, JOptionPane.INFORMATION_MESSAGE);
	      			 }  			 
				 	while(continueLoop);

	      			} 
			;}); 
		botaoVisualizar.setFont(new Font("Tahoma", Font.BOLD, 14));
		botaoVisualizar.setBounds(58, 378, 536, 23);
		frmLivrariaHiro.getContentPane().add(botaoVisualizar);
		
		JLabel lblNewLabel_7 = new JLabel("Para visualizar o livro cadastrado basta clicar no bot\u00E3o a seguir: ");
		lblNewLabel_7.setFont(new Font("Century Gothic", Font.BOLD, 16));
		lblNewLabel_7.setBounds(28, 342, 506, 14);
		frmLivrariaHiro.getContentPane().add(lblNewLabel_7);
		
		JButton botaoSair = new JButton("SAIR");
		botaoSair.setBackground(new Color(255, 204, 153));
		botaoSair.setForeground(new Color(255, 99, 71));
		botaoSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		botaoSair.setFont(new Font("Gadugi", Font.BOLD, 14));
		botaoSair.setBounds(536, 434, 89, 23);
		frmLivrariaHiro.getContentPane().add(botaoSair);
		
		separator_2 = new JSeparator();
		separator_2.setBounds(0, 412, 635, 56);
		frmLivrariaHiro.getContentPane().add(separator_2);
	}
}
