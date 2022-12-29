/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package odev3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

/**
 *
 * @author Fatih
 */
public class Odev3 {

   

    public static void main(String[] args) throws IOException {
            ReadWrite rw=new ReadWrite();
            TreeSet<contact> tree = new TreeSet<>();
            tree.addAll(rw.ContactsTreesetRead());
            contact cn =new contact();
        
            List<contact> list = rw.getArraylist();
            rw.write(list,"ContactArrayList.txt");
            Collections.sort(list,new LastNameComparator());
            rw.write(list,"contactsArrayListOrderByLastName.txt");
            rw.ContactsTreesetRead();
            rw.treesetwrite("contactTreeSet.txt", tree);
            rw.ContactHaseet("contactHashSet.txt");
            rw.contactHashmap("file.txt");
           // rw.sirala( tree);
            rw.treesetwrite("contactTreeSetOrderByLastName.txt",rw.ContactsTreesetRead());
    }
   
      
}
