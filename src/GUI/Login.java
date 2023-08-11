package GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login implements ActionListener {

    private JPanel login_panel;
    private JButton OKButton;
    private JButton REGISTRACIAButton;
    private JTextField textField_email;
    private JPasswordField passwordField;
    private Frame frame;

    public Login(Frame frame) {
        this.frame = frame;

        OKButton.addActionListener(this);
        REGISTRACIAButton.addActionListener(this);
    }

    public JPanel get_content()
    {
        return login_panel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(OKButton)){

        }
        if (e.getSource().equals(REGISTRACIAButton)){
            frame.set_content(new Registracia(frame).get_content());
        }
    }
}
