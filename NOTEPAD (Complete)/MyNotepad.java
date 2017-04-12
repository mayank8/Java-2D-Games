import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import javax.print.*;
import javax.swing.ImageIcon;
import java.awt.*;
class MyNotepad extends MouseAdapter  implements ActionListener ,WindowListener
{ JFrame f;
  JTextArea tf;
  JMenuBar mb;
  JMenu jm1,jm2,jm3,jm4,jm5;
  JMenuItem m[];
  JPopupMenu p;
  JFileChooser jfc;
  JScrollPane tp;
  MyNotepad()
  {
    f=new JFrame("Notepad");
    f.addWindowListener(this);
    f.setIconImage(new ImageIcon(".\\main.png").getImage());

jfc=new JFileChooser();


Font font=new Font("Comic Sans MS",Font.PLAIN,18);
    tf=new JTextArea();
    tf.setFont(font);
    tf.setBounds(0,0,1600,850);
	f.add(tf);

    mb=new JMenuBar();
    f.setJMenuBar(mb);
//****************** scroll bar*****************************************

/*
tp=new JScrollPane(tf);
tp.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
f.add(tp);

*/

//*************************  MENU ********************************
    jm1=new JMenu("File");
    mb.add(jm1);

    jm2=new JMenu("Edit");
    mb.add(jm2);

    jm3=new JMenu("Format");
    mb.add(jm3);

    jm4=new JMenu("View");
    mb.add(jm4);

    jm5=new JMenu("Help");
    mb.add(jm5);


//*************************  MENUITEM  ********************************
    m=new JMenuItem[23];
    String s[]={"New","Open","Save","Save As","Page Setup","Print","Exit","Undo","Cut","Copy","Paste","Delete","Find","Find Next","Replace","Go to","Select All","Time/Date","Word Wrap","Font","Status Bar","View Help","About Notepad"};



 for(int i=0;i<m.length;i++)
    {
		m[i]=new JMenuItem(s[i]);
        m[i].addActionListener(this);

     if(i!=13)
		m[i].setIcon(new ImageIcon(".\\"+i+".png"));
    }

/////*********************************   icon on the menu bar  *****************************************




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





//*************************  ADDING MENUITEM TO THE MENU ********************************

    for(int i=0;i<7;i++)
    { jm1.add(m[i]);

     if(i==4 || i==5)
       jm1.addSeparator();
    }



    for(int i=7;i<18;i++)
    { jm2.add(m[i]);

     if(i==7 || i==11 || i==15)
       jm2.addSeparator();
     }

    for(int i=18;i<20;i++)
    { jm3.add(m[i]); }

    jm4.add(m[20]);

    jm5.add(m[21]);
    jm5.addSeparator();
    jm5.add(m[22]);

	//***************************** popup */***************************

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

i1.addActionListener(this);
i2.addActionListener(this);
i3.addActionListener(this);
i4.addActionListener(this);
i5.addActionListener(this);
i7.addActionListener(this);


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
	      int x= jfc.showOpenDialog(null);

	      if(x==JFileChooser.APPROVE_OPTION)
	      {
	       File f=jfc.getSelectedFile();
	       String s=jfc.getName(f);
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
			int userSelection = jfc.showSaveDialog(null);

		/*if(userSelection==JFileChooser.APPROVE_OPTION)
          System.out.println("fdf");
           File e = fileChooser.getSelectedFile();

	      if(userSelection==JFileChooser.CANCEL_OPTION)

		  	        System.out.println("cancel");
*/
		}

    //**************************** cut copy paste  ***********************************
    else if(e.getActionCommand().equals("Cut"))
         tf.cut();


   else if(e.getActionCommand().equals("Copy"))
        tf.copy();

    else if(e.getActionCommand().equals("Paste"))
		         tf.paste();
/*
    else if(e.getActionCommand().equals("Undo")){
		        PrinterJob pj = PrinterJob.getPrinterJob();
		         pj.setPrintable(new PrintableDemo1());
				    if (pj.printDialog()) {
				      try {
				        pj.print();
				      } catch (PrinterException e) {
				        System.out.println(e);
				      }
    }
}*/
//PageFormat pf = pj.pageDialog(pj.defaultPage());


//*****************************   new method ***********************************
	else if(e.getActionCommand().equals("New")){

		 if(tf.getText()!=""){
		       //Custom button text
			   Object[] options = {"Save","Don't Save", "Cancel"};
			  int n=JOptionPane.showOptionDialog(null,"Do You Want To Save Changes To Document","Notepad", JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,options,options[2]);



                 if(n==1)
                   tf.setText(null);

                 else if(n==0)
					jfc.showSaveDialog(null);


          }


	}
}
//************************** exit listenere ********************************************
  public void windowOpened(WindowEvent e){}

    public void windowClosing(WindowEvent e){
		 if(tf.getText()!=""){
				       //Custom button text
					   Object[] options = {"Save","Don't Save", "Cancel"};
					  int n=JOptionPane.showOptionDialog(null,"Do You Want To Save Changes To Document","Notepad", JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,options,options[0]);



		                 if(n==1)
		                   System.exit(0);

		                 else if(n==0)
							jfc.showSaveDialog(null);

							else if(n==2)
							    f.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);


          }
		}


    public void windowClosed(WindowEvent e){}


    public void windowIconified(WindowEvent e){}


    public void windowDeiconified(WindowEvent e){}

    public void windowActivated(WindowEvent e){}


    public void windowDeactivated(WindowEvent e){}



//************************** mouse event *******************************************************
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

     new MyNotepad();
     }
     }



