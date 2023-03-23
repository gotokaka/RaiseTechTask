import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

/*目標：生き物リストを作成し(List)、その中から鳥類のみの情報を取得する(Map)*/
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
        /*Mapを追加。*/
        HashMap<Integer, String> creaturesMap = new HashMap<>();
        creaturesMap.put(0,"哺乳類");
        creaturesMap.put(1,"鳥類");
        creaturesMap.put(2,"魚類");

        System.out.println(creaturesMap.get(0));
        System.out.println(creaturesMap.get(1));
        System.out.println(creaturesMap.get(2));

    }
}