package jp.co.game.ohtello;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageProducer;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class DrawCanvas extends JPanel{

	public Image img = null;
	public JLabel label = new JLabel();

	public DrawCanvas() {
		 URL url=this.getClass().getClassLoader().
			     getResource("board.png");
		 System.out.print(url);
		 try {
			 img=this.createImage((ImageProducer)url.getContent());
			 label.setIcon(new ImageIcon(img));
		 }catch(Exception e){ }


	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		//画像の表示
		g.drawImage(img, 0, 0, this);
		//g.drawImage(img, 0, 0, 120, 90, this);
	}

	public void RemoveCanvas() {

	}

}
