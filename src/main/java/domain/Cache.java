package domain;

import java.util.List;

public class Cache {
    private int id;
    private int capacity;
    private int remainCapacity;
    private List<Video> videoInCache;

    public Cache(int id, int capacity) {
        this.id = id;
        this.capacity = capacity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getRemainCapacity() {
        return remainCapacity;
    }

    public void setRemainCapacity(int remainCapacity) {
        this.remainCapacity = remainCapacity;
    }

    public List<Video> getVideoInCache() {
        return videoInCache;
    }

    public void setVideoInCache(List<Video> videoInCache) {
        this.videoInCache = videoInCache;
    }
}
