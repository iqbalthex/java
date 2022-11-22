import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main implements ActionListener{
	private static JButton btn_0, btn_1, btn_2, btn_3, btn_4, btn_5, btn_6, btn_7, btn_8, btn_9,
	btn_add, btn_sub, btn_mul, btn_div, btn_dot, btn_equ, btn_clr, btn_exit, btn_res;
	private static String opr = "_";
	private static float num1 = 0, num2 = 0, num3;

	public void actionPerformed(ActionEvent e){
		// isi tombol
		String t = e.getActionCommand();
		char t0 = t.charAt(0);
		String cont = btn_res.getText();

		if(t0 >= '0' && t0 <= '9'){
			cont += t;
			btn_res.setText(cont);
		} else if(t0 == '+' || t0 == '-' || t0 == '*' || t0 == '/'){
			if(opr == ""){
				opr = t;
				num1 = Float.parseFloat(cont);
			} else {
				num2 = Float.parseFloat(cont);
			}
		} else if(t0 == '='){
			btn_res.setText("");
			if(opr.equals("+")){
				num3 = num1 + num2;
			} else if(opr == "-"){
				num3 = num1 - num2;
			} else if(opr == "*"){
				num3 = num1 * num2;
			} else if(opr == "/"){
				num3 = num1 / num2;
			}
		}

		System.out.println(num1 + " " + opr + " " + num2 + " = " + num3);
	}

	public static void main(String args[]){
		// membuat window utama (wadah tombol-tombol kalkulator)
		JFrame window = new JFrame("Kalkulator Sederhana");

		// objek agar tombol melakukan sesuatu ketik diklik
		Main listener = new Main();

		// membuat tombol-tombol kalkulator
		btn_0 = new JButton("0");
		btn_1 = new JButton("1");
		btn_2 = new JButton("2");
		btn_3 = new JButton("3");
		btn_4 = new JButton("4");
		btn_5 = new JButton("5");
		btn_6 = new JButton("6");
		btn_7 = new JButton("7");
		btn_8 = new JButton("8");
		btn_9 = new JButton("9");
		btn_res = new JButton();
		btn_add = new JButton("+");
		btn_sub = new JButton("-");
		btn_mul = new JButton("*");
		btn_div = new JButton("/");
		btn_equ = new JButton("=");
		btn_dot = new JButton(".");
		btn_clr = new JButton("C");
		btn_exit = new JButton("X");

		// setBounds(x, y, w, h);
		// mengatur tombol (posisi_x, posisi_y, lebar, tinggi)
		btn_res.setBounds(20, 20, 290, 40);
		btn_7.setBounds(20, 70, 50, 40); btn_8.setBounds(80, 70, 50, 40); btn_9.setBounds(140, 70, 50, 40); btn_div.setBounds(200, 70, 50, 40); btn_exit.setBounds(260, 70, 50,40);
		btn_4.setBounds(20, 120, 50, 40); btn_5.setBounds(80, 120, 50, 40); btn_6.setBounds(140, 120, 50, 40); btn_mul.setBounds(200, 120, 50, 40); btn_clr.setBounds(260, 120, 50, 40);
		btn_1.setBounds(20, 170, 50, 40); btn_2.setBounds(80, 170, 50, 40); btn_3.setBounds(140, 170, 50, 40); btn_sub.setBounds(200, 170, 50, 40); btn_equ.setBounds(260, 170, 50, 90);
		btn_0.setBounds(20, 220, 110, 40); btn_dot.setBounds(140, 220, 50, 40); btn_add.setBounds(200, 220, 50, 40);

		btn_0.addActionListener(listener);
		btn_1.addActionListener(listener);
		btn_2.addActionListener(listener);
		btn_3.addActionListener(listener);
		btn_4.addActionListener(listener);
		btn_5.addActionListener(listener);
		btn_6.addActionListener(listener);
		btn_7.addActionListener(listener);
		btn_8.addActionListener(listener);
		btn_9.addActionListener(listener);
		btn_add.addActionListener(listener);
		btn_sub.addActionListener(listener);
		btn_mul.addActionListener(listener);
		btn_div.addActionListener(listener);
		btn_equ.addActionListener(listener);
		btn_dot.addActionListener(listener);
		btn_clr.addActionListener(listener);
		// btn_exit.addActionListener(listener);

		// menambahkan tombol ke window utama
		window.add(btn_res);
		window.add(btn_7);
		window.add(btn_8);
		window.add(btn_9);
		window.add(btn_4);
		window.add(btn_5);
		window.add(btn_6);
		window.add(btn_3);
		window.add(btn_2);
		window.add(btn_1);
		window.add(btn_0);
		window.add(btn_dot);
		window.add(btn_add);
		window.add(btn_sub);
		window.add(btn_mul);
		window.add(btn_div);
		window.add(btn_equ);
		window.add(btn_clr);
		window.add(btn_exit);

		window.setSize(350,350);
		window.setLayout(null);
		window.setVisible(true);
	}
}
