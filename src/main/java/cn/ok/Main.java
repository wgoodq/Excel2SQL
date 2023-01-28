package cn.ok;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("本工具支持将Excel中数据转换成SQL语句。");
        System.out.println("本工具仅支持\".xlsx\"格式的文档。");
        System.out.println("输入demo，可生成模板。");

        Scanner scanner = new Scanner(System.in);
        String inLine = scanner.nextLine();

        if (inLine.equalsIgnoreCase("DEMO")) {

        }
    }


}