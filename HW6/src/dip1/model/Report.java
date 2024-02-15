package dip1.model;

import java.util.List;

public class Report {
    private List<ReportItem> items; // report data

    public Report(List<ReportItem> items) {
        this.items = items;
    }

    // calculate report data
    public void calculate() {
        items.add(new ReportItem("First", (float) 5));
        items.add(new ReportItem("Second", (float) 6));
    }

    public void output(ReportManager printer) {
        printer.output(items);
    }
}
