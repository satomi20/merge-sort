package com.daniel;

import java.util.ArrayList;
import java.util.List;

public class CommandListener {

    private String sortType = "";
    private String dataType = "";
    private String outputFile = "";
    private List<String> inputFiles = new ArrayList<>();

    public String getSortType() {
        return sortType;
    }

    public void setSortType(String sortType) {
        this.sortType = sortType;
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public String getOutputFile() {
        return outputFile;
    }

    public void setOutputFile(String outputFile) {
        this.outputFile = outputFile;
    }

    public List<String> getInputFiles() {
        return inputFiles;
    }

    public void setInputFiles(List<String> inputFiles) {
        this.inputFiles = inputFiles;
    }

    public void parseCommand(String[] arguments) throws Exception {

        try {
            if (arguments.length < 3) {
                throw new Exception("Arguments length is less than 3");
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        try {
            if (arguments.length > 0) {
                if (arguments[0].equals("-i")) {
                    dataType = "-i";
                } else if (arguments[0].equals("-s")) {
                    dataType = "-s";
                } else {
                    throw new Exception("Wrong data type. It should be \"-i\" or \"-s\".");
                }

                if (arguments[1].equals("-a")) {
                    sortType = "-a";
                } else if (arguments[1].equals("-d")) {
                    sortType = "-d";
                } else {
                    throw new Exception("Wrong sorting type. It should be \"-a\" or \"-d\".");
                }
            }
        }catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        try {
            outputFile = arguments[2];
        }catch (Exception e){
            System.out.println("Error: Output file is not specified.");
            System.out.println(e.getMessage());
        }
        try {
            for (int i = 3; i < arguments.length; i++) {
                inputFiles.add(arguments[i]);
            }
        }catch (Exception e){
            System.out.println("Error: Input file is not specified.");
            System.out.println(e.getMessage());
        }
//
        }
    }
