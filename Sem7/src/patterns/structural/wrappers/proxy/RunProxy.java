package patterns.structural.wrappers.proxy;
import patterns.structural.wrappers.proxy.task.downloaders.impl.PictureDownloadService;
import patterns.structural.wrappers.proxy.task.downloaders.view.View;

/**
 * Ускорить работу программы, не меняя PictureDownloadService.
 */
public class RunProxy {
    public static void main(String[] args) {
//       https://ru.wallpaper.mob.org/
        //https://w.forfun.com/fetch/f0/f0a26d856e63862f20e3f5b7a4ca0b58.jpeg?h=900&r=0.5
        //https://w.forfun.com/fetch/6d/6d926bd8dd61460a0010cefd8eda659c.jpeg?h=900&r=0.5
        //https://w.forfun.com/fetch/94/94c56e15f13f1de4740a76742b0b594f.jpeg?h=450&r=0.5

        PictureDownloadService service = new PictureDownloadService();
        View view = new View();
        view.run(service);

    }
}
