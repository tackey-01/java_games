package jp.co.game.ohtello;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class WindFrom extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WindFrom frame = new WindFrom();
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
	public WindFrom() {
		setTitle("OhtelloGame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 640, 640);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		addMouseListener(new MouseControl());

		JPanel text_panel = new JPanel();
		JLabel img_label = new JLabel();
		DrawCanvas dc = new DrawCanvas();

		img_label.setText("OhelloGame");
		text_panel.add(dc);

		Container contentPane = getContentPane();
		//System.out.println(contentPane.getColorModel());
	    //contentPane.add(text_panel, BorderLayout.LINE_START);
	    contentPane.add(dc);
	    setVisible(true);

	}

}
