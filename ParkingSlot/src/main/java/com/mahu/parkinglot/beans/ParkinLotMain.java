package com.mahu.parkinglot.beans;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ParkinLotMain {

	public static void main(String[] args) {
		InputLot inputParser = new InputLot();
        switch (args.length) {
            case 0:
                System.out.println("Please enter 'exit' to quit");
                System.out.println("Waiting for input...");
                for (;;) {
                    try {
                        BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
                        String inputString = bufferRead.readLine();
                        if (inputString.equalsIgnoreCase("exit")) {
                            break;
                        } else if ((inputString == null) || (inputString.isEmpty())) {
                        } else {
                            inputParser.parseTextInput(inputString.trim());
                        }
                    } catch(IOException e) {
                        e.printStackTrace();
                    }
                }
                break;
            case 1:
                inputParser.parseFileInput(args[0]);
                break;
            default:
                System.out.println("Invalid input. Usage: java -jar <jar_file_path> <input_file_path>");
        }

	}

}
