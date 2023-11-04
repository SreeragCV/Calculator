import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;


public class Calculator implements ActionListener{
	
	boolean isOperatorClicked=false;

	JFrame jf;
	JLabel Displaylabel;
	JButton Sevenbutton, Eightbutton, Ninebutton;
	JButton Fourbutton, Fivebutton, Sixbutton;
	JButton Onebutton, Twobutton, Threebutton;
	JButton Dotbutton, Zerobutton, Equalbutton;
	JButton Divbutton, Multibutton, Minusbutton, Plusbutton, Clearbutton;
	String oldValue,newValue;
	String choice;
	
	
	Calculator(){
		
		jf=new JFrame("Calculator");
		jf.setLayout(null);
		jf.setSize(600,600);
		jf.setLocation(450, 100);
		jf.getContentPane().setBackground(Color.WHITE);
		
		Displaylabel=new JLabel();
		Displaylabel.setBounds(30, 50, 530, 45);
		Displaylabel.setFont(new Font("Comic",Font.ITALIC,18));
		Displaylabel.setBackground(Color.GRAY);
		Displaylabel.setForeground(Color.WHITE);
		Displaylabel.setOpaque(true);
		Displaylabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		Sevenbutton=new JButton("7");
		Sevenbutton.setBounds(30, 130, 80, 80);
		Sevenbutton.setFont(new Font("c",Font.HANGING_BASELINE, 22));
		Sevenbutton.addActionListener(this);
		jf.add(Sevenbutton);
		
		
		Eightbutton=new JButton("8");
		Eightbutton.setBounds(130, 130, 80, 80);
		Eightbutton.setFont(new Font("c",Font.HANGING_BASELINE, 22));
		Eightbutton.addActionListener(this);
		jf.add(Eightbutton);
		
		Ninebutton=new JButton("9");
		Ninebutton.setBounds(230, 130, 80, 80);
		Ninebutton.setFont(new Font("c",Font.HANGING_BASELINE, 22));
		Ninebutton.addActionListener(this);
		jf.add(Ninebutton);
		
		Fourbutton=new JButton("4");
		Fourbutton.setBounds(30, 230, 80, 80);
		Fourbutton.setFont(new Font("c",Font.HANGING_BASELINE, 22));
		Fourbutton.addActionListener(this);
		jf.add(Fourbutton);
		
		Fivebutton=new JButton("5");
		Fivebutton.setBounds(130, 230, 80, 80);
		Fivebutton.setFont(new Font("c",Font.HANGING_BASELINE, 22));
		Fivebutton.addActionListener(this);
		jf.add(Fivebutton);
		
		Sixbutton=new JButton("6");
		Sixbutton.setBounds(230, 230, 80, 80);
		Sixbutton.setFont(new Font("c",Font.HANGING_BASELINE, 22));
		Sixbutton.addActionListener(this);
		jf.add(Sixbutton);
		
		Onebutton=new JButton("1");
		Onebutton.setBounds(30, 330, 80, 80);
		Onebutton.setFont(new Font("c",Font.HANGING_BASELINE, 22));
		Onebutton.addActionListener(this);
		jf.add(Onebutton);
		
		Twobutton=new JButton("2");
		Twobutton.setBounds(130, 330, 80, 80);
		Twobutton.setFont(new Font("c",Font.HANGING_BASELINE, 22));
		Twobutton.addActionListener(this);
		jf.add(Twobutton);
		
		Threebutton=new JButton("3");
		Threebutton.setBounds(230, 330, 80, 80);
		Threebutton.setFont(new Font("c",Font.HANGING_BASELINE, 22));
		Threebutton.addActionListener(this);
		jf.add(Threebutton);
		
		Dotbutton=new JButton(".");
		Dotbutton.setBounds(40, 430, 60, 60);
		Dotbutton.setFont(new Font("c",Font.HANGING_BASELINE, 22));
		Dotbutton.addActionListener(this);
		jf.add(Dotbutton);
		
		Zerobutton=new JButton("0");
		Zerobutton.setBounds(130, 430, 80, 80);
		Zerobutton.setFont(new Font("c",Font.HANGING_BASELINE, 22));
		Zerobutton.addActionListener(this);
		jf.add(Zerobutton);
		
		Equalbutton=new JButton("=");
		Equalbutton.setBounds(240, 430, 60, 60);
		Equalbutton.setFont(new Font("c",Font.HANGING_BASELINE, 22));
		Equalbutton.addActionListener(this);
		jf.add(Equalbutton);
		
		Divbutton=new JButton("/");
		Divbutton.setBounds(330, 140, 60, 60);
		Divbutton.setFont(new Font("c",Font.HANGING_BASELINE, 22));
		Divbutton.addActionListener(this);
		jf.add(Divbutton);
		
		Multibutton=new JButton("*");
		Multibutton.setBounds(330, 240, 60, 60);
		Multibutton.setFont(new Font("c",Font.HANGING_BASELINE, 22));
		Multibutton.addActionListener(this);
		jf.add(Multibutton);
		
	    Minusbutton=new JButton("-");
		Minusbutton.setBounds(330, 340, 60, 60);
		Minusbutton.setFont(new Font("c",Font.HANGING_BASELINE, 22));
		Minusbutton.addActionListener(this);
		jf.add(Minusbutton);
		
		Plusbutton=new JButton("+");
		Plusbutton.setBounds(330, 430, 60, 60);
		Plusbutton.setFont(new Font("c",Font.HANGING_BASELINE, 22));
		Plusbutton.addActionListener(this);
		jf.add(Plusbutton);
		
	    Clearbutton=new JButton("CLEAR");
		Clearbutton.setBounds(440, 130, 80, 360);
		Plusbutton.setFont(new Font("c",Font.HANGING_BASELINE, 22));
		Clearbutton.addActionListener(this);
		jf.add(Clearbutton);
		
		
		
		jf.add(Displaylabel);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		
		new Calculator();		
		
		}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==Sevenbutton) {
			
			if(isOperatorClicked) {
				Displaylabel.setText("7");
				isOperatorClicked=false;
			}else{Displaylabel.setText(Displaylabel.getText()+"7");}
			
		}else if(e.getSource()==Eightbutton) {
			if(isOperatorClicked) {
				Displaylabel.setText("8");
				isOperatorClicked=false;
			}else{Displaylabel.setText(Displaylabel.getText()+"8");}
		
		}else if(e.getSource()==Ninebutton) {
			if(isOperatorClicked) {
				Displaylabel.setText("9");
				isOperatorClicked=false;
			}else{Displaylabel.setText(Displaylabel.getText()+"9");}
		
		}else if(e.getSource()==Fourbutton) {
			if(isOperatorClicked) {
				Displaylabel.setText("4");
				isOperatorClicked=false;
			}else{Displaylabel.setText(Displaylabel.getText()+"4");}
		
		}else if(e.getSource()==Fivebutton) {
			if(isOperatorClicked) {
				Displaylabel.setText("5");
				isOperatorClicked=false;
			}else{Displaylabel.setText(Displaylabel.getText()+"5");}		
		
		}else if(e.getSource()==Sixbutton) {
			if(isOperatorClicked) {
				Displaylabel.setText("6");
				isOperatorClicked=false;
			}else{Displaylabel.setText(Displaylabel.getText()+"6");}
		
		}else if(e.getSource()==Onebutton) {
			if(isOperatorClicked) {
				Displaylabel.setText("1");
				isOperatorClicked=false;
			}else{Displaylabel.setText(Displaylabel.getText()+"1");}
		
		}else if(e.getSource()==Twobutton) {
			if(isOperatorClicked) {
				Displaylabel.setText("2");
				isOperatorClicked=false;
			}else{Displaylabel.setText(Displaylabel.getText()+"2");}
		
		}else if(e.getSource()==Threebutton) {
			if(isOperatorClicked) {
				Displaylabel.setText("3");
				isOperatorClicked=false;
			}else{Displaylabel.setText(Displaylabel.getText()+"3");}
	    
		}else if(e.getSource()==Dotbutton) {
			if(isOperatorClicked) {
				Displaylabel.setText(".");
				isOperatorClicked=false;
			}else{Displaylabel.setText(Displaylabel.getText()+".");}
	    
		}else if(e.getSource()==Zerobutton) {
			if(isOperatorClicked) {
				Displaylabel.setText("0");
				isOperatorClicked=false;
			}else{Displaylabel.setText(Displaylabel.getText()+"0");}
	    
		}else if(e.getSource()==Equalbutton) {
		   
			String newValue=Displaylabel.getText();
			
			float oldValueF=Float.parseFloat(oldValue);
			float newValueF=Float.parseFloat(newValue);
			
			if(choice=="/"){
				
			float result=oldValueF/newValueF;
			Displaylabel.setText(result+"");	
			
			}else if(choice=="*") {
				
				float result=oldValueF*newValueF;
				Displaylabel.setText(result+"");
			
			}else if(choice=="+") {
				
				float result=oldValueF+newValueF;
				Displaylabel.setText(result+"");
			
			}else if(choice=="-"){
				
				float result=oldValueF-newValueF;
				Displaylabel.setText(result+"");
				
			}
		    
	    }else if(e.getSource()==Divbutton) {
			isOperatorClicked=true;
			choice="/";
			oldValue=Displaylabel.getText();
	    }else if(e.getSource()==Multibutton) {
	    	isOperatorClicked=true;
	    	choice="*";
			oldValue=Displaylabel.getText();
	    }else if(e.getSource()==Minusbutton) {
	    	isOperatorClicked=true;
	    	choice="-";
			oldValue=Displaylabel.getText();
	    }else if(e.getSource()==Plusbutton) {
	    	isOperatorClicked=true;
	    	choice="+";
			oldValue=Displaylabel.getText();
	    }else if(e.getSource()==Clearbutton) {
			Displaylabel.setText("");	
	    }
	
	   }
	}
		
		
				
			
		
	
	
	
	

