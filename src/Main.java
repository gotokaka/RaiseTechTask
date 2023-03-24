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

        /*Mapのkeyと値の両方を取るメソッド*/
        for (Map.Entry<String, String> entry : creaturesMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        System.out.println("＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝");

        /*Mapのkeyを取得するメソッドとif文の追加*/
        for (String key : creaturesMap.keySet()) {
            if(key.equals("鳥類")){
                System.out.println("キジは鳥類");
            } else {
                System.out.println(key +"は鳥類ではない");
            }
        }

        System.out.println("＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝");

        /*Mapの値(values)を取得するメソッド*/
        for (String val : creaturesMap.values()) {
            System.out.println(val);
        }
    }
}