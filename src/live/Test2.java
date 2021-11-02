package live;

import java.math.BigInteger;
import java.util.*;

public class Test2 {
    public static void main(String[] args) {
        String S = "my.song.mp3 11b\n" + "greatSong.flac 1000b\n"
                + "not3.txt 5b\n" + "video.mp4 200b\n" + "game.exe 100b\n"
                + "mov!e.mkv 10000b";

        Set<String> music = new HashSet<>(Arrays.asList("mp3", "aac", "flac"));
        Set<String> images = new HashSet<>(Arrays.asList("jpg", "bmp", "gif"));
        Set<String> movies = new HashSet<>(Arrays.asList("mp4", "avi", "mkv"));

        Map<String, BigInteger> files = new LinkedHashMap<>();
        files.put("music", new BigInteger("0"));
        files.put("images", new BigInteger("0"));
        files.put("movies", new BigInteger("0"));
        files.put("other", new BigInteger("0"));

        String[] fileWithSizes = S.split("[\n]");

        for (int i = 0; i < fileWithSizes.length; i++) {
            String fileWithSize = fileWithSizes[i].substring(
                    fileWithSizes[i].lastIndexOf(".") + 1,
                    fileWithSizes[i].length() - 1);
            String[] str = fileWithSize.split("\\s+");
            if (music.contains(str[0])) {
                files.put("music",
                        files.get("music").add(new BigInteger(str[1])));
            } else if (images.contains(str[0])) {
                files.put("images",
                        files.get("images").add(new BigInteger(str[1])));
            } else if (movies.contains(str[0])) {
                files.put("movies",
                        files.get("movies").add(new BigInteger(str[1])));
            } else {
                files.put("other",
                        files.get("other").add(new BigInteger(str[1])));
            }
        }

        StringBuilder strBuilder = new StringBuilder();
        for (Map.Entry<String, BigInteger> map : files.entrySet()) {
            strBuilder.append(map.getKey()).append(" ").append(map.getValue()).append("b\n");
        }
        System.out.println(strBuilder.toString());
    }

}
