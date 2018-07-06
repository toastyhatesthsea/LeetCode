package ReverseInteger;

public class Integers
{
    public int reverse(int x)
    {
        int answer = 0;
        int originalNumber = answer;
        boolean isNegative = false;
        boolean notLargerThanMaxInteger = false;

        //Converts to positive number
        if (x < 0)
        {
            isNegative = true;
            x = x * -1;
        }

        while (x != 0 && !notLargerThanMaxInteger)
        {
            int lastDigit = x % 10; //gets last digit
            answer = answer * 10; //expands digits by one
            if((answer / 100) != (originalNumber / 10))
            {
                notLargerThanMaxInteger = true;
            }
            else
            {
                answer += lastDigit;
                x /= 10; //reduces input number by one
            }
            originalNumber = answer;
        }

        if (isNegative) //converts to negative if original number was negative
        {
            answer *= -1;
        }

        return answer;
    }
}

class IntegerTesters
{
    public static void main(String[] argsgs)
    {
        Integers rawrs = new Integers();

        rawrs.reverse(1534236469);

    }


}
