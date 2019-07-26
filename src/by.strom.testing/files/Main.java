package by.strom.testing.files;

import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {

        File file = new File("temp.txt");

        if(!file.exists()){
            file.createNewFile();
            System.out.println("exist");
        }

        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write("str1\n");
        fileWriter.write("str2\n");
        fileWriter.write("str3\n");
        fileWriter.append("str4\n");
        fileWriter.flush();
        //fileWriter.close();

        FileReader fileReader = new FileReader(file);
        /*char[] chars = new char[20];
        fileReader.read(chars);
        System.out.println(chars);*/

        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write("str5");
        bufferedWriter.newLine();
        bufferedWriter.write("str6");
        bufferedWriter.flush();
        bufferedWriter.close();

        BufferedReader bufferedReader = new BufferedReader(fileReader);
        while(bufferedReader.ready()){
            System.out.println(bufferedReader.readLine());
        }
    }
}
