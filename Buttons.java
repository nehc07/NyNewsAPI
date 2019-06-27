

package simplelogin;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import simplelogin.LoginForm;

public class Buttons {
    
    public static void main(String arg[]){
            
        RadioDemo r = new RadioDemo();
       
    
    }
    
}
class RadioDemo extends JFrame{
JTextArea t1;
JRadioButton r1,r2;
JButton b;

    public RadioDemo(){
        
        t1= new JTextArea("                                  ");
        r1= new JRadioButton("arts");
        r2= new JRadioButton("books");
        b = new JButton("Execute");
        
        
       ButtonGroup bg = new ButtonGroup();
       bg.add(r1);
       bg.add(r2);
       
       
       add(r1);
       add(r2);
       add(t1);
       add(b);
       
       
       b.addActionListener(new ActionListener(){
            
            public void actionPerformed(ActionEvent e) {
                
                if(r1.isSelected()){
                    LoginForm info = new LoginForm();
                    info.setVisible(true);
                
                t1.setText("New art has been published!!");
                }
                
                else{
                t1.setText("New book has released!!");
                
                }
            }
       
       
       
       
       
       
       });
       
       setLayout(new FlowLayout());
       setVisible(true);
       setSize(400, 400);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
    }
}
