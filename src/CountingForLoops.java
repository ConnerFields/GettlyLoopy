import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class CountingForLoops
{
    public static void main(String[] args)
    {
        for (int num = 0; num <= 30; num++) //Creates a loop increasing num's number by 1 until it equal 30
        {
            System.out.print(num + ", "); //Displays information in an easy to see format
        }
        System.out.println(""); //break in the line
        for (int numA = 30; numA >= 0; numA--) //Creates a loop decreasing num's number by 1 until it equal 0
        {
            System.out.print(numA + ", "); //Displays information in an easy to see format
        }
        System.out.println(""); //break in the line
        for (int numB = 0; numB <= 18; numB+=3) //Creates a loop increasing num's number by 3 until it equal 18
        {
            System.out.print(numB + ", "); //Displays information in an easy to see format
        }
        System.out.println(""); //break in the line
        for (int numC = 10; numC >= 0; numC-=2) //Creates a loop decreasing num's number by 2 until it equal 0
        {
            System.out.print(numC + ", "); //Displays information in an easy to see format
        }
    }
}