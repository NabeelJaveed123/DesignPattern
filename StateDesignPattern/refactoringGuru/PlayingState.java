package gof.StateDesignPattern.refactoringGuru;


import java.util.Timer;
import java.util.TimerTask;

public class PlayingState extends State {
    private Timer timer;

    PlayingState(Player player) {
        super(player);
        this.timer = new Timer();
    }

    @Override
    public String onLock() {
        player.changeState(new LockedState(player));
        player.setCurrentTrackAfterStop();
        stopTimer();
        return "Stop playing";
    }

    @Override
    public String onPlay() {
        // Start the timer when the track starts playing
        startTimer();
        return "Paused...";
    }

    @Override
    public String onNext() {
        stopTimer();
        return player.nextTrack();
    }

    @Override
    public String onPrevious() {
        stopTimer();
        return player.previousTrack();
    }

    private void startTimer() {
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                stopPlayingAndAlert();
            }
        }, 3000); // 3000 milliseconds (3 seconds)
    }

    private void stopTimer() {
        timer.cancel();
        timer = new Timer(); 
    }

    private void stopPlayingAndAlert() {
        player.changeState(new LockedState(player));
        player.setCurrentTrackAfterStop();
        System.out.println("Player damaged! Please reset.");
    }
}