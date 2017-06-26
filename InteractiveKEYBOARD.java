

/**

 Interactive Keyboard - Vesion : Alfa 1.11 ::: Crerated by Constantinos < tinoC23 /> Constantinou @ 06/2017 

*/




  // scrap code ........   

		 /*
			 keyboardKEYS[i].addKeyListener(new KeyListener()
			 {
      
		//		 

public void mouseEntered(MouseEvent e) { }
				
	//			
				
public void mouseExited(MouseEvent e) { }

//

public void mousePressed(MouseEvent e) { }

//
    
    public void actionPerformed(ActionEvent e) {}
    
    //          
	    
    public void keyTyped(KeyEvent e){}
    
        //
	    
    public void keyPressed(KeyEvent e){}
    
	    //
    
    public void keyReleased(KeyEvent e){}	

          //
			
		}
		);
		
		*/




// class import


import javax.swing.JScrollBar;

import javax.swing.JTextArea;

import java.awt.AWTException;

import java.awt.Image;

import java.awt.Toolkit;

import java.util.Random;

import javax.swing.Box;

import javax.swing.ImageIcon;

import java.awt.KeyEventDispatcher;

import java.awt.KeyboardFocusManager;

import java.awt.event.KeyEvent;

import java.lang.Object;

import java.awt.Robot;

import java.lang.ArrayIndexOutOfBoundsException;

 import java.io.IOException;
 
 import java.awt.Desktop;
 
 import java.io.File;
 
import java.awt.event.*;

import java.awt.event.MouseMotionListener;

import java.awt.Window;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import java.awt.Component;

import javax.swing.JFrame;

import javax.swing.JButton;

import javax.swing.JLabel;

import javax.swing.plaf.metal.MetalIconFactory;

import javax.swing.SwingConstants;

import java.awt.Font;

import javax.swing.JPanel;

import javax.swing.BoxLayout;

import javax.swing.JComponent;

import java.awt.GridLayout;

import java.awt.FlowLayout;

import javax.swing.JMenu;

import javax.swing.JMenuItem;

import javax.swing.JMenuBar;

import java.awt.Color;

import javax.swing.border.LineBorder;

import javax.swing.border.Border;

import javax.swing.Icon;

import javax.swing.ImageIcon;

import java.lang.Exception;

import java.awt.Dimension;

import javax.swing.JSeparator;

import java.util.Random;

import javax.swing.JOptionPane;

import javax.swing.SwingUtilities;

import javax.imageio.ImageIO;

import java.lang.NullPointerException;

import java.lang.NumberFormatException;

import java.lang.ArithmeticException;

import java.lang.RuntimeException;

import java.io.IOException;

import  java.awt.Image;

import javax.swing.BorderFactory;

import javax.swing.border.*;

import javax.swing.JWindow;

import java.util.*;

import javax.swing.JScrollPane;

// class import



public class InteractiveKEYBOARD extends JFrame 
{
	
	//
	
	private JTextArea TA;
	
	//
	
	
	private JScrollPane scrollPane;
	
	
	//
	
	private  Font f = new Font("Serif", Font.BOLD, 14);
	
	//
	// jmenubar options .... 
	
	// initializing jpanels 
	
	private  JPanel navigationMENU;  
	private JPanel JTextAreaPanel;
	private  JPanel JButtonsPanel1;
	private  JPanel JButtonsPanel2;
	private  JPanel JButtonsPanel3;
	private  JPanel JButtonsPanel4;
	private  JPanel JButtonsPanel5;
	private  JPanel JPanelsContainer; 
	
	//
	
	private  JMenuBar KBMenuBar;
        private  JMenu MENU;
	 private  JMenu ABOUT;
	 
	 //
	//  navigation menu jlabels
	
		private  JLabel  EXIT;  
	private  JLabel  programAuthor;
	
	//
	
	private  String [][] KBKeysNamesALT=new String[][]{
	{"`","1","2","3","4","5","6","7","8","9","0","-","="},
	{"Q","W","E","R","T","Y","U","I","O","P","[","]","|"},
	{"CAPS LOCK","A","S","D","F","G","H","J","K","L",";"," ' "},
	{"Z","X","C","V","B","N","M",",",".","/"},
	{"SPACE"}};
	
	// edit code .....
	
	private  String [][] KBKeysNames=new String[][]{
	{"`","1","2","3","4","5","6","7","8","9","0","-","="},
	{"q","w","e","r","t","y","u","i","o","p","[","]","|"},
	{"CAPS LOCK","a","s","d","f","g","h","j","k"," l ",";"," ' "},
	{"z","x","c","v","b","n","m",",",".","/"},
	{"SPACE"}};
		
		
        //
	
	
	int capsLOCKen=0;
	
	
	//
		
	
	// edit code .....
		
	private JButton [][] keyboardKEYS = new JButton[KBKeysNames.length][];
	
		
		
	   //
		
		
           private JFrame frame;
		

		//
		
		
		private String x=" ";
		
		private String keyString=" ";
		
		
		//
		
		private int jl=0;
		
		
		//
		
		
		
	void regularJButtonsText()
	{
		

		    //
		
	for(int i=0;i<KBKeysNames.length;i++)
      {
	      
	      
	      if( i == 0 )
	      {
		      
		      for(int i1=0;i1<KBKeysNames[i].length;i1++)
		      {
			      
			 keyboardKEYS[i][i1].setText(KBKeysNames[i][i1]);
			      
		      }
		      
		      
	      }
	      else if( i == 1 )
	      {
		      
		  		      
		      for(int i2=0;i2<KBKeysNames[i].length;i2++)
		      {
			
			
			 keyboardKEYS[i][i2].setText(KBKeysNames[i][i2]);
			      
		      }
		      
	      }
	      else if( i == 2 )
	      {
		     
		      		      
		      for(int i3=0;i3<KBKeysNames[i].length;i3++)
		      {
			
			
			 keyboardKEYS[i][i3].setText(KBKeysNames[i][i3]);
			      
		      }
		      
	      }
	      else if( i == 3 )
	      {
		      
		      
		      for(int i4=0;i4<KBKeysNames[i].length;i4++)
		      {
			
			
			 keyboardKEYS[i][i4].setText(KBKeysNames[i][i4]);
			      
		      }
		      
	      }
	      else if( i == 4)
	      {
		      
		      for(int i5=0;i5<KBKeysNames[i].length;i5++)
		      {
			
			 keyboardKEYS[i][i5].setText(KBKeysNames[i][i5]);
			      
		      }    
		      
	      }
	      
      }
      
      //
		
		
	}
		
		
		
		//
	
	
	
	void convertJButtonsText()
	{
		

		    //
		
	for(int i=0;i<KBKeysNames.length;i++)
      {
	      
	      
	      if( i == 0 )
	      {
		      
		      for(int i1=0;i1<KBKeysNamesALT[i].length;i1++)
		      {
			      
			 keyboardKEYS[i][i1].setText(KBKeysNamesALT[i][i1]);
			      
		      }
		      
		      
	      }
	      else if( i == 1 )
	      {
		      
		  		      
		      for(int i2=0;i2<KBKeysNamesALT[i].length;i2++)
		      {
			
			
			 keyboardKEYS[i][i2].setText(KBKeysNamesALT[i][i2]);
			      
		      }
		      
	      }
	      else if( i == 2 )
	      {
		     
		      		      
		      for(int i3=0;i3<KBKeysNamesALT[i].length;i3++)
		      {
			
			
			 keyboardKEYS[i][i3].setText(KBKeysNamesALT[i][i3]);
			      
		      }
		      
	      }
	      else if( i == 3 )
	      {
		      
		      
		      for(int i4=0;i4<KBKeysNamesALT[i].length;i4++)
		      {
			
			
			 keyboardKEYS[i][i4].setText(KBKeysNamesALT[i][i4]);
			      
		      }
		      
	      }
	      else if( i == 4)
	      {
		      
		      for(int i5=0;i5<KBKeysNamesALT[i].length;i5++)
		      {
			
			 keyboardKEYS[i][i5].setText(KBKeysNamesALT[i][i5]);
			      
		      }    
		      
	      }
	      
      }
      
      //
		
		
	}
	
	
	//

void JButtonsGenerator()
{
	
	
	
	
	
	//
	
	
	
	
	
	
	
	
	for(int i=0;i<KBKeysNames.length;i++)
      {
	      
	      jl=KBKeysNames[i].length;
	      
	 keyboardKEYS[i]=new JButton[jl];
	      
      }
      
      
      
      
      
      
      //
      
      
      
      
      
      
		
	for(int i=0;i<KBKeysNames.length;i++)
      {
	      
	      
	      if( i == 0 )
	      {
		      
		      for(int i1=0;i1<KBKeysNames[i].length;i1++)
		      {
			      
			
			
			keyboardKEYS[i][i1]=new JButton(KBKeysNames[i][i1]);
			 keyboardKEYS[i][i1].setText(KBKeysNames[i][i1]);
			 keyboardKEYS[i][i1].setEnabled(true);
			 keyboardKEYS[i][i1].setBackground(Color.WHITE);
			 keyboardKEYS[i][i1].setForeground(Color.BLACK);
			      			      keyboardKEYS[i][i1].setFocusable(false);  
			      keyboardKEYS[i][i1].setActionCommand(KBKeysNames[i][i1]);
	keyboardKEYS[i][i1].addActionListener(new ActionListener() 
	{ 
		
	@Override
  public void actionPerformed(ActionEvent evt) 
	{
			
    String cmd = evt.getActionCommand();
			
   x=new StringBuilder().append(TA.getText()).append(cmd).append(" ,").toString();
	
	TA.setText(x);
			
	}});

			      
	}
		      
		      
	      }
	      else if( i == 1 )
	      {
		      
		  		      
		      for(int i2=0;i2<KBKeysNames[i].length;i2++)
		      {
			
			keyboardKEYS[i][i2]=new JButton(KBKeysNames[i][i2]);
			 keyboardKEYS[i][i2].setText(KBKeysNames[i][i2]);
			 keyboardKEYS[i][i2].setEnabled(true);
			 keyboardKEYS[i][i2].setBackground(Color.WHITE);
			 keyboardKEYS[i][i2].setForeground(Color.BLACK);
						      keyboardKEYS[i][i2].setActionCommand(KBKeysNames[i][i2]);
			      keyboardKEYS[i][i2].setFocusable(false); 
	keyboardKEYS[i][i2].addActionListener(new ActionListener() 
	{ 
		
	@Override
  public void actionPerformed(ActionEvent evt) 
	{
			
    String cmd = evt.getActionCommand();
			
   x=new StringBuilder().append(TA.getText()).append(cmd).append(" ,").toString();
	
	TA.setText(x);
			
	}});
			      
		      }
		      
	      }
	      else if( i == 2 )
	      {
		     
		      		      
		      for(int i3=0;i3<KBKeysNames[i].length;i3++)
		      {
			
			keyboardKEYS[i][i3]=new JButton(KBKeysNames[i][i3]);
			 keyboardKEYS[i][i3].setText(KBKeysNames[i][i3]);
			 keyboardKEYS[i][i3].setEnabled(true);
			 keyboardKEYS[i][i3].setBackground(Color.WHITE);
			 keyboardKEYS[i][i3].setForeground(Color.BLACK);
						      keyboardKEYS[i][i3].setActionCommand(KBKeysNames[i][i3]);
			      keyboardKEYS[i][i3].setFocusable(false);  
	keyboardKEYS[i][i3].addActionListener(new ActionListener() 
	{ 
		
	@Override
  public void actionPerformed(ActionEvent evt) 
	{
			
    String cmd = evt.getActionCommand();
		
	if(cmd.equals("CAPS LOCK"))
	{
		
		
		if( capsLOCKen == 0 )
		{
			
			convertJButtonsText();
			
			capsLOCKen++;
			
		}
		else if(capsLOCKen == 1 )
		{
			
			regularJButtonsText();
			
			capsLOCKen--;
			
		}
		
		
		cmd=" ";
		
		  x=new StringBuilder().append(TA.getText()).append("").append("").toString();
		
		
	}
	else if( !(cmd.equals("CAPS LOCK")) )
	{
			
   x=new StringBuilder().append(TA.getText()).append(cmd).append(" , ").toString();
		
	}
	
	TA.setText(x);
			
	}});
			      
		      }
		      
	      }
	      else if( i == 3 )
	      {
		      
		      
		      for(int i4=0;i4<KBKeysNames[i].length;i4++)
		      {
			
			keyboardKEYS[i][i4]=new JButton(KBKeysNames[i][i4]);
			 keyboardKEYS[i][i4].setText(KBKeysNames[i][i4]);
			 keyboardKEYS[i][i4].setEnabled(true);
			 keyboardKEYS[i][i4].setBackground(Color.WHITE);
			 keyboardKEYS[i][i4].setForeground(Color.BLACK);
						      keyboardKEYS[i][i4].setActionCommand(KBKeysNames[i][i4]);
			      keyboardKEYS[i][i4].setFocusable(false);  
	keyboardKEYS[i][i4].addActionListener(new ActionListener() 
	{ 
		
	@Override
  public void actionPerformed(ActionEvent evt) 
	{
			
    String cmd = evt.getActionCommand();
			
   x=new StringBuilder().append(TA.getText()).append(cmd).append(" ,").toString();
	
	TA.setText(x);
			
	}});
			      
		      }
		      
	      }
	      else if( i == 4)
	      {
		      
		   
		      
		  		      
		      for(int i5=0;i5<KBKeysNames[i].length;i5++)
		      {
			
			keyboardKEYS[i][i5]=new JButton(KBKeysNames[i][i5]);
			 keyboardKEYS[i][i5].setText(KBKeysNames[i][i5]);
			 keyboardKEYS[i][i5].setEnabled(true);
			 keyboardKEYS[i][i5].setBackground(Color.WHITE);
			 keyboardKEYS[i][i5].setForeground(Color.BLACK);
			      if( keyboardKEYS[i][i5].getText().equals("SPACE") )
			      {
				      
                                 keyboardKEYS[i][i5].setPreferredSize(new Dimension(450,30)); 
				      
			      }
				keyboardKEYS[i][i5].setActionCommand(KBKeysNames[i][i5]);
			      keyboardKEYS[i][i5].setFocusable(false); 
	keyboardKEYS[i][i5].addActionListener(new ActionListener() 
	{ 
		
	@Override
  public void actionPerformed(ActionEvent evt) 
	{
			
   //  String cmd = evt.getActionCommand();
			
   x=new StringBuilder().append(TA.getText()).append(" ").append(" ,").toString();
	
	TA.setText(x);
			
	}});
			      
		      }    
		      
	      }
	      
      }
      
      //
		
}

	//
		
		
	
	
	
	
	public void InteractiveKEYBOARD()
	{
		
		//
		
		frame=new JFrame(" Interactive Keyboard - Version : Alpha 1.11 ");
		
			// initializing jpanels 
	
       navigationMENU=new JPanel();  
	 JTextAreaPanel=new JPanel();  
	JButtonsPanel1=new JPanel();
	JButtonsPanel2=new JPanel();  
	JButtonsPanel3=new JPanel();  
	JButtonsPanel4=new JPanel();  
		JButtonsPanel5=new JPanel();  
	JPanelsContainer=new JPanel();  
		
		//
		
		navigationMENU.setLayout(new FlowLayout(FlowLayout.LEFT));
		navigationMENU.setBackground(Color.ORANGE);
		  navigationMENU.setBorder(BorderFactory.createLineBorder(Color.CYAN));
		
		//
		
		
		
		JTextAreaPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		JTextAreaPanel.setBackground(Color.ORANGE);
		  JTextAreaPanel.setBorder(BorderFactory.createLineBorder(Color.CYAN));
		  
		
		  
		//
		
		JButtonsPanel1.setLayout(new FlowLayout(FlowLayout.CENTER));
		JButtonsPanel1.setBackground(Color.ORANGE);
		  JButtonsPanel1.setBorder(BorderFactory.createLineBorder(Color.CYAN));
		  
		  //
		
		JButtonsPanel2.setLayout(new FlowLayout(FlowLayout.CENTER));
		JButtonsPanel2.setBackground(Color.ORANGE);
		  JButtonsPanel2.setBorder(BorderFactory.createLineBorder(Color.CYAN));
		  
		  		//
		
		JButtonsPanel3.setLayout(new FlowLayout(FlowLayout.CENTER));
		JButtonsPanel3.setBackground(Color.ORANGE);
		  JButtonsPanel3.setBorder(BorderFactory.createLineBorder(Color.CYAN));
		  
		  		  		//
		
		JButtonsPanel4.setLayout(new FlowLayout(FlowLayout.CENTER));
		JButtonsPanel4.setBackground(Color.ORANGE);
		  JButtonsPanel4.setBorder(BorderFactory.createLineBorder(Color.CYAN));
		  
			  //
			  
			  
			  JButtonsPanel5.setLayout(new FlowLayout(FlowLayout.CENTER));
		JButtonsPanel5.setBackground(Color.ORANGE);
		  JButtonsPanel5.setBorder(BorderFactory.createLineBorder(Color.CYAN));
			  
			  
			  
			  //
			  
			  
		  
		  JPanelsContainer.setLayout((new BoxLayout(JPanelsContainer, BoxLayout.Y_AXIS)));
		JPanelsContainer.setBackground(Color.RED);
		
		//
		
		
	
		//
		// Program Menu  
		//    Create the menu bar
		//
		
		
        KBMenuBar = new JMenuBar();
        
        // initialize the main menu 
        
        MENU = new JMenu("MENU");
		MENU.setForeground(Color.BLACK);
		MENU.setBackground(Color.WHITE);
		
	ABOUT = new JMenu("HELP");
	ABOUT.setForeground(Color.BLACK);
	ABOUT.setBackground(Color.WHITE); 
			
		 KBMenuBar.add(MENU);
		 KBMenuBar.add(ABOUT);
				
			//
				
	EXIT=new JLabel("exit");
	  EXIT.setBackground(Color.WHITE);
	   EXIT.setForeground(Color.BLACK);
	 EXIT.setEnabled(true);
    EXIT.addMouseListener(new MouseAdapter() 
	{
         Color oldcolor =EXIT.getForeground();
         public void mouseEntered(MouseEvent me) 
		{
			Color c=Color.orange;
           EXIT.setForeground(c);
         }
         public void mouseExited(MouseEvent me) 
	 {
          EXIT.setForeground(oldcolor);
         }
      }
      );
	EXIT.addMouseListener(new MouseAdapter() 
	{
		
	public void mousePressed(MouseEvent e)
	{
		 		
	System.exit(0);
		 		
        }
		
      }
      );
       MENU.add(new JSeparator());//add a seperator line
	 MENU.add(EXIT);	
       MENU.add(new JSeparator());//add a seperator line
				
				 //
		
		 programAuthor=new JLabel("program creator");
	  programAuthor.setBackground(Color.WHITE);
	  programAuthor.setForeground(Color.BLACK);
	 programAuthor.setEnabled(true);
   programAuthor.addMouseListener(new MouseAdapter() 
	{
         Color oldcolor =programAuthor.getForeground();
         public void mouseEntered(MouseEvent me) 
		{
			Color c=Color.orange;
           programAuthor.setForeground(c);
         }
         public void mouseExited(MouseEvent me) 
	 {
         programAuthor.setForeground(oldcolor);
         }
      }
      );
	programAuthor.addMouseListener(new MouseAdapter() 
	{
		
	public void mousePressed(MouseEvent e)
	{
	
    		
	JOptionPane.showMessageDialog(null,
		" \n Program created by: \n Constantinos < tinoC23 /> Constantinou \n @ 06/2017 \n email : c.constantinou.24@gmail.com \n </[-_-]/> \n ",
		"INFORMATION MESSAGE",
		JOptionPane.INFORMATION_MESSAGE);
        
		 		
        }
		
      }
      );
 ABOUT.add(new JSeparator());//add a seperator line
      ABOUT.add(programAuthor);
       ABOUT.add(new JSeparator());//add a seperator line
      
            //
      
      		navigationMENU.add(KBMenuBar);

      //
      //
      // Area for JTextArea and the JScrollPane
      //
      
      	
      
      // check the pc keyboard -> caps lick button probability ....... 
		
		TA=new JTextArea(" ");
			TA.setEditable(false);
			  //  TA.setPreferredSize(new Dimension(550,250));
                     TA.setBounds(5,5,550,250);
			  TA.setMaximumSize(getPreferredSize());
		Border border = BorderFactory.createLineBorder(Color.BLACK);
        TA.setBorder(BorderFactory.createCompoundBorder(border,BorderFactory.createEmptyBorder(10, 10, 10, 10)));
            TA.setLineWrap(true);
               TA.setWrapStyleWord(false);
	       TA.setCaretPosition(TA.getDocument().getLength());
		TA.setFont(new Font("Serif",Font.PLAIN,12));
		TA.addKeyListener(new KeyListener()
			 {
				 
				 
				 //			 
				 
    public void keyReleased(KeyEvent e){}
    
    //
    
    public void keyPressed(KeyEvent e){}
    
    //
	    
	                    
			
			public void keyTyped(KeyEvent e) 
			{
				
        
        int id = e.getID();
	    
       
	    
        if (id == KeyEvent.KEY_TYPED)
         {
			
            char c = e.getKeyChar();
			
            keyString = " " + c + " ";
		 
		 
		 
	x=new StringBuilder().append(TA.getText()).append(keyString).append(" ,").toString();
	
	TA.setText(x);
		 
        } 
	else 
	{
		
		/*
		
           int keyCode = e.getKeyCode();
            
		keyString = "key code = " + keyCode+ " ("+ KeyEvent.getKeyText(keyCode)+ ")";
		
		x=new StringBuilder().append(x).append(TA.getText()).append(keyString).toString();
	
	      TA.setText(x);
		
		*/
		
        }
	

			
			}
			
                         //
	    
		
				 
			 });
		// JTextAreaPanel.add(TA);
		scrollPane = new JScrollPane(TA,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		 scrollPane.setPreferredSize(new Dimension(550, 250));
		scrollPane.setBounds(5, 5, 550, 250);
                scrollPane.setBorder(BorderFactory.createTitledBorder("Interactive Keyboard - Version : Alpha 1.11"));
		scrollPane.setViewportView(TA);			 
		// JScrollBar sb = scrollPane.getVerticalScrollBar();
                //  sb.setValue( sb.getMaximum() );
		// Box box=Box.createHorizontalBox();
		// box.add(scrollPane);
		JTextAreaPanel.add(scrollPane);
			 
			 
		
			 
	//=========================================================================================
      
      //
       // Area for JButtons ..... 
      //
      
      
      
      JButtonsGenerator();
      
    
      
      for(int i=0;i<KBKeysNames.length;i++)
      {
	      
	      
	      if( i == 0 )
	      {
		      
		      for(int i1=0;i1<KBKeysNames[i].length;i1++)
		      {
			
			JButtonsPanel1.add(keyboardKEYS[i][i1]);
			      
		      }
		      
		      
	      }
	      else if( i == 1 )
	      {
		      
		  		      
		      for(int i2=0;i2<KBKeysNames[i].length;i2++)
		      {
			
			JButtonsPanel2.add(keyboardKEYS[i][i2]);
			      
		      }
		      
	      }
	      else if( i == 2 )
	      {
		     
		      		      
		      for(int i3=0;i3<KBKeysNames[i].length;i3++)
		      {
			
			JButtonsPanel3.add(keyboardKEYS[i][i3]);
			      
		      }
		      
	      }
	      else if( i == 3 )
	      {
		      
		      
		      for(int i4=0;i4<KBKeysNames[i].length;i4++)
		      {
			
			JButtonsPanel4.add(keyboardKEYS[i][i4]);
			      
		      }
		      
	      }
	      else if( i == 4)
	      {
		      
		  		      
		      for(int i5=0;i5<KBKeysNames[i].length;i5++)
		      {
			
			      try
			      {
			      
			JButtonsPanel5.add(keyboardKEYS[i][i5]);
				      
			      }
			      catch(NullPointerException me)
			      {
				      
				      me.printStackTrace();
				      
			      }
			      
		      }    
		      
	      }
	      

	      
      }
      
      
      //
      
      
      //
      // additional code goes here .... [jpanels] 
      //
      
	/*
	
       navigationMENU.revalidate();
	 JTextAreaPanel.revalidate();
	JButtonsPanel1.revalidate();
	JButtonsPanel2.revalidate();
	JButtonsPanel3.revalidate();
	JButtonsPanel4.revalidate();
	JPanelsContainer.revalidate();
	
	*/
	
          //
		
		JPanelsContainer.add(navigationMENU);
		 JPanelsContainer.add(JTextAreaPanel);
		JPanelsContainer.add(JButtonsPanel1);
		 JPanelsContainer.add(JButtonsPanel2);
                 JPanelsContainer.add(JButtonsPanel3);
		 JPanelsContainer.add(JButtonsPanel4);
                 JPanelsContainer.add(JButtonsPanel5);
		   
	//   
	
                   // JPanelsContainer.revalidate();
		
		//
		
	
		
		frame.add(JPanelsContainer);
		
		frame.setDefaultLookAndFeelDecorated(true);
		
		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		
		frame.setVisible(true);
		
		frame.setResizable(false);
		
		frame.setLocationRelativeTo(null);
		
		// frame.setSize(800,600);
		
		// frame.revalidate();
		
	        frame.pack();
		
                      //
      
      
		
		
	}
	
	
	//
	
	
	
	
	public static void main(String [] args)
	{
		
		
		InteractiveKEYBOARD kb = new  InteractiveKEYBOARD();
		
		kb.InteractiveKEYBOARD();
		
		
	}
	
	//
	
	
}



