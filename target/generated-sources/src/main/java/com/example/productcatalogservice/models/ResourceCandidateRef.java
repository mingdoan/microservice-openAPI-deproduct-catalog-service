package com.example.productcatalogservice.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.net.URI;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ResourceCandidate is an entity that makes a resource specification available to a catalog. A ResourceCandidate and its associated resource specification may be published - made visible - in any number of resource catalogs, or in none.
 */
@ApiModel(description = "ResourceCandidate is an entity that makes a resource specification available to a catalog. A ResourceCandidate and its associated resource specification may be published - made visible - in any number of resource catalogs, or in none.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-02-16T03:04:00.216089+07:00[Asia/Ho_Chi_Minh]")
public class ResourceCandidateRef   {
  @JsonProperty("id")
  private String id;

  @JsonProperty("href")
  private URI href;

  @JsonProperty("name")
  private String name;

  @JsonProperty("version")
  private String version;

  @JsonProperty("@baseType")
  private String atBaseType;

  @JsonProperty("@schemaLocation")
  private URI atSchemaLocation;

  @JsonProperty("@type")
  private String atType;

  @JsonProperty("@referredType")
  private String atReferredType;

  public ResourceCandidateRef id(String id) {
    this.id = id;
    return this;
  }

  /**
   * unique identifier
   * @return id
  */
  @ApiModelProperty(required = true, value = "unique identifier")
  @NotNull


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ResourceCandidateRef href(URI href) {
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

  public ResourceCandidateRef name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the related entity.
   * @return name
  */
  @ApiModelProperty(value = "Name of the related entity.")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ResourceCandidateRef version(String version) {
    this.version = version;
    return this;
  }

  /**
   * the version of resource candidate
   * @return version
  */
  @ApiModelProperty(value = "the version of resource candidate")


  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public ResourceCandidateRef atBaseType(String atBaseType) {
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

  public ResourceCandidateRef atSchemaLocation(URI atSchemaLocation) {
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

  public ResourceCandidateRef atType(String atType) {
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

  public ResourceCandidateRef atReferredType(String atReferredType) {
    this.atReferredType = atReferredType;
    return this;
  }

  /**
   * The actual type of the target instance when needed for disambiguation.
   * @return atReferredType
  */
  @ApiModelProperty(value = "The actual type of the target instance when needed for disambiguation.")


  public String getAtReferredType() {
    return atReferredType;
  }

  public void setAtReferredType(String atReferredType) {
    this.atReferredType = atReferredType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourceCandidateRef resourceCandidateRef = (ResourceCandidateRef) o;
    return Objects.equals(this.id, resourceCandidateRef.id) &&
        Objects.equals(this.href, resourceCandidateRef.href) &&
        Objects.equals(this.name, resourceCandidateRef.name) &&
        Objects.equals(this.version, resourceCandidateRef.version) &&
        Objects.equals(this.atBaseType, resourceCandidateRef.atBaseType) &&
        Objects.equals(this.atSchemaLocation, resourceCandidateRef.atSchemaLocation) &&
        Objects.equals(this.atType, resourceCandidateRef.atType) &&
        Objects.equals(this.atReferredType, resourceCandidateRef.atReferredType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, name, version, atBaseType, atSchemaLocation, atType, atReferredType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceCandidateRef {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    atBaseType: ").append(toIndentedString(atBaseType)).append("\n");
    sb.append("    atSchemaLocation: ").append(toIndentedString(atSchemaLocation)).append("\n");
    sb.append("    atType: ").append(toIndentedString(atType)).append("\n");
    sb.append("    atReferredType: ").append(toIndentedString(atReferredType)).append("\n");
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

