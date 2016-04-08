//simple java calculator by Sajjad GHani
//email: sg786@msn.com
//phone: 0092-300-5303696
//MADE IN PAKISTAN


import java.awt.*;
import java.awt.event.*;

public class my_calculator5
{

	Font Bold=new Font("Helvetica", Font.BOLD, 20);
	Label  lcdDisplay = new Label("0",Label.RIGHT);
	Label  leftlcdDisplay = new Label("",Label.RIGHT);
	Label  rightlcdDisplay = new Label("",Label.RIGHT);
	Button mem_recall=new Button("MR");
	Button mem_clear=new Button("MC");
	public void map_calculator()
		{

		event_handler e1=new event_handler();

		Frame calc=new Frame("My Calculator :Beta version 5");
		calc.setResizable(false);
		calc.setSize(450,360);
		calc.setBackground(Color.gray);
		calc.setLayout(null);

		//lcdDisplay.setEditable(false);not used for label
        lcdDisplay.setBounds(68,58,320,30);
		lcdDisplay.setFont(new Font("Helvetica", Font.PLAIN, 20));
		lcdDisplay.setForeground(Color.orange);
		lcdDisplay.setBackground(Color.black);
		calc.add(lcdDisplay);

		rightlcdDisplay.setBounds(388,58,30,30);
		rightlcdDisplay.setFont(new Font("Helvetica", Font.PLAIN, 20));
		rightlcdDisplay.setForeground(Color.green);
		rightlcdDisplay.setBackground(Color.black);
		calc.add(rightlcdDisplay);
		//adding button 1 to 0

		Button mplus=new Button("M+");
		mplus.setBounds(72,96,60,34);
		mplus.setBackground(Color.black);
		mplus.setForeground(Color.red);
		mplus.setFont(Bold);
		mplus.addActionListener(e1);
		calc.add(mplus);


		mem_clear.setEnabled(false);
		mem_clear.setBounds(136,96,60,34);
		mem_clear.setBackground(Color.black);
		mem_clear.setForeground(Color.red);
		mem_clear.setFont(Bold);
		mem_clear.addActionListener(e1);
		calc.add(mem_clear);


		mem_recall.setBounds(200,96,60,34);
		mem_recall.setBackground(Color.black);
		mem_recall.setForeground(Color.red);
		mem_recall.setFont(Bold);
		mem_recall.addActionListener(e1);
		mem_recall.setEnabled(false);
		calc.add(mem_recall);


		Button one=new Button("1");
		one.setBounds(72,134,60,34);
		one.setBackground(Color.orange);
		one.setFont(Bold);
		one.addActionListener(e1);
		calc.add(one);

		Button two=new Button("2");
		two.addActionListener(e1);
		two.setBackground(Color.orange);
		two.setBounds(136,134,60,34);
		two.setFont(Bold);
		calc.add(two);

		Button three=new Button("3");
		three.addActionListener(e1);
		three.setBackground(Color.orange);
		three.setBounds(200,134,60,34);
		three.setFont(Bold);
		calc.add(three);

		Button four=new Button("4");
		four.setBackground(Color.orange);
		four.addActionListener(e1);
		four.setFont(Bold);
		four.setBounds(72,172,60,34);
		calc.add(four);

		Button five=new Button("5");
		five.setBackground(Color.orange);
		five.addActionListener(e1);
		five.setFont(Bold);
		five.setBounds(136,172,60,34);
		calc.add(five);

		Button six=new Button("6");
		six.setBackground(Color.orange);
		six.addActionListener(e1);
		six.setFont(Bold);
		six.setBounds(200,172,60,34);
		calc.add(six);

		Button seven=new Button("7");
		seven.setBackground(Color.orange);
		seven.addActionListener(e1);
		seven.setFont(Bold);
		seven.setBounds(72,210,60,34);
		calc.add(seven);

		Button eight=new Button("8");
		eight.setBackground(Color.orange);
		eight.addActionListener(e1);
		eight.setFont(Bold);
		eight.setBounds(136,210,60,34);
		calc.add(eight);

		Button nine=new Button("9");
		nine.setBackground(Color.orange);
		nine.addActionListener(e1);
		nine.setFont(Bold);
		nine.setBounds(200,210,60,34);
		calc.add(nine);

		Button zero=new Button("0");
		zero.setBackground(Color.orange);
		zero.addActionListener(e1);
		zero.setFont(Bold);
		zero.setBounds(136,248,60,34);
		calc.add(zero);

		//operation buttons

			Button buttonDivide    = new Button("/");
			buttonDivide.setBackground(Color.blue);
			buttonDivide.addActionListener(e1);
			buttonDivide .setBounds(264,134,60,34);
			buttonDivide .setForeground(Color.white);
			buttonDivide .setFont(Bold);
			calc.add(buttonDivide);

			Button buttonMultiply = new Button("X");
			buttonMultiply.setBackground(Color.blue);
			buttonMultiply.addActionListener(e1);
			buttonMultiply.setBounds(264,172,60,34);
			buttonMultiply.setForeground(Color.white);
			buttonMultiply.setFont(Bold);
			calc.add(buttonMultiply);

			Button buttonMinus    = new Button("-");
			buttonMinus.setBackground(Color.blue);
			buttonMinus.addActionListener(e1);
			buttonMinus.setBounds(264,210,60,34);
			buttonMinus.setForeground(Color.white);
			buttonMinus.setFont(Bold);
			calc.add(buttonMinus);

			Button buttonPlus= new Button("+");
			buttonPlus.setBackground(Color.blue);
			buttonPlus.addActionListener(e1);
			buttonPlus.setBounds(264,248,60,34);
			buttonPlus.setForeground(Color.white);
			buttonPlus.setFont(Bold);
			calc.add(buttonPlus);

			Button buttonPoint= new Button(".");
			buttonPoint.setBackground(Color.blue);
			buttonPoint.addActionListener(e1);
			buttonPoint.setBounds(200,248,60,34);
			buttonPoint.setForeground(Color.white);
			buttonPoint.setFont(Bold);
			calc.add(buttonPoint);

			Button buttonplusminus  = new Button("+/-");
			buttonplusminus .setBackground(Color.blue);
			buttonplusminus.addActionListener(e1);
			buttonplusminus.setBounds(72,248,60,34);
			buttonplusminus.setForeground(Color.white);
			buttonplusminus.setFont(Bold);
			calc.add(buttonplusminus);

			Button clear = new Button("C");
			clear.setBackground(Color.red);
			clear.addActionListener(e1);
			clear.setBounds(328,134,60,34);
			clear.setForeground(Color.white);
			clear.setFont(Bold);
			calc.add(clear);

			Button percent = new Button("%");
			percent.setBackground(Color.blue);
			percent.addActionListener(e1);
			percent.setBounds(328,172,60,34);
			percent.setForeground(Color.white);
			percent.setFont(Bold);
			calc.add(percent);

			Button oneoverx = new Button("1/x");
			oneoverx.setBackground(Color.blue);
			oneoverx.addActionListener(e1);
			oneoverx .setBounds(328,210,60,34);
			oneoverx .setForeground(Color.white);
			oneoverx .setFont(Bold);
			calc.add(oneoverx);

			Button buttonequal = new Button("=");
			buttonequal.setBackground(Color.green);
			buttonequal.addActionListener(e1);
			buttonequal.setBounds(328,248,60,34);
			buttonequal.setForeground(Color.red);
			buttonequal.setFont(Bold);
			calc.add(buttonequal);

		calc.setVisible(true);



		}


	public static void main(String args[])
			{
			my_calculator5 m1=new my_calculator5();
			m1.map_calculator();
			}
					String temp="";
					String sign="";
					double result=1;//CHANGE MADE RESULT=0 BEFORE
					double temp_minus=0;
					boolean flag_minus_first=true;
					boolean mul_flag=true;
					double mul_temp=1;
					double memory;
					boolean memory_flag=false;
					boolean divide_flag=true;
					double divide_temp=1;
					boolean mr_flag=false;///used for memory recall mechanism
					boolean point_flag=true;
					//boolean plus_slash_minus_flag=true;

	private class event_handler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
		String cmd=e.getActionCommand();
		System.out.println(cmd);
//**********************************************************************************************
					if(cmd=="+/-")
						{
							//plus_slash_minus_flag=true means that user has pressed +/- sign when value from temp is displaying to lcd screen not from result varibable

							if(temp!="" )//&& plus_slash_minus_flag==true && )
								{
									if(Double.parseDouble(temp)>0)
									{
										temp=("-"+ temp);
										System.out.println("temp="+temp);
										lcdDisplay.setText(temp);
									}
									else if(Double.parseDouble(temp)<0)
									{
										temp=temp.substring(1,temp.length());
										System.out.println("temp="+temp);
										lcdDisplay.setText(temp);

									}
									//plus_slash_minus_flag=false;
								}

					//enters when user press +/- and value from result variable is showing on screen in that case temp is always empty conditionly

							if(temp=="" )//&& plus_slash_minus_flag==false)
								{
									String pm="";
									pm=String.valueOf(result);
									if(result>0)
									{

										pm="-"+pm;
										result=Double.parseDouble(pm);
										lcdDisplay.setText(String.valueOf(result));
										pm="";
									}
									else if(result<0)
										{
											pm=pm.substring(1,pm.length());
											result=Double.parseDouble(pm);
											lcdDisplay.setText(String.valueOf(result));
											pm="";
										}
										System.out.println("result="+result);
								}
						}


//**********************************************************************************************

					if(cmd=="%")
						{
							point_flag=true;
							if(temp!="")
							{
								result=result/Double.parseDouble(temp);
								result=result*100;
								lcdDisplay.setText(String.valueOf(result));
							}

							//under construction
						}
//**********************************************************************************************
//independcy
					if(cmd=="1/x")
						{
							point_flag=true;

							if(temp!="")
								{
									double byx=0;
									byx=Double.parseDouble(temp);
									byx=1/byx;
									temp=String.valueOf(byx);
									lcdDisplay.setText(temp);
								}
							if(temp=="")
								{
									result=1/result;
									lcdDisplay.setText(String.valueOf(result));
								}
							//under construction
						}
//**********************************************************************************************

					//if(cmd=="+/-")
						//{
							//point_flag=true;
						//}
//**********************************************************************************************

					if(cmd=="MC")
						{
						point_flag=true;//must add to  this  flag coomaon  in all operations must note that if any new operation added after
						memory_flag=false;//means there is no value stored in M+
						memory=0;
						mem_recall.setEnabled(false);
						mem_clear.setEnabled(false);
						}
//**********************************************************************************************


					if(cmd=="M+")
						{
								point_flag=true;
								if(mr_flag==false)//used to specify that to store value from temp or result
								if(temp!="")
								{
									memory_flag=true;
									temp=lcdDisplay.getText();
									memory=Double.parseDouble(temp);
									mul_flag=false;
									flag_minus_first=false;
									divide_flag=false;
									mem_recall.setEnabled(true);
									mem_clear.setEnabled(true);
								}



								if(mr_flag==true)
								{
									System.out.println("ENTERED IN M+ where mr_flad=false");
									memory_flag=true;
									result=Double.parseDouble(lcdDisplay.getText());
									memory=result;
									mul_flag=false;
									flag_minus_first=false;
									divide_flag=false;
									mr_flag=false;
									mem_recall.setEnabled(true);
									mem_clear.setEnabled(true);
								}


						}
//**********************************************************************************************

					if(cmd=="MR")
						{
							point_flag=true;
							if(memory_flag==true)//checks that if any number is stored using M+
							{
							temp=String.valueOf(memory);
							lcdDisplay.setText(temp);
							}

						}
//**********************************************************************************************


					if(cmd=="/")
						{
							point_flag=true;
							if(sign=="-" && temp!="")
									{
									result=result-Double.parseDouble(temp);
									lcdDisplay.setText(String.valueOf(result));
									temp="";
									divide_flag=false;
									}

							if(sign=="+" && temp!="")
									{
									result=Double.parseDouble(temp)+result;
									lcdDisplay.setText(String.valueOf(result));
								    temp="";
									divide_flag=false;
									}

							if(sign=="X" && temp!="")
									{
									result=result*Double.parseDouble(temp);
									lcdDisplay.setText(String.valueOf(result));
									temp="";
									divide_flag=false;
									}


							sign="/";
							if(temp!="")
							{
								if(divide_flag==true)
									{
									divide_temp=Double.parseDouble(temp)/divide_temp;
									System.out.println("Divide_temp="+divide_temp);
									lcdDisplay.setText(String.valueOf(divide_temp));
									temp="";
									divide_flag=false;
									result=divide_temp;
									System.out.println("result="+result);
									}
								if(divide_flag==false && temp!="")
									{
									result=result/Double.parseDouble(temp);
									lcdDisplay.setText(String.valueOf(result));
									System.out.println("result="+result);
									temp="";
									}
							}
						}
//**********************************************************************************************


					if(cmd=="X")
						{
							point_flag=true;
							if(sign=="/" && temp!="")
								{
								result=result/Double.parseDouble(temp);
								lcdDisplay.setText(String.valueOf(result));
								System.out.println("result="+result);
								temp="";
								mul_flag=false;
								}


							if(sign=="+" && temp!="")
								{
								result=Double.parseDouble(temp)+result;
								lcdDisplay.setText(String.valueOf(result));
								temp="";
								mul_flag=false;  //testing statement beta
								}


							if(sign=="-" && temp!="")
								{
								result=result-Double.parseDouble(temp);
								lcdDisplay.setText(String.valueOf(result));
								temp="";
								mul_flag=false;///testing statement beta
								}

							sign="X";

							if(temp!="")
							{
								if(mul_flag==true)
									{
									System.out.println("Entered in X where temp!=empty");
									mul_temp=mul_temp*Double.parseDouble(temp);
									lcdDisplay.setText(String.valueOf(mul_temp));
									temp="";
									result=mul_temp;
									System.out.println("result="+result);
									mul_flag=false;
									}

									else
									{

										System.out.println("Entered in cmd=X and where mul_flag=false");
										result=result*Double.parseDouble(temp);
										lcdDisplay.setText(String.valueOf(result));////////////////
										temp="";
									}

							}

						}


//**********************************************************************************************

					if(cmd=="+")
						{


							point_flag=true;
							if(sign=="/" && temp!="")
								{
									result=result/Double.parseDouble(temp);
									lcdDisplay.setText(String.valueOf(result));
									System.out.println("result="+result);
									temp="";
								}

							if(sign=="X" && temp!="")
								{
									result=result*Double.parseDouble(temp);
									lcdDisplay.setText(String.valueOf(result));
									temp="";
								}



							if(sign=="-" && temp!="")//e.g 2-2+4 for this like operation
								{
									result=result-Double.parseDouble(temp);
									lcdDisplay.setText(String.valueOf(result));
									temp="";
								}

							sign="+";
							if(temp!="")
							{
								mul_flag=false;
								System.out.println(" Entered in + temp!=empty ");

								result=Double.parseDouble(temp)+result;
								lcdDisplay.setText(String.valueOf(result));
								temp="";
								System.out.println("result="+result);
								System.out.println(String.valueOf(temp));
							}
							else
								{

								}
						}
//**********************************************************************************************

					if(cmd=="-")
						{
							point_flag=true;
							if(sign=="/" && temp!="")
								{
								result=result/Double.parseDouble(temp);
								lcdDisplay.setText(String.valueOf(result));
								System.out.println("result="+result);
								temp="";
								flag_minus_first=false;
								}


							if(sign=="X" && temp!="")
								{
									result=result*Double.parseDouble(temp);
									lcdDisplay.setText(String.valueOf(result));
									temp="";
									flag_minus_first=false;
								}


							if(sign=="+" && temp!="") //if user enters 2-2+anynumber
								{
									result=Double.parseDouble(temp)+result;
									lcdDisplay.setText(String.valueOf(result));
									temp="";
									flag_minus_first=false;

								}
							sign="-";


							if(temp!="")
							{
								mul_flag=false;
								System.out.println(" Entered in - where temp!=empty ");
								if(flag_minus_first==true)//when user first time perform -operation after starting pgm
									{
									result=Double.parseDouble(temp)-result;
									flag_minus_first=false;
									System.out.println(result);
									}
								else
									{
								 	result=result-Double.parseDouble(temp);
								 	System.out.println(result);
									}

									lcdDisplay.setText(String.valueOf(result));
									temp="";
							}

						}
//**********************************************************************************************

					if(cmd=="=")
						{
							point_flag=true;
							if(sign=="+")
								if(temp!="")
								{
								mul_flag=false;
								divide_flag=false;
								flag_minus_first=false;//testing may be removed

								result=Double.parseDouble(temp)+result;
								lcdDisplay.setText(String.valueOf(result));
								sign="";
								temp="";
								System.out.println("result="+result);
								mr_flag=true;///used for memory recall mechanism
								}

							if(sign=="-")
								if(temp!="")
								{
								mul_flag=false;
								divide_flag=false;
								flag_minus_first=false;//testing may be removed
								result=result-Double.parseDouble(temp);
								lcdDisplay.setText(String.valueOf(result));
								sign="";
								temp="";
								System.out.println("result="+result);
								mr_flag=true;///used for memory recall mechanism
								}

							if(sign=="X")
								if(temp!="")
								{
								mul_flag=false;
								divide_flag=false;
								flag_minus_first=false;//testing may be removed
								result=result*Double.parseDouble(temp);
								lcdDisplay.setText(String.valueOf(result));
								sign="";
								temp="";
								mr_flag=true;///used for memory recall mechanism
								//mul_temp=1;
								}

							if(sign=="/")
								if(temp!="")
								{
								mul_flag=false;
								divide_flag=false;
								flag_minus_first=false;//testing may be removed
								result=result/Double.parseDouble(temp);
								lcdDisplay.setText(String.valueOf(result));
								sign="";
								temp="";
								mr_flag=true;///used for memory recall mechanism
								}

							if(sign=="")
								if(temp!="")//testing may be removed
								{
								result=Double.parseDouble(lcdDisplay.getText());
								System.out.println("result="+lcdDisplay.getText());
								mul_flag=false;
								mr_flag=true;///used for memory recall mechanism
								}
							temp="";

						}

//**********************************************************************************************


						if(cmd=="."||cmd=="0" || cmd=="1" || cmd=="2" || cmd=="3" || cmd=="4" || cmd=="5" || cmd=="6" || cmd=="7" || cmd=="8" || cmd=="9")
							{
							if(cmd=="." && temp=="" && point_flag==true)
								{

									temp="0";
									temp=temp+cmd;
									point_flag=false;

								}
							else if(cmd=="." && temp!="" && point_flag==true)
								{
									temp=temp+cmd;
									point_flag=false;
								}
							//temp=temp+cmd;
							else if(cmd!=".")
							temp=temp+cmd;

							lcdDisplay.setText(temp);
							System.out.println("temp"+temp);
							mr_flag=false;

							}


//**********************************************************************************************

						if(cmd=="C")
							{
							//plus_slash_minus_flag=true;
							point_flag=true;
							mr_flag=false;
							divide_temp=1;
							divide_flag=true;
							mul_flag=true;
							temp="";
							lcdDisplay.setText("0");
							result=0;
							sign="";
							flag_minus_first=true;
							mul_temp=1;
							System.out.println("result="+result);
							System.out.println("temp="+temp);
							}

//**********************************************************************************************

		}

	}
}

//simple java calculator by Sajjad GHani
//email: sg786@msn.com
//phone: 0092-300-5303696
//pakistan