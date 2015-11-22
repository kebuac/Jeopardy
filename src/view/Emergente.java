package view;

import controller.EmergenteController;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import model.Pregunta;
import java.util.ArrayList;
import javax.swing.SwingConstants;

public class Emergente extends JFrame{
    
    //modelo
    private Pregunta modelo;
    //controles
    private JLabel preguntaLabel;
    private JButton orderButton;
    private JPanel entreePanel;
    private JRadioButton radioButton;
    private ButtonGroup entreeGroup;
    private ArrayList<Pregunta> preguntas;
    
    public Emergente(Pregunta modelo) {

        this.modelo = modelo;
        this.setLocation(200, 200);
        this.setLayout(new BorderLayout());
        this.setPreferredSize(new Dimension(1000, 400));
        
        String pregunta;
        String respuesta1;
        String respuesta2;
        String respuesta3;
        String respuesta4;
        
        pregunta = modelo.getTextoPregunta();
        respuesta1 = modelo.getRespuestas().get(0).getTexto();
        respuesta2 = modelo.getRespuestas().get(1).getTexto();
        respuesta3 = modelo.getRespuestas().get(2).getTexto();
        respuesta4 = modelo.getRespuestas().get(3).getTexto();
        
        preguntaLabel = new JLabel(pregunta);
        preguntaLabel.setHorizontalAlignment(SwingConstants.CENTER);
        preguntaLabel.setForeground(Color.WHITE);
        preguntaLabel.setFont(new Font("BOLD", 0, 17));
        preguntaLabel.setBackground(Color.BLUE);
        preguntaLabel.setOpaque(true);
        this.add(preguntaLabel, BorderLayout.PAGE_START);
        
        entreeGroup = new ButtonGroup();
        
        
        entreePanel = new JPanel(new GridLayout(4, 0));
        entreePanel.add(radioButton = new JRadioButton(respuesta1, true));
        radioButton.setActionCommand(respuesta1);
        entreeGroup.add(radioButton);
        radioButton.setForeground(Color.BLACK);
        radioButton.setFont(new Font("BOLD", 0, 17));

        entreePanel.add(radioButton = new JRadioButton(respuesta2));
        radioButton.setActionCommand(respuesta2);
        entreeGroup.add(radioButton);
        radioButton.setForeground(Color.BLACK);
        radioButton.setFont(new Font("BOLD", 0, 17));

        entreePanel.add(radioButton = new JRadioButton(respuesta3));
        radioButton.setActionCommand(respuesta3);
        entreeGroup.add(radioButton);
        radioButton.setForeground(Color.BLACK);
        radioButton.setFont(new Font("BOLD", 0, 17));
        
        entreePanel.add(radioButton = new JRadioButton(respuesta4));
        radioButton.setActionCommand(respuesta4);
        entreeGroup.add(radioButton);
        radioButton.setForeground(Color.BLACK);
        radioButton.setFont(new Font("BOLD", 0, 17));
        
        orderButton = new JButton("Enviar respuesta");
        orderButton.setBackground(Color.BLUE);
        orderButton.setForeground(Color.WHITE);
        this.add(entreePanel, BorderLayout.CENTER);
        this.add(orderButton, BorderLayout.PAGE_END);        
    }
        
    public void addListeners(EmergenteController controller)
    {
        orderButton.addActionListener(controller);
    }
    
    public JButton getOrderButton()
    {
        JButton entree;
        entree = new JButton(entreeGroup.getSelection().getActionCommand());
        
        return entree;
    }
}
