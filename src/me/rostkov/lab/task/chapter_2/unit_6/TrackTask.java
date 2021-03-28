package me.rostkov.lab.task.chapter_2.unit_6;

import me.rostkov.lab.task.BaseTask;
import me.rostkov.lab.task.Task;

public class TrackTask extends BaseTask implements Task {
    public TrackTask() {
        this.id = "2.6";
        this.title = "Песни";
        this.description = "Необходимо разработать сущность Музыкальный Трек, которая описывается названием, автором и" +
                " альбомом, к которому данный трек относится, причем альбом описывается названием и автором. Будем" +
                " считать, что автор альбома - это автор всех песен, однако у него могут быть соавторы, которые" +
                " указываются непосредственно в треках. Любой трек может быть приведен к строке вида: " +
                "“Название, авторы: Автор1, Автор 2”, либо “Название, автор: Автор1”. ";
    }

    @Override
    public void start() {
        Album album1 = new Album("Кукловод", "Металлов");
        Album album2 = new Album("Шоссе к ООП", "Асид");

        Track track1 = new Track("Состояние объектов", "Янг");
        Track track2 = new Track("Шоссе к ООП"); // TODO: повторяется название?
        Track track3 = new Track("Одноразовый программсит", "Бертон");

        track1.setAlbum(album2);
        track2.setAlbum(album2);
        track3.setAlbum(album1);

        System.out.println(track1);
        System.out.println(track2);
        System.out.println(track3);
    }
}
