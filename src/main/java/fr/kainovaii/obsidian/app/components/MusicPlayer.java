package fr.kainovaii.obsidian.app.components;

import com.obsidian.core.livecomponents.annotations.Action;
import com.obsidian.core.livecomponents.annotations.LiveComponentImpl;
import com.obsidian.core.livecomponents.annotations.State;
import com.obsidian.core.livecomponents.core.LiveComponent;

import java.util.ArrayList;
import java.util.List;

@LiveComponentImpl
public class MusicPlayer extends LiveComponent
{
    @State
    private List<Track> trackList = new ArrayList<>();

    @State
    private int current = 0;

    @State
    private boolean playing = false;

    @Override
    public void onMount() {
        trackList.add(new Track(0, "Royalty Free Jazz", "https://www.soundhelix.com/examples/mp3/SoundHelix-Song-1.mp3"));
        trackList.add(new Track(1, "Electronic Beat", "https://www.soundhelix.com/examples/mp3/SoundHelix-Song-2.mp3"));
        trackList.add(new Track(2, "Ambient Groove", "https://www.soundhelix.com/examples/mp3/SoundHelix-Song-3.mp3"));
        trackList.add(new Track(3, "Chill Vibes", "https://www.soundhelix.com/examples/mp3/SoundHelix-Song-4.mp3"));
        trackList.add(new Track(4, "Funky Rhythm", "https://www.soundhelix.com/examples/mp3/SoundHelix-Song-5.mp3"));
    }

    @Action
    public void togglePlay() {
        playing = !playing;
    }

    @Action
    public void next() {
        current = (current + 1) % trackList.size();
        playing = true;
    }

    @Action
    public void prev() {
        current = (current - 1 + trackList.size()) % trackList.size();
        playing = true;
    }

    @Action
    public void select(int index) {
        current = index;
        playing = true;
    }

    public List<Track> getTrackList() { return trackList; }
    public int getCurrent() { return current; }
    public int getCurrentPosition() { return current + 1; }
    public boolean isPlaying() { return playing; }
    public Track getCurrentTrack() { return trackList.get(current); }

    @Override
    public String template() {
        return "components/music-player.html";
    }

    public static class Track {
        public int id;
        public String title;
        public String url;

        public Track() {}

        public Track(int id, String title, String url) {
            this.id = id;
            this.title = title;
            this.url = url;
        }

        public int getId() { return id; }
        public String getTitle() { return title; }
        public String getUrl() { return url; }
    }
}