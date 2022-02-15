

# ProductOfferingPriceRefOrValue

A new product offering price being created by value or a reference to an existing product offering price that alreasy created. The polymorphic attributes @type, @schemaLocation & @referredType are related to the product offering price and not to this ReforValue structure
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | unique identifier |  [optional]
**href** | **URI** | Hyperlink reference |  [optional]
**description** | **String** | Description of the productOfferingPrice |  [optional]
**lastUpdate** | **OffsetDateTime** | the last update time of this ProductOfferingPrice |  [optional]
**lifecycleStatus** | **String** | the lifecycle status of this ProductOfferingPrice |  [optional]
**name** | **String** | Name of the productOfferingPrice |  [optional]
**priceType** | **String** | A category that describes the price charge, such as recurring, penalty, One time fee and so forth. |  [optional]
**recurringChargePeriod** | **String** | The period type to repeat the application of the price Could be month, week... |  [optional]
**recurringChargePeriodLength** | **Integer** | the period of the recurring charge:  1, 2, ... .It sets to zero if it is not applicable |  [optional]
**version** | **String** | ProductOffering version |  [optional]
**constraint** | [**List&lt;ConstraintRef&gt;**](ConstraintRef.md) | The Constraint resource represents a policy/rule applied to ProductOfferingPrice. |  [optional]
**price** | [**ProductPriceValue**](ProductPriceValue.md) |  |  [optional]
**priceAlteration** | [**List&lt;POPAlteration&gt;**](POPAlteration.md) |  |  [optional]
**unitOfMeasure** | [**Quantity**](Quantity.md) |  |  [optional]
**validFor** | [**TimePeriod**](TimePeriod.md) |  |  [optional]
**atBaseType** | **String** | When sub-classing, this defines the super-class |  [optional]
**atSchemaLocation** | **URI** | A URI to a JSON-Schema file that defines additional attributes and relationships |  [optional]
**atType** | **String** | When sub-classing, this defines the sub-class Extensible name |  [optional]
**atReferredType** | **String** | The actual type of the target instance when needed for disambiguation. |  [optional]



