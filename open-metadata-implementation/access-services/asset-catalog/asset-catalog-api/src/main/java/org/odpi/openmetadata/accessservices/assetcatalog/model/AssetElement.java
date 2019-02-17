/* SPDX-License-Identifier: Apache-2.0 */
/* Copyright Contributors to the ODPi Egeria project. */
package org.odpi.openmetadata.accessservices.assetcatalog.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.ArrayList;
import java.util.List;

import static com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE;
import static com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.PUBLIC_ONLY;

@JsonAutoDetect(getterVisibility = PUBLIC_ONLY, setterVisibility = PUBLIC_ONLY, fieldVisibility = NONE)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class AssetElement extends Element {

    private List<Element> subElements = new ArrayList<>();
    private List<Connection> connectionIds;

    public List<Element> getSubElements() {
        return subElements;
    }

    public void setSubElements(List<Element> subElements) {
        this.subElements = subElements;
    }

    public List<Connection> getConnectionIds() {
        return connectionIds;
    }

    public void setConnectionIds(List<Connection> connectionIds) {
        this.connectionIds = connectionIds;
    }
}