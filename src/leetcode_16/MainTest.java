package leetcode_16;

/**
 * @author:MainTest
 * @DATE:2021/8/1416:23
 **/
public class MainTest
{
    public static int i = 1;
    public static void main(String[] args)throws Exception
    {
        MainTest.i = 2;
        System.out.println(MainTest.i);
        Runtime run = Runtime.getRuntime();
        Process p = run.exec("java test2");
    }
}
