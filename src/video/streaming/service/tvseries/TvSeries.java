package video.streaming.service.tvseries;

import video.streaming.service.Video;

public class TvSeries extends Video {

    //#4 - Video streaming service
    private TvSeries nextInSeries;

    public TvSeries getNextInSeries() {
        return nextInSeries;
    }

    public void setNextInSeries(TvSeries nextInSeries) {
        this.nextInSeries = nextInSeries;
    }

    public TvSeries(int length, boolean contentQualified, int volumeLevel) {
        super(length, contentQualified, volumeLevel);
    }
}
