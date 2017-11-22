package demo;



import java.util.Scanner;

public class Name

{


    public static void main(String[] args)
    {

        // Entering name and receiving the response

        Scanner input = new Scanner(System.in);

        System.out.println("Please type your name" );

        String name = input.next();


        System.out.println("Hello " + name);



        //Checking if it is a Male or Female (most Female names end with the letters "a" )

        System.out.println("The length of the name is " + name.length()+ " symbols");


        if (name.endsWith("a"))
        {
            System.out.println("The name is Female Gender");
        }

        else
        {

            System.out.println("The name is Male Gender");

        }


        //Counting and checking if the name contains Vowels(lower case and upper case)

        int count = 0;

        for (int i = 0; i < name.length(); i++)
        {

            char ch = name.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
            {

                count++;

            }

        }

        System.out.println("Number of vowels : " + count);


        input.close();

    }
}
