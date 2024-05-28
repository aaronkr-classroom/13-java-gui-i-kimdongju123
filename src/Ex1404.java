import javax.swing.*;
import java.awt.*;

public class Ex1404 extends JFrame {

	public Ex1404() {
		setTitle("계산기");
		setSize(300, 250);
		
		//제목 패널
		JPanel titlePanel = new JPanel();
		titlePanel.setBounds(0, 0, 300, 40);
		add(titlePanel);
		JLabel title = new JLabel("계산기",JLabel.CENTER);
		title.setFont(new Font("함초롬돋음",Font.BOLD, 20));
		titlePanel.add(title);
		
		//숫자 페널
		JPanel numPanel = new JPanel();
		numPanel.setBounds(0,40,300,40);
		//추가
		numPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		add(numPanel);
		JTextField num1 = new JTextField(5);
		numPanel.add(num1);
		JTextField num2 = new JTextField(5);	
		numPanel.add(num2);
		
		//버튼 페널
		JPanel btPanel = new JPanel();
		btPanel.setBounds(100,80,100,80);
		btPanel.setLayout(new GridLayout(2,2,10,5));
		add(btPanel);
		JButton plus = new JButton("+");
		btPanel.add(plus);
		JButton minus = new JButton("-");
		btPanel.add(minus);
		JButton multiply = new JButton("*");
		btPanel.add(multiply);
		JButton divide = new JButton("/");
		btPanel.add(divide);
		
		//결과 페널
		JPanel resultPanel = new JPanel();
		resultPanel.setBounds(0,160,300,40);
		add(resultPanel);
		JLabel lbl1 = new JLabel("결과값:");
		resultPanel.add(lbl1);
		JLabel lbl2 = new JLabel("");
		resultPanel.add(lbl2);
		
		//프레임 설정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new Ex1404 ();
		
	}

}
