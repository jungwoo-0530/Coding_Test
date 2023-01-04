import java.math.BigInteger;

/**
 * fileName     : AnswerFour
 * author       : jungwoo
 * description  :
 */
public class AnswerFour {

  public static BigInteger factorial(int num) {
    BigInteger result = BigInteger.valueOf(num);

    while (num >= 1) {
      result = result.multiply(BigInteger.valueOf(num));
      num--;
    }
    return result;
  }

  public static void main(String[] args) {

    BigInteger res = factorial(1000000);

    System.out.println(res);
  }
}
