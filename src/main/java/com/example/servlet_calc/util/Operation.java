package com.example.servlet_calc.util;

/**
 * @author Buyevich_I
 */
public enum Operation {
    PLUS('p'),
    MINUS('m'),
    MULTIPLY('*'),
    DIVISION('/');

    private final char operationChar;
    Operation(char operationChar){
        this.operationChar = operationChar;
    }

    public char getOperationChar() {
        return operationChar;
    }
}
