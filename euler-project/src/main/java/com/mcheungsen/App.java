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

        System.out.print("Entrez le numéro du problème à résoudre : ");
        int problemNumber = scanner.nextInt();

        // Construire le nom complet de la classe
        String problemClassName = "com.mcheungsen.Problems.Problem" + problemNumber;

        try {
            // Charger la classe à partir de son nom
            Class<?> problemClass = Class.forName(problemClassName);

            // Créer une instance de la classe
            EulerProblem problem = (EulerProblem) problemClass.getDeclaredConstructor().newInstance();

            // Exécuter la méthode solve()
            problem.solve();
        } catch (ClassNotFoundException e) {
            System.out.println("Problème non trouvé : " + e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }

        scanner.close();
    }
}
