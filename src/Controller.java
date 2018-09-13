import javax.swing.*;

public class Controller {

    String firstArg = "";
    String secondArg = "";
    String operator = "";

    CalculatorApp gui;

    Controller(CalculatorApp gui){
        this.gui = gui;
    }

    public void enterButton(){
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
        gui.updateView(firstArg, secondArg, operator);

    }

    public void numberButton(String num){
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
        gui.updateView(firstArg, secondArg, operator);
    }

    public void setOperator(String op){
        if(firstArg.equals("") && op.equals("-")){
            firstArg += op;
        }
        else if((!firstArg.equals("") || !(firstArg.equals("-")))&&operator.equals("")){
            this.operator = op;
        }
        else if(!this.operator.equals("")){
            if(secondArg.equals("") && op.equals("-")){
                secondArg += op;
            }
            else if(!secondArg.equals("") || !secondArg.equals("-")){
                enterButton();
                this.operator = op;
            }
        }
        gui.updateView(firstArg, secondArg, operator);
        //if clicked again, hit enter then set new?
    }

    public void clearView(){
        firstArg = "";
        secondArg = "";
        operator = "";
        gui.updateView(firstArg, secondArg, operator);
    }



}