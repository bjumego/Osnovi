/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package startdew;

import java.util.Scanner;

/**
 *
 * @author user
 */
class Task1 {
    private final Scanner scanner = new Scanner(System.in);
    public void run() {
        System.out.println("--- Задача первая! ---");
        System.out.println("Введите число градусов по Цельсию: ");
        // rewenie zadachi
        double gradC = scanner.nextDouble ();
        System.out.println("По Фарингейту это будет: ");
        double gradF = gradC * 9 / 5 +32;
        System.out.println("%.2f%n,gradF");
        
        System.out.println("Конец первой задачи!!!");
        
        
    }
    
}
