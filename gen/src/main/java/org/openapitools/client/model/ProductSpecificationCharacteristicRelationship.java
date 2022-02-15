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
import org.openapitools.client.model.TimePeriod;

/**
 * An aggregation, migration, substitution, dependency or exclusivity relationship between/among productSpecificationCharacteristics.
 */
@ApiModel(description = "An aggregation, migration, substitution, dependency or exclusivity relationship between/among productSpecificationCharacteristics.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-02-04T02:31:04.425344+07:00[Asia/Ho_Chi_Minh]")
public class ProductSpecificationCharacteristicRelationship {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_HREF = "href";
  @SerializedName(SERIALIZED_NAME_HREF)
  private String href;

  public static final String SERIALIZED_NAME_CHAR_SPEC_SEQ = "charSpecSeq";
  @SerializedName(SERIALIZED_NAME_CHAR_SPEC_SEQ)
  private Integer charSpecSeq;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_RELATIONSHIP_TYPE = "relationshipType";
  @SerializedName(SERIALIZED_NAME_RELATIONSHIP_TYPE)
  private String relationshipType;

  public static final String SERIALIZED_NAME_VALID_FOR = "validFor";
  @SerializedName(SERIALIZED_NAME_VALID_FOR)
  private TimePeriod validFor;

  public static final String SERIALIZED_NAME_AT_BASE_TYPE = "@baseType";
  @SerializedName(SERIALIZED_NAME_AT_BASE_TYPE)
  private String atBaseType;

  public static final String SERIALIZED_NAME_AT_SCHEMA_LOCATION = "@schemaLocation";
  @SerializedName(SERIALIZED_NAME_AT_SCHEMA_LOCATION)
  private URI atSchemaLocation;

  public static final String SERIALIZED_NAME_AT_TYPE = "@type";
  @SerializedName(SERIALIZED_NAME_AT_TYPE)
  private String atType;


  public ProductSpecificationCharacteristicRelationship id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * the identifier of the associated product specification
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the identifier of the associated product specification")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public ProductSpecificationCharacteristicRelationship href(String href) {
    
    this.href = href;
    return this;
  }

   /**
   * Hyperlink reference to the target product specification
   * @return href
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Hyperlink reference to the target product specification")

  public String getHref() {
    return href;
  }


  public void setHref(String href) {
    this.href = href;
  }


  public ProductSpecificationCharacteristicRelationship charSpecSeq(Integer charSpecSeq) {
    
    this.charSpecSeq = charSpecSeq;
    return this;
  }

   /**
   * The order in which a CharacteristicSpecification appears within another CharacteristicSpecification that defines a grouping of CharacteristicSpecifications.  For example, a grouping may represent the name of an individual. The given name is first, the middle name is second, and the last name is third.
   * @return charSpecSeq
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The order in which a CharacteristicSpecification appears within another CharacteristicSpecification that defines a grouping of CharacteristicSpecifications.  For example, a grouping may represent the name of an individual. The given name is first, the middle name is second, and the last name is third.")

  public Integer getCharSpecSeq() {
    return charSpecSeq;
  }


  public void setCharSpecSeq(Integer charSpecSeq) {
    this.charSpecSeq = charSpecSeq;
  }


  public ProductSpecificationCharacteristicRelationship name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of the target product specification characteristic
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the target product specification characteristic")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ProductSpecificationCharacteristicRelationship relationshipType(String relationshipType) {
    
    this.relationshipType = relationshipType;
    return this;
  }

   /**
   * Type of relationship such as aggregation, migration, substitution, dependency, exclusivity
   * @return relationshipType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Type of relationship such as aggregation, migration, substitution, dependency, exclusivity")

  public String getRelationshipType() {
    return relationshipType;
  }


  public void setRelationshipType(String relationshipType) {
    this.relationshipType = relationshipType;
  }


  public ProductSpecificationCharacteristicRelationship validFor(TimePeriod validFor) {
    
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


  public ProductSpecificationCharacteristicRelationship atBaseType(String atBaseType) {
    
    this.atBaseType = atBaseType;
    return this;
  }

   /**
   * When sub-classing, this defines the super-class
   * @return atBaseType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "When sub-classing, this defines the super-class")

  public String getAtBaseType() {
    return atBaseType;
  }


  public void setAtBaseType(String atBaseType) {
    this.atBaseType = atBaseType;
  }


  public ProductSpecificationCharacteristicRelationship atSchemaLocation(URI atSchemaLocation) {
    
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


  public ProductSpecificationCharacteristicRelationship atType(String atType) {
    
    this.atType = atType;
    return this;
  }

   /**
   * When sub-classing, this defines the sub-class Extensible name
   * @return atType
  **/
  @javax.annotation.Nullable
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
    ProductSpecificationCharacteristicRelationship productSpecificationCharacteristicRelationship = (ProductSpecificationCharacteristicRelationship) o;
    return Objects.equals(this.id, productSpecificationCharacteristicRelationship.id) &&
        Objects.equals(this.href, productSpecificationCharacteristicRelationship.href) &&
        Objects.equals(this.charSpecSeq, productSpecificationCharacteristicRelationship.charSpecSeq) &&
        Objects.equals(this.name, productSpecificationCharacteristicRelationship.name) &&
        Objects.equals(this.relationshipType, productSpecificationCharacteristicRelationship.relationshipType) &&
        Objects.equals(this.validFor, productSpecificationCharacteristicRelationship.validFor) &&
        Objects.equals(this.atBaseType, productSpecificationCharacteristicRelationship.atBaseType) &&
        Objects.equals(this.atSchemaLocation, productSpecificationCharacteristicRelationship.atSchemaLocation) &&
        Objects.equals(this.atType, productSpecificationCharacteristicRelationship.atType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, charSpecSeq, name, relationshipType, validFor, atBaseType, atSchemaLocation, atType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductSpecificationCharacteristicRelationship {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    charSpecSeq: ").append(toIndentedString(charSpecSeq)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    relationshipType: ").append(toIndentedString(relationshipType)).append("\n");
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

