package lab2semestr;

import java.awt.Graphics;

import javax.swing.JPanel;

public class lab5Panel extends JPanel {
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		lab5Minskovskogo.Draw(g, 150, 150, 600, 150, 7);
	}

}
