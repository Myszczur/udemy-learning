import org.jfree.chart.JFreeChart;
import org.jfree.data.time.Day;
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.TimeSeriesCollection;
import org.jfree.data.xy.XYDataset;
import yahoofinance.Stock;
import yahoofinance.YahooFinance;
import yahoofinance.histquotes.HistoricalQuote;

import javax.swing.*;
import java.util.Calendar;
import java.util.List;

public class TeslaChart extends JFrame {

    public TeslaChart() {
        XYDataset dataset = createDatSet();

    }

    public XYDataset createDatSet() {
        try {
            Stock stock = YahooFinance.get("TSLA", true);
            List<HistoricalQuote> stockHistory = stock.getHistory();

            String year = "" + stockHistory.get(0).getDate().get(Calendar.YEAR);
            TimeSeriesCollection dataset = new TimeSeriesCollection();
            TimeSeries series = new TimeSeries(year);

            for (HistoricalQuote quote : stockHistory) {
                Calendar calendar = quote.getDate();
                series.add(new Day(calendar.get(Calendar.DAY_OF_MONTH),
                                calendar.get(Calendar.MONTH) + 1,
                                calendar.get(Calendar.YEAR)),
                        quote.getClose());
                System.out.println(quote.getDate().getTime() + " - " + quote.getClose());
            }

            dataset.addSeries(series);
            return dataset;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public JFreeChart createChart() {
        return null;
    }

    public static void main(String[] args) {

        TeslaChart chart = new TeslaChart();

    }
}
