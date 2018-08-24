package copubank;

import java.util.ArrayList;
import java.util.Scanner;

//账户信息
public class Account {
    String name;//账号名字
    String password;//密码
    double balance;//账户余额
    long bankNum;//银行卡号

    public Account() {}

    public Account(String name, String password, double balance, long bankNum) {
        this.name = name;
        this.password = password;
        this.balance = balance;
        this.bankNum = bankNum;
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", balance=" + balance +
                ", bankNum=" + bankNum +
                '}';
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public long getBankNum() {
        return bankNum;
    }

    public void setBankNum(long bankNum) {
        this.bankNum = bankNum;
    }


}
