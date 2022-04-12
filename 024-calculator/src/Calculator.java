public class Calculator {
  int a;
  int b;

  public int calculate(int a, int b, Operator op) throws IllegalArgumentException {

    this.a = a;
    this.b = b;

    int result = 0;

    switch (op) {
      case ADD:
        result = this.add();
        break;
      case SUB:
        result = this.sub();
        break;
      case MULT:
        result = this.mult();
        break;
      case DIV:
        result = this.div();
        break;
      default:
        throw new IllegalArgumentException("Operator ist nicht erlaubt");

    }

    return result;
  }

  private int add() {
    return this.a + this.b;
  }

  private int sub() {
    return this.a - this.b;
  }

  private int mult() {
    return this.a * this.b;
  }

  private int div() {
    return this.a / this.b;
  }

}
