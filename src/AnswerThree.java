/**
 * fileName     : AnswerThree
 * author       : jungwoo
 * description  :
 */
public class AnswerThree {

  public static int factorial(int num){
    if(num <= 1){
      return num;
    }
    return factorial(num-1)*num;
  }
  public static void main(String[] args) {

    int result = factorial(1000000);
    System.out.println(result);
  }


}
