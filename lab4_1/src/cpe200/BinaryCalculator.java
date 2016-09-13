package cpe200;


import java.text.DecimalFormat;

public class BinaryCalculator {
    private Operand firstOperand;
    private Operand secondOperand;

    public BinaryCalculator() {

    }

    public void setFirstOperand(Operand operand) {
        this.firstOperand = operand;
    }


    public void setSecondOperand(Operand operand) {
        this.secondOperand = operand;
    }

    public String add() {
        double total = Double.parseDouble(firstOperand.getOperand()) + Double.parseDouble(secondOperand.getOperand());
        if (total == Math.floor(total)) {
            int totalint = (int) total;
            return Integer.toString(totalint);
        }
        else {
            DecimalFormat formatter = new DecimalFormat("#0.0");
            return formatter.format(total);
        }
    }

    public String subtract() {
        double total = Double.parseDouble(firstOperand.getOperand()) - Double.parseDouble(secondOperand.getOperand());
        if (total == Math.floor(total)) {
            int totalint = (int) total;
            return Integer.toString(totalint);
        }
        else {
            DecimalFormat formatter = new DecimalFormat("#0.0");
            return formatter.format(total);
        }
    }

    public String multiply() {
        double total = Double.parseDouble(firstOperand.getOperand()) * Double.parseDouble(secondOperand.getOperand());

        if (total == Math.floor(total)) {
            int totalint = (int) total;
            return Integer.toString(totalint);
        }
        else {
            DecimalFormat formatter = new DecimalFormat("#0.0");
            return formatter.format(total);
        }
    }

    public String division() throws ArithmeticException {

        if (Double.parseDouble(secondOperand.getOperand())!=0)
        {
            double total = Double.parseDouble(firstOperand.getOperand()) / Double.parseDouble(secondOperand.getOperand());
            if (total == Math.floor(total)) {
                int totalint = (int) total;
                return Integer.toString(totalint);
            }
               else {
                    total = total*100000;
                    total = Math.floor(total);
                    int count = (int)total;
                    total = (double)count/100000;
                    return Double.toString(total);
            }
        }
        else{
            int a=2;
            return Integer.toString(a/0);
        }
    }
    public String power() {
        double total=Math.pow(Double.parseDouble(firstOperand.getOperand()),Double.parseDouble(secondOperand.getOperand()));
        if (total == Math.floor(total)) {
            int totalint = (int) total;
            return Integer.toString(totalint);
        }
        else {
            DecimalFormat formatter = new DecimalFormat("#0.0");
            return formatter.format(total);
        }
    }
}

