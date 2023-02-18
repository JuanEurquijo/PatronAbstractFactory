package abstractFactory.familiaws;

import abstractFactory.servicios.IServiciosSoap;
import com.learnwebservices.services.tempconverter.CelsiusToFahrenheitRequest;
import com.learnwebservices.services.tempconverter.CelsiusToFahrenheitResponse;
import com.learnwebservices.services.tempconverter.TempConverterEndpoint;
import com.learnwebservices.services.tempconverter.TempConverterEndpointService;

import java.util.InputMismatchException;

public class ImplementacionWSSoap implements IServiciosSoap {

    @Override
    public String getSoap(double num) throws InputMismatchException {
        TempConverterEndpointService service = new TempConverterEndpointService();
        TempConverterEndpoint port = service.getTempConverterEndpointPort();
        CelsiusToFahrenheitRequest request = new CelsiusToFahrenheitRequest();
        request.setTemperatureInCelsius(num);
        CelsiusToFahrenheitResponse response = port.celsiusToFahrenheit(request);
        return String.valueOf(response.getTemperatureInFahrenheit());
    }
}
