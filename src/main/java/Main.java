import domain.Cache;
import domain.Endpoint;
import domain.Request;
import domain.Video;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.parseInt;

public class Main {

    public static List<Video> videoList = new ArrayList();
    public static List<Endpoint> endpointList = new ArrayList();
    public static List<Cache> cacheList = new ArrayList();

    public static void main(String[] args) throws IOException {
        File inputFile = new File("test.in");
        BufferedReader br = new BufferedReader(new FileReader(inputFile));
        String totalInfoString = br.readLine();
        String[] totalInfoArray = totalInfoString.split(" ");

        //parse cache
        int cacheSize = parseInt(totalInfoArray[4]);
        for (int i = 0; i < parseInt(totalInfoArray[3]); i++) {
            cacheList.add(new Cache(i, cacheSize));
        }

        //parse video size
        String videoSizeString = br.readLine();
        String[] videoSizeArray = videoSizeString.split(" ");
        for (int i = 0; i < parseInt(totalInfoArray[0]); i++) {
            videoList.add(new Video(i, parseInt(videoSizeArray[i])));
        }

        //parse endpoint info
        int numberOfEndpoint = parseInt(totalInfoArray[1]);
        for (int i = 0; i < numberOfEndpoint; i++) {
            String endpointInfoString = br.readLine();
            String[] endpointInfoArray = endpointInfoString.split(" ");
            Endpoint endpoint = new Endpoint();
            endpoint.setId(i);
            endpoint.setLatencyToDataCenter(parseInt(endpointInfoArray[0]));
            //read cache to latency
            int numberOfCache = parseInt(endpointInfoArray[1]);
            for (int j = 0; j < numberOfCache; j++) {
                String cacheInfoString = br.readLine();
                String[] cacheInfoArray = cacheInfoString.split(" ");
                endpoint.getCacheToLatencyMap().put(parseInt(cacheInfoArray[0]), parseInt(cacheInfoArray[1]));
            }
            endpointList.add(endpoint);
        }

        //parse Request info
        int requestCount = parseInt(totalInfoArray[2]);
        for (int i = 0; i < requestCount; i++) {
            String requestInfoString = br.readLine();
            String[] requestInfoArray = requestInfoString.split(" ");
            int video = parseInt(requestInfoArray[0]);
            int endpoint = parseInt(requestInfoArray[1]);
            int noOfRequst = parseInt(requestInfoArray[0]);
            endpointList.get(endpoint).getRequestList().add(new Request(video, noOfRequst));
        }

        System.out.println("test");


    }
}
