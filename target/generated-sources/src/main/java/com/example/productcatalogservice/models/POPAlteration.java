package com.example.productcatalogservice.models;

import java.util.Objects;
import com.example.productcatalogservice.models.Duration;
import com.example.productcatalogservice.models.ProductPriceValue;
import com.example.productcatalogservice.models.Quantity;
import com.example.productcatalogservice.models.TimePeriod;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.net.URI;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Is an amount, usually of money, that modifies the price charged for an order item.
 */
@ApiModel(description = "Is an amount, usually of money, that modifies the price charged for an order item.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-02-16T02:51:54.355766+07:00[Asia/Ho_Chi_Minh]")
public class POPAlteration   {
  @JsonProperty("id")
  private String id;

  @JsonProperty("href")
  private URI href;

  @JsonProperty("description")
  private String description;

  @JsonProperty("name")
  private String name;

  @JsonProperty("priceType")
  private String priceType;

  @JsonProperty("priority")
  private Integer priority;

  @JsonProperty("recurringChargePeriod")
  private String recurringChargePeriod;

  @JsonProperty("applicationDuration")
  private Duration applicationDuration;

  @JsonProperty("price")
  private ProductPriceValue price;

  @JsonProperty("unitOfMeasure")
  private Quantity unitOfMeasure;

  @JsonProperty("validFor")
  private TimePeriod validFor;

  @JsonProperty("@baseType")
  private String atBaseType;

  @JsonProperty("@schemaLocation")
  private URI atSchemaLocation;

  @JsonProperty("@type")
  private String atType;

  public POPAlteration id(String id) {
    this.id = id;
    return this;
  }

  /**
   * unique identifier
   * @return id
  */
  @ApiModelProperty(value = "unique identifier")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public POPAlteration href(URI href) {
    this.href = href;
    return this;
  }

  /**
   * Hyperlink reference
   * @return href
  */
  @ApiModelProperty(value = "Hyperlink reference")

  @Valid

  public URI getHref() {
    return href;
  }

  public void setHref(URI href) {
    this.href = href;
  }

  public POPAlteration description(String description) {
    this.description = description;
    return this;
  }

  /**
   * A narrative that explains in detail the semantics of this order item price alteration
   * @return description
  */
  @ApiModelProperty(value = "A narrative that explains in detail the semantics of this order item price alteration")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public POPAlteration name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name given to this price alteration
   * @return name
  */
  @ApiModelProperty(value = "Name given to this price alteration")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public POPAlteration priceType(String priceType) {
    this.priceType = priceType;
    return this;
  }

  /**
   * A category that describes the price such as recurring, one time and usage.
   * @return priceType
  */
  @ApiModelProperty(required = true, value = "A category that describes the price such as recurring, one time and usage.")
  @NotNull


  public String getPriceType() {
    return priceType;
  }

  public void setPriceType(String priceType) {
    this.priceType = priceType;
  }

  public POPAlteration priority(Integer priority) {
    this.priority = priority;
    return this;
  }

  /**
   * Priority level for applying this alteration among all the defined alterations on the order item price
   * @return priority
  */
  @ApiModelProperty(value = "Priority level for applying this alteration among all the defined alterations on the order item price")


  public Integer getPriority() {
    return priority;
  }

  public void setPriority(Integer priority) {
    this.priority = priority;
  }

  public POPAlteration recurringChargePeriod(String recurringChargePeriod) {
    this.recurringChargePeriod = recurringChargePeriod;
    return this;
  }

  /**
   * Could be month, week...
   * @return recurringChargePeriod
  */
  @ApiModelProperty(value = "Could be month, week...")


  public String getRecurringChargePeriod() {
    return recurringChargePeriod;
  }

  public void setRecurringChargePeriod(String recurringChargePeriod) {
    this.recurringChargePeriod = recurringChargePeriod;
  }

  public POPAlteration applicationDuration(Duration applicationDuration) {
    this.applicationDuration = applicationDuration;
    return this;
  }

  /**
   * Get applicationDuration
   * @return applicationDuration
  */
  @ApiModelProperty(value = "")

  @Valid

  public Duration getApplicationDuration() {
    return applicationDuration;
  }

  public void setApplicationDuration(Duration applicationDuration) {
    this.applicationDuration = applicationDuration;
  }

  public POPAlteration price(ProductPriceValue price) {
    this.price = price;
    return this;
  }

  /**
   * Get price
   * @return price
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public ProductPriceValue getPrice() {
    return price;
  }

  public void setPrice(ProductPriceValue price) {
    this.price = price;
  }

  public POPAlteration unitOfMeasure(Quantity unitOfMeasure) {
    this.unitOfMeasure = unitOfMeasure;
    return this;
  }

  /**
   * Get unitOfMeasure
   * @return unitOfMeasure
  */
  @ApiModelProperty(value = "")

  @Valid

  public Quantity getUnitOfMeasure() {
    return unitOfMeasure;
  }

  public void setUnitOfMeasure(Quantity unitOfMeasure) {
    this.unitOfMeasure = unitOfMeasure;
  }

  public POPAlteration validFor(TimePeriod validFor) {
    this.validFor = validFor;
    return this;
  }

  /**
   * Get validFor
   * @return validFor
  */
  @ApiModelProperty(value = "")

  @Valid

  public TimePeriod getValidFor() {
    return validFor;
  }

  public void setValidFor(TimePeriod validFor) {
    this.validFor = validFor;
  }

  public POPAlteration atBaseType(String atBaseType) {
    this.atBaseType = atBaseType;
    return this;
  }

  /**
   * When sub-classing, this defines the super-class
   * @return atBaseType
  */
  @ApiModelProperty(value = "When sub-classing, this defines the super-class")


  public String getAtBaseType() {
    return atBaseType;
  }

  public void setAtBaseType(String atBaseType) {
    this.atBaseType = atBaseType;
  }

  public POPAlteration atSchemaLocation(URI atSchemaLocation) {
    this.atSchemaLocation = atSchemaLocation;
    return this;
  }

  /**
   * A URI to a JSON-Schema file that defines additional attributes and relationships
   * @return atSchemaLocation
  */
  @ApiModelProperty(value = "A URI to a JSON-Schema file that defines additional attributes and relationships")

  @Valid

  public URI getAtSchemaLocation() {
    return atSchemaLocation;
  }

  public void setAtSchemaLocation(URI atSchemaLocation) {
    this.atSchemaLocation = atSchemaLocation;
  }

  public POPAlteration atType(String atType) {
    this.atType = atType;
    return this;
  }

  /**
   * When sub-classing, this defines the sub-class Extensible name
   * @return atType
  */
  @ApiModelProperty(value = "When sub-classing, this defines the sub-class Extensible name")


  public String getAtType() {
    return atType;
  }

  public void setAtType(String atType) {
    this.atType = atType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    POPAlteration poPAlteration = (POPAlteration) o;
    return Objects.equals(this.id, poPAlteration.id) &&
        Objects.equals(this.href, poPAlteration.href) &&
        Objects.equals(this.description, poPAlteration.description) &&
        Objects.equals(this.name, poPAlteration.name) &&
        Objects.equals(this.priceType, poPAlteration.priceType) &&
        Objects.equals(this.priority, poPAlteration.priority) &&
        Objects.equals(this.recurringChargePeriod, poPAlteration.recurringChargePeriod) &&
        Objects.equals(this.applicationDuration, poPAlteration.applicationDuration) &&
        Objects.equals(this.price, poPAlteration.price) &&
        Objects.equals(this.unitOfMeasure, poPAlteration.unitOfMeasure) &&
        Objects.equals(this.validFor, poPAlteration.validFor) &&
        Objects.equals(this.atBaseType, poPAlteration.atBaseType) &&
        Objects.equals(this.atSchemaLocation, poPAlteration.atSchemaLocation) &&
        Objects.equals(this.atType, poPAlteration.atType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, description, name, priceType, priority, recurringChargePeriod, applicationDuration, price, unitOfMeasure, validFor, atBaseType, atSchemaLocation, atType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class POPAlteration {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    priceType: ").append(toIndentedString(priceType)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    recurringChargePeriod: ").append(toIndentedString(recurringChargePeriod)).append("\n");
    sb.append("    applicationDuration: ").append(toIndentedString(applicationDuration)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    unitOfMeasure: ").append(toIndentedString(unitOfMeasure)).append("\n");
    sb.append("    validFor: ").append(toIndentedString(validFor)).append("\n");
    sb.append("    atBaseType: ").append(toIndentedString(atBaseType)).append("\n");
    sb.append("    atSchemaLocation: ").append(toIndentedString(atSchemaLocation)).append("\n");
    sb.append("    atType: ").append(toIndentedString(atType)).append("\n");
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

