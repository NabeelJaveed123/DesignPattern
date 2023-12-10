package gof.StateDesignPattern.refactoringGuru;

import java.util.List;

public class TrackIterator {
    private List<String> playlist;
    private int currentTrack;

    public TrackIterator(List<String> playlist) {
        this.playlist = playlist;
        this.currentTrack = 0;
    }

    public String getCurrentTrack() {
        return playlist.get(currentTrack);
    }

    public String getNextTrack() {
        currentTrack = (currentTrack + 1) % playlist.size();
        return getCurrentTrack();
    }

    public String getPreviousTrack() {
        currentTrack = (currentTrack - 1 + playlist.size()) % playlist.size();
        return getCurrentTrack();
    }

    public void reset() {
        currentTrack = 0;
    }
}
