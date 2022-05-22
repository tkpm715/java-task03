import java.util.Comparator;
import java.util.List;

public class ExeStreamAPI {
  public void indexOrderOut(List<String> list) {
    System.out.printf("1.インデックス順表示：");
    list.stream()
      .forEach(s -> System.out.printf(s + " ")); // 「+ " "」は可読性良くするため
    System.out.println(""); //可読性良くするため改行
  }

  public void descOrderOut(List<String> list) {
    System.out.printf("2.降順表示：");
    list.stream()
      .sorted(Comparator.reverseOrder())
      .forEach(s -> System.out.printf(s + " "));
    System.out.println(""); //可読性良くするため改行
  }

  public void filterOut(List<String> list) {
    System.out.printf("3.３文字以上表示：");
    list.stream()
      .filter(s -> s.length() >= 3)
      .forEach(s -> System.out.printf(s + " "));
    System.out.println(""); //可読性良くするため改行
  }

  public void skipLimitOut(List<String> list) {
    System.out.printf("4.２番目から２つ表示：");
    list.stream()
      .skip(1).limit(2)
      .forEach(s -> System.out.printf(s + " "));
    System.out.println(""); //可読性良くするため改行
  }
}
