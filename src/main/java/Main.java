import domain.Endpoint;
import domain.Video;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static List<Video> videoList;
    public static List<Endpoint> endpointList;

    public static void main(String[] args) throws IOException {
        File inputFile = new File("me_at_the_zoo.in");
        try (BufferedReader br = new BufferedReader(new FileReader(inputFile))) {
            String totalInfoString = br.readLine();
            String [] totalInfoArray = totalInfoString.split(" ");

            String videoSizeString = br.readLine();
            String [] videoSizeArray = videoSizeString.split(" ");
            videoList = new ArrayList<>(videoList.size());
            for(int i = 0; i < videoSizeArray.length; i++) {
                videoList.add(new Video(i, Integer.parseInt(videoSizeArray[i])));
            }
//
//            while ((totalInfoString = ) != null) {
//
//            }
        }

    }
}
