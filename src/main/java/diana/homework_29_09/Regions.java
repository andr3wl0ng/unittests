package diana.homework_29_09;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Regions {
    public static void main(String args[]) {
        Map<String, List<String>> regions = new HashMap<>();
        List<String> chernigivskaRaions = new ArrayList();
        chernigivskaRaions.add("Корюківський район");
        chernigivskaRaions.add("Ніжинський район");
        chernigivskaRaions.add("Новгород-Сіверський район");
        chernigivskaRaions.add("Прилуцький район");
        chernigivskaRaions.add("Чернігівський район");

        List<String> zakarpatskaRaions = new ArrayList();
        zakarpatskaRaions.add("Берегівський район");
        zakarpatskaRaions.add("Мукачівський район");
        zakarpatskaRaions.add("Ужгородський район");
        zakarpatskaRaions.add("Рахівський район");
        zakarpatskaRaions.add("Тячівський район");
        zakarpatskaRaions.add("Хустський район");


        regions.put("Чернiгiвська область", chernigivskaRaions);
        regions.put("Закарпатська область", zakarpatskaRaions);
    }
}
