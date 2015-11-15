package view;

import java.awt.GridBagConstraints;
import javax.swing.JLabel;
import model.Pregunta;
import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Color;
import model.Jugador;
import java.awt.Dimension;
import javax.swing.SwingConstants;
import javax.swing.BorderFactory;


public class JeopardyPanel extends JPanel{
    private Pregunta pregunta;
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
    
    private final String[] VALOR_BOTONES = {"100", "200", "300", "400", "500"};
    private final String[] VALOR_CATEGORIAS = {"Categoria 1", "Categoria 2", "Categoria 3", "Categoria 4", "Categoria 5", "Categoria 6"};
    
    public JeopardyPanel(Pregunta pregunta)
    {
        this.pregunta = pregunta;
        
        this.setLayout(new BorderLayout());
        this.setPreferredSize(new Dimension(627, 610));
        
        panelSuperior = new JPanel();
        
        tituloJeopardy = new JLabel();
        tituloJeopardy.setText("JEOPARDY!");
        tituloJeopardy.setHorizontalAlignment(SwingConstants.CENTER);
        tituloJeopardy.setFont(new java.awt.Font("Arial", 0, 36));
        tituloJeopardy.setPreferredSize(new Dimension(627, 43));
        tituloJeopardy.setBackground(Color.blue);
        tituloJeopardy.setForeground(Color.white);
        tituloJeopardy.setBorder(BorderFactory.createLineBorder(Color.black));
        tituloJeopardy.setOpaque(true);
        
        panelSuperior.add(tituloJeopardy);
        this.add(panelSuperior, BorderLayout.PAGE_START);
        
        panelCentral = new JPanel();
        panelCentral.setLayout(new BorderLayout());
        
        panelCentral1 = new JPanel();
        panelCentral1.setPreferredSize(new Dimension(627, 48));
        
        arrayLabels = new JLabel[VALOR_CATEGORIAS.length];
        
        int numeroFilasLabels = 6;
        for (int i = 0; i < numeroFilasLabels; i++)
        {
            arrayLabels[i] = new JLabel(VALOR_CATEGORIAS[i]);
            arrayLabels[i].setPreferredSize(new Dimension(100, 50));
            arrayLabels[i].setMinimumSize(new Dimension(97, 59));
            arrayLabels[i].setMaximumSize(new Dimension(100, 50));
            arrayLabels[i].setHorizontalAlignment(SwingConstants.CENTER);
            arrayLabels[i].setBorder(BorderFactory.createLineBorder(Color.black));
            arrayLabels[i].setFont(new java.awt.Font("Arial", 0, 12));
            arrayLabels[i].setBackground(Color.blue);
            arrayLabels[i].setOpaque(true);
            arrayLabels[i].setForeground(Color.white);
            panelCentral1.add(arrayLabels[i]);
        }
        panelCentral.add(panelCentral1, BorderLayout.PAGE_START);
        
        panelCentral2 = new JPanel();        
        GridBagLayout layoutPanelCentral = new GridBagLayout();
        GridBagConstraints c = new GridBagConstraints();
        panelCentral2.setLayout(layoutPanelCentral);
        panelCentral2.setPreferredSize(new Dimension(627, 627));
        
        arrayBotones = new JButton[VALOR_BOTONES.length];
        
        int numeroFilasBotones = 5;
        
        for (int i=0; i<numeroFilasBotones; i++)
        {
            arrayBotones[i] = new JButton(VALOR_BOTONES[i]);
            arrayBotones[i].setBackground(Color.blue);
            arrayBotones[i].setForeground(Color.white);
            
            c.gridx=0;
            c.gridy=i;
            c.ipady=50;
            c.ipadx=50;
            c.fill=123;
            panelCentral2.add(arrayBotones[i], c);
            
            arrayBotones[i] = new JButton(VALOR_BOTONES[i]);
            arrayBotones[i].setBackground(Color.blue);
            arrayBotones[i].setForeground(Color.white);          
            
            c.gridx=1;
            c.gridy=i;
            panelCentral2.add(arrayBotones[i], c);
            
            arrayBotones[i] = new JButton(VALOR_BOTONES[i]);
            arrayBotones[i].setBackground(Color.blue);
            arrayBotones[i].setForeground(Color.white);
            
            c.gridx=2;
            c.gridy=i;
            panelCentral2.add(arrayBotones[i], c);
            
            arrayBotones[i] = new JButton(VALOR_BOTONES[i]);
            arrayBotones[i].setBackground(Color.blue);
            arrayBotones[i].setForeground(Color.white);
            
            c.gridx=3;
            c.gridy=i;
            panelCentral2.add(arrayBotones[i], c);
            
            arrayBotones[i] = new JButton(VALOR_BOTONES[i]);
            arrayBotones[i].setBackground(Color.blue);
            arrayBotones[i].setForeground(Color.white);
            
            c.gridx=4;
            c.gridy=i;
            panelCentral2.add(arrayBotones[i], c);
            
            arrayBotones[i] = new JButton(VALOR_BOTONES[i]);
            arrayBotones[i].setBackground(Color.blue);
            arrayBotones[i].setForeground(Color.white);
            
            c.gridx=5;
            c.gridy=i;
            panelCentral2.add(arrayBotones[i], c);
            
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
    public Pregunta getPreguntaJeopardyPanel()
    {
        return this.pregunta;
    }
    public Jugador getJugadorJeopardyPanel()
    {
        return this.jugador;
    }
}
