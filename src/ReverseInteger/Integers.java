package ReverseInteger;

public class Integers
{
    public int reverse(int x)
    {
        int answer = 0;
        int originalNumber = answer;
        boolean isNegative = false;

        //Converts to positive number
        if (x < 0)
        {
            isNegative = true;
            x = x * -1;
        }

        while (x != 0)
        {
            int lastDigit = x % 10; //gets last digit
            answer = answer * 10; //expands digits by one

            //Checks to make sure output does not exceed integer.MAX_VALUE
            if((answer / 100) != (originalNumber / 10))
            {
                return 0;
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
