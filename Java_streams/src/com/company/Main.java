package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /*try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(new FileInputStream("src/text.txt")))) {

            System.out.println(reader.readLine());
            System.out.println(reader.readLine());
        }catch (IOException ex) {
            System.out.println("File is not exist");
        }*/

        /*try(BufferedReader fileReader = new BufferedReader(
                        new FileReader("src/text.txt"))) {
            while (true) {
                String line = fileReader.readLine();
                if (line == null) break;
                System.out.println(line);
            }
        }catch (IOException ioex) {
                System.err.println("Cannot read the file ");
            }
*/
       String [] array = new String[]{"Razni neshta", "Oshte neshta"};
        try ( BufferedWriter writer = new BufferedWriter(new FileWriter("src/text1.txt"))){
            for (int i = 0; i < array.length; i++) {
                String s = array[i];
                writer.write(s + "/r/n");
            }

       }catch (IOException ioex) {
           System.err.println("Cannot read the file ");
       }



    }
}

