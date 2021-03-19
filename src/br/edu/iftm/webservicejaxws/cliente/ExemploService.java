
package br.edu.iftm.webservicejaxws.cliente;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ExemploService", targetNamespace = "http://webservicejaxws.iftm.edu.br/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ExemploService {


    /**
     * 
     * @param arg0
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "calcula", targetNamespace = "http://webservicejaxws.iftm.edu.br/", className = "br.edu.iftm.webservicejaxws.cliente.Calcula")
    @ResponseWrapper(localName = "calculaResponse", targetNamespace = "http://webservicejaxws.iftm.edu.br/", className = "br.edu.iftm.webservicejaxws.cliente.CalculaResponse")
    @Action(input = "http://webservicejaxws.iftm.edu.br/ExemploService/calculaRequest", output = "http://webservicejaxws.iftm.edu.br/ExemploService/calculaResponse")
    public int calcula(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

}
