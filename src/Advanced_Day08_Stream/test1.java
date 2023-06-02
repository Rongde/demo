package Advanced_Day08_Stream;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class test1 {



    public static void main(String[] args) {

    }
}

interface AlertDAO {
    public UUID addAlert(Date time);
    public Date getAlert(UUID id);

}

class AlertService {
    private AlertDAO alterDAO;

    private final MapAlertDAO storage = new MapAlertDAO();

    public UUID raiseAlert() {
        return this.storage.addAlert(new Date());
    }

    public Date getAlertTime(UUID id) {
        return this.storage.getAlert(id);
    }

    public AlertService(AlertDAO alterDAO) {
        this.alterDAO = alterDAO;
        getAlertTime(raiseAlert());
    }
}

class MapAlertDAO  implements AlertDAO{
    private final Map<UUID, Date> alerts = new HashMap<UUID, Date>();

    public UUID addAlert(Date time) {
        UUID id = UUID.randomUUID();
        this.alerts.put(id, time);
        return id;
    }

    public Date getAlert(UUID id) {
        return this.alerts.get(id);
    }
}
