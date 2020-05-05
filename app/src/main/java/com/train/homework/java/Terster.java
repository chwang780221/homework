package com.train.homework.java;

import java.util.Scanner;

public class Terster {
    public static void main(String[] args) {
        final int BOX_STOP = -1;
        float length = 0.0f;
        float width = 0.0f;
        int height = 0;
        int Run_Status = 0;
        Box Box3 = new Box(23f, 14f, 13);
        Box Box5 = new Box(39.5f, 27.5f, 23);
        Scanner scanner = new Scanner(System.in);

        while (Run_Status != BOX_STOP) {
            System.out.print(" Please enter object's length: ");
            length = scanner.nextFloat();
            if (length == BOX_STOP) {
                break;
            }
            System.out.print(" Please enter object's width: ");
            width = scanner.nextFloat();
            if (width == BOX_STOP) {
                break;
            }
            System.out.print(" Please enter object's height: ");
            height = scanner.nextInt();
            if (height == BOX_STOP) {
                break;
            }

            if (Box3.getBox(length, width, height)) {
                System.out.print(" Box3 ");
            } else if (Box5.getBox(length, width, height)) {
                System.out.print(" Box5 ");
            }
            System.out.println();
            System.out.print(" Please enter run status (Enter -1 to quit): ");
            Run_Status = scanner.nextInt();
        }
    }
}