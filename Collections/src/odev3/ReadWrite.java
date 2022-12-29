package odev3;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;


public class ReadWrite {
    public TreeSet treeSet = new TreeSet(new Comparator<contact>(){
        @Override
        public int compare(contact o1, contact o2){
            return o1.getLastName(). compareTo(o2.getLastName());
        }
    });
     public  List<contact> getArraylist() throws IOException {
        List<contact> dizi = new ArrayList<>();
        //dosya açtım okuttum ve dizilerin içine ayırarark attım
        File file = new File("contacts.txt");
        FileReader fileReader = new FileReader(file);
        String line;
        BufferedReader br = new BufferedReader(fileReader);
        dizi.clear();
        while ((line = br.readLine()) != null) {
            String[] data = line.split(" ");
            contact col = new contact(data[0], data[1], data[2], data[3]);
            dizi.add(col);
        }
         br.close();
         
         return dizi;
    }
     
    public void write(List<contact> list,String yol) {
            try{
            File f =new File(yol);
            FileWriter fileWriter=new FileWriter(f,true);
           int i=0;
            while(i <10){
                 fileWriter.write(list.get(i).getSosialSecurityNumber()+" "
                         +list.get(i).getFirstName()+" "
                         +list.get(i).getLastName()+" "
                         +list.get(i).getPhoneNumber()+"\n");
                 i++;
            }

            fileWriter.close();

            }catch(IOException e){
            }

        }
    public TreeSet ContactsTreesetRead ()  throws IOException{
         
            TreeSet tree = new TreeSet();
                       
           try {
               BufferedReader bf = new BufferedReader(new FileReader("contacts.txt"));
                String line;
                int i=0;
                while((line=bf.readLine())!=null){
                    String[] parse= line.split(" ");
                    contact cn= new contact(parse[0], parse[1], parse[2], parse[3]);
                    tree.add(String.valueOf(cn));
                }
                bf.close();
            } catch (Exception e) {
                System.out.println(e);
            }
             
            return tree;
            
        }
    
 public void treesetwrite (String yol,TreeSet tree) throws IOException{
       File f =new File(yol);
            FileWriter fileWriter=new FileWriter(f);
            Iterator i = tree.iterator();
            
            while(i.hasNext()){
                fileWriter.write(i.next().toString()+"\n");
            }
            fileWriter.close();

            }

 public void ContactHaseet(String yol) throws  IOException{
               HashSet hash = new HashSet();
              
            try {BufferedReader bf = new BufferedReader(new FileReader("contacts.txt"));
           String line =null;
           String [] tutucu;
          
           while((line=bf.readLine())!=null){
         
               String [] parse= line.split(" ");
               
             contact cn= new contact(parse[0], parse[1], parse[2], parse[3]);
            hash.add(cn+"\n");  
            
              
           }    
     } catch (Exception e) {
     }
             try{
            File f =new File(yol);
            FileWriter fileWriter=new FileWriter(f);
            Iterator i = hash.iterator();
            
            while(i.hasNext()){
                fileWriter.write(i.next().toString()+"\n");
            }
            fileWriter.close();
           }
             catch(Exception e){}}
 
  public void contactHashmap(String yol) throws  IOException{
            HashMap<String,String> map = new HashMap<>();
        int i=0;        
      File file = new File("contacts.txt");
        FileReader fileReader = new FileReader(file);
        String line;
        BufferedReader br = new BufferedReader(fileReader);
        
        while ((line = br.readLine()) != null) {
            String[] data = line.split(" ");
            contact col = new contact(data[0], data[1], data[2], data[3]);
            String value =col.getSosialSecurityNumber()+" "+col.getFirstName()+" "+ col.getLastName()+" "+col.getPhoneNumber();
            String key=col.getPhoneNumber();
            map.put(key, value+"\n");
            
        }
        
        br.close();
           
                  try{
                File f =new File(yol);
                 FileWriter fileWriter=new FileWriter(f,true);
          
          
                
               fileWriter.write(map+"\n");
               
            
            fileWriter.close();

            }catch(IOException e){
            }
    }
  
    public void sirala(TreeSet<contact> tree){
        treeSet.addAll(tree); 
    }

}
