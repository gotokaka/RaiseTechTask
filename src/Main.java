import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

/*目標：生き物リストを作成し(List)、その中から鳥類のみの情報を取得する(Map)*/
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

        for (String key : creaturesMap.keySet()) {
            System.out.println(key);
        }
        for (String val : creaturesMap.values()) {
            System.out.println(val);
        }

    }
}