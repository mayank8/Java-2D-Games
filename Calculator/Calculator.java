import java.awt.*;
import java.awt.event.*;

class Calculator
{
Frame f;
Button b[];
TextField tf;
Calculator(String s)
{
	f=new Frame(s);
	b=new Button[28];
   String s11[]={"MC","MR","MS","M+","M-","<-","CE","C","±","SQRT","7","8","9","/","%","4","5","6","*","1/x","1","2","3","-","=","0",".","+"};

Listener o = new Listener(this);
 for(int i=0 ; i < 28 ; i++)
   {
      b[i]=new Button(s11[i]);


   }

// menu bar

    MenuBar mb=new MenuBar();
    f.setMenuBar(mb);

 // menues in menu bar

    Menu m1 = new Menu("View");
    mb.add(m1);
    Menu m2 = new Menu("Edit");
    mb.add(m2);
    Menu m3 = new Menu("Help");
    mb.add(m3);

    f.setBackground(new Color(206,243,247));


// menu items

    MenuItem m11 =new MenuItem("Standard");
    m11.setActionCommand("Standard");
    m1.add(m11);

    MenuItem m12 =new MenuItem("Scientific");
	m12.setActionCommand("Scientific");
    m1.add(m12);

    MenuItem m13 =new MenuItem("Programmer");
	    m13.setActionCommand("Programmer");
    m1.add(m13);

      MenuItem m14 =new MenuItem("Statistics");
	    m14.setActionCommand("Statistics");
    m1.add(m14);

m1.addSeparator();

      MenuItem m15 =new MenuItem("History");
	    m15.setActionCommand("History");
    m1.add(m15);

      MenuItem m16 =new MenuItem("Digit Grouping");
	    m16.setActionCommand("Digit Grouping");
    m1.add(m16);

m1.addSeparator();

      MenuItem m17 =new MenuItem("Baic");
	    m17.setActionCommand("Basic");
    m1.add(m17);

      MenuItem m18 =new MenuItem("Unit Conversion");
	    m18.setActionCommand("");
    m1.add(m18);

      MenuItem m19 =new MenuItem("Date Conversion");
	    m19.setActionCommand("");
    m1.add(m19);

   MenuItem m20 =new MenuItem("Worksheets");
   m20.setActionCommand("");
   m1.add(m20);


  MenuItem m21 =new MenuItem("Copy");
   m21.setActionCommand("");
   m2.add(m21);


  MenuItem m22 =new MenuItem("Paste");
  m22.setActionCommand("");
   m2.add(m22);

   m2.addSeparator();

     MenuItem m23 =new MenuItem("History");
      m23.setActionCommand("");
   m2.add(m23);

     MenuItem m31 =new MenuItem("View Help");
      m31.setActionCommand("");
   m3.add(m31);

   m3.addSeparator();

        MenuItem m32 =new MenuItem("About Calculator");
         m32.setActionCommand("");
   m3.add(m32);

// textfield

    tf=new TextField();
    tf.setBounds(19,60,190,60);
    f.add(tf);






// buttons


//********************   row 1  *************************



         b[0].setBounds(19,125,34,25);
         b[13].addMouseListener(o);
          b[0].addMouseListener(o);
         f.add(b[0]);

         b[1].setBounds(58,125,34,25);
         b[13].addMouseListener(o);
          b[1].addMouseListener(o);
         f.add(b[1]);


         b[2].setBounds(97,125,34,25);
         b[13].addMouseListener(o);
          b[2].addMouseListener(o);
         f.add(b[2]);


       	b[3].setBounds(136,125,34,25);
       	 b[3].addMouseListener(o);
           f.add(b[3]);


     	 b[4].setBounds(175,125,34,25);
     	  b[4].addMouseListener(o);
        f.add(b[4]);


     //********************   row 2  *************************


         b[5].setBounds(19,155,34,25);
        b[5].addActionListener(o);
          b[5].addMouseListener(o);
        f.add(b[5]);


        b[6].setBounds(58,155,34,25);
      b[6].addActionListener(o);
         b[6].addMouseListener(o);
         f.add(b[6]);



         b[7].setBounds(97,155,34,25);
        b[7].addActionListener(o);
          b[7].addMouseListener(o);
         f.add(b[7]);


     	b[8].setBounds(136,155,34,25);
     	b[8].addActionListener(o);
     	 b[8].addMouseListener(o);
        f.add(b[8]);


      b[9].setBounds(175,155,34,25);
    b[9].addActionListener(o);
       b[9].addMouseListener(o);
      f.add(b[9]);

          //********************   row 3  *************************


     	     b[10].setBounds(19,185,34,25);
     	     b[10].addActionListener(o);
     	     b[10].addMouseListener(o);
     	     f.add(b[10]);


     	     b[11].setBounds(58,185,34,25);
     	      b[11].addMouseListener(o);
     	     b[11].addActionListener(o);
     	     f.add(b[11]);


     	     b[12].setBounds(97,185,34,25);
     	      b[12].addMouseListener(o);
     	     b[12].addActionListener(o);
     	     f.add(b[12]);


     	 	b[13].setBounds(136,185,34,25);
     	 	 b[13].addMouseListener(o);
     	 	b[13].addActionListener(o);
     	     f.add(b[13]);


     	 	 b[14].setBounds(175,185,34,25);
     	 	  b[14].addMouseListener(o);
     	 	 b[14].addActionListener(o);

            f.add(b[14]);


     //********************   row 4  *************************


         b[15].setBounds(19,215,34,25);
          b[15].addMouseListener(o);
         b[15].addActionListener(o);
         f.add(b[15]);


         b[16].setBounds(58,215,34,25);
          b[16].addMouseListener(o);
         b[16].addActionListener(o);
         f.add(b[16]);



          b[17].setBounds(97,215,34,25);
           b[17].addMouseListener(o);
          b[17].addActionListener(o);
         f.add( b[17]);


     	b[18].setBounds(136,215,34,25);
     	 b[18].addMouseListener(o);
     	b[18].addActionListener(o);
         f.add(b[18]);

     	   b[19].setBounds(175,215,34,25);
     	    b[19].addMouseListener(o);
     	   b[19].addActionListener(o);
          f.add(  b[19]);

          //********************   row 5  *************************



     	 	     b[20].setBounds(19,245,34,25);
     	 	      b[20].addMouseListener(o);
     	 	     b[20].addActionListener(o);
     	 	     f.add(b[20]);


     	 	     b[21].setBounds(58,245,34,25);
     	 	      b[21].addMouseListener(o);
     	 	     b[21].addActionListener(o);
     	 	     f.add(b[21]);

     	 	     b[22].setBounds(97,245,34,25);
     	 	      b[22].addMouseListener(o);
               b[22].addActionListener(o);
     	 	     f.add(b[22]);

     	 	 	 b[23].setBounds(136,245,34,25);
     	 	 	  b[23].addMouseListener(o);
     	 	 	 b[23].addActionListener(o);
     	 	     f.add( b[23]);


     	 	 	 b[24].setBounds(175,245,34,55);
     	 	 	  b[24].addMouseListener(o);
     	 	 	 b[24].addActionListener(o);
     	 	 	 f.add(b[24]);


      //********************   row 6  *************************

     			     b[25].setBounds(19,275,73,25);
     			      b[25].addMouseListener(o);
     			     b[25].addActionListener(o);
     			     f.add(b[25]);


     			     b[26].setBounds(97,275,34,25);
     			      b[26].addMouseListener(o);
     			     b[26].addActionListener(o);
  			     f.add(b[26]);


			     b[27].setBounds(136,275,34,25);
			      b[27].addMouseListener(o);
			     b[27].addActionListener(o);
			     f.add(b[27]);



f.setLayout(null);
f.setLayout(null);
f.setLayout(null);
f.setLayout(null);
f.setLayout(null);
	 f.setLayout(null);
	 f.setSize(228,330);
	 f.setVisible(true);
	 f.setResizable(false);
}



 public static void main(String ss[])
   {
	   new Calculator("Calculator");
    }

}

class Listener implements ActionListener,MouseListener
{
	  Calculator d;
	  String strr;
	  double s=0;
	  int j=1;

      int s1=0;
     int flag=0;
    double vv=0;

       Listener(Calculator d)
	  {
		   this.d =d;
      }


 void value()
      {

					              	 if(flag==1)
					 				 	{
											s=s+vv;

										}


					 				 else if(flag==2)
					 				 	{System.out.println(s);
					 				 	System.out.println(vv);
											s=s-vv;
											System.out.println(s);
										}

					 				 else if(flag==3)
					 				 	 s=s/vv;

					 				 else if(flag==4)
					 	                s=s*vv;

      }


public void actionPerformed(ActionEvent e)
      {

		   for(int i=10;i<28;i++)
		        {
		   				 if(e.getSource()==d.b[i])
		   				 {
		   					  if(i==10||i==11||i==12||i==15||i==16||i==17||i==20||i==21||i==22||i==25)
		   				              d.tf.setText(d.tf.getText()+d.b[i].getLabel());
		                    }
		         }

//**********************    1 2 3 4 5 6 7 8 9 10 ***********************************************************************

      if(e.getSource()==d.b[10]||e.getSource()==d.b[11]||e.getSource()==d.b[12]||e.getSource()==d.b[15]||e.getSource()==d.b[16]||e.getSource()==d.b[17]||e.getSource()==d.b[20]||e.getSource()==d.b[21]||e.getSource()==d.b[22]||e.getSource()==d.b[25])
		  		  { strr=d.tf.getText();
		  		   //vv=Double.parseDouble(strr);
		  		  vv= new Double(strr).doubleValue();


		            }



//*********************         +             ****************************************************************
       else if(e.getSource()==d.b[27])
          {
				d.tf.setText(null);
              if(s1==0)
		         { s=vv;
		            s1=1;
			     }

				value();

			       flag=1;


         }
//**************************        -         ***************************************************************

           else if(e.getSource()==d.b[23])
		           {
		 			  	d.tf.setText(null);
		             if(s1==0)
		 		         { s=vv;
		 		           s1=1;
					    }

					 value();

                       flag=2;

                  }
//******************     /            *****************************************
         else if(e.getSource()==d.b[13])
          {
			  	d.tf.setText(null);
              if(s1==0)
		         { s=vv;
		            s1=1;
			     }


					value();
			       flag=3;
		}
//*****************           *            ************************************
          else if(e.getSource()==d.b[18])
          {
			  	d.tf.setText(null);
              if(s1==0)
		         { s=vv;
		            s1=1;
			     }
				value();
			       flag=4;

         }


//******************       1/x		*******************************************
          else if(e.getSource()==d.b[19])
          {
			    s=1/vv;

			    if(vv==0)
			         d.tf.setText("Cannot divided by zero");
			    else
			    d.tf.setText(String.valueOf(s));
	    }



//******************       =		*******************************************
		 else if(e.getSource()==d.b[24])
		 {
 			value();
 		 d.tf.setText(String.valueOf(s));



		    flag=0;


		   }
//******************       .		*******************************************

		 else if(e.getSource()==d.b[26])
		 {
		   d.tf.setText(d.tf.getText()+d.b[26].getLabel());
		   }

//******************      <-    	*******************************************


 else if(e.getSource()==d.b[5])
		 {
		         char ch[]=strr.toCharArray();



		         if(ch.length==j)
		            {ch[0]='0';
                        }

		         else
		         {
		         ch[ch.length-j]='\0';
		         j++;

			     }

                  if(ch[0]=='0')
                  {
				  d.tf.setText("");
				  }
                  else
                  {strr=new String(ch);
                   d.tf.setText(strr);
			      }
		         vv= new Double(strr).doubleValue();

		   }

//******************      CE  	*******************************************
else if(e.getSource()==d.b[6])
		 {

              vv=0;

              d.tf.setText(null);
		   }


//******************      C   	*******************************************
else if(e.getSource()==d.b[7])
		 {
              strr=null;
              vv=0;
              s=0;
              s1=0;
              d.tf.setText(null);
		   }


//******************      +-  	*******************************************
else if(e.getSource()==d.b[8])
		 {
             vv=-vv;
             d.tf.setText(String.valueOf(vv));
		   }

//**************************   sqrt    ********************************
else if(e.getSource()==d.b[9])
		 {
             vv=Math.sqrt(vv);
             d.tf.setText(String.valueOf(vv));


		   }

}
//************************************************  mouse ***********************************************

		  public void mouseClicked(MouseEvent e)
		   {

		    }
		    public void mouseEntered(MouseEvent e)
		    { for(int i=0;i<28;i++)
                 {
			     if(e.getSource()==d.b[i])
					d.b[i].setBackground(new Color(242,245,120));

                   }

		     }

		      public void mouseExited(MouseEvent e)
		      {  for(int i=0;i<28;i++)
				 { if(e.getSource()==d.b[i])
				      d.b[i].setBackground(Color.WHITE);
			     }

		     }

		     public void mousePressed(MouseEvent e)
		    {
		     }

		     public void mouseReleased(MouseEvent e)
		    {

		     }




}

