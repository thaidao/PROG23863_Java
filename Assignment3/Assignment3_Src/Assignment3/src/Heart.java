public class Heart {
    private int bpm;
    private HeartBeat heartBeat;

    public Heart(int bpm, HeartBeat heartBeat) {
        this.bpm = bpm;
        this.heartBeat = heartBeat;
    }

    public int getBpm() {
        return bpm;
    }

    public void setBpm(int bpm) {
        this.bpm = bpm;
    }

    public void oneMinute() {
        System.out.println("Heart beating with " + heartBeat);
    }
}