import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calcolatrice");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new GridLayout(3, 1));

        // Campi input
        JPanel inputPanel = new JPanel(new GridLayout(1, 2));
        JTextField campo1 = new JTextField();
        JTextField campo2 = new JTextField();
        inputPanel.add(campo1);
        inputPanel.add(campo2);

        //i pulsanti
        JPanel buttonPanel = new JPanel(new GridLayout(1, 4));
        JButton somma = new JButton("+");
        JButton sottrazione = new JButton("-");
        JButton moltiplicazione = new JButton("*");
        JButton divisione = new JButton("/");

        buttonPanel.add(somma);
        buttonPanel.add(sottrazione);
        buttonPanel.add(moltiplicazione);
        buttonPanel.add(divisione);

        // risultato
        JLabel risultato = new JLabel("Risultato: ", SwingConstants.CENTER);

        // Aggiunta dei listener
        ActionListener listener = e -> {
            try {
                double num1 = Double.parseDouble(campo1.getText());
                double num2 = Double.parseDouble(campo2.getText());
                double res = 0;

                if (e.getSource() == somma) {
                    res = num1 + num2;
                } else if (e.getSource() == sottrazione) {
                    res = num1 - num2;
                } else if (e.getSource() == moltiplicazione) {
                    res = num1 * num2;
                } else if (e.getSource() == divisione) {
                    if (num2 != 0) {
                        res = num1 / num2;
                    } else {
                        risultato.setText("Errore: Divisione per 0");
                        return;
                    }
                }
                risultato.setText("Risultato: " + res);
            } catch (NumberFormatException ex) {
                risultato.setText("Errore: Inserire numeri validi");
            }
        };

        somma.addActionListener(listener);
        sottrazione.addActionListener(listener);
        moltiplicazione.addActionListener(listener);
        divisione.addActionListener(listener);

        //i pannelli al frame
        frame.add(inputPanel);
        frame.add(buttonPanel);
        frame.add(risultato);

        frame.setVisible(true);


    }
    //odio la mia vita
}