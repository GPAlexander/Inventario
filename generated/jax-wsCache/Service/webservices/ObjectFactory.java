
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

    private final static QName _SelectAlProveedoresResponse_QNAME = new QName("http://WebServices/", "SelectAlProveedoresResponse");
    private final static QName _InsertProveedor_QNAME = new QName("http://WebServices/", "InsertProveedor");
    private final static QName _UpdateProveedorResponse_QNAME = new QName("http://WebServices/", "UpdateProveedorResponse");
    private final static QName _UpdateProveedor_QNAME = new QName("http://WebServices/", "UpdateProveedor");
    private final static QName _DeleteProveedor_QNAME = new QName("http://WebServices/", "deleteProveedor");
    private final static QName _InsertProveedorResponse_QNAME = new QName("http://WebServices/", "InsertProveedorResponse");
    private final static QName _DeleteProveedorResponse_QNAME = new QName("http://WebServices/", "deleteProveedorResponse");
    private final static QName _SelectAlProveedores_QNAME = new QName("http://WebServices/", "SelectAlProveedores");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: webservices
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link InsertProveedor }
     * 
     */
    public InsertProveedor createInsertProveedor() {
        return new InsertProveedor();
    }

    /**
     * Create an instance of {@link UpdateProveedorResponse }
     * 
     */
    public UpdateProveedorResponse createUpdateProveedorResponse() {
        return new UpdateProveedorResponse();
    }

    /**
     * Create an instance of {@link SelectAlProveedoresResponse }
     * 
     */
    public SelectAlProveedoresResponse createSelectAlProveedoresResponse() {
        return new SelectAlProveedoresResponse();
    }

    /**
     * Create an instance of {@link UpdateProveedor }
     * 
     */
    public UpdateProveedor createUpdateProveedor() {
        return new UpdateProveedor();
    }

    /**
     * Create an instance of {@link DeleteProveedor }
     * 
     */
    public DeleteProveedor createDeleteProveedor() {
        return new DeleteProveedor();
    }

    /**
     * Create an instance of {@link DeleteProveedorResponse }
     * 
     */
    public DeleteProveedorResponse createDeleteProveedorResponse() {
        return new DeleteProveedorResponse();
    }

    /**
     * Create an instance of {@link InsertProveedorResponse }
     * 
     */
    public InsertProveedorResponse createInsertProveedorResponse() {
        return new InsertProveedorResponse();
    }

    /**
     * Create an instance of {@link SelectAlProveedores }
     * 
     */
    public SelectAlProveedores createSelectAlProveedores() {
        return new SelectAlProveedores();
    }

    /**
     * Create an instance of {@link Proveedores }
     * 
     */
    public Proveedores createProveedores() {
        return new Proveedores();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelectAlProveedoresResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "SelectAlProveedoresResponse")
    public JAXBElement<SelectAlProveedoresResponse> createSelectAlProveedoresResponse(SelectAlProveedoresResponse value) {
        return new JAXBElement<SelectAlProveedoresResponse>(_SelectAlProveedoresResponse_QNAME, SelectAlProveedoresResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertProveedor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "InsertProveedor")
    public JAXBElement<InsertProveedor> createInsertProveedor(InsertProveedor value) {
        return new JAXBElement<InsertProveedor>(_InsertProveedor_QNAME, InsertProveedor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateProveedorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "UpdateProveedorResponse")
    public JAXBElement<UpdateProveedorResponse> createUpdateProveedorResponse(UpdateProveedorResponse value) {
        return new JAXBElement<UpdateProveedorResponse>(_UpdateProveedorResponse_QNAME, UpdateProveedorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateProveedor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "UpdateProveedor")
    public JAXBElement<UpdateProveedor> createUpdateProveedor(UpdateProveedor value) {
        return new JAXBElement<UpdateProveedor>(_UpdateProveedor_QNAME, UpdateProveedor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteProveedor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "deleteProveedor")
    public JAXBElement<DeleteProveedor> createDeleteProveedor(DeleteProveedor value) {
        return new JAXBElement<DeleteProveedor>(_DeleteProveedor_QNAME, DeleteProveedor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertProveedorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "InsertProveedorResponse")
    public JAXBElement<InsertProveedorResponse> createInsertProveedorResponse(InsertProveedorResponse value) {
        return new JAXBElement<InsertProveedorResponse>(_InsertProveedorResponse_QNAME, InsertProveedorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteProveedorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "deleteProveedorResponse")
    public JAXBElement<DeleteProveedorResponse> createDeleteProveedorResponse(DeleteProveedorResponse value) {
        return new JAXBElement<DeleteProveedorResponse>(_DeleteProveedorResponse_QNAME, DeleteProveedorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelectAlProveedores }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "SelectAlProveedores")
    public JAXBElement<SelectAlProveedores> createSelectAlProveedores(SelectAlProveedores value) {
        return new JAXBElement<SelectAlProveedores>(_SelectAlProveedores_QNAME, SelectAlProveedores.class, null, value);
    }

}
