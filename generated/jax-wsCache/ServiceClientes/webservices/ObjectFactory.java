
package webservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the webservices package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _UpdateCliente_QNAME = new QName("http://WebServices/", "UpdateCliente");
    private final static QName _SelectAllClientesResponse_QNAME = new QName("http://WebServices/", "SelectAllClientesResponse");
    private final static QName _UpdateClienteResponse_QNAME = new QName("http://WebServices/", "UpdateClienteResponse");
    private final static QName _DeleteCliente_QNAME = new QName("http://WebServices/", "DeleteCliente");
    private final static QName _SelectAllClientes_QNAME = new QName("http://WebServices/", "SelectAllClientes");
    private final static QName _InsertCliente_QNAME = new QName("http://WebServices/", "InsertCliente");
    private final static QName _DeleteClienteResponse_QNAME = new QName("http://WebServices/", "DeleteClienteResponse");
    private final static QName _InsertClienteResponse_QNAME = new QName("http://WebServices/", "InsertClienteResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: webservices
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SelectAllClientesResponse }
     * 
     */
    public SelectAllClientesResponse createSelectAllClientesResponse() {
        return new SelectAllClientesResponse();
    }

    /**
     * Create an instance of {@link UpdateCliente }
     * 
     */
    public UpdateCliente createUpdateCliente() {
        return new UpdateCliente();
    }

    /**
     * Create an instance of {@link UpdateClienteResponse }
     * 
     */
    public UpdateClienteResponse createUpdateClienteResponse() {
        return new UpdateClienteResponse();
    }

    /**
     * Create an instance of {@link SelectAllClientes }
     * 
     */
    public SelectAllClientes createSelectAllClientes() {
        return new SelectAllClientes();
    }

    /**
     * Create an instance of {@link DeleteCliente }
     * 
     */
    public DeleteCliente createDeleteCliente() {
        return new DeleteCliente();
    }

    /**
     * Create an instance of {@link InsertCliente }
     * 
     */
    public InsertCliente createInsertCliente() {
        return new InsertCliente();
    }

    /**
     * Create an instance of {@link DeleteClienteResponse }
     * 
     */
    public DeleteClienteResponse createDeleteClienteResponse() {
        return new DeleteClienteResponse();
    }

    /**
     * Create an instance of {@link InsertClienteResponse }
     * 
     */
    public InsertClienteResponse createInsertClienteResponse() {
        return new InsertClienteResponse();
    }

    /**
     * Create an instance of {@link Clientes }
     * 
     */
    public Clientes createClientes() {
        return new Clientes();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateCliente }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "UpdateCliente")
    public JAXBElement<UpdateCliente> createUpdateCliente(UpdateCliente value) {
        return new JAXBElement<UpdateCliente>(_UpdateCliente_QNAME, UpdateCliente.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelectAllClientesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "SelectAllClientesResponse")
    public JAXBElement<SelectAllClientesResponse> createSelectAllClientesResponse(SelectAllClientesResponse value) {
        return new JAXBElement<SelectAllClientesResponse>(_SelectAllClientesResponse_QNAME, SelectAllClientesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateClienteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "UpdateClienteResponse")
    public JAXBElement<UpdateClienteResponse> createUpdateClienteResponse(UpdateClienteResponse value) {
        return new JAXBElement<UpdateClienteResponse>(_UpdateClienteResponse_QNAME, UpdateClienteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteCliente }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "DeleteCliente")
    public JAXBElement<DeleteCliente> createDeleteCliente(DeleteCliente value) {
        return new JAXBElement<DeleteCliente>(_DeleteCliente_QNAME, DeleteCliente.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelectAllClientes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "SelectAllClientes")
    public JAXBElement<SelectAllClientes> createSelectAllClientes(SelectAllClientes value) {
        return new JAXBElement<SelectAllClientes>(_SelectAllClientes_QNAME, SelectAllClientes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertCliente }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "InsertCliente")
    public JAXBElement<InsertCliente> createInsertCliente(InsertCliente value) {
        return new JAXBElement<InsertCliente>(_InsertCliente_QNAME, InsertCliente.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteClienteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "DeleteClienteResponse")
    public JAXBElement<DeleteClienteResponse> createDeleteClienteResponse(DeleteClienteResponse value) {
        return new JAXBElement<DeleteClienteResponse>(_DeleteClienteResponse_QNAME, DeleteClienteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertClienteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "InsertClienteResponse")
    public JAXBElement<InsertClienteResponse> createInsertClienteResponse(InsertClienteResponse value) {
        return new JAXBElement<InsertClienteResponse>(_InsertClienteResponse_QNAME, InsertClienteResponse.class, null, value);
    }

}
