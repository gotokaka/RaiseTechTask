import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        /*Listの宣言*/
        List<String> creatures = new ArrayList<>();
        /*メソッドを定義する*/
        creatures.add("ゾウ");
        creatures.add("タカ");
        creatures.add("サンマ");
        /*Mapの宣言。*/
        Map< String,String> creaturesMap = new HashMap<>();
        /*メソッドを定義する*/
        creaturesMap.put("哺乳類", "キリン");
        creaturesMap.put("鳥類", "キジ");
        creaturesMap.put("魚類", "マグロ");
        creaturesMap.put("両生類", "カエル");

        System.out.println("-----------------------------");

        /*Listでの拡張for文*/
        for(String value : creatures){
            System.out.println(value);
        }
        System.out.println("＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝");

        /*Mapのkeyを取得するメソッド*/
        for (String key : creaturesMap.keySet()) {
            System.out.println(key);
        }
        System.out.println("＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝");

        /*Mapの値(values)を取得するメソッド*/
        for (String val : creaturesMap.values()) {
            System.out.println(val);
        }
        System.out.println("＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝");

        /*Mapのkeyと値の両方を取得するメソッド*/
        for (Map.Entry<String, String> entry : creaturesMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}