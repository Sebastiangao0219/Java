/**
 * 
 */

/**
 * @author Sebastian Gao
 *
 */
public class Downcast {
  static class A           { int x; }
  static class B extends A { int y; }

  static B convert (A p) {
    B result = (B) p;
    return result;
  }

  public static void main (String[] args) {
    A r = new A ();
    r.x = 5;
    B s = convert (r);
    System.out.println (s);
  }
}
