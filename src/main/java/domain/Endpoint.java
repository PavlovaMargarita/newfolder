package domain;

import java.util.List;
import java.util.Map;

public class Endpoint {
    private int id;
    private Map<Cache, Integer> cacheLatencyMap;
    private int latencyToDataCenter;
    private List<Request> requestList;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Map<Cache, Integer> getCacheLatencyMap() {
        return cacheLatencyMap;
    }

    public void setCacheLatencyMap(Map<Cache, Integer> cacheLatencyMap) {
        this.cacheLatencyMap = cacheLatencyMap;
    }

    public int getLatencyToDataCenter() {
        return latencyToDataCenter;
    }

    public void setLatencyToDataCenter(int latencyToDataCenter) {
        this.latencyToDataCenter = latencyToDataCenter;
    }

    public List<Request> getRequestList() {
        return requestList;
    }

    public void setRequestList(List<Request> requestList) {
        this.requestList = requestList;
    }
}
