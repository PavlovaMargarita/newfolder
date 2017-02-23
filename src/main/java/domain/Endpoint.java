package domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Endpoint {
    private int id;
    private Map<Integer, Integer> cacheToLatencyMap;
    private int latencyToDataCenter;
    private List<Request> requestList;

    public Endpoint() {
        cacheToLatencyMap = new TreeMap();
        requestList = new ArrayList();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Map<Integer, Integer> getCacheToLatencyMap() {
        return cacheToLatencyMap;
    }

    public void setCacheToLatencyMap(Map<Integer, Integer> cacheToLatencyMap) {
        this.cacheToLatencyMap = cacheToLatencyMap;
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
