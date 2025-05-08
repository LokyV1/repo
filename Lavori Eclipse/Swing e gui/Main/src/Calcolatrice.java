import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calcolatrice extends JFrame implements ActionListener {
    private JTextField input1, input2, result;
    private JButton addizione, sottrazione, moltiplicazione, divisione;

    public Calcolatrice() {
        // imposta il frame
        setTitle("Calcolatrice");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 3));

        // Crea componenti
        input1 = new JTextField();
        input2 = new JTextField();
        result = new JTextField();
        result.setEditable(false);

        addizione = new JButton("+");
        sottrazione = new JButton("-");
        moltiplicazione = new JButton("*");
        divisione = new JButton("/");

        // aggiunge i listeners
        addizione.addActionListener(this);
        sottrazione.addActionListener(this);
        moltiplicazione.addActionListener(this);
        divisione.addActionListener(this);

        // aggiunge la roba al frame
        add(new JLabel("Input 1:"));
        add(input1);
        add(new JLabel("Input 2:"));
        add(input2);
        add(new JLabel("risultato:"));
        add(result);

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(addizione);
        buttonPanel.add(sottrazione);
        buttonPanel.add(moltiplicazione);
        buttonPanel.add(divisione);
        add(buttonPanel);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            double num1 = Double.parseDouble(input1.getText());
            double num2 = Double.parseDouble(input2.getText());
            double res = 0;

            if (e.getSource() == addizione) {
                res = num1 + num2;
            } else if (e.getSource() == sottrazione) {
                res = num1 - num2;
                
            } else if (e.getSource() == moltiplicazione) {
                res = num1 * num2;
                
            } else if (e.getSource() == divisione) {
                if (num2 != 0) {
                	
                    res = num1 / num2;
                } else {
                    result.setText("Errore: divisione per 0 impossibile");
                    return;
                }
            }
            result.setText(String.valueOf(res));
        } catch (NumberFormatException ex) {
            result.setText("Errore: input non valido");
        }
    }

    public static void main(String[] args) {
        new Calcolatrice();
    }
}
