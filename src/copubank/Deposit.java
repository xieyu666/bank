package copubank;

import bank.Account;

import java.util.Map;
import java.util.Scanner;

public class Deposit {
    Read rd=new Read();
    Map<Integer, Account> map = rd.read();
    public void deposit(int i){
        System.out.println("请输入要存款的金额");
        Scanner sc=new Scanner(System.in);
        double money =sc.nextDouble();
        if (money<0){
            System.out.println("输入的金额不合法！返回主菜单！");
        }
        else {
            double b=map.get(i).getBalance()+money;
            System.out.println("存款成功！当前余额为 ："+b);
            System.out.println("输入1返回主菜单，输入0退出程序！");
            int a=sc.nextInt();
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
        }

    }
}
