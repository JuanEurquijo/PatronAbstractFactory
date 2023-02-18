package abstractFactory.familiarest;

import abstractFactory.servicios.IServiciosEmpleados;

public class ImplementacionRestEmpleados implements IServiciosEmpleados {
    private static final String[] EMPLEADOS = new String[]{"Juan Guillermo", "David", "Luis Fernando"};

    @Override
    public String[] getEmpleados() {
        System.out.println("Tipo de Servicio: Restful");
        return EMPLEADOS;
    }

}