public class OutputForLoops
{
    public static void main(String[] args)
    {
        for (int line = 1; line <= 5; line++) //increases "line by one" increasing the amount of stars per line
        {
            for (int numStars = 1; numStars <= line; numStars++) //increases star count to equal line count
            {
                System.out.print("*"); //prints number of stars equal to line
            }
            System.out.println(); //Moves to next line down
        }
        System.out.println();
        for (int lineA = 1; lineA <= 5; lineA++) //increases line by 1 until it counts to 5
        {
            for (int numStarsA = 1; numStarsA <= 5; numStarsA++) //increases star count to 5
            {
                System.out.print("*"); //prints 5 stars
            }
            System.out.println(); //Moves to next line down


        }

    }
}
