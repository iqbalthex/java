import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main implements ActionListener{
	private static JFrame window;
	private static Main listener;
	private static int gap = 10;

	public void actionPerformed(ActionEvent e){
		// fungsi ketika tombol diklik
		System.out.println("Kamu menekan tombol " + e.getActionCommand());
	}

	public static JButton add_button(String text, int row, int col, int w_ratio, int h_ratio){
		int x = (col * (50 + gap)) + gap;
		int y = (row * (50 + gap)) + gap;
		int w = (w_ratio * 50) + (gap * (w_ratio - 1));
		int h = (h_ratio * 50) + (gap * (h_ratio - 1));

		JButton b = new JButton(text);

		b.setBounds(x, y, w, h);
		b.addActionListener(listener);

		window.add(b);

		return b;
	}

	public static void main(String args[]){
		window = new JFrame("Kalkulator Sederhana");
		listener = new Main();

		// add_button(teks, baris, kolom, lebar, tinggi)
		add_button("hasil", 0, 0, 4, 1);

		add_button("7", 1, 0, 1, 1);
		add_button("8", 1, 1, 1, 1);
		add_button("9", 1, 2, 1, 1);
		add_button("/", 1, 3, 1, 1);

		add_button("4", 2, 0, 1, 1);
		add_button("5", 2, 1, 1, 1);
		add_button("6", 2, 2, 1, 1);
		add_button("*", 2, 3, 1, 1);

		add_button("1", 3, 0, 1, 1);
		add_button("2", 3, 1, 1, 1);
		add_button("3", 3, 2, 1, 1);
		add_button("-", 3, 3, 1, 1);

		add_button("0", 4, 0, 1, 1);
		add_button(".", 4, 1, 1, 1);
		add_button("=", 4, 2, 1, 1);
		add_button("+", 4, 3, 1, 1);

		// add_button("4", "5", "6", "*");
		// add_button("1", "2", "3", "-");

		window.setSize(280,350);
		window.setLayout(null);
		window.setVisible(true);
	}
}
