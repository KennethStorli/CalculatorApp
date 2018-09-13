import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorApp extends JFrame{

    CalculatorApp app = this;
    JLabel displayLabel;

    String firstArg = "";
    String secondArg = "";
    String operator = "";



    public CalculatorApp() {
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
                enterButton();
            }
        });

        JButton zeroButton = new JButton("0");
        zeroButton.setBounds(400,100,100,50);
        this.add(zeroButton);
        zeroButton.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent arg0){
                String num = "0";
                numberButton(num);
            }
        });

        JButton oneButton = new JButton("1");
        oneButton.setBounds(400,100,100,50);
        this.add(oneButton);
        oneButton.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent arg0){
                String num = "1";
                numberButton(num);
            }
        });

        JButton twoButton = new JButton("2");
        twoButton.setBounds(400,100,100,50);
        this.add(twoButton);
        twoButton.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent arg0){
                String num = "2";
                numberButton(num);
            }
        });

        JButton threeButton = new JButton("3");
        threeButton.setBounds(400,100,100,50);
        this.add(threeButton);
        threeButton.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent arg0){
                String num = "3";
                numberButton(num);
            }
        });

        JButton fourButton = new JButton("4");
        fourButton.setBounds(400,100,100,50);
        this.add(fourButton);
        fourButton.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent arg0){
                String num = "4";
                numberButton(num);
            }
        });

        JButton fiveButton = new JButton("5");
        fiveButton.setBounds(400,100,100,50);
        this.add(fiveButton);
        fiveButton.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent arg0){
                String num = "5";
                numberButton(num);
            }
        });

        JButton sixButton = new JButton("6");
        sixButton.setBounds(400,100,100,50);
        this.add(sixButton);
        sixButton.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent arg0){
                String num = "6";
                numberButton(num);
            }
        });

        JButton sevenButton = new JButton("7");
        sevenButton.setBounds(400,100,100,50);
        this.add(sevenButton);
        sevenButton.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent arg0){
                String num = "7";
                numberButton(num);
            }
        });

        JButton eightButton = new JButton("8");
        eightButton.setBounds(400,100,100,50);
        this.add(eightButton);
        eightButton.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent arg0){
                String num = "8";
                numberButton(num);
            }
        });

        JButton nineButton = new JButton("9");
        nineButton.setBounds(400,100,100,50);
        this.add(nineButton);
        nineButton.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent arg0){
                String num = "9";
                numberButton(num);
            }
        });

        JButton plusButton = new JButton("+");
        plusButton.setBounds(400,100,100,50);
        this.add(plusButton);
        plusButton.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent arg0){
                setOperator("+");
            }
        });

        JButton minusButton = new JButton("-");
        minusButton.setBounds(400,100,100,50);
        this.add(minusButton);
        minusButton.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent arg0){
                setOperator("-");
            }
        });

        JButton multButton = new JButton("*");
        multButton.setBounds(400,100,100,50);
        this.add(multButton);
        multButton.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent arg0){
                setOperator("*");
            }
        });

        JButton divButton = new JButton("/");
        divButton.setBounds(400,100,100,50);
        this.add(divButton);
        divButton.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent arg0){
                setOperator("/");
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
                clearView();
            }
        });

    }

    private void enterButton(){
        //do enter button stuff
        int firstNum = 0;
        int secondNum = 0;
        int result = 0;
        if(!firstArg.equals("")){
            firstNum = Integer.parseInt(firstArg);
        }
        if(!secondArg.equals("")){
            secondNum = Integer.parseInt(secondArg);
        }

        switch(operator){
            case "+":
                result =  MathUtil.add(firstNum, secondNum);
                //LABEL STUFF
                break;
            case "-":
                result =  MathUtil.sub(firstNum, secondNum);
                //LABEL STUFF
                break;
            case "*":
                result =  MathUtil.mul(firstNum, secondNum);
                //LABEL STUFF
                break;
            case "/":
                try{
                    result = MathUtil.div(firstNum, secondNum);
                }
                catch(IllegalArgumentException e){
                    //make popup window?
                    //otherwise set result to 0?
                    result = 0;
                }
                break;
            default:
                //set answer to 0?
                result = 0;
                //this should never happen
                break;
        }

        firstArg = String.valueOf(result);
        operator = "";
        secondArg = "";
        updateView();

    }

    private void numberButton(String num){
        //do stuff
        //displayLabel.setText(num);
        //update number1, if not operator
        //if operator, then update num 2
        //call UpdateView()
        if(operator.equals("")){
            firstArg += num;
        }
        else{
            secondArg += num;
        }
        updateView();
    }

    private void setOperator(String op){
        if(firstArg.equals("") && op.equals("-")){
            firstArg += op;
        }
        else if((!firstArg.equals("") || !(firstArg.equals("-")))&&operator.equals("")){
            this.operator = op;
        }
        else if(!this.operator.equals("")){
            System.out.println("Fuckery");
            if(secondArg.equals("") && op.equals("-")){
                secondArg += op;
            }
            else if(!secondArg.equals("") || !secondArg.equals("-")){
                enterButton();
                this.operator = op;
            }
        }
        updateView();
        //if clicked again, hit enter then set new?
    }

    private void clearView(){
        firstArg = "";
        secondArg = "";
        operator = "";
        updateView();
    }

    private void updateView(){
        displayLabel.setText(firstArg + operator + secondArg);
    }

    public static void main(String[] args) {
        CalculatorApp ex = new CalculatorApp();
        ex.setVisible(true);
    }
}

