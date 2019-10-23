package lab2semestr;

import java.awt.Graphics;

public class lab5Minskovskogo {
	public static int Draw(Graphics g, int x1, int y1, int x2, int y2, int iter) { 
		if (iter == 0) {
			g.drawLine(x1, y1, x2, y2);
			return 0;
		}
		int x[] = new int[9];
		int y[] = new int[9];
		x[0] = x1;
		y[0] = y1;
		x[8] = x2;
		y[8] = y2;
 
		int d;
 
		if (y1 == y2) { 
			d = (x2 - x1) / 4;
			x[1] = x[2] = x[0] + d;
			x[3] = x[4] = x[5] = x[2] + d;
			x[6] = x[7] = x[3] + d;
			y[1] = y[4] = y[7] = y[0];
			y[2] = y[3] = y[0] - d;
			y[5] = y[6] = y[0] + d;
		} else {
			d = (y2 - y1) / 4;
			y[1] = y[2] = y[0] + d;
			y[3] = y[4] = y[5] = y[2] + d;
			y[6] = y[7] = y[3] + d;
			x[1] = x[4] = x[7] = x[0];
			x[2] = x[3] = x[0] + d;
			x[5] = x[6] = x[0] - d;
		}
 
		for (int i = 0; i < 8; i++) { 
			Draw(g, x[i], y[i], x[i + 1], y[i + 1], iter - 1);
		}
		return 0;
 
	}
}
