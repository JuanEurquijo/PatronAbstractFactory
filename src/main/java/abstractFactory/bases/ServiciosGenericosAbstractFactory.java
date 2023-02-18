package abstractFactory.bases;

import abstractFactory.utilidades.UtilidadesAcceso;

import java.util.Properties;

public class ServiciosGenericosAbstractFactory {
    public ServiciosGenericosAbstractFactory() {}

    public static IServiciosBasesGenericos createServiceFactory() {
        Properties props = UtilidadesAcceso.loadProperty(
                "propiedades/AbsFactoryPropiedades.properties");
        String factoryClass =
                props.getProperty("servicioImplementado");
        System.out.println(factoryClass);
        try {
            return (IServiciosBasesGenericos)
                    Class.forName(factoryClass).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}

