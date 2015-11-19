package view;

import javax.swing.JLabel;
import model.Pregunta;
import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Color;
import model.Jugador;
import java.awt.Dimension;
import javax.swing.SwingConstants;
import javax.swing.BorderFactory;
import java.util.ArrayList;


public class JeopardyPanel extends JPanel{
    private ArrayList<Pregunta> pregunta;
    private Jugador jugador;
    
    private JLabel tituloJeopardy;
    private JPanel panelSuperior;
    private JPanel panelCentral;
    private JPanel panelCentral1;
    private JPanel panelCentral2;
    private JPanel panelInferior;
    private JLabel rondaJeopardy;
    private JLabel jugadorJeopardy;
    private static JButton[] arrayBotones;
    private static JLabel[] arrayLabels;
    
    private final String VALOR_BOTONES[] = {"100$", "200$", "300$", "400$", "500$"};
    
    public JeopardyPanel(ArrayList<Pregunta> pregunta)
    {
        this.pregunta = pregunta;
        
        this.setLayout(new BorderLayout());
        this.setPreferredSize(new Dimension(627, 610));
        
        panelSuperior = new JPanel();
        
        tituloJeopardy = new JLabel();
        tituloJeopardy.setText("JEOPARDY!");
        tituloJeopardy.setHorizontalAlignment(SwingConstants.CENTER);
        tituloJeopardy.setFont(new java.awt.Font("Arial", 0, 36));
        tituloJeopardy.setPreferredSize(new Dimension(745, 43));
        tituloJeopardy.setBackground(Color.blue);
        tituloJeopardy.setForeground(Color.white);
        tituloJeopardy.setBorder(BorderFactory.createLineBorder(Color.black));
        tituloJeopardy.setOpaque(true);
        
        panelSuperior.add(tituloJeopardy);
        this.add(panelSuperior, BorderLayout.PAGE_START);
        
        panelCentral = new JPanel();
        panelCentral.setLayout(new BorderLayout());
        
        panelCentral1 = new JPanel(new GridLayout(0, 6));
        panelCentral1.setPreferredSize(new Dimension(627, 48));
        
        arrayLabels = new JLabel[30];
        
        int count = 0;
        for (int i = 0; i < arrayLabels.length; i++)
        {
            arrayLabels[i] = new JLabel(pregunta.get(i).getCategoria());
            arrayLabels[i].setPreferredSize(new Dimension(100, 50));
            arrayLabels[i].setMinimumSize(new Dimension(97, 59));
            arrayLabels[i].setMaximumSize(new Dimension(100, 50));
            arrayLabels[i].setHorizontalAlignment(SwingConstants.CENTER);
            arrayLabels[i].setBorder(BorderFactory.createLineBorder(Color.black));
            arrayLabels[i].setFont(new java.awt.Font("Arial", 0, 12));
            arrayLabels[i].setBackground(Color.blue);
            arrayLabels[i].setOpaque(true);
            arrayLabels[i].setForeground(Color.white);
            
            if(i%5 == 0){
                panelCentral1.add(arrayLabels[i]);
            }
           
        }
        panelCentral.add(panelCentral1, BorderLayout.PAGE_START);
        
        panelCentral2 = new JPanel(new GridLayout(0, 6));
        panelCentral2.setPreferredSize(new Dimension(627, 627));
        
        arrayBotones = new JButton[30];

        for (int i = 0; i < arrayBotones.length; i++) {

            if ((i % 6 == 0) && (i > 0)) {
                count++;
            }
        
            arrayBotones[i] = new JButton(VALOR_BOTONES[count]);
            arrayBotones[i].setBackground(Color.blue);
            arrayBotones[i].setForeground(Color.white);
            arrayBotones[i].setBorder(BorderFactory.createLineBorder(Color.black));
            arrayBotones[i].setFont(new java.awt.Font("Arial", 0, 12));
            
            
            //crear boton y guardarlo en la posicion i del array
            
            panelCentral2.add(arrayBotones[i]);
        }
        panelCentral.add(panelCentral2, BorderLayout.CENTER);
        
        this.add(panelCentral, BorderLayout.CENTER);
        
        panelInferior = new JPanel();
        panelInferior.setLayout(new BorderLayout());
        panelInferior.setPreferredSize(new Dimension(627, 43));
        
        int ronda = 0;
        rondaJeopardy = new JLabel();
        rondaJeopardy.setText("Ronda: " +ronda);
        rondaJeopardy.setHorizontalAlignment(SwingConstants.CENTER);
        rondaJeopardy.setFont(new java.awt.Font("Arial", 0, 12));
        rondaJeopardy.setPreferredSize(new Dimension(200, 43));
        rondaJeopardy.setBackground(Color.blue);
        rondaJeopardy.setForeground(Color.white);
        rondaJeopardy.setBorder(BorderFactory.createLineBorder(Color.black));
        rondaJeopardy.setOpaque(true);
        
        String jugadorX = "Jugador 1";
        jugadorJeopardy = new JLabel();
        jugadorJeopardy.setText(jugadorX);
        jugadorJeopardy.setHorizontalAlignment(SwingConstants.CENTER);
        jugadorJeopardy.setFont(new java.awt.Font("Arial", 0, 12));
        jugadorJeopardy.setPreferredSize(new Dimension(200, 43));
        jugadorJeopardy.setBackground(Color.blue);
        jugadorJeopardy.setForeground(Color.white);
        jugadorJeopardy.setBorder(BorderFactory.createLineBorder(Color.black));
        jugadorJeopardy.setOpaque(true);
        
        panelInferior.add(rondaJeopardy, BorderLayout.WEST);
        panelInferior.add(jugadorJeopardy, BorderLayout.EAST);
        
        this.add(panelInferior, BorderLayout.PAGE_END);
    }
    public JButton[] getArrayBotonesJeopardyPanel()
    {
        return this.arrayBotones;
    }
    public ArrayList<Pregunta> getPreguntaJeopardyPanel()
    {
        return this.pregunta;
    }
    public Jugador getJugadorJeopardyPanel()
    {
        return this.jugador;
    }
    private boolean isCategoriaIn()
    {
        
        return true;
    }
}
