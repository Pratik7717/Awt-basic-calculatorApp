package com.calculator;

import java.awt.*;

public class Calculator {
	Frame frm;
	
	Panel pnl;
	
	Label lno1,lno2,lans;
	TextField tno1,tno2,tans;
	Button btnadd,btnsub,btnmult,btndiv,btnreset,btnexit;
	
	public Calculator() {
		frm=new Frame("Basic Calculator");
		frm.setSize(400,400);
		frm.setVisible(true);
	}
}
