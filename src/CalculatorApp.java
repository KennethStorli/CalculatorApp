import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorApp extends JFrame{

    JLabel displayLabel;

    Controller controller;

    public CalculatorApp() {

        controller = new Controller(this);

        setTitle("Calculator");
        setSize(500, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new GridLayout(5,5));
        //Lag 2 jpanel, en med fluid en med grid

        displayLabel = new JLabel("0");
        displayLabel.setBounds(0,0,500,100);
        this.add(displayLabel);



        JButton enterButton = new JButton("Enter");
        enterButton.setBounds(400,100,100,50);
        this.add(enterButton);
        enterButton.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent arg0){
                controller.enterButton();
            }
        });

        JButton zeroButton = new JButton("0");
        zeroButton.setBounds(400,100,100,50);
        this.add(zeroButton);
        zeroButton.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent arg0){
                String num = "0";
                controller.numberButton(num);
            }
        });

        JButton oneButton = new JButton("1");
        oneButton.setBounds(400,100,100,50);
        this.add(oneButton);
        oneButton.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent arg0){
                String num = "1";
                controller.numberButton(num);
            }
        });

        JButton twoButton = new JButton("2");
        twoButton.setBounds(400,100,100,50);
        this.add(twoButton);
        twoButton.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent arg0){
                String num = "2";
                controller.numberButton(num);
            }
        });

        JButton threeButton = new JButton("3");
        threeButton.setBounds(400,100,100,50);
        this.add(threeButton);
        threeButton.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent arg0){
                String num = "3";
                controller.numberButton(num);
            }
        });

        JButton fourButton = new JButton("4");
        fourButton.setBounds(400,100,100,50);
        this.add(fourButton);
        fourButton.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent arg0){
                String num = "4";
                controller.numberButton(num);
            }
        });

        JButton fiveButton = new JButton("5");
        fiveButton.setBounds(400,100,100,50);
        this.add(fiveButton);
        fiveButton.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent arg0){
                String num = "5";
                controller.numberButton(num);
            }
        });

        JButton sixButton = new JButton("6");
        sixButton.setBounds(400,100,100,50);
        this.add(sixButton);
        sixButton.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent arg0){
                String num = "6";
                controller.numberButton(num);
            }
        });

        JButton sevenButton = new JButton("7");
        sevenButton.setBounds(400,100,100,50);
        this.add(sevenButton);
        sevenButton.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent arg0){
                String num = "7";
                controller.numberButton(num);
            }
        });

        JButton eightButton = new JButton("8");
        eightButton.setBounds(400,100,100,50);
        this.add(eightButton);
        eightButton.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent arg0){
                String num = "8";
                controller.numberButton(num);
            }
        });

        JButton nineButton = new JButton("9");
        nineButton.setBounds(400,100,100,50);
        this.add(nineButton);
        nineButton.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent arg0){
                String num = "9";
                controller.numberButton(num);
            }
        });

        JButton plusButton = new JButton("+");
        plusButton.setBounds(400,100,100,50);
        this.add(plusButton);
        plusButton.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent arg0){
                controller.setOperator("+");
            }
        });

        JButton minusButton = new JButton("-");
        minusButton.setBounds(400,100,100,50);
        this.add(minusButton);
        minusButton.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent arg0){
                controller.setOperator("-");
            }
        });

        JButton multButton = new JButton("*");
        multButton.setBounds(400,100,100,50);
        this.add(multButton);
        multButton.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent arg0){
                controller.setOperator("*");
            }
        });

        JButton divButton = new JButton("/");
        divButton.setBounds(400,100,100,50);
        this.add(divButton);
        divButton.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent arg0){
                controller.setOperator("/");
            }
        });

        JButton saveButton = new JButton("Save");
        saveButton.setBounds(400,100,100,50);
        this.add(saveButton);
        saveButton.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent arg0){
                //Save stuff
            }
        });



        JButton retrieveButton = new JButton("Get");
        retrieveButton.setBounds(400,100,100,50);
        this.add(retrieveButton);
        retrieveButton.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent arg0){
                //Retrieve stuff
            }
        });

        JButton clearButton = new JButton("Clear");
        clearButton.setBounds(400,100,100,50);
        this.add(clearButton);
        clearButton.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent arg0){
                controller.clearView();
            }
        });

    }

    public static void main(String[] args) {
        CalculatorApp ex = new CalculatorApp();
        ex.setVisible(true);
    }

    public void updateView(String firstArg, String secondArg, String operator){
        displayLabel.setText(firstArg + operator + secondArg);
    }

}

