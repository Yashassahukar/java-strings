/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package senseidatetime;

import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class diffcountries5 {
    public static void main(String[] args) {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        ZonedDateTime india = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        ZonedDateTime usa = ZonedDateTime.now(ZoneId.of("America/New_York"));
        ZonedDateTime japan = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
        ZonedDateTime uk = ZonedDateTime.now(ZoneId.of("Europe/London"));

        System.out.println("India: " + india.format(fmt));
        System.out.println("USA:   " + usa.format(fmt));
        System.out.println("Japan: " + japan.format(fmt));
        System.out.println("UK:    " + uk.format(fmt));
    }
    
}
