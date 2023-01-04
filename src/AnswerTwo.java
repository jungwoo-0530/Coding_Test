/**
 * fileName     : AnswerTwo
 * author       : jungwoo
 * description  :
 */

class Calculator{
  private int num;

  Calculator() {}

  public Calculator add(int number){
    this.num += number;
    return this;
  }

  public Calculator subtract(int number) {
    this.num -= number;
    return this;
  }

  public int out() {
    return this.num;
  }
}

public class AnswerTwo {
  public static void main(String[] args) {
    Calculator calculator = new Calculator();

    int result = calculator.add(4).add(5).subtract(3).out();

    System.out.println(result);
  }
}
