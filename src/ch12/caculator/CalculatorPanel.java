package ch12.caculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @program: Core_Java
 * @description: calcutor
 * @author: Jun Wang
 * @create: 2019-01-21 16:19
 */
public class CalculatorPanel extends JPanel {
    private JButton display;
    private JPanel panel;
    private double result;
    private String lastCommand;
    private boolean start;

    public CalculatorPanel()
    {
        setLayout(new BorderLayout());

        result = 0;
        lastCommand = "=";
        start = true;

        display = new JButton("0");
        display.setEnabled(false);
        add(display, BorderLayout.NORTH);

        ActionListener insert = new InsertAction();
        ActionListener command = new CommandAction();

        panel = new JPanel();
        panel.setLayout(new GridLayout());

        addButton("7", insert);
        addButton("8", insert);
        addButton("9", insert);
        addButton("/", insert);

        addButton("4", insert);
        addButton("5", insert);
        addButton("6", insert);
        addButton("*", insert);

        addButton("1", insert);
        addButton("2", insert);
        addButton("3", insert);
        addButton("-", insert);

        addButton("0", insert);
        addButton(".", insert);
        addButton("=", insert);
        addButton("+", insert);

        add(panel, BorderLayout.CENTER);

    }

    private void addButton(String label, ActionListener listener)
    {
        JButton button = new JButton(label);
        button.addActionListener(listener);
        panel.add(button);
    }

    private class InsertAction implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) {
            String input = e.getActionCommand();
            if (start)
            {
                display.setText("");
                start = false;
            }
            display.setText(display.getText() + input);
        }
    }

    private class CommandAction implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();
            if (start)
            {
                if (command.equals("-"))
                {
                    display.setText(command);
                    start = false;
                }
                else
                {
                    lastCommand = command;
                }
            }
            else
            {
                calculate(Double.parseDouble(display.getText()));
                lastCommand = command;
                start = true;
            }
        }
    }

    public void calculate(double x)
    {
        if (lastCommand.equals("+")) result += x;
        else if (lastCommand.equals("-")) result -= x;
        else if (lastCommand.equals("*")) result *= x;
        else if (lastCommand.equals("/")) result /= x;
        else if (lastCommand.equals("=")) result = x;
        display.setText("" + result);
    }
}
