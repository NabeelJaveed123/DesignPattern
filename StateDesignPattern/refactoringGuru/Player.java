package gof.StateDesignPattern.refactoringGuru;

import java.util.ArrayList;
import java.util.List;
public class Player {
    private State state;
    private boolean playing = false;
    private TrackIterator trackIterator;

    public Player() {
        this.state = new ReadyState(this);
        setPlaying(true);

        // Initialize playlist
        List<String> playlist = new ArrayList<>();
        for (int i = 1; i <= 12; i++) {
            playlist.add("Track " + i);
        }

        // Initialize track iterator
        this.trackIterator = new TrackIterator(playlist);
    }

    public void changeState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void setPlaying(boolean playing) {
        this.playing = playing;
    }

    public boolean isPlaying() {
        return playing;
    }

    public String startPlayback() {
        return "Playing " + trackIterator.getCurrentTrack();
    }

    public String nextTrack() {
        return "Playing " + trackIterator.getNextTrack();
    }

    public String previousTrack() {
        return "Playing " + trackIterator.getPreviousTrack();
    }

    public void setCurrentTrackAfterStop() {
        trackIterator.reset();
    }
}