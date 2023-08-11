package GUI;

import javax.swing.*;
import javax.swing.text.StyledEditorKit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Pattern;

public class Registracia implements ActionListener {
    private JPanel panelRegistracia;
    private JButton OKButton;
    private JButton LOGINButton;
    private JTextField textField_meno;
    private JTextField textField_priezvisko;
    private JTextField textField_email;
    private JPasswordField passwordField;
    private JLabel password_label;
    private JLabel email_label;
    private Frame frame;

    public Registracia(Frame frame) {
        this.frame = frame;

        OKButton.addActionListener(this);
        LOGINButton.addActionListener(this);
    }

    public JPanel get_content()
    {
        return panelRegistracia;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(OKButton)){
            //ziskanie hesla z passwordfield
            char[] heslo_char = passwordField.getPassword();
            String heslo = new String(heslo_char);

            //kontrola ci textfieldy su prazdne
            if (!textField_meno.getText().isEmpty() && !textField_priezvisko.getText().isEmpty() &&
            !textField_email.getText().isEmpty() && !heslo.equals("")){

                //regexy na heslo a email
                String regex_heslo = "^(?=.*[A-Za-z])(?=.*\\d)(?=.*[@#$%^&+=!*])(?=.*[a-zA-Z]).{8,}$";
                String regex_mail = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";

                if (Pattern.matches(regex_heslo,heslo) && Pattern.matches(regex_mail,textField_email.getText()))
                {
                    //prepneme pouzivatela na novy frame
                    JOptionPane.showMessageDialog(this.frame,"Podarilo sa registrovat usera.","Uspech",JOptionPane.INFORMATION_MESSAGE);
                }else{
                    String chybajuce_prvky_na_label = "";

                    String velke_pismeno = ".*[A-Z].*";
                    String male_pismeno = ".*[a-z].*";
                    String cislo = ".*\\d.*";
                    String specialny_znak = ".*[@#$%^&+=!*].*";

                    //kontrola ci je v hesle potrebny prvok
                    if (!Pattern.matches(velke_pismeno,heslo)){
                        chybajuce_prvky_na_label += "\t\t velke pismeno";
                    }
                    if (!Pattern.matches(male_pismeno,heslo)){
                        chybajuce_prvky_na_label += "\t\t male pismeno";
                    }
                    if (!Pattern.matches(cislo,heslo)){
                        chybajuce_prvky_na_label += "\t\t cislo";
                    }
                    if (!Pattern.matches(specialny_znak,heslo)){
                        chybajuce_prvky_na_label += "\t\t specialny znak";
                    }
                    if (heslo.length() < 8){
                        chybajuce_prvky_na_label += "\t\t aspon 8 znakov";
                    }

                    password_label.setText("* " + chybajuce_prvky_na_label);

                    Boolean pom_email = Pattern.matches(regex_mail,textField_email.getText());
                    email_label.setText("");
                    if (!pom_email)
                    {
                        email_label.setText("* zly format");
                    }
                }
            }else{
                JOptionPane.showMessageDialog(frame,"Vypln polia!","WARNING",JOptionPane.WARNING_MESSAGE);
            }
        }
        if (e.getSource().equals(LOGINButton)){
            //prepnutie sa na novy LOGIN frame
            frame.set_content(new Login(frame).get_content());
        }
    }
}
