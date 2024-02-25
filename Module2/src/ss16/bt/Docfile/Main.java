package ss16.bt.Docfile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Main{
    public static void main(String[] args) {
        BufferedReader br = null;
        try{
            File file=new File("/Users/macbook/Desktop/Module-II/src/ss17/bt/Country");
            FileReader fileReader=new FileReader(file);
            BufferedReader reader=new BufferedReader(fileReader);
            String line =null;
            while ((line= reader.readLine()) !=null){
                System.out.println(line);
            }
            reader.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
