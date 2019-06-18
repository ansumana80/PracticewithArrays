import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        // create an array to hold 10 numbers and initialize
        int[] anArray = new int[]{150, 250, 350, 450, 550, 650, 750, 850, 950, 1050};
        //Loop through that array and sum the numbers 1-10,
        // then print that total to the screen.
        int total = 0;
        for (int i = 0; i < anArray.length; i++)
        {
            System.out.println(anArray[i]);
            total += anArray[i];
        }
        System.out.println("The sum of this array is: " + total);

        /* 3. Get 10 number inputs from the user, store them in an
        array and get the total of those 10 numbers.*/

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Excercise 3:Create an array to stores 10 numbers from user");
        System.out.println("Enter 10 numbers: ");
        int[] Ansu = new int[10];
        int newTotal = 0;

        for(int j =0; j<10; j++)
        {
        Ansu[j]= keyboard.nextInt();
        newTotal += Ansu[j];
        System.out.println("Array total is: " +newTotal);
        }
        /* 4.Get 10 number inputs from the user, store them in an array
        and get the average of those 10 numbers.
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Exercise 4: Create an array to store 10 numbers from user. Print the average");
        System.out.println("Enter 10 number: ");
        int[] Rogers = new int[10];
        int newTotal2 = 0;

        for(int p =0; p<10; p++)
        {
            Rogers[p]= scan.nextInt();
            newTotal2 += Rogers[p];
            System.out.println("The average of the Array total is: " +(newTotal2/2));
        }

        /*Create an array to store 3 names, loop through
         that array to print out the names.*/

        System.out.println("Excercise 5: Create an array to store 3 names, loop through \n" +
                "that array to print out the names ");
        String[] Joanna={"Jimah", "Eugenia", "Lischen"};

        for(int t=0; t<Joanna.length;t++)
        {
            System.out.println(Joanna[t]);
        }

       /*Create an array with the following values: [2,5,9,0,2,1,8,5,4] Loop through the array and print
        out the index each time the value equals 5.
         */
        System.out.println("Excercise 6: Create an array, Loop through the array, print" +
                "out the index each time the value equals 5");
        int[] kendra = new int[]{2, 5, 9, 0, 2, 1, 8, 5, 4};
        for (int z=0; z<kendra.length; z++)
        {
            if (kendra[z] == 5)
            {
                System.out.println("5s in this array are located at index: " +z);
            }
        }

        //Declare an array with the numbers 1-10. Print the numbers 1-10 backwards from the array.

        System.out.println("Excercise 7: Declare an array with the numbers " +
                "1-10. Print the numbers 1-10 backwards from the array.");
        System.out.println("Enter 10 numbers: ");
        int[] Esther = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int b;

        for (b = Esther.length-1; b>=0; b--)
        {
            System.out.println(Esther[b]);
        }

        //Given the following array: ['w','t','y','h','k']
        //Loop through the array and replace the the
        // letter 't' with the word "hello" once it's found.

        System.out.println("Excercise 8 Given the following array: ['w','t','y','h','k']\n" +
                "Loop through the array and replace the the letter 't' with the word \"hello\" once it's found.");
        {
            String[] Ansu2 = {"w","t","y","h","k"};
            for(int i = 0; i < Ansu2.length; i++)
            {
                if(Ansu2[i] == "t")
                {
                    Ansu2[i] = "Hello";
                    System.out.println(Ansu2[i]);
                }

            }
        }

        /*
         Given array 1: [1,7,6,5,9] and array 2: [2,7,6,3,4]
         Write a program that will print out all matching pairs from arrays 1 and 2.
         Expected output:
         (7,7) and (6,6)
         */

        System.out.println("Excercise 9: Write a program that will print out all matching pairs " +
                "from arrays 1 and 2.\n" +
                "Expected output: (7,7) and (6,6)");
            int[] nums5 = {1,7,6,5,9};
            int[] nums6 = {2,7,6,3,4};


            for(int x = 0; x < nums5.length; x++)
            {
                for(int y = 0; y < nums6.length; y++)
                {
                    if(nums5[x] == nums6[y])
                    {
                        System.out.println("(" + nums5[x] + ","+  nums6[y] +")");
                    }
                }
            }






    }




}





