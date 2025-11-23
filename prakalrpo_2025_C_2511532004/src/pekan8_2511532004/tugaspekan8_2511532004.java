package pekan8_2511532004;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class tugaspekan8_2511532004 extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtbil1;
	private JTextField txtbil2;
	private JTextField txthasil;

	private void pesanperingatan(String pesan) {
		JOptionPane.showMessageDialog(this, pesan, "peringatan", JOptionPane.WARNING_MESSAGE);
	}

	private void pesanerror(String pesan) {
		JOptionPane.showMessageDialog(this, pesan, "kesalahan", JOptionPane.ERROR_MESSAGE);
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tugaspekan8_2511532004 frame = new tugaspekan8_2511532004();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public tugaspekan8_2511532004() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 373, 373);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Operator Relasional");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setBounds(87, 10, 203, 31);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Bilangan 1");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(28, 61, 73, 20);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_1_1 = new JLabel("Bilangan 2");
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel_1_1.setBounds(28, 91, 123, 20);
		contentPane.add(lblNewLabel_1_1);

		JLabel lblNewLabel_1_1_1 = new JLabel("Operator");
		lblNewLabel_1_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel_1_1_1.setBounds(28, 138, 73, 20);
		contentPane.add(lblNewLabel_1_1_1);

		JLabel lblNewLabel_1_1_1_1 = new JLabel("hasil");
		lblNewLabel_1_1_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel_1_1_1_1.setBounds(28, 197, 57, 20);
		contentPane.add(lblNewLabel_1_1_1_1);

		txtbil1 = new JTextField();
		txtbil1.setBounds(111, 63, 57, 18);
		contentPane.add(txtbil1);
		txtbil1.setColumns(10);

		txtbil2 = new JTextField();
		txtbil2.setColumns(10);
		txtbil2.setBounds(111, 93, 57, 18);
		contentPane.add(txtbil2);

		txthasil = new JTextField();
		txthasil.setColumns(10);
		txthasil.setBounds(111, 199, 57, 18);
		contentPane.add(txthasil);

		JComboBox cboperator = new JComboBox();
		cboperator.setModel(new DefaultComboBoxModel(new String[] { "==", "!=", "<", ">", "<=", ">=" }));
		cboperator.setBounds(111, 139, 46, 20);
		contentPane.add(cboperator);

		JButton proses = new JButton("process");
		proses.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtbil1.getText().trim().isEmpty()) {
					pesanperingatan("Bilangan Harus diisi");
				} else if (txtbil2.getText().trim().isEmpty()) {
					pesanperingatan("Bilangan 2 Harus diisi");
				} else {
					try {
						int a = Integer.valueOf(txtbil1.getText());
						int b = Integer.valueOf(txtbil2.getText());
						int c = cboperator.getSelectedIndex();
						String hasil;
						if (c == 0) {
							hasil = String.valueOf(a == b);
						} else if (c == 1) {
							hasil = String.valueOf(a != b);
						} else if (c == 2) {
							hasil = String.valueOf(a < b);
						} else if (c == 3) {
							hasil = String.valueOf(a > b);
						} else if (c == 4) {
							hasil = String.valueOf(a <= b);
						} else {
							hasil = String.valueOf(a >= b);
						}
						txthasil.setText(hasil);

					} catch (NumberFormatException ex) {
						pesanerror("bilangan 1 dan bilangan 2 harus angka");
					}
				}
			}
		});
		proses.setBounds(209, 139, 81, 20);
		contentPane.add(proses);
	}
}
