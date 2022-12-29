/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package odev3;

import java.util.Comparator;


public class LastNameComparator implements Comparator <contact>{

    @Override
    public int compare(contact o1, contact o2) {
        return o1.getLastName().compareTo(o2.getLastName());
    }
    
}
