package view;

import controller.JeopardyController;
import java.awt.Container;
import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JButton;
import model.Pregunta;


public class JeopardyView extends JFrame{
    
    private ArrayList<Pregunta> modelo;
    private JeopardyPanel panelJeopardy;
    private JButton[] arrayBotones;
    
    public JeopardyView(ArrayList<Pregunta> modelo)
    {
        this.modelo = modelo;
        
        this.setTitle("Jeopardy!");
        this.setLayout(new BorderLayout());
        this.setLocation(520, 200);
        this.setPreferredSize(new Dimension(745, 638));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        
        addComponentsToPane(this.getContentPane());
        this.pack();
        this.setVisible(true);
    }
    public void addComponentsToPane(Container pane)
    {
        panelJeopardy = new JeopardyPanel(modelo);
        arrayBotones = panelJeopardy.getArrayBotonesJeopardyPanel();
        
        pane.add(panelJeopardy, BorderLayout.PAGE_END);
    }
    public void addListeners(JeopardyController controller)
    {
        for (int i = 0; i < arrayBotones.length; i++)
        {
            arrayBotones[i].addActionListener(controller);
        }
    }
    
    public JButton[] getBotonesView()
    {
        return this.arrayBotones;
    }
    
}
