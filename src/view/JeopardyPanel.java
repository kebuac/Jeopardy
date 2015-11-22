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
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.SwingConstants;
import javax.swing.BorderFactory;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.border.Border;

public class JeopardyPanel extends JPanel {

    private ArrayList<Pregunta> pregunta;
    private Jugador jugador;
    final static int MAXGAP = 20;

    private JLabel tituloJeopardy;
    private JPanel panelSuperior;
    private JPanel panelCentral1;
    private JPanel panelCentral2;
    private static JButton[] arrayBotones;
    private static JLabel[] arrayLabels;
    private final String jugadores[];
    private JLabel labelplayer;

    private final String VALOR_BOTONES[] = {"100$", "200$", "300$", "400$", "500$"};

    public JeopardyPanel(ArrayList<Pregunta> pregunta) {
        this.pregunta = pregunta;

        this.setLayout(new BorderLayout());

        panelSuperior = new JPanel();

        panelSuperior.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        //variables requeridas:
        int ronda = 0, puntuacion1 = 0, puntuacion2 = 0;
        String jugador1 = "Jugador 1";
        String jugador2 = "Jugador 2";

        String jugadores[] = new String[3];
        this.jugadores = jugadores;

        jugadores[0] = jugador1 + " Puntuación= " + puntuacion1;
        jugadores[1] = jugador2 + " Puntuación= " + puntuacion2;
        jugadores[2] = "Ronda: " + ronda;

        Border border = BorderFactory.createLineBorder(Color.WHITE, 5);

        for (int i = 0; i < jugadores.length; i++) {

            labelplayer = new JLabel();
            labelplayer.setForeground(Color.WHITE);
            labelplayer.setText("  " + jugadores[i] + "  ");
            labelplayer.setFont(new Font("Left to right", Font.HANGING_BASELINE, 30));

            if (i == 2) {
                labelplayer.setForeground(Color.BLUE);
                labelplayer.setBorder(border);

            }

            c.gridx = i;
            c.gridy = 0;
            c.weightx = 1;
            c.fill = GridBagConstraints.HORIZONTAL;
            panelSuperior.add(labelplayer, c);
        }

        JLabel jeopardy = new JLabel(new ImageIcon("image2.png"));

        c.gridx = 0;
        c.gridy = 1;
        c.gridwidth = 1;
        c.ipady = 40;     
        c.weightx = 0.0; 
        panelSuperior.add(jeopardy, c);

        JLabel activol = new JLabel();
        activol.setForeground(Color.CYAN);

        if (ronda % 2 == 0) {
            activol.setText("Turno de: " + jugador1);
        } else {
            activol.setText("Turno de: " + jugador2);
        }
        c.gridx = 2;
        c.gridy = 1;
        c.gridwidth = 1;
        c.ipady = 40;    
        c.weightx = 0.0; 
        panelSuperior.add(activol, c);

        this.add(panelSuperior, BorderLayout.PAGE_START);

        panelCentral1 = new JPanel(new GridLayout(0, 6));

        JButton b = new JButton("Boton auxiliar tamaño");
        Dimension buttonSize = b.getPreferredSize();
        panelCentral1.setPreferredSize(new Dimension((int) (buttonSize.getWidth() * 5) + MAXGAP,
                (int) (buttonSize.getHeight() * 7) + MAXGAP * 4));

        arrayLabels = new JLabel[30];

        int count = 0;
        for (int i = 0; i < arrayLabels.length; i++) {
            arrayLabels[i] = new JLabel(pregunta.get(i).getCategoria());
            arrayLabels[i].setHorizontalAlignment(SwingConstants.CENTER);
            arrayLabels[i].setFont(new java.awt.Font("Roman", Font.ROMAN_BASELINE, 18));
            arrayLabels[i].setBackground(Color.blue);
            arrayLabels[i].setOpaque(true);
            arrayLabels[i].setForeground(Color.cyan);

            if (i % 5 == 0) {
                panelCentral1.add(arrayLabels[i]);
            }

        }

        panelCentral2 = new JPanel(new GridLayout(0, 6));
        arrayBotones = new JButton[30];

        for (int i = 0; i < arrayBotones.length; i++) {

            if ((i % 6 == 0) && (i > 0)) {
                count++;
            }

            arrayBotones[i] = new JButton(VALOR_BOTONES[count]);
            arrayBotones[i].setBackground(Color.blue);
            arrayBotones[i].setForeground(Color.white);
            arrayBotones[i].setBorder(BorderFactory.createLineBorder(Color.white));
            arrayBotones[i].setFont(new java.awt.Font("Roman", Font.ROMAN_BASELINE, 20));

            //crear boton y guardarlo en la posicion i del array
            panelCentral1.add(arrayBotones[i]);
        }

        

        this.add(panelSuperior, BorderLayout.PAGE_START);
        this.add(panelCentral1, BorderLayout.PAGE_END);
        

        this.setOpaque(false);
        panelSuperior.setOpaque(false);
        panelCentral1.setOpaque(false);
        
    }

    public JButton[] getArrayBotonesJeopardyPanel() {
        return this.arrayBotones;
    }

}
