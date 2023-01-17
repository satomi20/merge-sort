package com.daniel;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class BufferFile {

     private List<String> allData = new ArrayList<String>();
     private final SortAlg sortAlg = new SortAlg();

     public List<String> readData(List<String> inputFiles, String dataType) throws IOException {
         try {
             for (String inputFile : inputFiles) {
                 try {
                 BufferedReader reader = new BufferedReader(new FileReader(inputFile));
                 String line = reader.readLine();
                 while (line != null) {
                     if (dataType.equals("-i")) {
                         allData.add(line);
                     } else {
                         allData.add(line);
                     }
                     line = reader.readLine();
                 }
                 reader.close();
                } catch (IOException e) {
                        System.out.println("Can't read file " + inputFile);
                        continue;
                 }
             }
         }catch (Exception e) {
             System.out.println("Error: error with reading file");
             System.out.println(e.getMessage());
         }
         return allData;
     }

     public void writeData(String outputFiles, String sortType) throws IOException {
          allData = sortAlg.mergeSort(allData, sortType);
            BufferedWriter bw = null;
            try {
                 bw = new BufferedWriter(new FileWriter(outputFiles));
                 for (String item : allData) {
                      bw.write(item);
                      bw.newLine();
                 }
            } catch (IOException e) {
                 System.out.println("Error: Could not write to output file " + outputFiles + ".");
            } finally {
                 if (bw != null) {
                      bw.close();
                 }
            }
     }

     public void start(String dataType, String sortType, String outputFiles, List<String> inputFiles) throws IOException {
          readData(inputFiles, dataType);
          writeData(outputFiles, sortType);
     }

}









