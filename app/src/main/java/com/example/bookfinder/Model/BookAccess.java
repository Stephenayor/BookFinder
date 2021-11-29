package com.example.bookfinder.Model;

import android.os.Parcelable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class BookAccess implements Parcelable
{
    public List<BookItem> getBookItem() {
        return bookItem;
    }

    public void setBookItem(List<BookItem> bookItem) {
        this.bookItem = bookItem;
    }
    @SerializedName("bookItem")
    @Expose
    private List<BookItem> bookItem = new ArrayList<BookItem>();
    @SerializedName("country")
    @Expose
    private String country;
    @SerializedName("viewability")
    @Expose
    private String viewability;
    @SerializedName("embeddable")
    @Expose
    private Boolean embeddable;
    @SerializedName("publicDomain")
    @Expose
    private Boolean publicDomain;
    @SerializedName("textToSpeechPermission")
    @Expose
    private String textToSpeechPermission;
    @SerializedName("epub")
    @Expose
    private BookPub epub;
    @SerializedName("pdf")
    @Expose
    private BookPdf pdf;
    @SerializedName("webReaderLink")
    @Expose
    private String webReaderLink;
    @SerializedName("accessViewStatus")
    @Expose
    private String accessViewStatus;
    @SerializedName("quoteSharingAllowed")
    @Expose
    private Boolean quoteSharingAllowed;
    public final static Creator<BookAccess> CREATOR = new Creator<BookAccess>() {


        @SuppressWarnings({
                "unchecked"
        })
        public BookAccess createFromParcel(android.os.Parcel in) {
            return new BookAccess(in);
        }

        public BookAccess[] newArray(int size) {
            return (new BookAccess[size]);
        }

    }
            ;

    protected BookAccess(android.os.Parcel in) {
        this.country = ((String) in.readValue((String.class.getClassLoader())));
        this.viewability = ((String) in.readValue((String.class.getClassLoader())));
        this.embeddable = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.publicDomain = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.textToSpeechPermission = ((String) in.readValue((String.class.getClassLoader())));
        this.epub = ((BookPub) in.readValue((BookPub.class.getClassLoader())));
        this.pdf = ((BookPdf) in.readValue((BookPdf.class.getClassLoader())));
        this.webReaderLink = ((String) in.readValue((String.class.getClassLoader())));
        this.accessViewStatus = ((String) in.readValue((String.class.getClassLoader())));
        this.quoteSharingAllowed = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     *
     */
    public BookAccess() {
    }

    /**
     *
     * @param accessViewStatus
     * @param country
     * @param viewability
     * @param pdf
     * @param webReaderLink
     * @param epub
     * @param publicDomain
     * @param quoteSharingAllowed
     * @param embeddable
     * @param textToSpeechPermission
     */
    public BookAccess(String country, String viewability, Boolean embeddable, Boolean publicDomain, String textToSpeechPermission,
                      BookPub epub, BookPdf pdf, String webReaderLink, String accessViewStatus, Boolean quoteSharingAllowed) {
        super();
        this.country = country;
        this.viewability = viewability;
        this.embeddable = embeddable;
        this.publicDomain = publicDomain;
        this.textToSpeechPermission = textToSpeechPermission;
        this.epub = epub;
        this.pdf = pdf;
        this.webReaderLink = webReaderLink;
        this.accessViewStatus = accessViewStatus;
        this.quoteSharingAllowed = quoteSharingAllowed;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getViewability() {
        return viewability;
    }

    public void setViewability(String viewability) {
        this.viewability = viewability;
    }

    public Boolean getEmbeddable() {
        return embeddable;
    }

    public void setEmbeddable(Boolean embeddable) {
        this.embeddable = embeddable;
    }

    public Boolean getPublicDomain() {
        return publicDomain;
    }

    public void setPublicDomain(Boolean publicDomain) {
        this.publicDomain = publicDomain;
    }

    public String getTextToSpeechPermission() {
        return textToSpeechPermission;
    }

    public void setTextToSpeechPermission(String textToSpeechPermission) {
        this.textToSpeechPermission = textToSpeechPermission;
    }

    public BookPub getEpub() {
        return epub;
    }

    public void setEpub(BookPub epub) {
        this.epub = epub;
    }

    public BookPdf getPdf() {
        return pdf;
    }

    public void setPdf(BookPdf pdf) {
        this.pdf = pdf;
    }

    public String getWebReaderLink() {
        return webReaderLink;
    }

    public void setWebReaderLink(String webReaderLink) {
        this.webReaderLink = webReaderLink;
    }

    public String getAccessViewStatus() {
        return accessViewStatus;
    }

    public void setAccessViewStatus(String accessViewStatus) {
        this.accessViewStatus = accessViewStatus;
    }

    public Boolean getQuoteSharingAllowed() {
        return quoteSharingAllowed;
    }

    public void setQuoteSharingAllowed(Boolean quoteSharingAllowed) {
        this.quoteSharingAllowed = quoteSharingAllowed;
    }

    public void writeToParcel(android.os.Parcel dest, int flags) {
        dest.writeValue(country);
        dest.writeValue(viewability);
        dest.writeValue(embeddable);
        dest.writeValue(publicDomain);
        dest.writeValue(textToSpeechPermission);
        dest.writeValue(epub);
        dest.writeValue(pdf);
        dest.writeValue(webReaderLink);
        dest.writeValue(accessViewStatus);
        dest.writeValue(quoteSharingAllowed);
    }

    public int describeContents() {
        return  0;
    }

}

