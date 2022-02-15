package com.example.productcatalogservice.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A time interval in a given unit of time
 */
@ApiModel(description = "A time interval in a given unit of time")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-02-16T02:51:54.355766+07:00[Asia/Ho_Chi_Minh]")
public class Duration   {
  @JsonProperty("amount")
  private Integer amount;

  @JsonProperty("units")
  private String units;

  public Duration amount(Integer amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Time interval (number of seconds, minutes, hours, etc.)
   * @return amount
  */
  @ApiModelProperty(value = "Time interval (number of seconds, minutes, hours, etc.)")


  public Integer getAmount() {
    return amount;
  }

  public void setAmount(Integer amount) {
    this.amount = amount;
  }

  public Duration units(String units) {
    this.units = units;
    return this;
  }

  /**
   * Unit of time (seconds, minutes, hours, etc.)
   * @return units
  */
  @ApiModelProperty(value = "Unit of time (seconds, minutes, hours, etc.)")


  public String getUnits() {
    return units;
  }

  public void setUnits(String units) {
    this.units = units;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Duration duration = (Duration) o;
    return Objects.equals(this.amount, duration.amount) &&
        Objects.equals(this.units, duration.units);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, units);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Duration {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    units: ").append(toIndentedString(units)).append("\n");
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

