package abstractFactory.familiaws;

import abstractFactory.bases.IServiciosBasesGenericos;
import abstractFactory.servicios.IServiciosArticulos;
import abstractFactory.servicios.IServiciosEmpleados;
import abstractFactory.servicios.IServiciosRest;
import abstractFactory.servicios.IServiciosSoap;

public class ImplementacionFabricaWS implements IServiciosBasesGenericos {

    @Override
    public IServiciosEmpleados getEmpleados() {
        return new ImplementacionWSEmpleados();
    }

    @Override
    public IServiciosArticulos getArticulos() {
        return new ImplementacionWSArticulos();
    }

    @Override
    public IServiciosRest getRest() {
        return null;
    }

    @Override
    public IServiciosSoap getSoap() {
        return new ImplementacionWSSoap();
    }

}
