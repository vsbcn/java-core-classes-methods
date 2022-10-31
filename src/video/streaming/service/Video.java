package video.streaming.service;

public class Video {
    //#4 - Video streaming service

    private int length;

    public int getVolumeLevel() {
        return volumeLevel;
    }

    public void setVolumeLevel(int volumeLevel) {
        this.volumeLevel = volumeLevel;
    }

    private int volumeLevel;
    private boolean contentQualified;


    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public boolean isContentQualified() {
        return contentQualified;
    }

    public void setContentQualified(boolean contentQualified) {
        this.contentQualified = contentQualified;
    }

    public Video(int length, boolean contentQualified, int volumeLevel) {
        setLength(length);
        setContentQualified(contentQualified);
        setVolumeLevel(volumeLevel);
    }

    public void muteSound(int volumeLevel){
        this.volumeLevel = 0;
    }
}
