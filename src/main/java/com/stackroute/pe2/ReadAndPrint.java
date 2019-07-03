//read an existing file and print its content with all in capital letters

package com.stackroute.pe2;

import java.io.*;

public class ReadAndPrint {
    public static void main(String[] args) throws Exception{
        File file = new File("/home/utkarsh/IdeaProjects/Java_Day_Assignment2/src/main/java/com/stackroute/pe2/text.txt");
        //System.out.println(file.exists());

        BufferedReader br = new BufferedReader(new FileReader(file));

        String st;
        while ((st = br.readLine()) != null)
            System.out.println(st.toUpperCase());

        System.out.println(file.length());
    }
}