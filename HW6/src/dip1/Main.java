package dip1;

import dip1.model.Report;
import dip1.model.ReportItem;
import dip1.model.util.DisplayPrinter;
import dip1.model.util.ReportPrinter;
import logger.Log;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    private static final Logger log = Log.log(Main.class.getName());

    public static void main(String[] args) {
        List<ReportItem> reports = new ArrayList<>();

        log.log(Level.INFO, "Method main in model package started");
        Report report = new Report(reports);
        report.calculate();
        report.output(new DisplayPrinter());
    }
}
