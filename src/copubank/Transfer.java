package copubank;

import bank.Account;

import java.util.Map;
import java.util.Scanner;

public class Transfer {
    Read rd=new Read();
    Map<Integer, Account> map = rd.read();
    public void revise(int i){
        System.out.println("请输入要转的银行卡号！");
        Scanner sa=new Scanner(System.in);
        String bankNum=sa.nextLine();
        System.out.println("请输入要转的金额！");
        double money=sa.nextDouble();
        if (money>map.get(i).getBalance()){
            System.out.println("您输入的金额大于您当前存款！返回主菜单，请重新输入！");
        }
        else  if (money>0&&money<map.get(i).getBalance()){
            System.out.println("转账成功！");
            map.get(i).setBalance(map.get(i).getBalance()-money);
            System.out.println("您当前的余额为 ："+map.get(i).getBalance());
            System.out.println("输入1返回主菜单，输入0退出程序！");
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
        }
        else{
            System.out.println("您输入的金额格式不正确！返回主菜单，请重新输入！");
        }
    }
}
