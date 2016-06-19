import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Log extends JFrame{
	
	public JButton delete;
	public JTextArea log;
	
	public Log(){
		setTitle("                                             Log");
		setSize(500,250);
		setVisible(false);
		
		JPanel panel = new JPanel();
		delete = new JButton("기록삭제");
		log = new JTextArea(10,30);
		log.setEditable(false);
		JScrollPane scrollPane = new JScrollPane(log);
		
		panel.add(scrollPane);
		panel.add(delete);
		
		add(panel);
		
		delete.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if(e.getSource() == delete){
					log.setText("");
				}
			}
		});
	}

}
