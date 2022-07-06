// ############################################ Begin Imports ########################################################################################## //

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.lang.*;
import java.text.DateFormat;
import java.util.Date;

//############################################ End Imports ############################################################################################# //
/* The purpose of this Java file is to demonstrate familiarity with the the Java Abstract Window Toolkit and Javax Swing 
 * tools as a method of creating a clock that users can interface with
 * Copyleft,all wrongs reserved-- this may be reused without permission with the explicit understanding that nothing resulting from this can be copywritten.
 *  Nicholas J. Marn 2022
 * All code has been written by Nicholas Marn unless otherwise noted
 * Information on construstion provided by Oracle https://docs.oracle.com/en/java/javase/13/docs/api/java.desktop/java/awt/package-summary.html
 */


// ############################################ Begin ClockMaker()/Driver Class ######################################################################### //
// This class contains the main method, which will in turn start the JFrame by instantiating an instance of ClockMaker. This will then lead 
// to the creation of the Jframe via the ClockMaker constructor
public class ClockMaker {
	
	public static void main (String [] args) {
		new ClockMaker();
		System.out.println("Hi!");
	}
	// Uses override to create the constructor (This idea was derived from and serves as a variant of
	// https://stackoverflow.com/questions/13366780/how-to-add-real-time-date-and-time-into-a-jframe-component-e-g-status-bar
// ############################################ Start Overridden ClockMaker() Class #################################################################### //
	public ClockMaker() {
		EventQueue.invokeLater(new Runnable() {
		@Override
			public void run() {
			JFrame Clock = new JFrame("Nick's JFrame Clock!");
			Clock.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            Clock.setLayout(new BorderLayout());
            Clock.add(new ClockFace());
            Clock.pack();
            Clock.setVisible(true);
	
			}
		
		});
	}
// ######################################## End  Overridden ClockMaker() Class ######################################################################### //
// ######################################## Begin ClockFace() Class #################################################################################### //
// Again, this heavily borrows from https://stackoverflow.com/questions/13366780/how-to-add-real-time-date-and-time-into-a-jframe-component-e-g-status-bar
// user MadProgrammer's implementation, adding on some bells and whistles to display comprehension
    public class ClockFace extends JPanel {
    	private JLabel DigitalClock;
    	
    	public ClockFace() {
            setLayout(new BorderLayout());
            DigitalClock = new JLabel();
            DigitalClock.setHorizontalAlignment(JLabel.CENTER);
            timeUpdate();
            add(DigitalClock);

            Timer timer = new Timer(600,new ActionListener() {
                @Override
				public void actionPerformed(ActionEvent e) {
					timeUpdate();
					
				}
            });
            timer.setRepeats(true);
            timer.setCoalesce(true);
            timer.setInitialDelay(0);
            timer.start();
        }

        public void timeUpdate() {
            DigitalClock.setText(DateFormat.getDateTimeInstance().format(new Date()));
        }
	
    }
 // ######################################## End ClockFace() Class ##################################################################################### //
}
//############################################ End Driver Class ######################################################################################## //