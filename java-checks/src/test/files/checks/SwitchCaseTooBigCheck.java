class A {
  void f() {
    switch (x) {
      case 0: // Compliant - 5
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
      case 1: // Non-Compliant - 6
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        break;
      case 2: { System.out.println(); // Non-Compliant - 7
      System.out.println();
      System.out.println();
      System.out.println();
      System.out.println();
      System.out.println();
      System.out.println(); }
      default: // Non-Compliant - 6
        System.out.println();
        System.out.println();
        /* foo */

        System.out.println(
        );
    }
  }
}
