package ReverseInteger;

public class Integers
{
    public int reverse(int x)
    {
        int answer = 0;
        boolean isNegative = false;

        if (x < 0)
        {
            isNegative = true;
            x = x * -1;
        }

        while (x > 10)
        {
            int lastDigit = x % 10; //gets last digit
            answer = (answer * 10); //expand digits by one
            answer += lastDigit;
            x %= 10;
        }

        if (isNegative)
        {
            answer *= -1;
        }

        return answer;

    }




}
