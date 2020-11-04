package resolucaoExe1;

import org.joda.time.*;
import org.joda.time.format.*;

/**
 * Esta classe serve para instanciar o método WorldTime
 */
public class WorldTime {
    /**
     *
     * @param timezone zona temporal de um determinado país
     * @return com base um país retorna a hora atual no formato hh:mm
     */
    public String getTimeByCountry(String timezone) {
        Instant nowUtc = Instant.now();
        DateTimeFormatter dtf = DateTimeFormat.forPattern("hh:mm");
        DateTimeZone zone = DateTimeZone.forID(timezone);
        DateTime dt = nowUtc.toDateTime(zone);
        return dt.toString(dtf);
    }
}
