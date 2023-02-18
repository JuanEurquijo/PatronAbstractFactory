package abstractFactory.servicios;

import java.io.IOException;
import java.util.InputMismatchException;

public interface IServiciosSoap {

    String getSoap(double num) throws InputMismatchException;
}
