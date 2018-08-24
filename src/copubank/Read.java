package copubank;

import bank.Account;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Read{
    Map<Integer, Account> admin= new HashMap<>();
    public  Map<Integer, Account> read() {
    if (admin!=null){
        try {
        BufferedReader read =new BufferedReader(new InputStreamReader(new FileInputStream("src/copubank/txt/person.txt")));
        String str=null;
        int i=0;
        while ((str=read.readLine())!=null){
                String[] stt=str.split(";");
                String name=stt[0];
                String password=stt[1];
                double balance= Double.parseDouble(stt[2]);
                long bankNum=Long.parseLong(stt[3]);
                admin.put(i,(new Account(name,password,balance,bankNum)));
                i++;
            }

        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
      }
        return admin;
    }
}
