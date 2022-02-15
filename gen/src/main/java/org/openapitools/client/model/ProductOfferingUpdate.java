/*
 * Product Catalog Management
 * ## TMF API Reference: TMF620 - Product Catalog Management  ### Release : 20.5 - March 2021  Product Catalog API is one of Catalog Management API Family. Product Catalog API goal is to provide a catalog of products.   ### Operations Product Catalog API performs the following operations on the resources : - Retrieve an entity or a collection of entities depending on filter criteria - Partial update of an entity (including updating rules) - Create an entity (including default values and creation rules) - Delete an entity - Manage notification of events
 *
 * The version of the OpenAPI document: 4.1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.AgreementRef;
import org.openapitools.client.model.AttachmentRefOrValue;
import org.openapitools.client.model.BundledProductOffering;
import org.openapitools.client.model.CategoryRef;
import org.openapitools.client.model.ChannelRef;
import org.openapitools.client.model.MarketSegmentRef;
import org.openapitools.client.model.PlaceRef;
import org.openapitools.client.model.ProductOfferingPriceRefOrValue;
import org.openapitools.client.model.ProductOfferingRelationship;
import org.openapitools.client.model.ProductOfferingTerm;
import org.openapitools.client.model.ProductSpecificationCharacteristicValueUse;
import org.openapitools.client.model.ProductSpecificationRef;
import org.openapitools.client.model.ResourceCandidateRef;
import org.openapitools.client.model.SLARef;
import org.openapitools.client.model.ServiceCandidateRef;
import org.openapitools.client.model.TimePeriod;

/**
 * Represents entities that are orderable from the provider of the catalog, this resource includes pricing information. Skipped properties: id,href,lastUpdate,@type,@baseType
 */
@ApiModel(description = "Represents entities that are orderable from the provider of the catalog, this resource includes pricing information. Skipped properties: id,href,lastUpdate,@type,@baseType")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-02-04T02:31:04.425344+07:00[Asia/Ho_Chi_Minh]")
public class ProductOfferingUpdate {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_IS_BUNDLE = "isBundle";
  @SerializedName(SERIALIZED_NAME_IS_BUNDLE)
  private Boolean isBundle;

  public static final String SERIALIZED_NAME_IS_SELLABLE = "isSellable";
  @SerializedName(SERIALIZED_NAME_IS_SELLABLE)
  private Boolean isSellable;

  public static final String SERIALIZED_NAME_LIFECYCLE_STATUS = "lifecycleStatus";
  @SerializedName(SERIALIZED_NAME_LIFECYCLE_STATUS)
  private String lifecycleStatus;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_STATUS_REASON = "statusReason";
  @SerializedName(SERIALIZED_NAME_STATUS_REASON)
  private String statusReason;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;

  public static final String SERIALIZED_NAME_AGREEMENT = "agreement";
  @SerializedName(SERIALIZED_NAME_AGREEMENT)
  private List<AgreementRef> agreement = null;

  public static final String SERIALIZED_NAME_ATTACHMENT = "attachment";
  @SerializedName(SERIALIZED_NAME_ATTACHMENT)
  private List<AttachmentRefOrValue> attachment = null;

  public static final String SERIALIZED_NAME_BUNDLED_PRODUCT_OFFERING = "bundledProductOffering";
  @SerializedName(SERIALIZED_NAME_BUNDLED_PRODUCT_OFFERING)
  private List<BundledProductOffering> bundledProductOffering = null;

  public static final String SERIALIZED_NAME_CATEGORY = "category";
  @SerializedName(SERIALIZED_NAME_CATEGORY)
  private List<CategoryRef> category = null;

  public static final String SERIALIZED_NAME_CHANNEL = "channel";
  @SerializedName(SERIALIZED_NAME_CHANNEL)
  private List<ChannelRef> channel = null;

  public static final String SERIALIZED_NAME_MARKET_SEGMENT = "marketSegment";
  @SerializedName(SERIALIZED_NAME_MARKET_SEGMENT)
  private List<MarketSegmentRef> marketSegment = null;

  public static final String SERIALIZED_NAME_PLACE = "place";
  @SerializedName(SERIALIZED_NAME_PLACE)
  private List<PlaceRef> place = null;

  public static final String SERIALIZED_NAME_PROD_SPEC_CHAR_VALUE_USE = "prodSpecCharValueUse";
  @SerializedName(SERIALIZED_NAME_PROD_SPEC_CHAR_VALUE_USE)
  private List<ProductSpecificationCharacteristicValueUse> prodSpecCharValueUse = null;

  public static final String SERIALIZED_NAME_PRODUCT_OFFERING_PRICE = "productOfferingPrice";
  @SerializedName(SERIALIZED_NAME_PRODUCT_OFFERING_PRICE)
  private List<ProductOfferingPriceRefOrValue> productOfferingPrice = null;

  public static final String SERIALIZED_NAME_PRODUCT_OFFERING_RELATIONSHIP = "productOfferingRelationship";
  @SerializedName(SERIALIZED_NAME_PRODUCT_OFFERING_RELATIONSHIP)
  private List<ProductOfferingRelationship> productOfferingRelationship = null;

  public static final String SERIALIZED_NAME_PRODUCT_OFFERING_TERM = "productOfferingTerm";
  @SerializedName(SERIALIZED_NAME_PRODUCT_OFFERING_TERM)
  private List<ProductOfferingTerm> productOfferingTerm = null;

  public static final String SERIALIZED_NAME_PRODUCT_SPECIFICATION = "productSpecification";
  @SerializedName(SERIALIZED_NAME_PRODUCT_SPECIFICATION)
  private ProductSpecificationRef productSpecification;

  public static final String SERIALIZED_NAME_RESOURCE_CANDIDATE = "resourceCandidate";
  @SerializedName(SERIALIZED_NAME_RESOURCE_CANDIDATE)
  private ResourceCandidateRef resourceCandidate;

  public static final String SERIALIZED_NAME_SERVICE_CANDIDATE = "serviceCandidate";
  @SerializedName(SERIALIZED_NAME_SERVICE_CANDIDATE)
  private ServiceCandidateRef serviceCandidate;

  public static final String SERIALIZED_NAME_SERVICE_LEVEL_AGREEMENT = "serviceLevelAgreement";
  @SerializedName(SERIALIZED_NAME_SERVICE_LEVEL_AGREEMENT)
  private SLARef serviceLevelAgreement;

  public static final String SERIALIZED_NAME_VALID_FOR = "validFor";
  @SerializedName(SERIALIZED_NAME_VALID_FOR)
  private TimePeriod validFor;

  public static final String SERIALIZED_NAME_AT_SCHEMA_LOCATION = "@schemaLocation";
  @SerializedName(SERIALIZED_NAME_AT_SCHEMA_LOCATION)
  private URI atSchemaLocation;


  public ProductOfferingUpdate description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Description of the productOffering
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Description of the productOffering")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public ProductOfferingUpdate isBundle(Boolean isBundle) {
    
    this.isBundle = isBundle;
    return this;
  }

   /**
   * isBundle determines whether a productOffering represents a single productOffering (false), or a bundle of productOfferings (true).
   * @return isBundle
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "isBundle determines whether a productOffering represents a single productOffering (false), or a bundle of productOfferings (true).")

  public Boolean getIsBundle() {
    return isBundle;
  }


  public void setIsBundle(Boolean isBundle) {
    this.isBundle = isBundle;
  }


  public ProductOfferingUpdate isSellable(Boolean isSellable) {
    
    this.isSellable = isSellable;
    return this;
  }

   /**
   * A flag indicating if this product offer can be sold stand-alone for sale or not. If this flag is false it indicates that the offer can only be sold within a bundle.
   * @return isSellable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A flag indicating if this product offer can be sold stand-alone for sale or not. If this flag is false it indicates that the offer can only be sold within a bundle.")

  public Boolean getIsSellable() {
    return isSellable;
  }


  public void setIsSellable(Boolean isSellable) {
    this.isSellable = isSellable;
  }


  public ProductOfferingUpdate lifecycleStatus(String lifecycleStatus) {
    
    this.lifecycleStatus = lifecycleStatus;
    return this;
  }

   /**
   * Used to indicate the current lifecycle status
   * @return lifecycleStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Used to indicate the current lifecycle status")

  public String getLifecycleStatus() {
    return lifecycleStatus;
  }


  public void setLifecycleStatus(String lifecycleStatus) {
    this.lifecycleStatus = lifecycleStatus;
  }


  public ProductOfferingUpdate name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of the productOffering
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the productOffering")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ProductOfferingUpdate statusReason(String statusReason) {
    
    this.statusReason = statusReason;
    return this;
  }

   /**
   * A string providing a complementary information on the value of the lifecycle status attribute.
   * @return statusReason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A string providing a complementary information on the value of the lifecycle status attribute.")

  public String getStatusReason() {
    return statusReason;
  }


  public void setStatusReason(String statusReason) {
    this.statusReason = statusReason;
  }


  public ProductOfferingUpdate version(String version) {
    
    this.version = version;
    return this;
  }

   /**
   * ProductOffering version
   * @return version
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ProductOffering version")

  public String getVersion() {
    return version;
  }


  public void setVersion(String version) {
    this.version = version;
  }


  public ProductOfferingUpdate agreement(List<AgreementRef> agreement) {
    
    this.agreement = agreement;
    return this;
  }

  public ProductOfferingUpdate addAgreementItem(AgreementRef agreementItem) {
    if (this.agreement == null) {
      this.agreement = new ArrayList<AgreementRef>();
    }
    this.agreement.add(agreementItem);
    return this;
  }

   /**
   * An agreement represents a contract or arrangement, either written or verbal and sometimes enforceable by law, such as a service level agreement or a customer price agreement. An agreement involves a number of other business entities, such as products, services, and resources and/or their specifications.
   * @return agreement
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An agreement represents a contract or arrangement, either written or verbal and sometimes enforceable by law, such as a service level agreement or a customer price agreement. An agreement involves a number of other business entities, such as products, services, and resources and/or their specifications.")

  public List<AgreementRef> getAgreement() {
    return agreement;
  }


  public void setAgreement(List<AgreementRef> agreement) {
    this.agreement = agreement;
  }


  public ProductOfferingUpdate attachment(List<AttachmentRefOrValue> attachment) {
    
    this.attachment = attachment;
    return this;
  }

  public ProductOfferingUpdate addAttachmentItem(AttachmentRefOrValue attachmentItem) {
    if (this.attachment == null) {
      this.attachment = new ArrayList<AttachmentRefOrValue>();
    }
    this.attachment.add(attachmentItem);
    return this;
  }

   /**
   * Complements the description of an element (for instance a product) through video, pictures...
   * @return attachment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Complements the description of an element (for instance a product) through video, pictures...")

  public List<AttachmentRefOrValue> getAttachment() {
    return attachment;
  }


  public void setAttachment(List<AttachmentRefOrValue> attachment) {
    this.attachment = attachment;
  }


  public ProductOfferingUpdate bundledProductOffering(List<BundledProductOffering> bundledProductOffering) {
    
    this.bundledProductOffering = bundledProductOffering;
    return this;
  }

  public ProductOfferingUpdate addBundledProductOfferingItem(BundledProductOffering bundledProductOfferingItem) {
    if (this.bundledProductOffering == null) {
      this.bundledProductOffering = new ArrayList<BundledProductOffering>();
    }
    this.bundledProductOffering.add(bundledProductOfferingItem);
    return this;
  }

   /**
   * A type of ProductOffering that belongs to a grouping of ProductOfferings made available to the market. It inherits of all attributes of ProductOffering.
   * @return bundledProductOffering
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A type of ProductOffering that belongs to a grouping of ProductOfferings made available to the market. It inherits of all attributes of ProductOffering.")

  public List<BundledProductOffering> getBundledProductOffering() {
    return bundledProductOffering;
  }


  public void setBundledProductOffering(List<BundledProductOffering> bundledProductOffering) {
    this.bundledProductOffering = bundledProductOffering;
  }


  public ProductOfferingUpdate category(List<CategoryRef> category) {
    
    this.category = category;
    return this;
  }

  public ProductOfferingUpdate addCategoryItem(CategoryRef categoryItem) {
    if (this.category == null) {
      this.category = new ArrayList<CategoryRef>();
    }
    this.category.add(categoryItem);
    return this;
  }

   /**
   * The category resource is used to group product offerings, service and resource candidates in logical containers. Categories can contain other categories and/or product offerings, resource or service candidates.
   * @return category
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The category resource is used to group product offerings, service and resource candidates in logical containers. Categories can contain other categories and/or product offerings, resource or service candidates.")

  public List<CategoryRef> getCategory() {
    return category;
  }


  public void setCategory(List<CategoryRef> category) {
    this.category = category;
  }


  public ProductOfferingUpdate channel(List<ChannelRef> channel) {
    
    this.channel = channel;
    return this;
  }

  public ProductOfferingUpdate addChannelItem(ChannelRef channelItem) {
    if (this.channel == null) {
      this.channel = new ArrayList<ChannelRef>();
    }
    this.channel.add(channelItem);
    return this;
  }

   /**
   * The channel defines the channel for selling product offerings.
   * @return channel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The channel defines the channel for selling product offerings.")

  public List<ChannelRef> getChannel() {
    return channel;
  }


  public void setChannel(List<ChannelRef> channel) {
    this.channel = channel;
  }


  public ProductOfferingUpdate marketSegment(List<MarketSegmentRef> marketSegment) {
    
    this.marketSegment = marketSegment;
    return this;
  }

  public ProductOfferingUpdate addMarketSegmentItem(MarketSegmentRef marketSegmentItem) {
    if (this.marketSegment == null) {
      this.marketSegment = new ArrayList<MarketSegmentRef>();
    }
    this.marketSegment.add(marketSegmentItem);
    return this;
  }

   /**
   * provides references to the corresponding market segment as target of product offerings. A market segment is grouping of Parties, GeographicAreas, SalesChannels, and so forth.
   * @return marketSegment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "provides references to the corresponding market segment as target of product offerings. A market segment is grouping of Parties, GeographicAreas, SalesChannels, and so forth.")

  public List<MarketSegmentRef> getMarketSegment() {
    return marketSegment;
  }


  public void setMarketSegment(List<MarketSegmentRef> marketSegment) {
    this.marketSegment = marketSegment;
  }


  public ProductOfferingUpdate place(List<PlaceRef> place) {
    
    this.place = place;
    return this;
  }

  public ProductOfferingUpdate addPlaceItem(PlaceRef placeItem) {
    if (this.place == null) {
      this.place = new ArrayList<PlaceRef>();
    }
    this.place.add(placeItem);
    return this;
  }

   /**
   * Place defines the places where the products are sold or delivered.
   * @return place
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Place defines the places where the products are sold or delivered.")

  public List<PlaceRef> getPlace() {
    return place;
  }


  public void setPlace(List<PlaceRef> place) {
    this.place = place;
  }


  public ProductOfferingUpdate prodSpecCharValueUse(List<ProductSpecificationCharacteristicValueUse> prodSpecCharValueUse) {
    
    this.prodSpecCharValueUse = prodSpecCharValueUse;
    return this;
  }

  public ProductOfferingUpdate addProdSpecCharValueUseItem(ProductSpecificationCharacteristicValueUse prodSpecCharValueUseItem) {
    if (this.prodSpecCharValueUse == null) {
      this.prodSpecCharValueUse = new ArrayList<ProductSpecificationCharacteristicValueUse>();
    }
    this.prodSpecCharValueUse.add(prodSpecCharValueUseItem);
    return this;
  }

   /**
   * A use of the ProductSpecificationCharacteristicValue by a ProductOffering to which additional properties (attributes) apply or override the properties of similar properties contained in ProductSpecificationCharacteristicValue. It should be noted that characteristics which their value(s) addressed by this object must exist in corresponding product specification. The available characteristic values for a ProductSpecificationCharacteristic in a Product specification can be modified at the ProductOffering level. For example, a characteristic &#39;Color&#39; might have values White, Blue, Green, and Red. But, the list of values can be restricted to e.g. White and Blue in an associated product offering. It should be noted that the list of values in &#39;ProductSpecificationCharacteristicValueUse&#39; is a strict subset of the list of values as defined in the corresponding product specification characteristics.
   * @return prodSpecCharValueUse
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A use of the ProductSpecificationCharacteristicValue by a ProductOffering to which additional properties (attributes) apply or override the properties of similar properties contained in ProductSpecificationCharacteristicValue. It should be noted that characteristics which their value(s) addressed by this object must exist in corresponding product specification. The available characteristic values for a ProductSpecificationCharacteristic in a Product specification can be modified at the ProductOffering level. For example, a characteristic 'Color' might have values White, Blue, Green, and Red. But, the list of values can be restricted to e.g. White and Blue in an associated product offering. It should be noted that the list of values in 'ProductSpecificationCharacteristicValueUse' is a strict subset of the list of values as defined in the corresponding product specification characteristics.")

  public List<ProductSpecificationCharacteristicValueUse> getProdSpecCharValueUse() {
    return prodSpecCharValueUse;
  }


  public void setProdSpecCharValueUse(List<ProductSpecificationCharacteristicValueUse> prodSpecCharValueUse) {
    this.prodSpecCharValueUse = prodSpecCharValueUse;
  }


  public ProductOfferingUpdate productOfferingPrice(List<ProductOfferingPriceRefOrValue> productOfferingPrice) {
    
    this.productOfferingPrice = productOfferingPrice;
    return this;
  }

  public ProductOfferingUpdate addProductOfferingPriceItem(ProductOfferingPriceRefOrValue productOfferingPriceItem) {
    if (this.productOfferingPrice == null) {
      this.productOfferingPrice = new ArrayList<ProductOfferingPriceRefOrValue>();
    }
    this.productOfferingPrice.add(productOfferingPriceItem);
    return this;
  }

   /**
   * An amount, usually of money, that is asked for or allowed when a ProductOffering is bought, rented, or leased. The price is valid for a defined period of time and may not represent the actual price paid by a customer.
   * @return productOfferingPrice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An amount, usually of money, that is asked for or allowed when a ProductOffering is bought, rented, or leased. The price is valid for a defined period of time and may not represent the actual price paid by a customer.")

  public List<ProductOfferingPriceRefOrValue> getProductOfferingPrice() {
    return productOfferingPrice;
  }


  public void setProductOfferingPrice(List<ProductOfferingPriceRefOrValue> productOfferingPrice) {
    this.productOfferingPrice = productOfferingPrice;
  }


  public ProductOfferingUpdate productOfferingRelationship(List<ProductOfferingRelationship> productOfferingRelationship) {
    
    this.productOfferingRelationship = productOfferingRelationship;
    return this;
  }

  public ProductOfferingUpdate addProductOfferingRelationshipItem(ProductOfferingRelationship productOfferingRelationshipItem) {
    if (this.productOfferingRelationship == null) {
      this.productOfferingRelationship = new ArrayList<ProductOfferingRelationship>();
    }
    this.productOfferingRelationship.add(productOfferingRelationshipItem);
    return this;
  }

   /**
   * A relationship between this product offering and other product offerings.
   * @return productOfferingRelationship
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A relationship between this product offering and other product offerings.")

  public List<ProductOfferingRelationship> getProductOfferingRelationship() {
    return productOfferingRelationship;
  }


  public void setProductOfferingRelationship(List<ProductOfferingRelationship> productOfferingRelationship) {
    this.productOfferingRelationship = productOfferingRelationship;
  }


  public ProductOfferingUpdate productOfferingTerm(List<ProductOfferingTerm> productOfferingTerm) {
    
    this.productOfferingTerm = productOfferingTerm;
    return this;
  }

  public ProductOfferingUpdate addProductOfferingTermItem(ProductOfferingTerm productOfferingTermItem) {
    if (this.productOfferingTerm == null) {
      this.productOfferingTerm = new ArrayList<ProductOfferingTerm>();
    }
    this.productOfferingTerm.add(productOfferingTermItem);
    return this;
  }

   /**
   * A condition under which a ProductOffering is made available to Customers. For instance, a productOffering can be offered with multiple commitment periods.
   * @return productOfferingTerm
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A condition under which a ProductOffering is made available to Customers. For instance, a productOffering can be offered with multiple commitment periods.")

  public List<ProductOfferingTerm> getProductOfferingTerm() {
    return productOfferingTerm;
  }


  public void setProductOfferingTerm(List<ProductOfferingTerm> productOfferingTerm) {
    this.productOfferingTerm = productOfferingTerm;
  }


  public ProductOfferingUpdate productSpecification(ProductSpecificationRef productSpecification) {
    
    this.productSpecification = productSpecification;
    return this;
  }

   /**
   * Get productSpecification
   * @return productSpecification
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ProductSpecificationRef getProductSpecification() {
    return productSpecification;
  }


  public void setProductSpecification(ProductSpecificationRef productSpecification) {
    this.productSpecification = productSpecification;
  }


  public ProductOfferingUpdate resourceCandidate(ResourceCandidateRef resourceCandidate) {
    
    this.resourceCandidate = resourceCandidate;
    return this;
  }

   /**
   * Get resourceCandidate
   * @return resourceCandidate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ResourceCandidateRef getResourceCandidate() {
    return resourceCandidate;
  }


  public void setResourceCandidate(ResourceCandidateRef resourceCandidate) {
    this.resourceCandidate = resourceCandidate;
  }


  public ProductOfferingUpdate serviceCandidate(ServiceCandidateRef serviceCandidate) {
    
    this.serviceCandidate = serviceCandidate;
    return this;
  }

   /**
   * Get serviceCandidate
   * @return serviceCandidate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ServiceCandidateRef getServiceCandidate() {
    return serviceCandidate;
  }


  public void setServiceCandidate(ServiceCandidateRef serviceCandidate) {
    this.serviceCandidate = serviceCandidate;
  }


  public ProductOfferingUpdate serviceLevelAgreement(SLARef serviceLevelAgreement) {
    
    this.serviceLevelAgreement = serviceLevelAgreement;
    return this;
  }

   /**
   * Get serviceLevelAgreement
   * @return serviceLevelAgreement
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SLARef getServiceLevelAgreement() {
    return serviceLevelAgreement;
  }


  public void setServiceLevelAgreement(SLARef serviceLevelAgreement) {
    this.serviceLevelAgreement = serviceLevelAgreement;
  }


  public ProductOfferingUpdate validFor(TimePeriod validFor) {
    
    this.validFor = validFor;
    return this;
  }

   /**
   * Get validFor
   * @return validFor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TimePeriod getValidFor() {
    return validFor;
  }


  public void setValidFor(TimePeriod validFor) {
    this.validFor = validFor;
  }


  public ProductOfferingUpdate atSchemaLocation(URI atSchemaLocation) {
    
    this.atSchemaLocation = atSchemaLocation;
    return this;
  }

   /**
   * A URI to a JSON-Schema file that defines additional attributes and relationships
   * @return atSchemaLocation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A URI to a JSON-Schema file that defines additional attributes and relationships")

  public URI getAtSchemaLocation() {
    return atSchemaLocation;
  }


  public void setAtSchemaLocation(URI atSchemaLocation) {
    this.atSchemaLocation = atSchemaLocation;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductOfferingUpdate productOfferingUpdate = (ProductOfferingUpdate) o;
    return Objects.equals(this.description, productOfferingUpdate.description) &&
        Objects.equals(this.isBundle, productOfferingUpdate.isBundle) &&
        Objects.equals(this.isSellable, productOfferingUpdate.isSellable) &&
        Objects.equals(this.lifecycleStatus, productOfferingUpdate.lifecycleStatus) &&
        Objects.equals(this.name, productOfferingUpdate.name) &&
        Objects.equals(this.statusReason, productOfferingUpdate.statusReason) &&
        Objects.equals(this.version, productOfferingUpdate.version) &&
        Objects.equals(this.agreement, productOfferingUpdate.agreement) &&
        Objects.equals(this.attachment, productOfferingUpdate.attachment) &&
        Objects.equals(this.bundledProductOffering, productOfferingUpdate.bundledProductOffering) &&
        Objects.equals(this.category, productOfferingUpdate.category) &&
        Objects.equals(this.channel, productOfferingUpdate.channel) &&
        Objects.equals(this.marketSegment, productOfferingUpdate.marketSegment) &&
        Objects.equals(this.place, productOfferingUpdate.place) &&
        Objects.equals(this.prodSpecCharValueUse, productOfferingUpdate.prodSpecCharValueUse) &&
        Objects.equals(this.productOfferingPrice, productOfferingUpdate.productOfferingPrice) &&
        Objects.equals(this.productOfferingRelationship, productOfferingUpdate.productOfferingRelationship) &&
        Objects.equals(this.productOfferingTerm, productOfferingUpdate.productOfferingTerm) &&
        Objects.equals(this.productSpecification, productOfferingUpdate.productSpecification) &&
        Objects.equals(this.resourceCandidate, productOfferingUpdate.resourceCandidate) &&
        Objects.equals(this.serviceCandidate, productOfferingUpdate.serviceCandidate) &&
        Objects.equals(this.serviceLevelAgreement, productOfferingUpdate.serviceLevelAgreement) &&
        Objects.equals(this.validFor, productOfferingUpdate.validFor) &&
        Objects.equals(this.atSchemaLocation, productOfferingUpdate.atSchemaLocation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, isBundle, isSellable, lifecycleStatus, name, statusReason, version, agreement, attachment, bundledProductOffering, category, channel, marketSegment, place, prodSpecCharValueUse, productOfferingPrice, productOfferingRelationship, productOfferingTerm, productSpecification, resourceCandidate, serviceCandidate, serviceLevelAgreement, validFor, atSchemaLocation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductOfferingUpdate {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    isBundle: ").append(toIndentedString(isBundle)).append("\n");
    sb.append("    isSellable: ").append(toIndentedString(isSellable)).append("\n");
    sb.append("    lifecycleStatus: ").append(toIndentedString(lifecycleStatus)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    statusReason: ").append(toIndentedString(statusReason)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    agreement: ").append(toIndentedString(agreement)).append("\n");
    sb.append("    attachment: ").append(toIndentedString(attachment)).append("\n");
    sb.append("    bundledProductOffering: ").append(toIndentedString(bundledProductOffering)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    marketSegment: ").append(toIndentedString(marketSegment)).append("\n");
    sb.append("    place: ").append(toIndentedString(place)).append("\n");
    sb.append("    prodSpecCharValueUse: ").append(toIndentedString(prodSpecCharValueUse)).append("\n");
    sb.append("    productOfferingPrice: ").append(toIndentedString(productOfferingPrice)).append("\n");
    sb.append("    productOfferingRelationship: ").append(toIndentedString(productOfferingRelationship)).append("\n");
    sb.append("    productOfferingTerm: ").append(toIndentedString(productOfferingTerm)).append("\n");
    sb.append("    productSpecification: ").append(toIndentedString(productSpecification)).append("\n");
    sb.append("    resourceCandidate: ").append(toIndentedString(resourceCandidate)).append("\n");
    sb.append("    serviceCandidate: ").append(toIndentedString(serviceCandidate)).append("\n");
    sb.append("    serviceLevelAgreement: ").append(toIndentedString(serviceLevelAgreement)).append("\n");
    sb.append("    validFor: ").append(toIndentedString(validFor)).append("\n");
    sb.append("    atSchemaLocation: ").append(toIndentedString(atSchemaLocation)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

