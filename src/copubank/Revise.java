package copubank;

import bank.Account;

import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;


public class Revise {
    Read rd=new Read();
    Map<Integer, Account> map = rd.read();

    public String revise(int i){
        System.out.println("您的原始密码为 ："+map.get(i).getPassword());
        System.out.println("请输入新的密码！");
        Scanner sc=new Scanner(System.in);
        String mima=sc.nextLine();
        map.get(i).setPassword(mima);
        System.out.println("修改密码成功！");
        System.out.println("您的新密码为 ："+map.get(i).getPassword());
        Set<Map.Entry<Integer, Account>> entrySet = map.entrySet();
        Iterator<Map.Entry<Integer, Account>> it = entrySet.iterator();

        while (it.hasNext()) {
            // 返回的是封装了key和value对象的Map.Entry对象
            Map.Entry<Integer, bank.Account> en = it.next();
            // 获取Map.Entry对象中封装的key和value对象
            Integer key = en.getKey();
            bank.Account value = en.getValue();
            System.out.println("key=" + key + " value=" + value);

        }
        System.out.println("输入1返回主菜单，输入0退出程序！");
        Scanner sa=new Scanner(System.in);
        int a=sa.nextInt();
        if (a==0){
            System.exit(0);
        }
        else if (a==1){
            new Menu().menu(i);
        }
        else {
            System.out.println("输入不合法！强制退出本程序！");
            System.exit(0);
        }
     return map.get(i).getPassword();
    }




}
