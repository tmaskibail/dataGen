package com.maskibth.util;

import au.com.bytecode.opencsv.CSVWriter;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class CsvWriter {

    public static void writeCsv(String fileWithAbsolutePath, List<String[]> dataList) {

        System.out.println("writing csv in [" + fileWithAbsolutePath + "]");
        CSVWriter writer = null;
        try {
            writer = new CSVWriter(new FileWriter(fileWithAbsolutePath));
            writer.writeAll(dataList);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
