/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package senseidatetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class customformat2 {
    
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        System.out.println("Formatted DateTime: " + now.format(format));
    }
}

    

