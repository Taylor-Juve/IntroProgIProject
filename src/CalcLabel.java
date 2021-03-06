import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class CalcLabel extends JLabel {
	
	public CalcLabel(Calculator calc) {
		super("", SwingConstants.RIGHT);

		setPreferredSize(new Dimension(502, 88));
		setBackground(CalcPanel.BACKGROUND);
		setOpaque(true); // necessary to set Color
		setBorder(new EmptyBorder(0, 0, 0, 12));
		setFont(new Font(CalcPanel.FONTNAME_BOLD, Font.PLAIN, 40));
	}
	
}
