package domain;

public class Request {
    private int videoNo;
    private int requestCount;

    public Request(int videoNo, int requestCount) {
        this.videoNo = videoNo;
        this.requestCount = requestCount;
    }

    public int getVideoNo() {
        return videoNo;
    }

    public void setVideoNo(int videoNo) {
        this.videoNo = videoNo;
    }

    public int getRequestCount() {
        return requestCount;
    }

    public void setRequestCount(int requestCount) {
        this.requestCount = requestCount;
    }
}
