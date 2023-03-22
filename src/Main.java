import java.util.ArrayList;
import java.util.List;
/*生き物リストを作成し(List)、その中から鳥類のみの情報を取得する(Map)*/
public class Main {
    public static void main(String[] args) {
        /*生き物インスタンスを生成する*/
        List<String> creatures = new ArrayList<>();
        /*メソッドを定義する*/
        creatures.add("キリン");
        creatures.add("キジ");
        creatures.add("マグロ");
        /*出力する*/
        System.out.println(creatures.size());
        System.out.println(creatures.get(0));
        System.out.println(creatures.get(1));
        System.out.println(creatures.get(2));

    }
}