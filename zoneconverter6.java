/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package senseidatetime;

import java.util.Scanner;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class zoneconverter6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");

        System.out.print("Enter time in IST (dd-MM-yyyy HH:mm): ");
        String input = sc.nextLine();

        LocalDateTime ldt = LocalDateTime.parse(input, fmt);
        ZonedDateTime indiaTime = ldt.atZone(ZoneId.of("Asia/Kolkata"));

        ZonedDateTime usaTime = indiaTime.withZoneSameInstant(ZoneId.of("America/Los_Angeles"));
        ZonedDateTime australiaTime = indiaTime.withZoneSameInstant(ZoneId.of("Australia/Sydney"));

        System.out.println("India Time   : " + indiaTime.format(fmt));
        System.out.println("US Time      : " + usaTime.format(fmt));
        System.out.println("Australia Time: " + australiaTime.format(fmt));
    }
    
}
