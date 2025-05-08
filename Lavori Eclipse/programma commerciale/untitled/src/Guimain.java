import java.util.HashMap;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Guimain {
    public static void main(String[] args) {
        // Mappa dei prodotti
        HashMap<String, Double> prodotti = new HashMap<>();
        prodotti.put("Mela", 1.2);
        prodotti.put("Pane", 2.5);
        prodotti.put("Latte", 1.8);
        prodotti.put("Formaggio", 3.7);

        // Creazione del frame
        JFrame frame = new JFrame("Programma commerciale");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new BorderLayout());

        // Pannello per i prodotti
        JTextArea prodottiArea = new JTextArea();
        prodottiArea.setEditable(false);
        prodotti.forEach((prodotto, prezzo) ->
                prodottiArea.append(prodotto + ": €" + prezzo + "\n"));
        JScrollPane scrollPane = new JScrollPane(prodottiArea);
        frame.add(scrollPane, BorderLayout.CENTER);

        // Pannello per aggiungere nuovi prodotti
        JPanel inputPanel = new JPanel(new GridLayout(2, 2));
        JTextField nomeProdottoField = new JTextField();
        JTextField prezzoProdottoField = new JTextField();
        JButton aggiungiButton = new JButton("Aggiungi");
        inputPanel.add(new JLabel("Nome prodotto:"));
        inputPanel.add(nomeProdottoField);
        inputPanel.add(new JLabel("Prezzo prodotto:"));
        inputPanel.add(prezzoProdottoField);
        frame.add(inputPanel, BorderLayout.NORTH);

        // Azione per il pulsante "Aggiungi"
        aggiungiButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nomeProdotto = nomeProdottoField.getText();
                try {
                    double prezzoProdotto = Double.parseDouble(prezzoProdottoField.getText());
                    prodotti.put(nomeProdotto, prezzoProdotto);
                    prodottiArea.append(nomeProdotto + ": €" + prezzoProdotto + "\n");
                    nomeProdottoField.setText("");
                    prezzoProdottoField.setText("");
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame,
                            "Inserisci un prezzo valido.",
                            "Errore", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        frame.add(aggiungiButton, BorderLayout.SOUTH);


        frame.setVisible(true);
    }
}