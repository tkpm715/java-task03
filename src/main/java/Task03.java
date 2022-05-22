import java.util.ArrayList;
import java.util.List;

public class Task03 {
  public static void main(String[] args) {

    ////// （課題）String型のListを作成しコンソール画面に表示  /////
    List<String> names = new ArrayList<>();
    names.add("さとう");
    names.add("おの");
    names.add("ごろうまる");
    names.add("やまざき");

    ExeStreamAPI esa = new ExeStreamAPI();

    esa.indexOrderOut(names); //インデックス番号順に表示
    esa.descOrderOut(names); //降順表示 sort
    esa.filterOut(names); // ４文字以上の名前だけ表示 filter
    esa.skipLimitOut(names); // インデックス順２番目から２つ表示

    ////// （課題）任意のプログラムで例外を起こしてみる  /////
    RaiseErr.err(); //ランダムで何種類かのエラーを発生させ内容を表示
  }
}
