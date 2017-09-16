import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.awt.*;
import java.io.IOException;
import java.net.URL;

import java.applet.*;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import javafx.scene.media.MediaPlayer;

import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRootPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.border.LineBorder;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import sun.audio.AudioData;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;
import sun.audio.ContinuousAudioDataStream;

import com.sun.jndi.ldap.ManageReferralControl;
import com.sun.org.apache.xerces.internal.util.URI;
import com.sun.org.apache.xml.internal.serializer.utils.StringToIntTable;
import com.sun.prism.Image;
import com.sun.scenario.effect.ImageData;
import com.sun.security.auth.module.JndiLoginModule;


public class AlphabetPrimary extends JPanel {
	            
	/**
	 * 
	 */
	private static final long serialVersionUID = 787207322273517402L;
	Icon alphabetIcon[]=new ImageIcon[26];
	int count;
	JButton alphabetButton[]=new JButton[26];
    int i=0;
    int j=0;
	String x;
	AudioClip clip[]=new AudioClip[26];
	Icon a[]=new ImageIcon[26];
    JMenu homeMenu=new JMenu("Home");
    java.awt.Image background=new ImageIcon(getClass().getResource("AlphabetBackground.jpg")).getImage();
    HomeFrame homeframe;
	public AlphabetPrimary(HomeFrame hf)
	{
		this.homeframe=hf;
		setLayout(new FlowLayout());
		char s='A';
		for(int i=0;i<26;i++)
		{
			x=s+"_I.png";
			alphabetIcon[i]=new ImageIcon(getClass().getResource(x));
			s=(char) (s+1)	;
		}
		//JButton button[]=new JButton[26];
		for(int i=0;i<26;i++){
	    alphabetButton[i]=new JButton();
		alphabetButton[i].setIcon(alphabetIcon[i]);
		add(alphabetButton[i]);
		}
		Thehandler handler=new Thehandler();
		for(int i=0;i<alphabetButton.length;i++)
		{
			alphabetButton[i].addActionListener(handler);
		}
	}
	protected void paintComponent(Graphics arg0) {
		super.paintComponent(arg0);
		arg0.drawImage(background, 0, 0, this);
	}
	private class Thehandler implements ActionListener
	{
		public void actionPerformed(ActionEvent event) {
			// TODO Auto-generated method stub
			for(i=0;i<3;i++){
			if(event.getSource()==alphabetButton[i])
			{
				//clip[j].stop();
				x="Alarm0"+(i+1)+".wav";
				URL url = getClass().getResource(x);
				clip[i] =  Applet.newAudioClip(url);
				clip[i].play();
			}
			}
		}	
		
	}
}
