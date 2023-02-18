package abstractFactory.bases;

import abstractFactory.servicios.IServiciosArticulos;
import abstractFactory.servicios.IServiciosEmpleados;
import abstractFactory.servicios.IServiciosRest;
import abstractFactory.servicios.IServiciosSoap;

public interface IServiciosBasesGenericos {
    IServiciosEmpleados getEmpleados();
    IServiciosArticulos getArticulos();
    IServiciosRest getRest();
    IServiciosSoap getSoap();
}
