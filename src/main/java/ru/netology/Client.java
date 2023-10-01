package ru.netology;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        String host = "netology.homework";
        int port = 8080;
        try (Socket clientSocker = new Socket(host, port); PrintWriter out = new PrintWriter(clientSocker.getOutputStream(), true); BufferedReader in = new BufferedReader(new InputStreamReader(clientSocker.getInputStream()))) {
            Scanner scanner = new Scanner(System.in);
            String resp = in.readLine();
            System.out.println(resp); //Write your name

            String name = scanner.nextLine();
            out.println(name);

            String age = in.readLine();
            System.out.println(age);
            String quAge = scanner.nextLine();
            out.println(quAge);
            String ask = in.readLine();
            System.out.println(ask);


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
