package view;

import controller.JeopardyController;
import java.awt.Container;
import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import model.Pregunta;

public class JeopardyView extends JFrame {

    private ArrayList<Pregunta> modelo;
    private JeopardyPanel panelJeopardy;
    private JButton[] arrayBotones;
    private static JLabel icolabel;

    public JeopardyView(ArrayList<Pregunta> modelo) {
        this.modelo = modelo;

        this.setTitle("Jeopardy");
        this.setSize(950, 500);
        this.setResizable(true);
        this.setLocationRelativeTo(null);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new BorderLayout());

        icolabel = new JLabel(new ImageIcon("image.png"));

        add(icolabel);

        icolabel.setLayout(new FlowLayout());

        panelJeopardy = new JeopardyPanel(modelo);
        
        icolabel.add(panelJeopardy, BorderLayout.PAGE_START);
        arrayBotones = panelJeopardy.getArrayBotonesJeopardyPanel();
        this.setVisible(true);
        
    }
    public void addListeners(JeopardyController controller) {
        for (int i = 0; i < arrayBotones.length; i++) {
            arrayBotones[i].addActionListener(controller);
        }
    }

    public JButton[] getBotonesView() {
        return this.arrayBotones;
    }

}
