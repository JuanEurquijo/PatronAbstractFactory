
package com.learnwebservices.services.tempconverter;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para fahrenheitToCelsiusRequest complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="fahrenheitToCelsiusRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TemperatureInFahrenheit" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fahrenheitToCelsiusRequest", propOrder = {
    "temperatureInFahrenheit"
})
public class FahrenheitToCelsiusRequest {

    @XmlElement(name = "TemperatureInFahrenheit")
    protected double temperatureInFahrenheit;

    /**
     * Obtiene el valor de la propiedad temperatureInFahrenheit.
     * 
     */
    public double getTemperatureInFahrenheit() {
        return temperatureInFahrenheit;
    }

    /**
     * Define el valor de la propiedad temperatureInFahrenheit.
     * 
     */
    public void setTemperatureInFahrenheit(double value) {
        this.temperatureInFahrenheit = value;
    }

}
