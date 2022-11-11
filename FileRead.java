import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

public class FileRead {
    public static void main(String[] args) {
        Path lyricPath = Paths.get("lyrics.txt");
        Path wordPath = Paths.get("lyrics.docx");

        try {
            BasicFileAttributes lyricsTxt = Files.readAttributes(lyricPath, BasicFileAttributes.class);
            BasicFileAttributes lyricsDocx = Files.readAttributes(wordPath, BasicFileAttributes.class);
            long lyricsTxtSize = lyricsTxt.size();
            long lyricsDocxSize = lyricsDocx.size();
            long sizeRatio = lyricsTxtSize / lyricsDocxSize;
            System.out.printf("The size ratio between %s and %s is %d", lyricPath, wordPath, sizeRatio);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
