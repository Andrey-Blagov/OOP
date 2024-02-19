package patterns.structural.wrappers.proxy.task.downloaders.validators;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Objects;

public class PictureComparator {
    private final String DIR = "src/patterns/wrappers/proxy/pictures";

    public boolean arePictureEqual(String path)  {
        try {

            InputStream in = new URI(path).toURL().openStream();
            byte[] bytes = toByteArray(in);

            File dir = new File(DIR);
            File[] files = dir.listFiles();
            if (Objects.requireNonNull(files).length == 0) return false;

            for (File elem: Objects.requireNonNull(files)) {
                byte[] current = Files.readAllBytes(Paths.get(elem.getAbsolutePath()));
                if (isEqual(current, bytes)) return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Something went wrong when comparing files...");

        }

        return false;
    }

    private byte[] toByteArray(InputStream in) throws Exception{
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        int nRead;
        byte[] data = new byte[16384];

        while ((nRead = in.read(data, 0, data.length)) != -1) {
            buffer.write(data, 0, nRead);
        }

        buffer.flush();
        return buffer.toByteArray();
    }

    private boolean isEqual(byte[] one, byte[] two) {
        return Arrays.equals(one, two);
    }
}
