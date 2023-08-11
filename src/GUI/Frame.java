package GUI;

import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {
    private Registracia registracia;
    public Frame(){
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //neda sa zvacsovat a zmensovat dialogove okno
        setResizable(false);
        //dialogove okno je na celu obrazovku
        setExtendedState(JFrame.MAXIMIZED_BOTH);

        registracia = new Registracia(this);
        setContentPane(registracia.get_content());

        //nastavenie Frame-u aby bol viditelny
        setVisible(true);
    }

    /**
     * metoda, na prenastavenie vnutorneho contentu dialogoveho okna
     * @param novy_content
     */
    public void set_content(JPanel novy_content)
    {
         setContentPane(novy_content);
         //refresh dialogoveho okna
         revalidate();
         //premalovanie contentu, ktory vkladame do Frame
         repaint();
    }
}
