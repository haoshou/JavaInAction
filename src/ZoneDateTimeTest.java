import java.time.Clock;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class ZoneDateTimeTest {
    public static void main(String[] args) {
        //1. 获取所有的时区ID
        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
        System.out.println("availableZoneIds: " + availableZoneIds);
        System.out.println("=============================");

        //2.1 获取当地的时间 LocalDateTime
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("当地的时间: " + localDateTime);

        //2.2 获取标准时区的时间 ZoneDateTime
        ZonedDateTime zonedDateTime = ZonedDateTime.now(Clock.systemUTC());
        System.out.println("标准时区时间UTC: " + zonedDateTime );

        //2.3 使用计算机的默认时区
        ZonedDateTime zonedDateTime1 = ZonedDateTime.now();
        System.out.println("计算机的默认时区时间: " + zonedDateTime1);

        //2.4 制定时区id
        ZonedDateTime now = ZonedDateTime.now(ZoneId.of("Asia/Shanghai"));
        System.out.println("指定时区时间: " + now );

    }
}
