package dev.razafindratelo;

import dev.razafindratelo.streamingMusical.songSet.PlayList;
import dev.razafindratelo.streamingMusical.user.User;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        PlayList playList1 = new PlayList("1", "test");
        User user = new User("a", "b", "c");
        User user2 = new User("c", "b", "c");
        System.out.println(playList1.getLike());
        user.like(playList1);
        System.out.println(playList1.getLike());
        user2.like(playList1);
        System.out.println(playList1.getLike());
    }
}