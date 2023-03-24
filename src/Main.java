import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

/**目標：生き物リストを作成し(List)、その中から鳥類のみの情報を取得する(Map)
 * これから実行する事
 * 1.Mapでキーと値の両方を取得するメソッド(entrySet)を実行する
 * 2.Mapにおいて、「指定したキーが存在するか判定する」メソッド(containsKey)を実装してみる
 * 3.MapとListを使って目標の要件を満たしたコードを実装する
 * 4.例外処理を実装してみる**/
public class Main {
    public static void main(String[] args) {
        /*リストの宣言*/
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

        System.out.println("------------------------------");

        /*Mapの宣言。*/
        Map< String,String> creaturesMap = new HashMap<>();
        creaturesMap.put("哺乳類", "キリン");
        creaturesMap.put("鳥類", "キジ");
        creaturesMap.put("魚類", "マグロ");
        /*Mapのkeyを取得するメソッド*/
        for (String key : creaturesMap.keySet()) {
            System.out.println(key);
        }
        /*Mapの値(values)を取得するメソッド*/
        for (String val : creaturesMap.values()) {
            System.out.println(val);
        }
        /*Mapのkeyと値の両方を取るメソッド*/
        for (Map.Entry<String, String> entry : creaturesMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

    }
}