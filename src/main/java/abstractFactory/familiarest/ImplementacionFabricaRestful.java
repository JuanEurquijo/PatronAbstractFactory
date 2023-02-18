package abstractFactory.familiarest;

import abstractFactory.bases.IServiciosBasesGenericos;
import abstractFactory.servicios.IServiciosArticulos;
import abstractFactory.servicios.IServiciosEmpleados;
import abstractFactory.servicios.IServiciosRest;
import abstractFactory.servicios.IServiciosSoap;

public class ImplementacionFabricaRestful implements IServiciosBasesGenericos {

    @Override
    public IServiciosEmpleados getEmpleados() {
        return new ImplementacionRestEmpleados();
    }

    @Override
    public IServiciosArticulos getArticulos() {
        return new ImplementacionRestArticulos();
    }

    @Override
    public IServiciosRest getRest() {return new ImplementacionRest();}

    @Override
    public IServiciosSoap getSoap() {
        return null;
    }


}
