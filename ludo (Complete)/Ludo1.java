import java.awt.color.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.Random;
import java.awt.*;

class Ludo1{

 JFrame f,f2;
 JLabel l[],m,image,dic,hero,rms,he;					//dic is the gif image of dice
 JLabel blue[],red[],green[],yellow[];
 JFrame f1 = new JFrame("MENU");
 JFrame options = new JFrame("OPTIONS");
 JFrame hell = new JFrame("HELP");
 JRadioButton player2,player3,player4;
 JTextField screen;
 JButton exit,reset,okay,mmenu;



 JButton choice[];
 static int j=0;
Listener o;
JButton dice,play,option,help;

  Ludo1(){

   f=new JFrame("Ludo");
   f2=new JFrame("No number players");
   l=new JLabel[89];
   o = new Listener(this);
   f1=new JFrame("Menu");
/*
JWindow window = new JWindow();

	 	window.getContentPane().add(  new JLabel("", new ImageIcon(".\\loading.gif"), SwingConstants.LEFT));
	 	window.setBounds(300, 100, 800, 600);
	 	window.setVisible(true);
	 			try {
	 			    Thread.sleep(4800);
	 			} catch (InterruptedException e) {
	 			    e.printStackTrace();
	 			}

        window.dispose();

	 	 JWindow window1 = new JWindow();
         window1.getContentPane().add(new JLabel("", new ImageIcon(".\\splash0.jpg"), SwingConstants.LEFT));
	 	 window1.setBounds(300,100, 800,600);
	 	 window1.setVisible(true);
	 	 			try {
	 	 			    Thread.sleep(2000);
	 	 			} catch (InterruptedException e) {
	 	 			    e.printStackTrace();
	 	 			}
        window1.dispose();

        	 	 JWindow window2 = new JWindow();
		         window2.getContentPane().add(new JLabel("", new ImageIcon(".\\splash2.jpg"), SwingConstants.LEFT));
			 	 window2.setBounds(300,100, 800,600);
			 	 window2.setVisible(true);
			 	 			try {
			 	 			    Thread.sleep(2000);
			 	 			} catch (InterruptedException e) {
			 	 			    e.printStackTrace();
			 	 			}
        window2.dispose();
*/
f.setContentPane(new JLabel(new ImageIcon(".\\d.jpg")));


        Font font = new Font("Tempus Sans ITC", Font.BOLD,32);
                Font font1 = new Font("Tempus Sans ITC", Font.BOLD,38);

		screen= new JTextField("Blue team chance");
		screen.setBounds(142,30,600,60);
		screen.setBackground(Color.BLACK);
		screen.setForeground(Color.GREEN);
		f.add(screen);
		screen.setFont(font);



    image=new JLabel();
    image.setBounds(40,550,70,70);
    image.setFont(font);

    f.add(image);

    hero=new JLabel();
    hero.setBounds(20,300,430,430);
    hero.setIcon(new ImageIcon(".\\hero.gif"));

exit=new JButton();
exit.setFont(font);
exit.setBounds(370,550,150,150);
exit.addActionListener(o);
	exit.setIcon(new ImageIcon(".\\exit.png"));
exit.setBorder(null);
exit.setContentAreaFilled(false);

reset =new JButton();                      // reset
reset.setFont(font);
reset.setBounds(760,320,80,80);
reset.setIcon(new ImageIcon(".\\reset.png"));
reset.setBorder(null);
reset.setContentAreaFilled(false);
reset.addActionListener(o);
f.add(reset);



mmenu =new JButton();                      // reset
mmenu.setFont(font);
mmenu.setBounds(850,320,80,80);
mmenu.setIcon(new ImageIcon(".\\home.png"));
mmenu.setBorder(null);
mmenu.setContentAreaFilled(false);
mmenu.addActionListener(o);
f.add(mmenu);


    rms=new JLabel();
    rms.setBounds(740,575,250,128);
    rms.setIcon(new ImageIcon(".\\rms.jpg"));
    f.add(rms);

        he=new JLabel();
	    he.setBounds(120,120,638,479);
	    he.setIcon(new ImageIcon(".\\help.jpg"));
        hell.add(he);

   dice=new JButton();					 // roll button
   dice.setBounds(20,620,100,50);
       dice.setIcon(new ImageIcon(".\\roll.png"));
       dice.setBorder(null);
dice.setContentAreaFilled(false);

   dice.addActionListener(o);
   f.add(dice);

      play=new JButton("");					 // play button
      play.setBounds(350,150,200,100);
      play.addActionListener(o);
      play.setIcon(new ImageIcon(".\\play.png"));
     play.setBorder(null);
			   			play.setContentAreaFilled(false);

      option=new JButton("");					 // opt button
      option.setBounds(370,260,150,150);
      option.addActionListener(o);
      option.setIcon(new ImageIcon(".\\option.png"));
	  			   			option.setBorder(null);
			   			option.setContentAreaFilled(false);

      help=new JButton("");					 // help button
      help.setBounds(370,400,170,150);
      help.addActionListener(o);
      help.setIcon(new ImageIcon(".\\help.png"));
       help.setBorder(null);
		help.setContentAreaFilled(false);


//*********************  choice buttons for selecting goti ***************
choice=new JButton[4];
for(int i=0;i<choice.length;i++)
{
	  choice[i]=new JButton();
	  choice[i].setBounds(30,120+j,70,70);
	  choice[i].addActionListener(o);
	  f.add(choice[i]);
	  			   			choice[i].setBorder(null);
			   			choice[i].setContentAreaFilled(false);
	  j=j+70;

}

choice[0].setIcon(new ImageIcon(".\\super.png"));
choice[1].setIcon(new ImageIcon(".\\bat.png"));
choice[2].setIcon(new ImageIcon(".\\captain.png"));
choice[3].setIcon(new ImageIcon(".\\spider.png"));


    m=new JLabel();
    m.setBounds(130,100,600,600);
	m.setIcon(new ImageIcon(".\\ludo.jpg"));

    dic=new JLabel();
	dic.setBounds(20,450,72,70);
	dic.setIcon(new ImageIcon(".\\dice.gif"));
	f.add(dic);

	//*******************  player labels ********************************************

   blue=new JLabel[4];
   red=new JLabel[4];
   green=new JLabel[4];
   yellow=new JLabel[4];

for(int i=0;i<4;i++)
{
	blue[i]=new JLabel();
	red[i]=new JLabel();
	green[i]=new JLabel();
	yellow[i]=new JLabel();
}

blue[0].setBounds(160,500,39,40);
blue[1].setBounds(160+150,500,40,40);
blue[2].setBounds(160,500+100,40,40);
blue[3].setBounds(160+150,500+100,40,40);

red[0].setBounds(160,150,40,40);
red[1].setBounds(160+150,150,40,40);
red[2].setBounds(160,150+100,40,40);
red[3].setBounds(160+150,150+100,40,40);

green[0].setBounds(500,150,40,40);
green[1].setBounds(500+150,150,40,40);
green[2].setBounds(500,150+100,40,40);
green[3].setBounds(500+150,150+100,40,40);

yellow[0].setBounds(500,500,40,40);
yellow[1].setBounds(500+150,500,40,40);
yellow[2].setBounds(500,500+100,40,40);
yellow[3].setBounds(500+150,500+100,40,40);

for(int i=0;i<4;i++){
	blue[i].setIcon(new ImageIcon(".\\b"+i+".png"));
	f.add(blue[i]);

	red[i].setIcon(new ImageIcon(".\\r"+i+".png"));
	f.add(red[i]);

	green[i].setIcon(new ImageIcon(".\\g"+i+".png"));
	f.add(green[i]);

	yellow[i].setIcon(new ImageIcon(".\\y"+i+".png"));
	f.add(yellow[i]);
}




for(int i=0;i<l.length;i++)
{
	 l[i]=new JLabel();
}


f.add(m);


//******************************    board  *****************************************

       //*********  these for loop is for blue area  ************************
       j=0;
for(int i=5;i>=0;i--){
	      l[i].setBounds(372,417+j,39,39);
	      j=j+39;
   }


  j=0;
for(int i=56;i>=52;i--){
	      l[i].setBounds(410,456+j,39,39);
	      j=j+40;
   }


  j=0;
for(int i=44;i<=49;i++){
	      l[i].setBounds(452,456+j,39,39);
	      j=j+40;
   }

 //*********  these for loop is for red area  ************************
   j=0;
for(int i=10;i>=5;i--){
	      l[i].setBounds(130+j,417,39,39);
	      j=j+39;
   }
   j=0;
for(int i=12;i<=17;i++){
	      l[i].setBounds(130+j,339,39,39);
	      j=j+39;
   }


  j=0;
for(int i=57;i<=61;i++){
	      l[i].setBounds(169+j,378,39,39);
	      j=j+39;
   }

 //*********  these for loop is for green area  ************************
   j=0;
for(int i=18;i<=23;i++){
	      l[i].setBounds(372,300-j,39,39);
	      j=j+39;
   }
   j=0;
for(int i=30;i>=25;i--){
	      l[i].setBounds(450,300-j,39,39);
	      j=j+39;
   }

  j=0;
for(int i=62;i<=66;i++){
	      l[i].setBounds(411,139+j,39,39);
	      j=j+39;
   }

 //*********  these for loop is for yellow area  ************************
   j=0;
for(int i=31;i<=36;i++){
	      l[i].setBounds(491+j,339,39,39);
	      j=j+39;
   }
   j=0;
for(int i=43;i>=38;i--){
	      l[i].setBounds(491+j,417,39,39);
	      j=j+39;
   }


  j=0;
for(int i=71;i>=67;i--){
	      l[i].setBounds(491+j,378,39,39);
	      j=j+39;
   }



 //*********  these are the extra pics which cant be pasted by for loop   ***********************

l[50].setBounds(410,660,39,39);
l[51].setBounds(373,660,39,39);
l[11].setBounds(130,378,39,39);
l[24].setBounds(411,100,39,39);
l[37].setBounds(686,378,39,39);

l[72].setBounds(130,456,121,121);
l[73].setBounds(251,456,121,121);
l[74].setBounds(130,577,121,121);
l[75].setBounds(251,577,121,121);

l[76].setBounds(130,100,121,121);
l[77].setBounds(251,100,121,121);
l[78].setBounds(130,218,121,121);
l[79].setBounds(251,218,121,121);

l[80].setBounds(489,100,121,121);
l[81].setBounds(610,100,121,121);
l[82].setBounds(489,218,121,121);
l[83].setBounds(610,218,121,121);

l[84].setBounds(489,456,121,121);
l[85].setBounds(610,456,121,121);
l[86].setBounds(489,573,121,121);
l[87].setBounds(610,573,121,121);

l[88].setBounds(364,334,122,122);


for(int i=0;i<l.length;i++){

     l[i].setIcon(new ImageIcon(".\\"+i+".jpg"));
  f.add(l[i]);

}





 f.setLayout(null);
  f.setLayout(null);
   f.setLayout(null);
   f.setLayout(null);
   f.setSize(1000,740);
   f.setResizable(false);
   f.setVisible(false);




			   			f1.setLayout(null);
   						f1.setResizable(false);
   			   			f1.setBounds(100,0,900,730);
   			   			f1.setContentPane(new JLabel(new ImageIcon(".\\menu.png")));
   			   			f1.add(play);
   			   		    f1.add(option);
   			   			f1.add(help);
   			   			f1.add(exit);
						f1.setVisible(true);



//************************  checkbox ************************************************
player2=new JRadioButton("2 Players");
player3=new JRadioButton("3 Players");
player4=new JRadioButton("4 Players");
ButtonGroup grp=new ButtonGroup();
grp.add(player2);
grp.add(player3);
grp.add(player4);
//player2.setSelected(true);
//player3.setSelected(true);
player4.setSelected(true);
player2.setBorder(null);
player2.setContentAreaFilled(false);
player2.setForeground(Color.white);
player3.setBorder(null);
player3.setContentAreaFilled(false);
player3.setForeground(Color.white);
player4.setBorder(null);
player4.setContentAreaFilled(false);
player4.setForeground(Color.white);
player2.setBounds(400,150,200,100);
player3.setBounds(400,270,200,100);
player4.setBounds(400,390,200,100);
player2.setFont(font1);
player3.setFont(font1);
player4.setFont(font1);

okay=new JButton();
okay.setFont(font1);
	okay.setIcon(new ImageIcon(".\\ok.png"));

		       okay.setBorder(null);
		okay.setContentAreaFilled(false);
okay.setBounds(400,510,150,100);
okay.addActionListener(o);


						f2.setResizable(false);
						f2.setBounds(100,0,900,730);
						f2.setContentPane(new JLabel(new ImageIcon(".\\option.jpg")));
						f2.add(player2);
						f2.add(player3);
						f2.add(player4);
						f2.add(okay);
						//f2.setLayout(new FlowLayout(FlowLayout.LEFT));

						options.setLayout(null);

	   						options.setResizable(false);
	   			   			options.setBounds(100,0,900,730);
   			   			options.setContentPane(new JLabel(new ImageIcon(".\\option.jpg")));
						options.setVisible(false);
						f2.add(hero);




						hell.setLayout(null);

	   						hell.setResizable(false);
	   			   			hell.setBounds(100,0,900,730);

   			   			hell.setContentPane(new JLabel(new ImageIcon(".\\menung.jpg")));
   			   				hell.add(he);
						hell.setVisible(false);

   }
   public static void main(String ss[])
   {	try{

    	 UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());}
		catch(Exception e)
		{
			}

      new Ludo1();
    }
    }






class Listener implements ActionListener
{
	 Ludo1 d;
	 int rno,x1,y1,temp;

	  static int pc1[]= new int[4];
	  static int pc2[]= new int[4];
	  static int pc3[]= new int[4];
	  static int pc4[]= new int[4];




	 static int w;
	 Rectangle r=new Rectangle();
	 double y,z;
 	   boolean flag0=false;
	   boolean block=false;
	   boolean block2=false;
	   boolean block3=false;
	   boolean block4=false;
	   int safe[];
	   int nplayers,c1,c2,c3,c4;
	   int flag1[]=new int[4];
	   int flag2[]=new int[4];
	   int flag3[]=new int[4];
	   int flag4[]=new int[4];


	 Listener(Ludo1 d)
	 {
		  this.d=d;

		  for(int i=0;i<4;i++){
			  pc1[i]=-1;
			  pc2[i]=12;
			  pc3[i]=25;
			  pc4[i]=38;
			  flag1[i]=0;
			  flag2[i]=0;
			  flag3[i]=0;
			  flag4[i]=0;

		  }

safe =new int[]{0,8,13,21,26,35,39,47};

	  }
	  //***********************************  reset funciton */*************************************************
	  void resetFunction(){

	d.blue[0].setBounds(160,500,39,40);
	d.blue[1].setBounds(160+150,500,40,40);
	d.blue[2].setBounds(160,500+100,40,40);
	d.blue[3].setBounds(160+150,500+100,40,40);

	d.red[0].setBounds(160,150,40,40);
	d.red[1].setBounds(160+150,150,40,40);
	d.red[2].setBounds(160,150+100,40,40);
	d.red[3].setBounds(160+150,150+100,40,40);

	d.green[0].setBounds(500,150,40,40);
	d.green[1].setBounds(500+150,150,40,40);
	d.green[2].setBounds(500,150+100,40,40);
	d.green[3].setBounds(500+150,150+100,40,40);

	d.yellow[0].setBounds(500,500,40,40);
	d.yellow[1].setBounds(500+150,500,40,40);
	d.yellow[2].setBounds(500,500+100,40,40);
    d.yellow[3].setBounds(500+150,500+100,40,40);

	for(int i=0;i<4;i++){
				  pc1[i]=-1;
				  pc2[i]=12;
				  pc3[i]=25;
				  pc4[i]=38;
				  flag1[i]=0;
				  flag2[i]=0;
				  flag3[i]=0;
				  flag4[i]=0;


		  }
		   w=0;

  }


	//****************************************   giving the random number *************************************
	  void randomNumber()
	  {
		  Random generator = new Random();
		  rno = generator.nextInt(6) + 1;                // random number storing to rno
		  d.image.setIcon(new ImageIcon(".\\dice"+rno+".png"));
		  //d.image.setText(String.valueOf(rno));
     }

//**************************************  new position  ******************************************

/* * this funciton will give the new position to every player after rolling the dice and it also check weather any team has won this game or not
     and this function uses c1,c2,c3,c4 4 count variable to  check the winnig any team who whose count variable become 4 will become first and so on

*/
    void newPosition(int pos,int ii){
		 r=d.l[pos].getBounds();
		 y=r.getX();
		 z=r.getY();
		 x1=(int)Math.round(y);
		 y1=(int)Math.round(z);
		 w--;

	    if(w%nplayers==0){

		 if(pos==88){
		    d.blue[ii].setBounds(x1+40,y1+80,40,40);
		     d.screen.setText("One player of Blue team is in the house");
		     c1++;
		     pc1[pos]=111;


		 }
		 else
		    d.blue[ii].setBounds(x1,y1,40,40);

	     }

		 else if(w%nplayers==1){

			if(pos==88){
				 d.red[ii].setBounds(x1+20,y1+40,40,40);
				  d.screen.setText("One player of Red team is in the house");
				  c2++;
				   pc2[pos]=111;
			  }
			else
				 d.red[ii].setBounds(x1,y1,40,40);

			}

		 else if(w%nplayers==2){

			 if(pos==88){
		 		d.green[ii].setBounds(x1+40,y1,40,40);
		 		d.screen.setText("One player of Green team is in the house");
		 		c3++;
		 		 pc3[pos]=111;
			}
		 	else
		 	    d.green[ii].setBounds(x1,y1,40,40);
		 }

		 else if(w%nplayers==3){
			 if(pos==88){
		 		d.yellow[ii].setBounds(x1+80,y1+40,40,40);
		 		d.screen.setText("One player of Yellow team is in the house");
		 		c4++;
		 		 pc4[pos]=111;
			}
		 	 else
		 	    d.yellow[ii].setBounds(x1,y1,40,40);
		 }


		 w++;

  if(c1==4 ){
   JOptionPane.showMessageDialog(null, "Blue team has finish  the match");
   c1=0;

    }

  else if(c2==4){
   JOptionPane.showMessageDialog(null, "Red team has finish  the match");
   c2=0;
}

  else if(c3==4){
   JOptionPane.showMessageDialog(null, "Green team has finish  the match");
   c3=0;
}


  else if(c4==4){
    JOptionPane.showMessageDialog(null, "Yellow team has finish   the match");
    c4=0;
}

	}






	//**************** for cutting the player**********************8

	/*  this function will check wheather ay any position two different team members is at same
	    plce if so then cut method will apply acc. to rules of ludo


	    */

	void cut(int k){
		w--;
for(int j=0;j<4;j++){

		if(w%nplayers==0){
			if (pc1[k]==pc2[j]){
                d.red[j].setBounds(160+150,150,40,40);
			    d.screen.setText("Blue team player beat the red team");
			}

			else if(pc1[k]==pc3[j]){
				d.green[j].setBounds(500+150,150,40,40);
			    pc3[j]=25;
			     d.screen.setText("Blue team player beat the green team");
			}

			else if(pc1[k]==pc4[j]){
                 d.yellow[j].setBounds(500+150,500,40,40);
				 pc4[j]=38;
				  d.screen.setText("Blue team player beat the Yellow team");
			}
	    }



		else if(w%nplayers==1){

			 if (pc2[k]==pc1[j]){
		         d.blue[j].setBounds(160+150,500,40,40);
			     pc1[j]=-1;
			      d.screen.setText("Red team player beat the Blue team");
			}

			else if(pc2[k]==pc3[j]){
			    d.green[j].setBounds(500,150+100,40,40);
			    pc3[j]=25;
			     d.screen.setText("Red team player beat the Green team");
			}

			else if(pc1[k]==pc4[j]) {
		       d.yellow[j].setBounds(500,500+100,40,40);
			   pc4[j]=38;
			    d.screen.setText("Red team player beat the Yellow team");
			}
		}



		else if(w%nplayers==2){

			 if (pc3[k]==pc1[j]){
				 d.blue[j].setBounds(160,500+100,40,40);
				 pc1[j]=-1;
				  d.screen.setText("Green team player beat the Blue team");
			 }

			else if(pc3[k]==pc2[j]){
				d.red[j].setBounds(160,150+100,40,40);
				pc2[j]=12;
				 d.screen.setText("Green team player beat the Red team");
			}

		   else if(pc3[k]==pc4[j]) {
			   d.yellow[j].setBounds(500+150,500+100,40,40);
			   pc4[j]=38;
			    d.screen.setText("Green team player beat the Yellow team");
		   }
		}

        if(w%nplayers==3){

		   if (pc4[k]==pc1[j]){
				  d.blue[j].setBounds(160+150,500+100,40,40);
				  pc1[j]=-1;
				  d.screen.setText("Yellow team player beat the Blue team");
		   }

		  else if(pc4[k]==pc2[j]) {
				  d.red[j].setBounds(160+150,150+100,40,40);
				  pc2[j]=12;
				   d.screen.setText("Yellow team player beat the red team");
		  }

		  else if(pc4[k]==pc3[j]){
				  d.green[j].setBounds(500+150,150+100,40,40);
				  pc4[j]=25;
				   d.screen.setText("Yellow team player beat the Green team");
		  }

		}
}

   w++;
}


//*********************************   ACTION EVENT ****************************************************
public void actionPerformed(ActionEvent e)
{


	if(e.getSource()==d.dice){
		   randomNumber();
         flag0=true;


          }
   else if(e.getSource()==d.reset){
		  resetFunction();
	  }


        else if(e.getSource()==d.play) {
        	 d.f2.setVisible(true);
    		 d.f1.setVisible(false);
	   }

	           else if(e.getSource()==d.mmenu) {
	           	 d.f2.setVisible(false);
	       		 d.f1.setVisible(true);
	       		 d.f.setVisible(false);
	       		 resetFunction();
	       		 d.screen.setText("Blue team chance");
	   }
else if(e.getSource()==d.exit)
   System.exit(0);

	    else if(e.getSource()==d.option)
			 {
                d.f2.setVisible(true);

			}
else if(e.getSource()==d.okay)
			 {
                d.f.setVisible(true);
                d.f1.setVisible(false);
                d.f2.dispose();
                	  if(d.player2.isSelected()){
					     nplayers=2;
					     for(int q=0;q<4;q++){
							  d.green[q].setVisible(false);
							  d.yellow[q].setVisible(false);

					 }}

					 else if(d.player3.isSelected()){
					     nplayers=3;
					     		for(int q=0;q<4;q++)
							  d.yellow[q].setVisible(false);


					 }
					  else if(d.player4.isSelected()){
					      nplayers=4;

					  }


			}


		else if(e.getSource()==d.help)
		{
       d.hell.setVisible(true);

		}






for(int i=0;i<4;i++)
{
	if(e.getSource()==d.choice[i]&&flag0==true){

            if(w%nplayers==0){

				d.screen.setText("Red team chance");
                 w++;

				if(((pc1[i]+rno==0)||flag1[i]==1) && pc1[i]!=111){

		          if((pc1[i]+rno)<=50){

					  pc1[i]=pc1[i]+rno;
					  newPosition(pc1[i],i);
				      for(int k=0;k<8;k++){

						if(pc1[i]==safe[k]){
						    block4=true;
						    break;
						   }
					     else
						    block4=false;
					  }
					  if(block4==false)
					  cut(i);
			      }



			      else if((pc1[i]+rno)>50){
				   if((pc1[i]+rno)==51)
				      pc1[i]++;

				      pc1[i]=pc1[i]+rno;
				      System.out.println(pc1[i]);
				      if(pc1[i]==57)
				        newPosition(88,i);
				      else if(pc1[i]<57)
				        newPosition(pc1[i],i);


				  }

				flag1[i]=1;

 			  }

}

 			  else if(w%nplayers==1){

                if(nplayers==2)
                 d.screen.setText("Blue team chance");
                 else
				  d.screen.setText("Green team chance");

				  w++;
				 if(((pc2[i]+rno==13)||flag2[i]==1) && pc2[i]!=111) {



					  if((pc2[i]+rno)<=51 && block==false){

					  	 pc2[i]=pc2[i]+rno;
					  	 newPosition(pc2[i],i);

					  	 for(int k=0;k<8;k++){

						     if(pc2[i]==safe[k]){
						 			 block4=true;
						 			 break;
						 	  }
						 	 else
						 		 block4=false;
						  }

						 if(block4==false)
						 	 cut(i);
						 }





					 else if((pc2[i]+rno)>=51 && block==false){
					   	 temp = pc2[i]+rno;
						 pc2[i]=temp-51;
						 pc2[i]--;
					 	 newPosition(pc2[i],i);

					  	 for(int k=0;k<8;k++){

						     if(pc2[i]==safe[k]){
						 			 block4=true;
						 			 break;
						 	  }
						 	 else
						 		 block4=false;
						  }

						 if(block4==false)
						 	 cut(i);



					   	 block=true;

					 }
					 else if((pc2[i]+rno)>=0&&(pc2[i]+rno)<=11){
						  pc2[i]=pc2[i]+rno;
						 newPosition(pc2[i],i);

					  	 for(int k=0;k<8;k++){

						     if(pc2[i]==safe[k]){
						 			 block4=true;
						 			 break;
						 	  }
						 	 else
						 		 block4=false;
						  }

						 if(block4==false)
						 	 cut(i);



					   }

					 else if((pc2[i]+rno)>11){

					    temp = pc2[i]+rno;
					 	temp=temp-11;
					 	pc2[i]=56;
					 	pc2[i]=pc2[i]+temp;

					 	if(pc2[i]==62)
					 	  newPosition(88,i);
					 	else if(pc2[i]<62)
					 	  newPosition(pc2[i],i);

					 }


				flag2[i]=1;

 			  }
}
	         else if(w%nplayers==2){

                 if(nplayers==3)
                  d.screen.setText("Blue team chance");
                  else
				 d.screen.setText("Yellow team chance");
				  w++;

				  if(((pc3[i]+rno==26)||flag3[i]==1) && pc3[i]!=111){

					  if((pc3[i]+rno)<=51 && block2==false){
					  	 pc3[i]=pc3[i]+rno;
					  	 newPosition(pc3[i],i);

					  	 for(int k=0;k<8;k++){

						     if(pc3[i]==safe[k]){
						 			 block4=true;
						 			 break;
						 	  }
						 	 else
						 		 block4=false;
						  }

						 if(block4==false)
						 	 cut(i);



					   }
					  else if((pc3[i]+rno)>=51 && block2==false){
					  	 temp = pc3[i]+rno;
						 pc3[i]=temp-51;
						 pc3[i]--;
						 newPosition(pc3[i],i);

					  	 for(int k=0;k<8;k++){

						     if(pc3[i]==safe[k]){
						 			 block4=true;
						 			 break;
						 	  }
						 	 else
						 		 block4=false;
						  }

						 if(block4==false)
						 	 cut(i);


					   	 block2=true;

					 }
					 else if((pc3[i]+rno)>=0&&(pc3[i]+rno)<=24){

					 	pc3[i]=pc3[i]+rno;
					 	newPosition(pc3[i],i);

					  	 for(int k=0;k<8;k++){

						     if(pc3[i]==safe[k]){
						 			 block4=true;
						 			 break;
						 	  }
						 	 else
						 		 block4=false;
						  }

						 if(block4==false)
						 	 cut(i);


					   }
					 else if((pc3[i]+rno)>24){

					   		temp = pc3[i]+rno;
					   		temp=temp-24;
					   		pc3[i]=61;
					   		pc3[i]=pc3[i]+temp;

					   		if(pc3[i]==67)
								newPosition(88,i);
							else if(pc3[i]<67)
					 	        newPosition(pc3[i],i);


					 }
				flag3[i]=1;

 			  }
}
 			 else if(w%nplayers==3){

				 d.screen.setText("Blue team chance");

				  w++;
				 if(((pc4[i]+rno==39)||flag4[i]==1) && pc4[i]!=111){
					  if((pc4[i]+rno)<=51 && block3==false){

					  		 pc4[i]=pc4[i]+rno;
					  		newPosition(pc4[i],i);

					  	 for(int k=0;k<8;k++){

						     if(pc4[i]==safe[k]){
						 			 block4=true;
						 			 break;
						 	  }
						 	 else
						 		 block4=false;
						  }

						 if(block4==false)
						 	 cut(i);


					   }
					 else if((pc4[i]+rno)>=51 && block3==false){

					  		temp = pc4[i]+rno;
							pc4[i]=temp-51;
						    pc4[i]--;
					  		newPosition(pc4[i],i);

					  	 for(int k=0;k<8;k++){

						     if(pc4[i]==safe[k]){
						 			 block4=true;
						 			 break;
						 	  }
						 	 else
						 		 block4=false;
						  }

						 if(block4==false)
						 	 cut(i);

					  	    block3=true;

					   }
					 else if((pc4[i]+rno)>=0&&(pc4[i]+rno)<=37){

					  		pc4[i]=pc4[i]+rno;
					  		newPosition(pc4[i],i);

					  	 for(int k=0;k<8;k++){

						     if(pc4[i]==safe[k]){
						 			 block4=true;
						 			 break;
						 	  }
						 	 else
						 		 block4=false;
						  }

						 if(block4==false)
						 	 cut(i);


					  }
					  else if((pc4[i]+rno)>37){

					  		temp = pc4[i]+rno;
					  		temp=temp-37;
					  		pc4[i]=66;
					  		pc4[i]=pc4[i]+temp;

					  		if(pc4[i]==72)
								 newPosition(88,i);
							else if(pc4[i]<72)
					 	         newPosition(pc4[i],i);



					 }
				flag4[i]=1;


}

}
flag0=false;



}


			}






}}