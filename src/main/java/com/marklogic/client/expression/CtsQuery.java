/*
 * Copyright 2016 MarkLogic Corporation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.marklogic.client.expression;

import com.marklogic.client.type.XsQNameSeqVal;
 import com.marklogic.client.type.XsDateTimeVal;
 import com.marklogic.client.type.CtsPointExpr;
 import com.marklogic.client.type.XsDoubleVal;
 import com.marklogic.client.type.CtsBoxExpr;
 import com.marklogic.client.type.CtsPolygonExpr;
 import com.marklogic.client.type.CtsCircleSeqExpr;
 import com.marklogic.client.type.CtsRegionExpr;
 import com.marklogic.client.type.CtsCircleExpr;
 import com.marklogic.client.type.CtsPeriodSeqExpr;
 import com.marklogic.client.type.CtsQuerySeqExpr;
 import com.marklogic.client.type.CtsPeriodExpr;
 import com.marklogic.client.type.XsStringSeqVal;
 import com.marklogic.client.type.CtsQueryExpr;
 import com.marklogic.client.type.XsStringVal;
 import com.marklogic.client.type.XsAnyAtomicTypeSeqVal;
 import com.marklogic.client.type.CtsReferenceSeqExpr;
 import com.marklogic.client.type.MapMapExpr;
 import com.marklogic.client.type.CtsPolygonSeqExpr;
 import com.marklogic.client.type.CtsReferenceExpr;
 import com.marklogic.client.type.CtsBoxSeqExpr;
 import com.marklogic.client.type.XsAnyAtomicTypeVal;
 import com.marklogic.client.type.XsQNameVal;
 import com.marklogic.client.type.CtsRegionSeqExpr;
 import com.marklogic.client.type.CtsPointSeqExpr;


// IMPORTANT: Do not edit. This file is generated. 
public interface CtsQuery {
    public CtsQueryExpr andNotQuery(CtsQueryExpr positiveQuery, CtsQueryExpr negativeQuery);
    public CtsQueryExpr andQuery(CtsQueryExpr... queries);
    public CtsQueryExpr andQuery(CtsQuerySeqExpr queries);
    public CtsQueryExpr andQuery(CtsQuerySeqExpr queries, String... options);
    public CtsQueryExpr andQuery(CtsQuerySeqExpr queries, XsStringSeqVal options);
    public CtsQueryExpr boostQuery(CtsQueryExpr matchingQuery, CtsQueryExpr boostingQuery);
    public CtsQueryExpr collectionQuery(String... uris);
    public CtsQueryExpr collectionQuery(XsStringSeqVal uris);
    public CtsQueryExpr directoryQuery(String... uris);
    public CtsQueryExpr directoryQuery(XsStringSeqVal uris);
    public CtsQueryExpr directoryQuery(String uris, String depth);
    public CtsQueryExpr directoryQuery(XsStringSeqVal uris, XsStringVal depth);
    public CtsQueryExpr documentFragmentQuery(CtsQueryExpr query);
    public CtsQueryExpr documentQuery(String... uris);
    public CtsQueryExpr documentQuery(XsStringSeqVal uris);
    public CtsQueryExpr elementAttributePairGeospatialQuery(XsQNameSeqVal elementName, XsQNameSeqVal latitudeAttributeNames, XsQNameSeqVal longitudeAttributeNames, CtsRegionSeqExpr regions);
    public CtsQueryExpr elementAttributePairGeospatialQuery(XsQNameSeqVal elementName, XsQNameSeqVal latitudeAttributeNames, XsQNameSeqVal longitudeAttributeNames, CtsRegionSeqExpr regions, String... options);
    public CtsQueryExpr elementAttributePairGeospatialQuery(XsQNameSeqVal elementName, XsQNameSeqVal latitudeAttributeNames, XsQNameSeqVal longitudeAttributeNames, CtsRegionSeqExpr regions, XsStringSeqVal options);
    public CtsQueryExpr elementAttributePairGeospatialQuery(XsQNameSeqVal elementName, XsQNameSeqVal latitudeAttributeNames, XsQNameSeqVal longitudeAttributeNames, CtsRegionSeqExpr regions, String options, double weight);
    public CtsQueryExpr elementAttributePairGeospatialQuery(XsQNameSeqVal elementName, XsQNameSeqVal latitudeAttributeNames, XsQNameSeqVal longitudeAttributeNames, CtsRegionSeqExpr regions, XsStringSeqVal options, XsDoubleVal weight);
    public CtsQueryExpr elementAttributeRangeQuery(XsQNameSeqVal elementName, XsQNameSeqVal attributeName, String operator, XsAnyAtomicTypeVal... value);
    public CtsQueryExpr elementAttributeRangeQuery(XsQNameSeqVal elementName, XsQNameSeqVal attributeName, XsStringVal operator, XsAnyAtomicTypeSeqVal value);
    public CtsQueryExpr elementAttributeRangeQuery(XsQNameSeqVal elementName, XsQNameSeqVal attributeName, String operator, XsAnyAtomicTypeSeqVal value, String... options);
    public CtsQueryExpr elementAttributeRangeQuery(XsQNameSeqVal elementName, XsQNameSeqVal attributeName, XsStringVal operator, XsAnyAtomicTypeSeqVal value, XsStringSeqVal options);
    public CtsQueryExpr elementAttributeRangeQuery(XsQNameSeqVal elementName, XsQNameSeqVal attributeName, String operator, XsAnyAtomicTypeSeqVal value, String options, double weight);
    public CtsQueryExpr elementAttributeRangeQuery(XsQNameSeqVal elementName, XsQNameSeqVal attributeName, XsStringVal operator, XsAnyAtomicTypeSeqVal value, XsStringSeqVal options, XsDoubleVal weight);
    public CtsQueryExpr elementAttributeValueQuery(XsQNameSeqVal elementName, XsQNameSeqVal attributeName, String... text);
    public CtsQueryExpr elementAttributeValueQuery(XsQNameSeqVal elementName, XsQNameSeqVal attributeName, XsStringSeqVal text);
    public CtsQueryExpr elementAttributeValueQuery(XsQNameSeqVal elementName, XsQNameSeqVal attributeName, String text, String... options);
    public CtsQueryExpr elementAttributeValueQuery(XsQNameSeqVal elementName, XsQNameSeqVal attributeName, XsStringSeqVal text, XsStringSeqVal options);
    public CtsQueryExpr elementAttributeValueQuery(XsQNameSeqVal elementName, XsQNameSeqVal attributeName, String text, String options, double weight);
    public CtsQueryExpr elementAttributeValueQuery(XsQNameSeqVal elementName, XsQNameSeqVal attributeName, XsStringSeqVal text, XsStringSeqVal options, XsDoubleVal weight);
    public CtsQueryExpr elementAttributeWordQuery(XsQNameSeqVal elementName, XsQNameSeqVal attributeName);
    public CtsQueryExpr elementAttributeWordQuery(XsQNameSeqVal elementName, XsQNameSeqVal attributeName, String... text);
    public CtsQueryExpr elementAttributeWordQuery(XsQNameSeqVal elementName, XsQNameSeqVal attributeName, XsStringSeqVal text);
    public CtsQueryExpr elementAttributeWordQuery(XsQNameSeqVal elementName, XsQNameSeqVal attributeName, String text, String... options);
    public CtsQueryExpr elementAttributeWordQuery(XsQNameSeqVal elementName, XsQNameSeqVal attributeName, XsStringSeqVal text, XsStringSeqVal options);
    public CtsQueryExpr elementAttributeWordQuery(XsQNameSeqVal elementName, XsQNameSeqVal attributeName, String text, String options, double weight);
    public CtsQueryExpr elementAttributeWordQuery(XsQNameSeqVal elementName, XsQNameSeqVal attributeName, XsStringSeqVal text, XsStringSeqVal options, XsDoubleVal weight);
    public CtsQueryExpr elementChildGeospatialQuery(XsQNameSeqVal parentElementName, XsQNameSeqVal childElementNames, CtsRegionSeqExpr regions);
    public CtsQueryExpr elementChildGeospatialQuery(XsQNameSeqVal parentElementName, XsQNameSeqVal childElementNames, CtsRegionSeqExpr regions, String... options);
    public CtsQueryExpr elementChildGeospatialQuery(XsQNameSeqVal parentElementName, XsQNameSeqVal childElementNames, CtsRegionSeqExpr regions, XsStringSeqVal options);
    public CtsQueryExpr elementChildGeospatialQuery(XsQNameSeqVal parentElementName, XsQNameSeqVal childElementNames, CtsRegionSeqExpr regions, String options, double weight);
    public CtsQueryExpr elementChildGeospatialQuery(XsQNameSeqVal parentElementName, XsQNameSeqVal childElementNames, CtsRegionSeqExpr regions, XsStringSeqVal options, XsDoubleVal weight);
    public CtsQueryExpr elementGeospatialQuery(XsQNameSeqVal elementName, CtsRegionSeqExpr regions);
    public CtsQueryExpr elementGeospatialQuery(XsQNameSeqVal elementName, CtsRegionSeqExpr regions, String... options);
    public CtsQueryExpr elementGeospatialQuery(XsQNameSeqVal elementName, CtsRegionSeqExpr regions, XsStringSeqVal options);
    public CtsQueryExpr elementGeospatialQuery(XsQNameSeqVal elementName, CtsRegionSeqExpr regions, String options, double weight);
    public CtsQueryExpr elementGeospatialQuery(XsQNameSeqVal elementName, CtsRegionSeqExpr regions, XsStringSeqVal options, XsDoubleVal weight);
    public CtsQueryExpr elementPairGeospatialQuery(XsQNameSeqVal elementName, XsQNameSeqVal latitudeElementNames, XsQNameSeqVal longitudeElementNames, CtsRegionSeqExpr regions);
    public CtsQueryExpr elementPairGeospatialQuery(XsQNameSeqVal elementName, XsQNameSeqVal latitudeElementNames, XsQNameSeqVal longitudeElementNames, CtsRegionSeqExpr regions, String... options);
    public CtsQueryExpr elementPairGeospatialQuery(XsQNameSeqVal elementName, XsQNameSeqVal latitudeElementNames, XsQNameSeqVal longitudeElementNames, CtsRegionSeqExpr regions, XsStringSeqVal options);
    public CtsQueryExpr elementPairGeospatialQuery(XsQNameSeqVal elementName, XsQNameSeqVal latitudeElementNames, XsQNameSeqVal longitudeElementNames, CtsRegionSeqExpr regions, String options, double weight);
    public CtsQueryExpr elementPairGeospatialQuery(XsQNameSeqVal elementName, XsQNameSeqVal latitudeElementNames, XsQNameSeqVal longitudeElementNames, CtsRegionSeqExpr regions, XsStringSeqVal options, XsDoubleVal weight);
    public CtsQueryExpr elementQuery(XsQNameSeqVal elementName, CtsQueryExpr query);
    public CtsQueryExpr elementRangeQuery(XsQNameSeqVal elementName, String operator, XsAnyAtomicTypeVal... value);
    public CtsQueryExpr elementRangeQuery(XsQNameSeqVal elementName, XsStringVal operator, XsAnyAtomicTypeSeqVal value);
    public CtsQueryExpr elementRangeQuery(XsQNameSeqVal elementName, String operator, XsAnyAtomicTypeSeqVal value, String... options);
    public CtsQueryExpr elementRangeQuery(XsQNameSeqVal elementName, XsStringVal operator, XsAnyAtomicTypeSeqVal value, XsStringSeqVal options);
    public CtsQueryExpr elementRangeQuery(XsQNameSeqVal elementName, String operator, XsAnyAtomicTypeSeqVal value, String options, double weight);
    public CtsQueryExpr elementRangeQuery(XsQNameSeqVal elementName, XsStringVal operator, XsAnyAtomicTypeSeqVal value, XsStringSeqVal options, XsDoubleVal weight);
    public CtsQueryExpr elementValueQuery(XsQNameSeqVal elementName);
    public CtsQueryExpr elementValueQuery(XsQNameSeqVal elementName, String... text);
    public CtsQueryExpr elementValueQuery(XsQNameSeqVal elementName, XsStringSeqVal text);
    public CtsQueryExpr elementValueQuery(XsQNameSeqVal elementName, String text, String... options);
    public CtsQueryExpr elementValueQuery(XsQNameSeqVal elementName, XsStringSeqVal text, XsStringSeqVal options);
    public CtsQueryExpr elementValueQuery(XsQNameSeqVal elementName, String text, String options, double weight);
    public CtsQueryExpr elementValueQuery(XsQNameSeqVal elementName, XsStringSeqVal text, XsStringSeqVal options, XsDoubleVal weight);
    public CtsQueryExpr elementWordQuery(XsQNameSeqVal elementName, String... text);
    public CtsQueryExpr elementWordQuery(XsQNameSeqVal elementName, XsStringSeqVal text);
    public CtsQueryExpr elementWordQuery(XsQNameSeqVal elementName, String text, String... options);
    public CtsQueryExpr elementWordQuery(XsQNameSeqVal elementName, XsStringSeqVal text, XsStringSeqVal options);
    public CtsQueryExpr elementWordQuery(XsQNameSeqVal elementName, String text, String options, double weight);
    public CtsQueryExpr elementWordQuery(XsQNameSeqVal elementName, XsStringSeqVal text, XsStringSeqVal options, XsDoubleVal weight);
    public CtsQueryExpr falseQuery();
    public CtsQueryExpr fieldRangeQuery(String fieldName, String operator, XsAnyAtomicTypeVal... value);
    public CtsQueryExpr fieldRangeQuery(XsStringSeqVal fieldName, XsStringVal operator, XsAnyAtomicTypeSeqVal value);
    public CtsQueryExpr fieldRangeQuery(String fieldName, String operator, XsAnyAtomicTypeSeqVal value, String... options);
    public CtsQueryExpr fieldRangeQuery(XsStringSeqVal fieldName, XsStringVal operator, XsAnyAtomicTypeSeqVal value, XsStringSeqVal options);
    public CtsQueryExpr fieldRangeQuery(String fieldName, String operator, XsAnyAtomicTypeSeqVal value, String options, double weight);
    public CtsQueryExpr fieldRangeQuery(XsStringSeqVal fieldName, XsStringVal operator, XsAnyAtomicTypeSeqVal value, XsStringSeqVal options, XsDoubleVal weight);
    public CtsQueryExpr fieldValueQuery(String fieldName, XsAnyAtomicTypeVal... text);
    public CtsQueryExpr fieldValueQuery(XsStringSeqVal fieldName, XsAnyAtomicTypeSeqVal text);
    public CtsQueryExpr fieldValueQuery(String fieldName, XsAnyAtomicTypeSeqVal text, String... options);
    public CtsQueryExpr fieldValueQuery(XsStringSeqVal fieldName, XsAnyAtomicTypeSeqVal text, XsStringSeqVal options);
    public CtsQueryExpr fieldValueQuery(String fieldName, XsAnyAtomicTypeSeqVal text, String options, double weight);
    public CtsQueryExpr fieldValueQuery(XsStringSeqVal fieldName, XsAnyAtomicTypeSeqVal text, XsStringSeqVal options, XsDoubleVal weight);
    public CtsQueryExpr fieldWordQuery(String fieldName, String... text);
    public CtsQueryExpr fieldWordQuery(XsStringSeqVal fieldName, XsStringSeqVal text);
    public CtsQueryExpr fieldWordQuery(String fieldName, String text, String... options);
    public CtsQueryExpr fieldWordQuery(XsStringSeqVal fieldName, XsStringSeqVal text, XsStringSeqVal options);
    public CtsQueryExpr fieldWordQuery(String fieldName, String text, String options, double weight);
    public CtsQueryExpr fieldWordQuery(XsStringSeqVal fieldName, XsStringSeqVal text, XsStringSeqVal options, XsDoubleVal weight);
    public CtsQueryExpr jsonPropertyChildGeospatialQuery(String parentPropertyName, String childPropertyNames, CtsRegionExpr... regions);
    public CtsQueryExpr jsonPropertyChildGeospatialQuery(XsStringSeqVal parentPropertyName, XsStringSeqVal childPropertyNames, CtsRegionSeqExpr regions);
    public CtsQueryExpr jsonPropertyChildGeospatialQuery(String parentPropertyName, String childPropertyNames, CtsRegionSeqExpr regions, String... options);
    public CtsQueryExpr jsonPropertyChildGeospatialQuery(XsStringSeqVal parentPropertyName, XsStringSeqVal childPropertyNames, CtsRegionSeqExpr regions, XsStringSeqVal options);
    public CtsQueryExpr jsonPropertyChildGeospatialQuery(String parentPropertyName, String childPropertyNames, CtsRegionSeqExpr regions, String options, double weight);
    public CtsQueryExpr jsonPropertyChildGeospatialQuery(XsStringSeqVal parentPropertyName, XsStringSeqVal childPropertyNames, CtsRegionSeqExpr regions, XsStringSeqVal options, XsDoubleVal weight);
    public CtsQueryExpr jsonPropertyGeospatialQuery(String propertyName, CtsRegionExpr... regions);
    public CtsQueryExpr jsonPropertyGeospatialQuery(XsStringSeqVal propertyName, CtsRegionSeqExpr regions);
    public CtsQueryExpr jsonPropertyGeospatialQuery(String propertyName, CtsRegionSeqExpr regions, String... options);
    public CtsQueryExpr jsonPropertyGeospatialQuery(XsStringSeqVal propertyName, CtsRegionSeqExpr regions, XsStringSeqVal options);
    public CtsQueryExpr jsonPropertyGeospatialQuery(String propertyName, CtsRegionSeqExpr regions, String options, double weight);
    public CtsQueryExpr jsonPropertyGeospatialQuery(XsStringSeqVal propertyName, CtsRegionSeqExpr regions, XsStringSeqVal options, XsDoubleVal weight);
    public CtsQueryExpr jsonPropertyPairGeospatialQuery(String propertyName, String latitudePropertyNames, String longitudePropertyNames, CtsRegionExpr... regions);
    public CtsQueryExpr jsonPropertyPairGeospatialQuery(XsStringSeqVal propertyName, XsStringSeqVal latitudePropertyNames, XsStringSeqVal longitudePropertyNames, CtsRegionSeqExpr regions);
    public CtsQueryExpr jsonPropertyPairGeospatialQuery(String propertyName, String latitudePropertyNames, String longitudePropertyNames, CtsRegionSeqExpr regions, String... options);
    public CtsQueryExpr jsonPropertyPairGeospatialQuery(XsStringSeqVal propertyName, XsStringSeqVal latitudePropertyNames, XsStringSeqVal longitudePropertyNames, CtsRegionSeqExpr regions, XsStringSeqVal options);
    public CtsQueryExpr jsonPropertyPairGeospatialQuery(String propertyName, String latitudePropertyNames, String longitudePropertyNames, CtsRegionSeqExpr regions, String options, double weight);
    public CtsQueryExpr jsonPropertyPairGeospatialQuery(XsStringSeqVal propertyName, XsStringSeqVal latitudePropertyNames, XsStringSeqVal longitudePropertyNames, CtsRegionSeqExpr regions, XsStringSeqVal options, XsDoubleVal weight);
    public CtsQueryExpr jsonPropertyRangeQuery(String propertyName, String operator, XsAnyAtomicTypeVal... value);
    public CtsQueryExpr jsonPropertyRangeQuery(XsStringSeqVal propertyName, XsStringVal operator, XsAnyAtomicTypeSeqVal value);
    public CtsQueryExpr jsonPropertyRangeQuery(String propertyName, String operator, XsAnyAtomicTypeSeqVal value, String... options);
    public CtsQueryExpr jsonPropertyRangeQuery(XsStringSeqVal propertyName, XsStringVal operator, XsAnyAtomicTypeSeqVal value, XsStringSeqVal options);
    public CtsQueryExpr jsonPropertyRangeQuery(String propertyName, String operator, XsAnyAtomicTypeSeqVal value, String options, double weight);
    public CtsQueryExpr jsonPropertyRangeQuery(XsStringSeqVal propertyName, XsStringVal operator, XsAnyAtomicTypeSeqVal value, XsStringSeqVal options, XsDoubleVal weight);
    public CtsQueryExpr jsonPropertyScopeQuery(String propertyName, CtsQueryExpr query);
    public CtsQueryExpr jsonPropertyScopeQuery(XsStringSeqVal propertyName, CtsQueryExpr query);
    public CtsQueryExpr jsonPropertyValueQuery(String propertyName, XsAnyAtomicTypeVal... value);
    public CtsQueryExpr jsonPropertyValueQuery(XsStringSeqVal propertyName, XsAnyAtomicTypeSeqVal value);
    public CtsQueryExpr jsonPropertyValueQuery(String propertyName, XsAnyAtomicTypeSeqVal value, String... options);
    public CtsQueryExpr jsonPropertyValueQuery(XsStringSeqVal propertyName, XsAnyAtomicTypeSeqVal value, XsStringSeqVal options);
    public CtsQueryExpr jsonPropertyValueQuery(String propertyName, XsAnyAtomicTypeSeqVal value, String options, double weight);
    public CtsQueryExpr jsonPropertyValueQuery(XsStringSeqVal propertyName, XsAnyAtomicTypeSeqVal value, XsStringSeqVal options, XsDoubleVal weight);
    public CtsQueryExpr jsonPropertyWordQuery(String propertyName, String... text);
    public CtsQueryExpr jsonPropertyWordQuery(XsStringSeqVal propertyName, XsStringSeqVal text);
    public CtsQueryExpr jsonPropertyWordQuery(String propertyName, String text, String... options);
    public CtsQueryExpr jsonPropertyWordQuery(XsStringSeqVal propertyName, XsStringSeqVal text, XsStringSeqVal options);
    public CtsQueryExpr jsonPropertyWordQuery(String propertyName, String text, String options, double weight);
    public CtsQueryExpr jsonPropertyWordQuery(XsStringSeqVal propertyName, XsStringSeqVal text, XsStringSeqVal options, XsDoubleVal weight);
    public CtsQueryExpr locksFragmentQuery(CtsQueryExpr query);
    public CtsQueryExpr locksQuery(CtsQueryExpr arg1);
    public CtsQueryExpr lsqtQuery(String temporalCollection);
    public CtsQueryExpr lsqtQuery(XsStringVal temporalCollection);
    public CtsQueryExpr lsqtQuery(String temporalCollection, XsDateTimeVal timestamp);
    public CtsQueryExpr lsqtQuery(XsStringVal temporalCollection, XsDateTimeVal timestamp);
    public CtsQueryExpr lsqtQuery(String temporalCollection, XsDateTimeVal timestamp, String... options);
    public CtsQueryExpr lsqtQuery(XsStringVal temporalCollection, XsDateTimeVal timestamp, XsStringSeqVal options);
    public CtsQueryExpr lsqtQuery(String temporalCollection, XsDateTimeVal timestamp, String options, double weight);
    public CtsQueryExpr lsqtQuery(XsStringVal temporalCollection, XsDateTimeVal timestamp, XsStringSeqVal options, XsDoubleVal weight);
    public CtsQueryExpr nearQuery(CtsQueryExpr... queries);
    public CtsQueryExpr nearQuery(CtsQuerySeqExpr queries);
    public CtsQueryExpr nearQuery(CtsQuerySeqExpr queries, double distance);
    public CtsQueryExpr nearQuery(CtsQuerySeqExpr queries, XsDoubleVal distance);
    public CtsQueryExpr nearQuery(CtsQuerySeqExpr queries, double distance, String... options);
    public CtsQueryExpr nearQuery(CtsQuerySeqExpr queries, XsDoubleVal distance, XsStringSeqVal options);
    public CtsQueryExpr nearQuery(CtsQuerySeqExpr queries, double distance, String options, double distanceWeight);
    public CtsQueryExpr nearQuery(CtsQuerySeqExpr queries, XsDoubleVal distance, XsStringSeqVal options, XsDoubleVal distanceWeight);
    public CtsQueryExpr notInQuery(CtsQueryExpr positiveQuery, CtsQueryExpr negativeQuery);
    public CtsQueryExpr notQuery(CtsQueryExpr query);
    public CtsQueryExpr orQuery(CtsQueryExpr... queries);
    public CtsQueryExpr orQuery(CtsQuerySeqExpr queries);
    public CtsQueryExpr orQuery(CtsQuerySeqExpr queries, String... options);
    public CtsQueryExpr orQuery(CtsQuerySeqExpr queries, XsStringSeqVal options);
    public CtsQueryExpr pathGeospatialQuery(String pathExpression, CtsRegionExpr... regions);
    public CtsQueryExpr pathGeospatialQuery(XsStringSeqVal pathExpression, CtsRegionSeqExpr regions);
    public CtsQueryExpr pathGeospatialQuery(String pathExpression, CtsRegionSeqExpr regions, String... options);
    public CtsQueryExpr pathGeospatialQuery(XsStringSeqVal pathExpression, CtsRegionSeqExpr regions, XsStringSeqVal options);
    public CtsQueryExpr pathGeospatialQuery(String pathExpression, CtsRegionSeqExpr regions, String options, double weight);
    public CtsQueryExpr pathGeospatialQuery(XsStringSeqVal pathExpression, CtsRegionSeqExpr regions, XsStringSeqVal options, XsDoubleVal weight);
    public CtsQueryExpr pathRangeQuery(String pathExpression, String operator, XsAnyAtomicTypeVal... value);
    public CtsQueryExpr pathRangeQuery(XsStringSeqVal pathExpression, XsStringVal operator, XsAnyAtomicTypeSeqVal value);
    public CtsQueryExpr pathRangeQuery(String pathExpression, String operator, XsAnyAtomicTypeSeqVal value, String... options);
    public CtsQueryExpr pathRangeQuery(XsStringSeqVal pathExpression, XsStringVal operator, XsAnyAtomicTypeSeqVal value, XsStringSeqVal options);
    public CtsQueryExpr pathRangeQuery(String pathExpression, String operator, XsAnyAtomicTypeSeqVal value, String options, double weight);
    public CtsQueryExpr pathRangeQuery(XsStringSeqVal pathExpression, XsStringVal operator, XsAnyAtomicTypeSeqVal value, XsStringSeqVal options, XsDoubleVal weight);
    public CtsPeriodExpr period(XsDateTimeVal start);
    public CtsPeriodExpr period(XsDateTimeVal start, XsDateTimeVal end);
    public CtsQueryExpr periodCompareQuery(String axis1, String operator, String axis2);
    public CtsQueryExpr periodCompareQuery(XsStringVal axis1, XsStringVal operator, XsStringVal axis2);
    public CtsQueryExpr periodCompareQuery(String axis1, String operator, String axis2, String... options);
    public CtsQueryExpr periodCompareQuery(XsStringVal axis1, XsStringVal operator, XsStringVal axis2, XsStringSeqVal options);
    public CtsQueryExpr periodRangeQuery(String axisName, String operator);
    public CtsQueryExpr periodRangeQuery(XsStringSeqVal axisName, XsStringVal operator);
    public CtsQueryExpr periodRangeQuery(String axisName, String operator, CtsPeriodExpr... period);
    public CtsQueryExpr periodRangeQuery(XsStringSeqVal axisName, XsStringVal operator, CtsPeriodSeqExpr period);
    public CtsQueryExpr periodRangeQuery(String axisName, String operator, CtsPeriodSeqExpr period, String... options);
    public CtsQueryExpr periodRangeQuery(XsStringSeqVal axisName, XsStringVal operator, CtsPeriodSeqExpr period, XsStringSeqVal options);
    public CtsQueryExpr propertiesFragmentQuery(CtsQueryExpr query);
    public CtsQueryExpr propertiesQuery(CtsQueryExpr arg1);
    public CtsQueryExpr tripleRangeQuery(XsAnyAtomicTypeSeqVal subject, XsAnyAtomicTypeSeqVal predicate, XsAnyAtomicTypeSeqVal object);
    public CtsQueryExpr tripleRangeQuery(XsAnyAtomicTypeSeqVal subject, XsAnyAtomicTypeSeqVal predicate, XsAnyAtomicTypeSeqVal object, String... operator);
    public CtsQueryExpr tripleRangeQuery(XsAnyAtomicTypeSeqVal subject, XsAnyAtomicTypeSeqVal predicate, XsAnyAtomicTypeSeqVal object, XsStringSeqVal operator);
    public CtsQueryExpr tripleRangeQuery(XsAnyAtomicTypeSeqVal subject, XsAnyAtomicTypeSeqVal predicate, XsAnyAtomicTypeSeqVal object, String operator, String... options);
    public CtsQueryExpr tripleRangeQuery(XsAnyAtomicTypeSeqVal subject, XsAnyAtomicTypeSeqVal predicate, XsAnyAtomicTypeSeqVal object, XsStringSeqVal operator, XsStringSeqVal options);
    public CtsQueryExpr tripleRangeQuery(XsAnyAtomicTypeSeqVal subject, XsAnyAtomicTypeSeqVal predicate, XsAnyAtomicTypeSeqVal object, String operator, String options, double weight);
    public CtsQueryExpr tripleRangeQuery(XsAnyAtomicTypeSeqVal subject, XsAnyAtomicTypeSeqVal predicate, XsAnyAtomicTypeSeqVal object, XsStringSeqVal operator, XsStringSeqVal options, XsDoubleVal weight);
    public CtsQueryExpr trueQuery();
    public CtsQueryExpr wordQuery(String... text);
    public CtsQueryExpr wordQuery(XsStringSeqVal text);
    public CtsQueryExpr wordQuery(String text, String... options);
    public CtsQueryExpr wordQuery(XsStringSeqVal text, XsStringSeqVal options);
    public CtsQueryExpr wordQuery(String text, String options, double weight);
    public CtsQueryExpr wordQuery(XsStringSeqVal text, XsStringSeqVal options, XsDoubleVal weight);
    public CtsBoxExpr box(double south, double west, double north, double east);
    public CtsBoxExpr box(XsDoubleVal south, XsDoubleVal west, XsDoubleVal north, XsDoubleVal east);
    public CtsCircleExpr circle(double radius, CtsPointExpr center);
    public CtsCircleExpr circle(XsDoubleVal radius, CtsPointExpr center);
    public CtsPointExpr point(double latitude, double longitude);
    public CtsPointExpr point(XsDoubleVal latitude, XsDoubleVal longitude);
    public CtsPolygonExpr polygon(XsAnyAtomicTypeSeqVal vertices);
    public CtsReferenceExpr collectionReference();
    public CtsReferenceExpr collectionReference(String... options);
    public CtsReferenceExpr collectionReference(XsStringSeqVal options);
    public CtsReferenceExpr elementAttributeReference(XsQNameVal element, XsQNameVal attribute);
    public CtsReferenceExpr elementAttributeReference(XsQNameVal element, XsQNameVal attribute, String... options);
    public CtsReferenceExpr elementAttributeReference(XsQNameVal element, XsQNameVal attribute, XsStringSeqVal options);
    public CtsReferenceExpr elementReference(XsQNameVal element);
    public CtsReferenceExpr elementReference(XsQNameVal element, String... options);
    public CtsReferenceExpr elementReference(XsQNameVal element, XsStringSeqVal options);
    public CtsReferenceExpr fieldReference(String field);
    public CtsReferenceExpr fieldReference(XsStringVal field);
    public CtsReferenceExpr fieldReference(String field, String... options);
    public CtsReferenceExpr fieldReference(XsStringVal field, XsStringSeqVal options);
    public CtsReferenceExpr jsonPropertyReference(String property);
    public CtsReferenceExpr jsonPropertyReference(XsStringVal property);
    public CtsReferenceExpr jsonPropertyReference(String property, String... options);
    public CtsReferenceExpr jsonPropertyReference(XsStringVal property, XsStringSeqVal options);
    public CtsReferenceExpr pathReference(String pathExpression);
    public CtsReferenceExpr pathReference(XsStringVal pathExpression);
    public CtsReferenceExpr pathReference(String pathExpression, String... options);
    public CtsReferenceExpr pathReference(XsStringVal pathExpression, XsStringSeqVal options);
    public CtsReferenceExpr pathReference(String pathExpression, String options, MapMapExpr map);
    public CtsReferenceExpr pathReference(XsStringVal pathExpression, XsStringSeqVal options, MapMapExpr map);
    public CtsReferenceExpr uriReference();     public CtsBoxSeqExpr box(CtsBoxExpr... items);
     public CtsCircleSeqExpr circle(CtsCircleExpr... items);
     public CtsPeriodSeqExpr period(CtsPeriodExpr... items);
     public CtsPointSeqExpr point(CtsPointExpr... items);
     public CtsPolygonSeqExpr polygon(CtsPolygonExpr... items);
     public CtsQuerySeqExpr query(CtsQueryExpr... items);
     public CtsReferenceSeqExpr reference(CtsReferenceExpr... items);
     public CtsRegionSeqExpr region(CtsRegionExpr... items);

}
