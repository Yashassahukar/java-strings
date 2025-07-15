/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package senseidatetime;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class parsedate3 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter date (dd-MM-yyyy): ");
        String input = sc.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate date = LocalDate.parse(input, formatter);

        System.out.println("Parsed Date: " + date);
    }
    
}
