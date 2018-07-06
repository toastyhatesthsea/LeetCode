package ReverseInteger;

public class Integers
{
    public int reverse(int x)
    {
        int answer = 0;
        boolean isNegative = false;
        boolean notLargerThanMaxInteger = false;

        //Converts to positive number
        if (x < 0)
        {
            isNegative = true;
            x = x * -1;k
        }

        while (x != 0 && !notLargerThanMaxInteger)
        {
            int lastDigit = x % 10; //gets last digit
            answer = answer * 10;
            if((answer = answer % 10) != lastDigit)
            {
                notLargerThanMaxInteger = true;
            }
            else
            {
                answer = (answer * 10); //expand digits by one
                answer += lastDigit;
                x /= 10; //reduces input number by one
            }

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
