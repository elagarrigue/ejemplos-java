public class Main {

  public static void main(String[] args) {
    Expr expr =
            new Sum(
                    new Sum(
                            new Num(1),
                            new Num(2)),
                    new Num(4)
            );

    System.out.println("Result: " + eval(expr));
  }

  static int eval(Expr e) {

    if (e instanceof Num) {
      Num n = (Num) e;
      return n.getValue();
    }

    if (e instanceof Sum) {
      Sum s = (Sum) e;
      return eval(s.getLeft()) + eval(s.getRight());
    }

    throw new IllegalArgumentException();
  }

}
