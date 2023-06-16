import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;

public class StatsServiceTest {


    @Test
    public void AmountAllSalesMonth() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = service.allSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void MaximumSalesMonth() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 7;
        int actual = service.maxSalesMonth(sales);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void MinimumSalesMonth() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = service.minSalesMonth(sales);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void MediumSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        int actual = service.mediumSales(sales);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void AllMinSalesMonth() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.allMonthMinSales(sales);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void AllMaxSalesMonth() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.allMonthMaxSales(sales);
        Assertions.assertEquals(expected, actual);

    }
}

