package dip1.model.util;

import java.util.List;

import dip1.model.ReportItem;
import dip1.model.ReportManager;

public class DisplayPrinter implements ReportManager {
    public void output(List<ReportItem> items) {
        System.out.println("OUTPUT TO DISPLAY");
        for (ReportItem item : items) {
            System.out.format("DISPLAY %s - %f \n\r", item.getDescription(), item.getAmount());
        }
    }
}
