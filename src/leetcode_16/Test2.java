package leetcode_16;

import java.io.*;
import java.util.HashMap;

public class Test2
{
    public static void main(String[] args) throws Exception
    {
        FileOutputStream fOut = new FileOutputStream("D:\\Test1.txt");
        fOut.write(MainTest.i);
        fOut.close();
        System.out.println("被调用成功!");

    }
}
