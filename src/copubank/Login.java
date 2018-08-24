package copubank;


import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Login {

    public void login() {
        int a=0;
        Read rd=new Read();
        Map<Integer,bank.Account> map = rd.read();

        //遍历
        Set<Map.Entry<Integer, bank.Account>> entrySet = map.entrySet();
        Iterator<Map.Entry<Integer,bank.Account>> it = entrySet.iterator();

        while (it.hasNext()) {
        // 返回的是封装了key和value对象的Map.Entry对象
        Map.Entry<Integer, bank.Account> en = it.next();
        // 获取Map.Entry对象中封装的key和value对象
        Integer key = en.getKey();
        bank.Account value = en.getValue();
        System.out.println("key=" + key + " value=" + value);
        a++;
        }
        System.out.println("请输入用户名");
        Scanner sa=new Scanner(System.in);
        String name=sa.nextLine();
        for (int i = 0; i < a; i++) {
            while (name.equals(map.get(i).getName())){
                System.out.println("系统匹配成功！请输入密码");
                String mima=sa.nextLine();
                while ((mima.equals(map.get(i).getPassword()))){
                    System.out.println("密码正确！进入系统菜单！");
                    new Menu().menu(i);
                    break;
                }
                return;
            }
            if ((a-1)==i){
                System.out.println("输入的用户名不合法");
                break;
            }
        }

      }
    }

