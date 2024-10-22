package org.example.calculator;

public class Calculator {

    private double op1;
    private double op2;
    private char operator;
    private double result;
    private boolean isError = false;

    public void calculate() {
        isError = false;
        switch (this.operator) {
            case '+':
                this.result = this.op1 + this.op2;
                break;
            case '-':
                this.result = this.op1 - this.op2;
                break;
            case '*':
                this.result = this.op1 * this.op2;
                break;
            case '/':
                if (this.op2 == 0) {
                    isError = true;
                    this.result = Double.NaN;
                } else {
                    this.result = this.op1 / this.op2;
                }
                break;
            default:
                isError = true;
                this.result = Double.NaN;
                break;
        }
    }

    public double getOp1() {
        return op1;
    }

    public void setOp1(double op1) {
        this.op1 = op1;
    }

    public double getOp2() {
        return op2;
    }

    public void setOp2(double op2) {
        this.op2 = op2;
    }

    public char getOperator() {
        return operator;
    }

    public void setOperator(char operator) {
        this.operator = operator;
    }

    public double getResult() {
        return result;
    }

    public void clear() {
        op1 = 0;
        op2 = 0;
        operator = ' ';
        result = 0;
        isError = false;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public boolean isError() {
        return isError;
    }
}
