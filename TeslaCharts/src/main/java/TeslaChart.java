import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.time.Day;
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.TimeSeriesCollection;
import org.jfree.data.xy.XYDataset;
import yahoofinance.Stock;
import yahoofinance.YahooFinance;
import yahoofinance.histquotes.HistoricalQuote;

import javax.swing.*;
import java.awt.*;
import java.util.Calendar;
import java.util.List;

public class TeslaChart extends JFrame {

    final String ticker = "TSLA";

    public TeslaChart() {
        XYDataset dataset = createDatSet();
        JFreeChart chart = createChart(dataset);

        ChartPanel chartPanel = new ChartPanel(chart);

        chartPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        add(chartPanel);

        pack();
        setTitle("Wykres ceny akcji: " + ticker);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public XYDataset createDatSet() {
        try {
            Stock stock = YahooFinance.get(ticker, true);
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

    public JFreeChart createChart(XYDataset dataset) {
        JFreeChart chart = ChartFactory.createTimeSeriesChart(
                "Wukres ceny akcji: " + ticker,
                "Data",
                "Cena akcji",
                dataset
        );

        XYPlot plot = chart.getXYPlot();
        XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();
        renderer.setSeriesPaint(0, Color.BLUE);
        renderer.setSeriesStroke(0, new BasicStroke(2.2f));

        plot.setRenderer(renderer);
        plot.setBackgroundPaint(Color.WHITE);
        plot.setRangeGridlinesVisible(true);
        plot.setRangeGridlinePaint(Color.BLACK);

        plot.setDomainGridlinesVisible(true);
        plot.setDomainGridlinePaint(Color.BLACK);

        return chart;
    }

    public static void main(String[] args) {

        TeslaChart chart = new TeslaChart();

    }
}
