
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

    private final static QName _UpdateProducto_QNAME = new QName("http://WebServices/", "UpdateProducto");
    private final static QName _UpdateProductoResponse_QNAME = new QName("http://WebServices/", "UpdateProductoResponse");
    private final static QName _DeleteProductoResponse_QNAME = new QName("http://WebServices/", "DeleteProductoResponse");
    private final static QName _SaveProductoResponse_QNAME = new QName("http://WebServices/", "SaveProductoResponse");
    private final static QName _SelectAllProductosResponse_QNAME = new QName("http://WebServices/", "SelectAllProductosResponse");
    private final static QName _SaveProducto_QNAME = new QName("http://WebServices/", "SaveProducto");
    private final static QName _DeleteProducto_QNAME = new QName("http://WebServices/", "DeleteProducto");
    private final static QName _SelectAllProductos_QNAME = new QName("http://WebServices/", "SelectAllProductos");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: webservices
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UpdateProductoResponse }
     * 
     */
    public UpdateProductoResponse createUpdateProductoResponse() {
        return new UpdateProductoResponse();
    }

    /**
     * Create an instance of {@link UpdateProducto }
     * 
     */
    public UpdateProducto createUpdateProducto() {
        return new UpdateProducto();
    }

    /**
     * Create an instance of {@link DeleteProductoResponse }
     * 
     */
    public DeleteProductoResponse createDeleteProductoResponse() {
        return new DeleteProductoResponse();
    }

    /**
     * Create an instance of {@link SaveProductoResponse }
     * 
     */
    public SaveProductoResponse createSaveProductoResponse() {
        return new SaveProductoResponse();
    }

    /**
     * Create an instance of {@link SelectAllProductosResponse }
     * 
     */
    public SelectAllProductosResponse createSelectAllProductosResponse() {
        return new SelectAllProductosResponse();
    }

    /**
     * Create an instance of {@link SaveProducto }
     * 
     */
    public SaveProducto createSaveProducto() {
        return new SaveProducto();
    }

    /**
     * Create an instance of {@link DeleteProducto }
     * 
     */
    public DeleteProducto createDeleteProducto() {
        return new DeleteProducto();
    }

    /**
     * Create an instance of {@link SelectAllProductos }
     * 
     */
    public SelectAllProductos createSelectAllProductos() {
        return new SelectAllProductos();
    }

    /**
     * Create an instance of {@link Productos }
     * 
     */
    public Productos createProductos() {
        return new Productos();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateProducto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "UpdateProducto")
    public JAXBElement<UpdateProducto> createUpdateProducto(UpdateProducto value) {
        return new JAXBElement<UpdateProducto>(_UpdateProducto_QNAME, UpdateProducto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateProductoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "UpdateProductoResponse")
    public JAXBElement<UpdateProductoResponse> createUpdateProductoResponse(UpdateProductoResponse value) {
        return new JAXBElement<UpdateProductoResponse>(_UpdateProductoResponse_QNAME, UpdateProductoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteProductoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "DeleteProductoResponse")
    public JAXBElement<DeleteProductoResponse> createDeleteProductoResponse(DeleteProductoResponse value) {
        return new JAXBElement<DeleteProductoResponse>(_DeleteProductoResponse_QNAME, DeleteProductoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveProductoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "SaveProductoResponse")
    public JAXBElement<SaveProductoResponse> createSaveProductoResponse(SaveProductoResponse value) {
        return new JAXBElement<SaveProductoResponse>(_SaveProductoResponse_QNAME, SaveProductoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelectAllProductosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "SelectAllProductosResponse")
    public JAXBElement<SelectAllProductosResponse> createSelectAllProductosResponse(SelectAllProductosResponse value) {
        return new JAXBElement<SelectAllProductosResponse>(_SelectAllProductosResponse_QNAME, SelectAllProductosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveProducto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "SaveProducto")
    public JAXBElement<SaveProducto> createSaveProducto(SaveProducto value) {
        return new JAXBElement<SaveProducto>(_SaveProducto_QNAME, SaveProducto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteProducto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "DeleteProducto")
    public JAXBElement<DeleteProducto> createDeleteProducto(DeleteProducto value) {
        return new JAXBElement<DeleteProducto>(_DeleteProducto_QNAME, DeleteProducto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelectAllProductos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "SelectAllProductos")
    public JAXBElement<SelectAllProductos> createSelectAllProductos(SelectAllProductos value) {
        return new JAXBElement<SelectAllProductos>(_SelectAllProductos_QNAME, SelectAllProductos.class, null, value);
    }

}
