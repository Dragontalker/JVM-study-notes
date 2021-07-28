package com.dragontalker.java2;

public class EscapeAnalysis {

    public EscapeAnalysis obj;

    /*
    方法返回EscapeAnalysis对象, 发生逃逸
     */
    public EscapeAnalysis getInstance() {
        return obj == null? new EscapeAnalysis() : obj;
    }
}
