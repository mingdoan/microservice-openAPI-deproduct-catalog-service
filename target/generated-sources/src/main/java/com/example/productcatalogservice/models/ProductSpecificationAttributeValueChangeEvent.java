package com.example.productcatalogservice.models;

import java.util.Objects;
import com.example.productcatalogservice.models.ProductSpecificationAttributeValueChangeEventPayload;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The notification data structure
 */
@ApiModel(description = "The notification data structure")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-02-16T02:51:54.355766+07:00[Asia/Ho_Chi_Minh]")
public class ProductSpecificationAttributeValueChangeEvent   {
  @JsonProperty("eventId")
  private String eventId;

  @JsonProperty("eventTime")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
  private Date eventTime;

  @JsonProperty("eventType")
  private String eventType;

  @JsonProperty("correlationId")
  private String correlationId;

  @JsonProperty("domain")
  private String domain;

  @JsonProperty("title")
  private String title;

  @JsonProperty("description")
  private String description;

  @JsonProperty("priority")
  private String priority;

  @JsonProperty("timeOcurred")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
  private Date timeOcurred;

  @JsonProperty("fieldPath")
  private String fieldPath;

  @JsonProperty("event")
  private ProductSpecificationAttributeValueChangeEventPayload event;

  public ProductSpecificationAttributeValueChangeEvent eventId(String eventId) {
    this.eventId = eventId;
    return this;
  }

  /**
   * The identifier of the notification.
   * @return eventId
  */
  @ApiModelProperty(value = "The identifier of the notification.")


  public String getEventId() {
    return eventId;
  }

  public void setEventId(String eventId) {
    this.eventId = eventId;
  }

  public ProductSpecificationAttributeValueChangeEvent eventTime(Date eventTime) {
    this.eventTime = eventTime;
    return this;
  }

  /**
   * Time of the event occurrence.
   * @return eventTime
  */
  @ApiModelProperty(value = "Time of the event occurrence.")

  @Valid

  public Date getEventTime() {
    return eventTime;
  }

  public void setEventTime(Date eventTime) {
    this.eventTime = eventTime;
  }

  public ProductSpecificationAttributeValueChangeEvent eventType(String eventType) {
    this.eventType = eventType;
    return this;
  }

  /**
   * The type of the notification.
   * @return eventType
  */
  @ApiModelProperty(value = "The type of the notification.")


  public String getEventType() {
    return eventType;
  }

  public void setEventType(String eventType) {
    this.eventType = eventType;
  }

  public ProductSpecificationAttributeValueChangeEvent correlationId(String correlationId) {
    this.correlationId = correlationId;
    return this;
  }

  /**
   * The correlation id for this event.
   * @return correlationId
  */
  @ApiModelProperty(value = "The correlation id for this event.")


  public String getCorrelationId() {
    return correlationId;
  }

  public void setCorrelationId(String correlationId) {
    this.correlationId = correlationId;
  }

  public ProductSpecificationAttributeValueChangeEvent domain(String domain) {
    this.domain = domain;
    return this;
  }

  /**
   * The domain of the event.
   * @return domain
  */
  @ApiModelProperty(value = "The domain of the event.")


  public String getDomain() {
    return domain;
  }

  public void setDomain(String domain) {
    this.domain = domain;
  }

  public ProductSpecificationAttributeValueChangeEvent title(String title) {
    this.title = title;
    return this;
  }

  /**
   * The title of the event.
   * @return title
  */
  @ApiModelProperty(value = "The title of the event.")


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public ProductSpecificationAttributeValueChangeEvent description(String description) {
    this.description = description;
    return this;
  }

  /**
   * An explnatory of the event.
   * @return description
  */
  @ApiModelProperty(value = "An explnatory of the event.")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ProductSpecificationAttributeValueChangeEvent priority(String priority) {
    this.priority = priority;
    return this;
  }

  /**
   * A priority.
   * @return priority
  */
  @ApiModelProperty(value = "A priority.")


  public String getPriority() {
    return priority;
  }

  public void setPriority(String priority) {
    this.priority = priority;
  }

  public ProductSpecificationAttributeValueChangeEvent timeOcurred(Date timeOcurred) {
    this.timeOcurred = timeOcurred;
    return this;
  }

  /**
   * The time the event occured.
   * @return timeOcurred
  */
  @ApiModelProperty(value = "The time the event occured.")

  @Valid

  public Date getTimeOcurred() {
    return timeOcurred;
  }

  public void setTimeOcurred(Date timeOcurred) {
    this.timeOcurred = timeOcurred;
  }

  public ProductSpecificationAttributeValueChangeEvent fieldPath(String fieldPath) {
    this.fieldPath = fieldPath;
    return this;
  }

  /**
   * The path identifying the object field concerned by this notification.
   * @return fieldPath
  */
  @ApiModelProperty(value = "The path identifying the object field concerned by this notification.")


  public String getFieldPath() {
    return fieldPath;
  }

  public void setFieldPath(String fieldPath) {
    this.fieldPath = fieldPath;
  }

  public ProductSpecificationAttributeValueChangeEvent event(ProductSpecificationAttributeValueChangeEventPayload event) {
    this.event = event;
    return this;
  }

  /**
   * Get event
   * @return event
  */
  @ApiModelProperty(value = "")

  @Valid

  public ProductSpecificationAttributeValueChangeEventPayload getEvent() {
    return event;
  }

  public void setEvent(ProductSpecificationAttributeValueChangeEventPayload event) {
    this.event = event;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductSpecificationAttributeValueChangeEvent productSpecificationAttributeValueChangeEvent = (ProductSpecificationAttributeValueChangeEvent) o;
    return Objects.equals(this.eventId, productSpecificationAttributeValueChangeEvent.eventId) &&
        Objects.equals(this.eventTime, productSpecificationAttributeValueChangeEvent.eventTime) &&
        Objects.equals(this.eventType, productSpecificationAttributeValueChangeEvent.eventType) &&
        Objects.equals(this.correlationId, productSpecificationAttributeValueChangeEvent.correlationId) &&
        Objects.equals(this.domain, productSpecificationAttributeValueChangeEvent.domain) &&
        Objects.equals(this.title, productSpecificationAttributeValueChangeEvent.title) &&
        Objects.equals(this.description, productSpecificationAttributeValueChangeEvent.description) &&
        Objects.equals(this.priority, productSpecificationAttributeValueChangeEvent.priority) &&
        Objects.equals(this.timeOcurred, productSpecificationAttributeValueChangeEvent.timeOcurred) &&
        Objects.equals(this.fieldPath, productSpecificationAttributeValueChangeEvent.fieldPath) &&
        Objects.equals(this.event, productSpecificationAttributeValueChangeEvent.event);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventId, eventTime, eventType, correlationId, domain, title, description, priority, timeOcurred, fieldPath, event);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductSpecificationAttributeValueChangeEvent {\n");
    
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    eventTime: ").append(toIndentedString(eventTime)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    correlationId: ").append(toIndentedString(correlationId)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    timeOcurred: ").append(toIndentedString(timeOcurred)).append("\n");
    sb.append("    fieldPath: ").append(toIndentedString(fieldPath)).append("\n");
    sb.append("    event: ").append(toIndentedString(event)).append("\n");
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

