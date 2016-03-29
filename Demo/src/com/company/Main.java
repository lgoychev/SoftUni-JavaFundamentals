package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) {

        //String filePath = "users.txt";

        File file = new File("test.txt");
        try (BufferedReader reader = new BufferedReader(new FileReader(file)))
        {
            String line = reader.readLine();
            while (line !=null) {
                line = reader.readLine();
                String[] lineArgs = line.split(" ");
                String username = lineArgs[0];
                int totalMinutes = 0;
                for (int i = 1; i < lineArgs.length; i++) {
                    String[] loggedTime = lineArgs[i].split(":");
                    int hours = Integer.parseInt(loggedTime[0]);
                    int minutes = Integer.parseInt(loggedTime[1]);
                    totalMinutes += (hours * 60) + minutes;

                }
                String savePath = "total_time1.txt";
                File outputFile = new File(savePath);
                FileWriter fw = new FileWriter(outputFile, true);
                PrintWriter writer = new PrintWriter(fw, true);
                String output = username + " " + totalMinutes;
                output += " (" + writer + ")";

                writer.close();
                reader.close();
            }









        } catch (IOException e1) {
            e1.printStackTrace();
        }


    }

    }

