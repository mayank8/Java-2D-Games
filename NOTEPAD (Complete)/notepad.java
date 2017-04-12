import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import javax.swing.ImageIcon;
import java.awt.*;
import javax.swing.border.*;
class notepad extends MouseAdapter implements ActionListener
{
//************ layout for notepad  and classes to be declared*******
 JFrame f;
  JTextArea tf;
  JMenuBar mb;
  JMenu Jm1,Jm2,Jm3,Jm4,Jm5;
  JMenuItem m[];
  JPopupMenu p;
  JFileChooser Jfc;


 notepad()
  {
	  //****notepad constructor fields are inserted*****
    f=new JFrame(" untitled--Notepad");
    f.setIconImage(new ImageIcon(".\\notepad.png").getImage());
    Jfc=new JFileChooser();

	Font font=new Font("Castellar",Font.PLAIN,18);
	    tf=new JTextArea();
	    tf.setFont(font);
	    tf.setBounds(0,0,1600,850);
		f.add(tf);

	    mb=new JMenuBar();
    f.setJMenuBar(mb);
    //*************************  MENU ********************************
	    Jm1=new JMenu("File");
	    mb.add(Jm1);

	    Jm2=new JMenu("Edit");
	    mb.add(Jm2);

	    Jm3=new JMenu("Format");
	    mb.add(Jm3);

	    Jm4=new JMenu("View");
	    mb.add(Jm4);

	    Jm5=new JMenu("Help");
	    mb.add(Jm5);

m=new JMenuItem[23];

	  // submenue of first menue
	    m[0]=new JMenuItem("new",new ImageIcon(".\\0.png"));
	    m[0].addActionListener(this);
	    Jm1.add(m[0]);





	     m[1]=new JMenuItem ("open",new ImageIcon(".\\1.png"));
			    m[1].addActionListener(this);
	    Jm1.add(m[1]);



	     m[2]=new JMenuItem ("save",new ImageIcon(".\\2.png"));
			    m[2].addActionListener(this);
	    Jm1.add(m[2]);


	     m[3]=new JMenuItem ("save as",new ImageIcon(".\\3.png"));
			    m[3].addActionListener(this);
	    Jm1.add(m[3]);


	     m[4]=new JMenuItem ("page setup",new ImageIcon(".\\0.png"));
			    m[4].addActionListener(this);
	    Jm1.add(m[4]);


	     m[5]=new JMenuItem ("print",new ImageIcon(".\\5.png"));
			    m[5].addActionListener(this);
	    Jm1.add(m[5]);


	     m[6]=new JMenuItem ("exit",new ImageIcon(".\\6.png"));
			    m[6].addActionListener(this);
	    Jm1.add(m[6]);


	    // *************************************submenue of second menue*******************************************

	     m[7]=new JMenuItem ("undo",new ImageIcon(".\\7.png"));
			    m[7].addActionListener(this);
	    Jm2.add(m[7]);

	     m[8]=new JMenuItem ("cut",new ImageIcon(".\\8.png"));
			    m[8].addActionListener(this);
	    Jm2.add(m[8]);


	      m[9]=new JMenuItem ("copy",new ImageIcon(".\\9.png"));
					    m[9].addActionListener(this);
	    Jm2.add(m[9]);

	      m[10]=new JMenuItem ("paste",new ImageIcon(".\\10.png"));
					    m[10].addActionListener(this);
	    Jm2.add(m[10]);


	      m[11]=new JMenuItem ("delete",new ImageIcon(".\\11.png"));
					    m[11].addActionListener(this);
	    Jm2.add(m[11]);


			      m[12]=new JMenuItem ("find",new ImageIcon(".\\12.png"));
							    m[12].addActionListener(this);
	    Jm2.add(m[12]);



			      m[13]=new JMenuItem ("find next",new ImageIcon(".\\13.png"));
							    m[13].addActionListener(this);
	    Jm2.add(m[13]);



			      m[14]=new JMenuItem ("replace",new ImageIcon(".\\14.png"));
							    m[14].addActionListener(this);
	    Jm2.add(m[14]);


			      m[15]=new JMenuItem ("go to",new ImageIcon(".\\15.png"));
							    m[15].addActionListener(this);
	    Jm2.add(m[15]);


			      m[16]=new JMenuItem ("select all",new ImageIcon(".\\16.png"));
							    m[16].addActionListener(this);
	    Jm2.add(m[16]);



			      m[17]=new JMenuItem ("time date",new ImageIcon(".\\17.png"));
							    m[17].addActionListener(this);
	    Jm2.add(m[17]);


	    //***************** submneue on the third menue***************

			      m[18]=new JMenuItem ("word wrap",new ImageIcon(".\\18.png"));
							    m[18].addActionListener(this);
	    Jm3.add(m[18]);


			      m[19]=new JMenuItem ("font",new ImageIcon(".\\19.png"));
							    m[11].addActionListener(this);
	    Jm3.add(m[19]);

	    //************** submenue on the forth menue**************

			      m[20]=new JMenuItem ("status bar",new ImageIcon(".\\20.png"));
							    m[20].addActionListener(this);
	    Jm4.add(m[20]);
	    //********************* submenue on the fifth menue*********8
	    		      m[21]=new JMenuItem ("view help",new ImageIcon(".\\21.png"));
									    m[20].addActionListener(this);
	    Jm5.add(m[21]);



	    		      m[22]=new JMenuItem ("about notepad",new ImageIcon(".\\22.png"));
									    m[20].addActionListener(this);
	    Jm5.add(m[22]);









	//************************* HOT KEY FOR MENUITEM ********************************
	   m[0].setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,ActionEvent.CTRL_MASK));
	   m[1].setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O,ActionEvent.CTRL_MASK));
	   m[2].setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,ActionEvent.CTRL_MASK));
	   m[5].setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P,ActionEvent.CTRL_MASK));

	   m[7].setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Z,ActionEvent.CTRL_MASK));
	   m[8].setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X,ActionEvent.CTRL_MASK));
	   m[9].setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C,ActionEvent.CTRL_MASK));
	   m[10].setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V,ActionEvent.CTRL_MASK));
	   m[11].setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_DELETE,0));
	   m[12].setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F,ActionEvent.CTRL_MASK));
	   m[13].setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F3,0));
	   m[14].setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_H,ActionEvent.CTRL_MASK));
	   m[15].setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_G,ActionEvent.CTRL_MASK));
	   m[16].setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A,ActionEvent.CTRL_MASK));
	   m[17].setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F5,0));




		 p=new JPopupMenu("pop");
	    JMenuItem i1=new JMenuItem("Undo",new ImageIcon(".\\7.png"));
		JMenuItem i2=new JMenuItem("Cut",new ImageIcon(".\\8.png"));
	    JMenuItem i3=new JMenuItem("Copy",new ImageIcon(".\\9.png"));
	    JMenuItem i4=new JMenuItem("Paste",new ImageIcon(".\\10.png"));
	    JMenuItem i5=new JMenuItem("Delete",new ImageIcon(".\\11.png"));
	    JMenuItem i7=new JMenuItem("Select All",new ImageIcon(".\\16.png"));
	    JMenuItem i8=new JMenuItem("Right to left reading order");
	    JMenuItem i9=new JMenuItem("Show unicode Control Characters");
	    JMenuItem i10=new JMenuItem("Insert unicode Control Characters");
	    JMenuItem i11=new JMenuItem("Open IME");
	    JMenuItem i12=new JMenuItem("Reconversion");

	    /*
	    JScrollPane textpane= new JScrollPane(tf);
	    textpane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
	    f.add(textpane);*/

	      /*
			    JScrollPane textpan= new JScrollPane(tf);
			    textpan.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
	    f.add(textpane);*/




	   p.add(i1);
	   p.add(i2);
	   p.add(i3);
	   p.add(i4);
	   p.add(i5);
	   p.addSeparator();
	   p.add(i7);
	    p.addSeparator();
	   p.add(i8);
	   p.add(i9);
	   p.add(i10);
	    p.addSeparator();
	   p.add(i11);
	   p.add(i12);



	     tf.add(p);
	     tf.addMouseListener(this);





	    f.setLayout(null);
	    f.setSize(1600,850);
	    f.setVisible(true);

    }
    //**********************  ACTION EVENT  METHOD  *************************************************
	public void actionPerformed(ActionEvent e)
	    {
			if( e.getActionCommand().equals("exit"))
	        System.exit(0);

		//****************************  OPEN Dialog ***********************************
	     else if(e.getActionCommand().equals("Open"))
	       {
		      int x= Jfc.showOpenDialog(null);

		      if(x==JFileChooser.APPROVE_OPTION)
		      {
		       File f=Jfc.getSelectedFile();
		       String s=Jfc.getName(f);
		       System.out.println(s);
		       }
		       if(x==JFileChooser.CANCEL_OPTION)
		       {
		        System.out.println("cancel");
		        }
		   }
		//****************************  SAVE AS Dialog ***********************************

	     else if(e.getActionCommand().equals("Save As"))
		    {
				int userSelection = Jfc.showSaveDialog(null);


			}

	    //**************************** cut copy paste  ***********************************
	    else if(e.getActionCommand().equals("cut"))
	        {
	            tf.cut();
	          }

	   else if(e.getActionCommand().equals("copy"))
	        tf.copy();

	    else if(e.getActionCommand().equals("paste"))
			         tf.paste();

		}


	  public void mouseClicked(MouseEvent e)
	   {
	    int x=e.getButton();
	    if(x==MouseEvent.BUTTON3)
	    {
	     p.show(e.getComponent(),e.getX(),e.getY());
	     }
	   }


	 public static void main(String ss[])
		{

			try{

	    	 UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());}
			catch(Exception e)
			{
				}

	     new notepad();
	     }
     }
