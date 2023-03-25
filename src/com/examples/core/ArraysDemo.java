package com.examples.core;

import com.example.oops.ScientificCalculator;

public class ArraysDemo {

    public static void main(String[] args) {
        int marks[] = new int[6];

        marks[0] = 98;
        marks[1] = 97;
        marks[2] = 96;
        marks[3] = 95;
        marks[4] = 94;
        marks[5] = 93;

        int totalMarks = 0;

        int position = 0;

        while(position < marks.length){
            totalMarks = totalMarks + marks[position];
            position++;
        }

        System.out.println("TOTAL MARKS: "+totalMarks);

    }
}
