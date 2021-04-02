package me.rostkov.lab.task.chapter_3.unit_4;

import me.rostkov.lab.task.chapter_2.unit_6.Album;
import me.rostkov.lab.task.chapter_2.unit_6.Track;
import me.rostkov.lab.task.chapter_3.unit_3.Route;

import java.util.Arrays;

public class LinkedAlbum extends Album {

    public LinkedTrack[] tracks;

    public LinkedAlbum(String name, String author, LinkedTrack[] tracks) {
        super(name, author);
        this.tracks = tracks;
    }

    public LinkedAlbum(String name, String author) {
        super(name, author);
    }

    public void addTrack(LinkedTrack track) {
        if (this.tracks == null) {
            this.tracks = new LinkedTrack[]{track};
        } else {
            this.tracks = Arrays.copyOf(this.tracks, this.tracks.length + 1);
            this.tracks[this.tracks.length - 1] = track;
        }
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder("Альбом '" + this.getName() + "':\n");

        if (this.tracks != null) {
            for (LinkedTrack track : this.tracks) {
                str.append(String.format("  * %s\n", track));
            }
        }

        return str.toString();
    }
}
