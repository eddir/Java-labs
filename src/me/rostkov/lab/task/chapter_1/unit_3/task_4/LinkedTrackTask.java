package me.rostkov.lab.task.chapter_1.unit_3.task_4;

import me.rostkov.lab.task.BaseTask;
import me.rostkov.lab.task.Task;

import java.util.Scanner;

public class LinkedTrackTask extends BaseTask implements Task {
    public LinkedTrackTask() {
        this.id = "1.3.4";
        this.title = "Песни и ссылки";
        this.description = "Основные требования к данной задаче совпадают с таковыми для задачи 2.6, однако " +
                "необходимо так модифицировать решение, чтобы имея ссылку на трек, можно было бы получить доступ ко " +
                "всем трекам того же альбома, к которому относится текущий трек.";
    }

    @Override
    public void start(Scanner in) {

        LinkedAlbum album1 = new LinkedAlbum("Кукловод", "Металлов");
        LinkedAlbum album2 = new LinkedAlbum("Шоссе к ООП", "Асид");

        LinkedTrack track1 = new LinkedTrack("Состояние объектов", "Янг");
        LinkedTrack track2 = new LinkedTrack("Шоссе к ООП");
        LinkedTrack track3 = new LinkedTrack("Одноразовый программсит", "Бертон");

        track1.setAlbum(album2);
        track2.setAlbum(album2);
        track3.setAlbum(album1);

        System.out.println(track1.getAlbum());
    }
}
