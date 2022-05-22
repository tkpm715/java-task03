import java.util.Random;

public class RaiseErr {
  public static void err() {
    Random random = new Random();
    int x = random.nextInt(4);
    String y = null;

    System.out.println(""); // 可読性良くするため改行
    System.out.println("▼例外を発生させ表示");

    try {

      if (x < 2) {
        y = Integer.toString(x);
      }

      if (x == 3) {
        throw new Exception("意図的に例外を投げる。");
      }

      int z = 1 / Integer.parseInt(y); //ここでエラーを発生させる

      System.out.println("正常終了");

    } catch (ArithmeticException e) {
      System.out.println("エラーが発生しました。ゼロで除算。" + e.getMessage());
      e.printStackTrace();
    } catch (NumberFormatException e) {
      System.out.println("エラーが発生しました。yが" + e.getMessage() + "のため型変換不能。");
      e.printStackTrace();
    } catch (Exception e) {
      System.out.println("エラーが発生しました。" + e.getMessage());
    } finally {
      System.out.println("乱数xの値：" + x);
    }

  }

}
