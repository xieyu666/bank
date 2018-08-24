package copubank;

import java.util.Scanner;

public class Menu {
    public void menu(int i) {
        Scanner sc=new Scanner(System.in);
        for (;;) {
            System.out.println("请选择菜单项：");
            System.out.println("1、修改个人密码：");
            System.out.println("2、转账：");
            System.out.println("3、存款：");
            System.out.println("4、贷款申请：");
            System.out.println("5、还款列表查询：");
            System.out.println("6、提前还款申请与还款 ：");
            System.out.println("0、退出系统");

            switch (sc.nextInt()) {
                case 1:
                    //修改个人密码
                    new Revise().revise(i);
                case 2:
                    //转账
                    new Transfer().revise(i);
                    break;
                case 3:
                    //存款
                    new Deposit().deposit(i);
                    break;
                case 4:
                    //贷款申请
                    break;
                case 5:
                    //还款列表查询
                    break;
                case 6:
                    //提前还款申请与还款
                    break;
                case 0:
                    //退出系统
                    System.exit(0);
            }
        }

    }
}
