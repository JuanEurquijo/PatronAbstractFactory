
package com.learnwebservices.services.tempconverter;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para celsiusToFahrenheitRequest complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="celsiusToFahrenheitRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TemperatureInCelsius" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "celsiusToFahrenheitRequest", propOrder = {
    "temperatureInCelsius"
})
public class CelsiusToFahrenheitRequest {

    @XmlElement(name = "TemperatureInCelsius")
    protected double temperatureInCelsius;

    /**
     * Obtiene el valor de la propiedad temperatureInCelsius.
     * 
     */
    public double getTemperatureInCelsius() {
        return temperatureInCelsius;
    }

    /**
     * Define el valor de la propiedad temperatureInCelsius.
     * 
     */
    public void setTemperatureInCelsius(double value) {
        this.temperatureInCelsius = value;
    }

}
