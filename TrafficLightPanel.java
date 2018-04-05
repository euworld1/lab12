import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

/**
 * Demonstrates using an array of JButtons.
 * 
 * @author Michael Arthur
 * CS121L Section 1
 *
 */
@SuppressWarnings("serial")
public class TrafficLightPanel extends JPanel
{
	private final Color[] COLORS = { Color.GREEN,Color.YELLOW, Color.RED }; 
	private JButton colorButton;
	private int counter = 0;


	/**
	 * Initializes the buttons and preview panel and adds the listener
	 * to all of the buttons.
	 */
	public TrafficLightPanel()
	{
		colorButton = new JButton();

		ColorButtonListener listener = new ColorButtonListener();

		// create our buttons and add them to the panel


		colorButton.setBackground(COLORS[0]);
		colorButton.addActionListener(listener);
		colorButton.setPreferredSize(new Dimension(200, 200));
		this.add(colorButton);


		// create our preview panel and add it to this panel

	}

	private class ColorButtonListener implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e)
		{
			counter++;
			if(e.getSource() == colorButton) {
				
				
				
				if (counter >2)
					counter =0;
				System.out.println(counter);
				colorButton.setBackground(COLORS[counter]);
				
				//previewPanel.setBackground(clicked.getBackground());


			}
			//colorButton.setBackground(COLORS[counter]);
		}
	}}
