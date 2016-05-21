package gq.bdb.csv;

import com.univocity.parsers.common.processor.ColumnProcessor;
import com.univocity.parsers.csv.CsvParser;
import com.univocity.parsers.csv.CsvParserSettings;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;


public class CsvReaderTest {

    private final String fileName = "client.csv";

    @Test
    public void getHeaders() throws Exception {
        // Настройки
        CsvParserSettings settings = new CsvParserSettings();
        settings.getFormat().setLineSeparator("\n");
        settings.setHeaderExtractionEnabled(true);
        // Для обработки по клонокам
        ColumnProcessor columnProcessor =  new ColumnProcessor();
        settings.setRowProcessor(columnProcessor);

        // Парсер
        CsvParser parser = new CsvParser(settings);

        parser.parse(this.getClass().getResourceAsStream(fileName),"UTF-8");

        System.out.println(Arrays.toString(columnProcessor.getHeaders()));
        assertEquals(columnProcessor.getHeaders().length,8);

    }

}