package com.calculator;

import java.awt.*;
import java.awt.event.*;

public class Calculator implements ActionListener {
	Frame frm;
	
	Panel pnl;
	
	Label lno1,lno2,lans;
	TextField tno1,tno2,tans;
	Button btnadd,btnsub,btnmult,btndiv,btnreset,btnexit;
	
	public Calculator() {
		frm=new Frame("Basic Calculator");
		frm.setSize(400,400);
		frm.setVisible(true);
		
		pnl=new Panel();
		frm.add(pnl);
		
		GridLayout gl=new GridLayout(6, 2);
		pnl.setLayout(gl);
		
		lno1=new Label("Enter First Number : ");
		lno2=new Label("Enter second number : ");
		lans=new Label("Answer : ");
		
		tno1=new TextField();
		tno2=new TextField();
		tans=new TextField();
		
		btnadd=new Button("+");
		btnsub=new Button("-");
		btnmult=new Button("*");
		btndiv=new Button("/");
		btnreset=new Button("C");
		btnexit=new Button("Exit");
		
		
		pnl.add(lno1);
		pnl.add(tno1);
		pnl.add(lno2);
		pnl.add(tno2);
		pnl.add(lans);
		pnl.add(tans);
		
		pnl.add(btnadd);
		pnl.add(btnsub);
		pnl.add(btnmult);
		pnl.add(btndiv);
		pnl.add(btnreset);
		pnl.add(btnexit);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
