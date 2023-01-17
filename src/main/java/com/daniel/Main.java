package com.daniel;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        CommandListener commandListener = new CommandListener();
        BufferFile bufferFile = new BufferFile();
        Scanner in = new Scanner(System.in);
        String [] arguments = in.nextLine().split(" ");
        commandListener.parseCommand(arguments);
       bufferFile.start(commandListener.getDataType(), commandListener.getSortType(), commandListener.getOutputFile(), commandListener.getInputFiles());



    }

}


