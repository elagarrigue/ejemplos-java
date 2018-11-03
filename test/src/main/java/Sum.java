class Sum extends Expr {
  private Expr left;
  private Expr right;

  Sum(Expr left, Expr right) {
    this.left = left;
    this.right = right;
  }

  Expr getLeft() { return left; }

  Expr getRight() { return right; }
}
