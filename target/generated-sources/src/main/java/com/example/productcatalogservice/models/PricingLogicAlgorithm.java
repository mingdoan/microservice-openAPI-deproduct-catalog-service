package com.example.productcatalogservice.models;

import java.util.Objects;
import com.example.productcatalogservice.models.TimePeriod;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.net.URI;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The PricingLogicAlgorithm entity represents an instantiation of an interface specification to external rating function (without a modeled bahavior in SID). Some of the parameters of the interface definiition may be already set (such as price per unit) and some may be gathered during the rating process from the event (such as call duration) or from ProductCharacteristicValues (such as assigned bandwidth)
 */
@ApiModel(description = "The PricingLogicAlgorithm entity represents an instantiation of an interface specification to external rating function (without a modeled bahavior in SID). Some of the parameters of the interface definiition may be already set (such as price per unit) and some may be gathered during the rating process from the event (such as call duration) or from ProductCharacteristicValues (such as assigned bandwidth)")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-02-16T03:04:00.216089+07:00[Asia/Ho_Chi_Minh]")
public class PricingLogicAlgorithm   {
  @JsonProperty("id")
  private String id;

  @JsonProperty("href")
  private URI href;

  @JsonProperty("description")
  private String description;

  @JsonProperty("name")
  private String name;

  @JsonProperty("plaSpecId")
  private String plaSpecId;

  @JsonProperty("validFor")
  private TimePeriod validFor;

  @JsonProperty("@baseType")
  private String atBaseType;

  @JsonProperty("@schemaLocation")
  private URI atSchemaLocation;

  @JsonProperty("@type")
  private String atType;

  public PricingLogicAlgorithm id(String id) {
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

  public PricingLogicAlgorithm href(URI href) {
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

  public PricingLogicAlgorithm description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of the PricingLogicAlgorithm
   * @return description
  */
  @ApiModelProperty(value = "Description of the PricingLogicAlgorithm")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public PricingLogicAlgorithm name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name given to the PricingLogicAlgorithm
   * @return name
  */
  @ApiModelProperty(value = "Name given to the PricingLogicAlgorithm")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PricingLogicAlgorithm plaSpecId(String plaSpecId) {
    this.plaSpecId = plaSpecId;
    return this;
  }

  /**
   * id of corresponding PricingLogicAlgorithm specification
   * @return plaSpecId
  */
  @ApiModelProperty(value = "id of corresponding PricingLogicAlgorithm specification")


  public String getPlaSpecId() {
    return plaSpecId;
  }

  public void setPlaSpecId(String plaSpecId) {
    this.plaSpecId = plaSpecId;
  }

  public PricingLogicAlgorithm validFor(TimePeriod validFor) {
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

  public PricingLogicAlgorithm atBaseType(String atBaseType) {
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

  public PricingLogicAlgorithm atSchemaLocation(URI atSchemaLocation) {
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

  public PricingLogicAlgorithm atType(String atType) {
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
    PricingLogicAlgorithm pricingLogicAlgorithm = (PricingLogicAlgorithm) o;
    return Objects.equals(this.id, pricingLogicAlgorithm.id) &&
        Objects.equals(this.href, pricingLogicAlgorithm.href) &&
        Objects.equals(this.description, pricingLogicAlgorithm.description) &&
        Objects.equals(this.name, pricingLogicAlgorithm.name) &&
        Objects.equals(this.plaSpecId, pricingLogicAlgorithm.plaSpecId) &&
        Objects.equals(this.validFor, pricingLogicAlgorithm.validFor) &&
        Objects.equals(this.atBaseType, pricingLogicAlgorithm.atBaseType) &&
        Objects.equals(this.atSchemaLocation, pricingLogicAlgorithm.atSchemaLocation) &&
        Objects.equals(this.atType, pricingLogicAlgorithm.atType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, description, name, plaSpecId, validFor, atBaseType, atSchemaLocation, atType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PricingLogicAlgorithm {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    plaSpecId: ").append(toIndentedString(plaSpecId)).append("\n");
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

