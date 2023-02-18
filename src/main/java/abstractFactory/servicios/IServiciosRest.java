package abstractFactory.servicios;

import java.io.IOException;

public interface IServiciosRest {
    String getJson() throws IOException, InterruptedException;
}
