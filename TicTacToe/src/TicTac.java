import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class TicTac {

	private JFrame frame;
	int clicked = 0;
	boolean btn00Flag = true;
	boolean btn01Flag = true;
	boolean btn02Flag = true;
	boolean btn10Flag = true;
	boolean btn11Flag = true;
	boolean btn12Flag = true;
	boolean btn20Flag = true;
	boolean btn21Flag = true;
	boolean btn22Flag = true;
	
	int n = 3;
	int[][] mat = new int[n][n];
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TicTac window = new TicTac();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TicTac() {
		
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		for(int i=0;i<n;i++){
		       for(int j=0;j<n;j++){
		           mat[i][j] = -1;
		       }
		}
		
		
		frame = new JFrame();
		frame.setBounds(100, 100, 550, 550);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btn00 = new JButton("");
		btn00.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(btn00Flag) {
					clicked++;
					mat[0][0] = clicked%2;
					if(clicked%2==0) {
						btn00.setLabel("O");
					} else {
						btn00.setLabel("X");
					}
					btn00.setEnabled(false);
					btn00Flag = false;
					checkWinner();
				}
			}
		});
		btn00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn00.setFont(new Font("Tahoma", Font.PLAIN, 99));
		btn00.setBounds(9, 3, 165, 166);
		frame.getContentPane().add(btn00);
		
		JButton btn01 = new JButton("");
		btn01.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(btn01Flag) {
					clicked++;
					mat[0][1] = clicked%2;
					if(clicked%2==0) {
						btn01.setLabel("O");
					} else {
						btn01.setLabel("X");
					}
					btn01.setEnabled(false);
					btn01Flag = false;
					checkWinner();
				}
			}
		});
		btn01.setFont(new Font("Tahoma", Font.PLAIN, 99));
		btn01.setBounds(183, 3, 166, 166);
		frame.getContentPane().add(btn01);
		
		JButton btn02 = new JButton("");
		btn02.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(btn02Flag) {
					clicked++;
					mat[0][2] = clicked%2;
					if(clicked%2==0) {
						btn02.setLabel("O");
					} else {
						btn02.setLabel("X");
					}
					btn02.setEnabled(false);
					btn02Flag = false;
					checkWinner();
				}
			}
		});
		btn02.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn02.setFont(new Font("Tahoma", Font.PLAIN, 99));
		btn02.setBounds(358, 3, 166, 166);
		frame.getContentPane().add(btn02);
		
		JButton btn10 = new JButton("");
		btn10.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(btn10Flag) {
					clicked++;
					mat[1][0] = clicked%2;
					if(clicked%2==0) {
						btn10.setLabel("O");
					} else {
						btn10.setLabel("X");
					}
					btn10.setEnabled(false);
					btn10Flag = false;
					checkWinner();
				}
			}
		});
		btn10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn10.setFont(new Font("Tahoma", Font.PLAIN, 99));
		btn10.setBounds(9, 172, 166, 166);
		frame.getContentPane().add(btn10);
		
		JButton btn11 = new JButton("");
		btn11.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(btn11Flag) {
					clicked++;
					mat[1][1] = clicked%2;
					if(clicked%2==0) {
						btn11.setLabel("O");
					} else {
						btn11.setLabel("X");
					}
					btn11.setEnabled(false);
					btn11Flag = false;
					checkWinner();
				}
			}
		});
		btn11.setFont(new Font("Tahoma", Font.PLAIN, 99));
		btn11.setBounds(184, 172, 166, 166);
		frame.getContentPane().add(btn11);
		
		JButton btn12 = new JButton("");
		btn12.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(btn12Flag) {
					clicked++;
					mat[1][2] = clicked%2;
					if(clicked%2==0) {
						btn12.setLabel("O");
					} else {
						btn12.setLabel("X");
					}
					btn12.setEnabled(false);
					btn12Flag = false;
					checkWinner();
				}
			}
		});
		btn12.setFont(new Font("Tahoma", Font.PLAIN, 99));
		btn12.setBounds(359, 172, 166, 166);
		frame.getContentPane().add(btn12);
		
		JButton btn20 = new JButton("");
		btn20.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(btn20Flag) {
					clicked++;
					mat[2][0] = clicked%2;
					if(clicked%2==0) {
						btn20.setLabel("O");
					} else {
						btn20.setLabel("X");
					}
					btn20.setEnabled(false);
					btn20Flag = false;
					checkWinner();
				}
			}
		});
		btn20.setFont(new Font("Tahoma", Font.PLAIN, 99));
		btn20.setBounds(9, 341, 166, 166);
		frame.getContentPane().add(btn20);
		
		JButton btn21 = new JButton("");
		btn21.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(btn21Flag) {
					clicked++;
					mat[2][1] = clicked%2;
					if(clicked%2==0) {
						btn21.setLabel("O");
					} else {
						btn21.setLabel("X");
					}
					btn21.setEnabled(false);
					btn21Flag = false;
					checkWinner();
				}
			}
		});
		btn21.setFont(new Font("Tahoma", Font.PLAIN, 99));
		btn21.setBounds(184, 341, 166, 166);
		frame.getContentPane().add(btn21);
		
		JButton btn22 = new JButton("");
		btn22.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(btn22Flag) {
					clicked++;
					mat[2][2] = clicked%2;
					if(clicked%2==0) {
						btn22.setLabel("O");
					} else {
						btn22.setLabel("X");
					}
					btn22.setEnabled(false);
					btn22Flag = false;
					checkWinner();
				}
			}
		});
		btn22.setFont(new Font("Tahoma", Font.PLAIN, 99));
		btn22.setBounds(359, 341, 166, 166);
		frame.getContentPane().add(btn22);
	}

	private void printMat() {
		for(int i=0;i<n;i++){
	       for(int j=0;j<n;j++){
	           System.out.print(mat[i][j]+" ");
	       }
	       System.out.println();
		}
		 System.out.println();
	}
	
	void checkWinner() {
		printMat();
//		Check Vertical 
		if(mat[0][0]==mat[1][0] && mat[0][0]==mat[2][0] && mat[0][0]!=-1) {
			String value = (mat[0][0]==1 ? "X" : "O");
			JOptionPane.showMessageDialog(frame, value + " Is the Winner");
		}
		else if(mat[0][1]==mat[1][1] && mat[0][1]==mat[2][1] && mat[0][1]!=-1){
			String value = (mat[0][1]==1 ? "X" : "O");
			JOptionPane.showMessageDialog(frame, value + " Is the Winner");
		}
		else if(mat[0][2]==mat[1][2] && mat[0][2]==mat[2][2] && mat[0][2]!=-1){
			String value = (mat[0][2]==1 ? "X" : "O");
			JOptionPane.showMessageDialog(frame, value + " Is the Winner");
		}
//		Check Horizontal
		else if(mat[0][0]==mat[0][1] && mat[0][0]==mat[0][2] && mat[0][0]!=-1){
			String value = (mat[0][0]==1 ? "X" : "O");
			JOptionPane.showMessageDialog(frame, value + " Is the Winner");
		}
		else if(mat[1][0]==mat[1][1] && mat[1][0]==mat[1][2] && mat[1][0]!=-1){
			String value = (mat[1][0]==1 ? "X" : "O");
			JOptionPane.showMessageDialog(frame, value + " Is the Winner");
		}
		else if(mat[2][0]==mat[2][1] && mat[2][0]==mat[2][2] && mat[2][0]!=-1){
			String value = (mat[2][0]==1 ? "X" : "O");
			JOptionPane.showMessageDialog(frame, value + " Is the Winner");
		}
//		Check Diagonal
		else if(mat[0][0]==mat[1][1] && mat[0][0]==mat[2][2] && mat[0][0]!=-1){
			String value = (mat[0][0]==1 ? "X" : "O");
			JOptionPane.showMessageDialog(frame, value + " Is the Winner");
		}
		else if(mat[0][2]==mat[1][1] && mat[1][1]==mat[2][0] && mat[0][2]!=-1){
			String value = (mat[0][2]==1 ? "X" : "O");
			JOptionPane.showMessageDialog(frame, value + " Is the Winner");
		}
		
		if(clicked == 9) {
			JOptionPane.showMessageDialog(frame, "Match Draw");
		}
		
	}
}
