package ru.tyurin.project;


import java.util.HashMap;


public class LionAlex extends Lion {

    public LionAlex(Feline feline) throws Exception {
        super("Самец", feline);
    }

    public HashMap<String, String> getFriends() {
        HashMap<String, String> friends = new HashMap<>();
        friends.put("Зебра", "Марти");
        friends.put("Бегемотиха", "Глория");
        friends.put("Жираф", "Мелман");
        return friends;
    }

    public String getPlaceOfLiving() {
        return "Нью-Йоркский зоопарк";
    }

    @Override
    public int getKittens() {
        return 0;
    }

}
