
package com.bullhorn.apiservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.bullhorn.apiservice package. 
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

    private final static QName _CreateEmail_QNAME = new QName("http://apiservice.bullhorn.com/", "createEmail");
    private final static QName _PurgeEmailResponse_QNAME = new QName("http://apiservice.bullhorn.com/", "purgeEmailResponse");
    private final static QName _SendEmailResponse_QNAME = new QName("http://apiservice.bullhorn.com/", "sendEmailResponse");
    private final static QName _DeleteEmail_QNAME = new QName("http://apiservice.bullhorn.com/", "deleteEmail");
    private final static QName _LoadEmailAttachmentResponse_QNAME = new QName("http://apiservice.bullhorn.com/", "loadEmailAttachmentResponse");
    private final static QName _SendEmail_QNAME = new QName("http://apiservice.bullhorn.com/", "sendEmail");
    private final static QName _CreateEmailResponse_QNAME = new QName("http://apiservice.bullhorn.com/", "createEmailResponse");
    private final static QName _EmailServiceException_QNAME = new QName("http://apiservice.bullhorn.com/", "EmailServiceException");
    private final static QName _SearchEmailResponse_QNAME = new QName("http://apiservice.bullhorn.com/", "searchEmailResponse");
    private final static QName _MoveEmail_QNAME = new QName("http://apiservice.bullhorn.com/", "moveEmail");
    private final static QName _DeleteEmailResponse_QNAME = new QName("http://apiservice.bullhorn.com/", "deleteEmailResponse");
    private final static QName _MoveEmailResponse_QNAME = new QName("http://apiservice.bullhorn.com/", "moveEmailResponse");
    private final static QName _SearchEmail_QNAME = new QName("http://apiservice.bullhorn.com/", "searchEmail");
    private final static QName _PurgeEmail_QNAME = new QName("http://apiservice.bullhorn.com/", "purgeEmail");
    private final static QName _LoadEmailAttachment_QNAME = new QName("http://apiservice.bullhorn.com/", "loadEmailAttachment");
    private final static QName _FindEmailResponse_QNAME = new QName("http://apiservice.bullhorn.com/", "findEmailResponse");
    private final static QName _FindEmail_QNAME = new QName("http://apiservice.bullhorn.com/", "findEmail");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.bullhorn.apiservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FindEmailRequest }
     * 
     */
    public FindEmailRequest createFindEmailRequest() {
        return new FindEmailRequest();
    }

    /**
     * Create an instance of {@link MoveEmail }
     * 
     */
    public MoveEmail createMoveEmail() {
        return new MoveEmail();
    }

    /**
     * Create an instance of {@link MoveEmailResponse }
     * 
     */
    public MoveEmailResponse createMoveEmailResponse() {
        return new MoveEmailResponse();
    }

    /**
     * Create an instance of {@link EmailAttachment }
     * 
     */
    public EmailAttachment createEmailAttachment() {
        return new EmailAttachment();
    }

    /**
     * Create an instance of {@link NameValuePair }
     * 
     */
    public NameValuePair createNameValuePair() {
        return new NameValuePair();
    }

    /**
     * Create an instance of {@link UserContext }
     * 
     */
    public UserContext createUserContext() {
        return new UserContext();
    }

    /**
     * Create an instance of {@link FindEmailResponse }
     * 
     */
    public FindEmailResponse createFindEmailResponse() {
        return new FindEmailResponse();
    }

    /**
     * Create an instance of {@link EmailServiceException }
     * 
     */
    public EmailServiceException createEmailServiceException() {
        return new EmailServiceException();
    }

    /**
     * Create an instance of {@link DeleteEmail }
     * 
     */
    public DeleteEmail createDeleteEmail() {
        return new DeleteEmail();
    }

    /**
     * Create an instance of {@link EmailSearchRequest }
     * 
     */
    public EmailSearchRequest createEmailSearchRequest() {
        return new EmailSearchRequest();
    }

    /**
     * Create an instance of {@link Attachment }
     * 
     */
    public Attachment createAttachment() {
        return new Attachment();
    }

    /**
     * Create an instance of {@link PurgeEmailRequest }
     * 
     */
    public PurgeEmailRequest createPurgeEmailRequest() {
        return new PurgeEmailRequest();
    }

    /**
     * Create an instance of {@link CreateEmail }
     * 
     */
    public CreateEmail createCreateEmail() {
        return new CreateEmail();
    }

    /**
     * Create an instance of {@link FindEmail }
     * 
     */
    public FindEmail createFindEmail() {
        return new FindEmail();
    }

    /**
     * Create an instance of {@link SearchEmailResponse }
     * 
     */
    public SearchEmailResponse createSearchEmailResponse() {
        return new SearchEmailResponse();
    }

    /**
     * Create an instance of {@link PurgeEmail }
     * 
     */
    public PurgeEmail createPurgeEmail() {
        return new PurgeEmail();
    }

    /**
     * Create an instance of {@link DateRange }
     * 
     */
    public DateRange createDateRange() {
        return new DateRange();
    }

    /**
     * Create an instance of {@link DeleteEmailResponse }
     * 
     */
    public DeleteEmailResponse createDeleteEmailResponse() {
        return new DeleteEmailResponse();
    }

    /**
     * Create an instance of {@link CreateEmailResponse }
     * 
     */
    public CreateEmailResponse createCreateEmailResponse() {
        return new CreateEmailResponse();
    }

    /**
     * Create an instance of {@link EmailUser }
     * 
     */
    public EmailUser createEmailUser() {
        return new EmailUser();
    }

    /**
     * Create an instance of {@link SendEmail }
     * 
     */
    public SendEmail createSendEmail() {
        return new SendEmail();
    }

    /**
     * Create an instance of {@link LoadEmailAttachment }
     * 
     */
    public LoadEmailAttachment createLoadEmailAttachment() {
        return new LoadEmailAttachment();
    }

    /**
     * Create an instance of {@link LoadEmailAttachmetRequest }
     * 
     */
    public LoadEmailAttachmetRequest createLoadEmailAttachmetRequest() {
        return new LoadEmailAttachmetRequest();
    }

    /**
     * Create an instance of {@link Email }
     * 
     */
    public Email createEmail() {
        return new Email();
    }

    /**
     * Create an instance of {@link CreateEmailRequest }
     * 
     */
    public CreateEmailRequest createCreateEmailRequest() {
        return new CreateEmailRequest();
    }

    /**
     * Create an instance of {@link MoveEmailRequest }
     * 
     */
    public MoveEmailRequest createMoveEmailRequest() {
        return new MoveEmailRequest();
    }

    /**
     * Create an instance of {@link SearchEmail }
     * 
     */
    public SearchEmail createSearchEmail() {
        return new SearchEmail();
    }

    /**
     * Create an instance of {@link LoadEmailAttachmentResponse }
     * 
     */
    public LoadEmailAttachmentResponse createLoadEmailAttachmentResponse() {
        return new LoadEmailAttachmentResponse();
    }

    /**
     * Create an instance of {@link PurgeEmailResponse }
     * 
     */
    public PurgeEmailResponse createPurgeEmailResponse() {
        return new PurgeEmailResponse();
    }

    /**
     * Create an instance of {@link SendEmailResponse }
     * 
     */
    public SendEmailResponse createSendEmailResponse() {
        return new SendEmailResponse();
    }

    /**
     * Create an instance of {@link EmailModificationRequest }
     * 
     */
    public EmailModificationRequest createEmailModificationRequest() {
        return new EmailModificationRequest();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateEmail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://apiservice.bullhorn.com/", name = "createEmail")
    public JAXBElement<CreateEmail> createCreateEmail(CreateEmail value) {
        return new JAXBElement<CreateEmail>(_CreateEmail_QNAME, CreateEmail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PurgeEmailResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://apiservice.bullhorn.com/", name = "purgeEmailResponse")
    public JAXBElement<PurgeEmailResponse> createPurgeEmailResponse(PurgeEmailResponse value) {
        return new JAXBElement<PurgeEmailResponse>(_PurgeEmailResponse_QNAME, PurgeEmailResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendEmailResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://apiservice.bullhorn.com/", name = "sendEmailResponse")
    public JAXBElement<SendEmailResponse> createSendEmailResponse(SendEmailResponse value) {
        return new JAXBElement<SendEmailResponse>(_SendEmailResponse_QNAME, SendEmailResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteEmail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://apiservice.bullhorn.com/", name = "deleteEmail")
    public JAXBElement<DeleteEmail> createDeleteEmail(DeleteEmail value) {
        return new JAXBElement<DeleteEmail>(_DeleteEmail_QNAME, DeleteEmail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoadEmailAttachmentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://apiservice.bullhorn.com/", name = "loadEmailAttachmentResponse")
    public JAXBElement<LoadEmailAttachmentResponse> createLoadEmailAttachmentResponse(LoadEmailAttachmentResponse value) {
        return new JAXBElement<LoadEmailAttachmentResponse>(_LoadEmailAttachmentResponse_QNAME, LoadEmailAttachmentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendEmail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://apiservice.bullhorn.com/", name = "sendEmail")
    public JAXBElement<SendEmail> createSendEmail(SendEmail value) {
        return new JAXBElement<SendEmail>(_SendEmail_QNAME, SendEmail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateEmailResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://apiservice.bullhorn.com/", name = "createEmailResponse")
    public JAXBElement<CreateEmailResponse> createCreateEmailResponse(CreateEmailResponse value) {
        return new JAXBElement<CreateEmailResponse>(_CreateEmailResponse_QNAME, CreateEmailResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmailServiceException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://apiservice.bullhorn.com/", name = "EmailServiceException")
    public JAXBElement<EmailServiceException> createEmailServiceException(EmailServiceException value) {
        return new JAXBElement<EmailServiceException>(_EmailServiceException_QNAME, EmailServiceException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchEmailResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://apiservice.bullhorn.com/", name = "searchEmailResponse")
    public JAXBElement<SearchEmailResponse> createSearchEmailResponse(SearchEmailResponse value) {
        return new JAXBElement<SearchEmailResponse>(_SearchEmailResponse_QNAME, SearchEmailResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MoveEmail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://apiservice.bullhorn.com/", name = "moveEmail")
    public JAXBElement<MoveEmail> createMoveEmail(MoveEmail value) {
        return new JAXBElement<MoveEmail>(_MoveEmail_QNAME, MoveEmail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteEmailResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://apiservice.bullhorn.com/", name = "deleteEmailResponse")
    public JAXBElement<DeleteEmailResponse> createDeleteEmailResponse(DeleteEmailResponse value) {
        return new JAXBElement<DeleteEmailResponse>(_DeleteEmailResponse_QNAME, DeleteEmailResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MoveEmailResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://apiservice.bullhorn.com/", name = "moveEmailResponse")
    public JAXBElement<MoveEmailResponse> createMoveEmailResponse(MoveEmailResponse value) {
        return new JAXBElement<MoveEmailResponse>(_MoveEmailResponse_QNAME, MoveEmailResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchEmail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://apiservice.bullhorn.com/", name = "searchEmail")
    public JAXBElement<SearchEmail> createSearchEmail(SearchEmail value) {
        return new JAXBElement<SearchEmail>(_SearchEmail_QNAME, SearchEmail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PurgeEmail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://apiservice.bullhorn.com/", name = "purgeEmail")
    public JAXBElement<PurgeEmail> createPurgeEmail(PurgeEmail value) {
        return new JAXBElement<PurgeEmail>(_PurgeEmail_QNAME, PurgeEmail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoadEmailAttachment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://apiservice.bullhorn.com/", name = "loadEmailAttachment")
    public JAXBElement<LoadEmailAttachment> createLoadEmailAttachment(LoadEmailAttachment value) {
        return new JAXBElement<LoadEmailAttachment>(_LoadEmailAttachment_QNAME, LoadEmailAttachment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindEmailResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://apiservice.bullhorn.com/", name = "findEmailResponse")
    public JAXBElement<FindEmailResponse> createFindEmailResponse(FindEmailResponse value) {
        return new JAXBElement<FindEmailResponse>(_FindEmailResponse_QNAME, FindEmailResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindEmail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://apiservice.bullhorn.com/", name = "findEmail")
    public JAXBElement<FindEmail> createFindEmail(FindEmail value) {
        return new JAXBElement<FindEmail>(_FindEmail_QNAME, FindEmail.class, null, value);
    }

}
