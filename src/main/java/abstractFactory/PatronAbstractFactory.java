package abstractFactory;

import abstractFactory.bases.IServiciosBasesGenericos;
import abstractFactory.bases.ServiciosGenericosAbstractFactory;
import abstractFactory.servicios.IServiciosArticulos;
import abstractFactory.servicios.IServiciosEmpleados;
import abstractFactory.servicios.IServiciosRest;
import abstractFactory.servicios.IServiciosSoap;
import com.learnwebservices.services.hello.HelloEndpoint;
import com.learnwebservices.services.hello.HelloEndpointService;
import com.learnwebservices.services.hello.HelloRequest;
import com.learnwebservices.services.hello.HelloResponse;
import com.sun.istack.Nullable;

import java.io.IOException;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PatronAbstractFactory {

    public static void main(String[] args) throws Exception {

        IServiciosBasesGenericos factory =
                ServiciosGenericosAbstractFactory.createServiceFactory();
        assert factory != null;
        IServiciosEmpleados employeeService = factory.getEmpleados();
        IServiciosArticulos productService = factory.getArticulos();
        IServiciosSoap serviciosSoap = factory.getSoap();
        IServiciosRest serviciosRest = factory.getRest();


        System.out.println("Servicio Empleados class > "
                + employeeService.getClass().getCanonicalName());
        System.out.println("Servicio Articulos class  > "
                + productService.getClass().getCanonicalName());

       System.out.println("getEmployee > "
                + Arrays.toString(employeeService.getEmpleados())+ "\n");
        System.out.println("getProduct  > "
                + Arrays.toString(productService.getArticulos()) + "\n");
        if(serviciosRest != null) {
            System.out.println("Servicio Rest class  > "
                    + serviciosRest.getClass().getCanonicalName());
            System.out.println("getRest  > "
                    + serviciosRest.getJson() + "\n");
        }
        if(serviciosSoap != null) {
            double num = 0;
            int numCorr = 0;
            System.out.println("Servicio Soap class  > "
                    + serviciosSoap.getClass().getCanonicalName());
            Scanner sc = new Scanner(System.in);
            System.out.println("Escribe una temperatura en Celsius para convertir a Fahrenheit: ");
            while (numCorr < 1){
                try{
                    num = sc.nextDouble();
                    System.out.println("getSoap  > "
                            + serviciosSoap.getSoap(num) + " Grados Fahrenheit " + "\n");
                    numCorr++;
                }catch (InputMismatchException e){
                    System.out.println("Escribe el número correctamente - 'decimal con comas'");
                    sc.nextLine();
                }
            }
        }

    }
}