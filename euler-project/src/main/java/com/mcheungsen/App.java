package com.mcheungsen;

import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, MalformedURLException {
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.print("Enter the problem number to solve : ");
            int problemNumber = scanner.nextInt();

            //quitter ?
            if(problemNumber == -1){
                System.out.println("Program Terminated.");
                break;
            }

            // Construire le nom complet de la classe
            String problemClassName = "com.mcheungsen.Problems.Problem" + problemNumber;

            try {
                // Charger la classe à partir de son nom
                Class<?> problemClass = Class.forName(problemClassName);

                // Créer une instance de la classe
                EulerProblem problem = (EulerProblem) problemClass.getDeclaredConstructor().newInstance();

                // Exécuter
                System.out.println(problem.getName() + " : " + problem.solve());
            } catch (ClassNotFoundException e) {
                System.out.println("Problem not found : " + e.getMessage());
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        scanner.close();
    }
}
