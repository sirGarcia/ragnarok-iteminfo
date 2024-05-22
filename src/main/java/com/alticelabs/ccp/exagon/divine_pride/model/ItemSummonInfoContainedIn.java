
package com.alticelabs.ccp.exagon.divine_pride.model;

import java.util.LinkedHashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.annotation.processing.Generated;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Type",
    "sourceId",
    "sourceName",
    "targetId",
    "targetName",
    "count",
    "totalOfSource",
    "summonType",
    "chance"
})
@Generated("jsonschema2pojo")
public class ItemSummonInfoContainedIn {

    @JsonProperty("Type")
    private Integer type;
    @JsonProperty("sourceId")
    private Integer sourceId;
    @JsonProperty("sourceName")
    private String sourceName;
    @JsonProperty("targetId")
    private Integer targetId;
    @JsonProperty("targetName")
    private String targetName;
    @JsonProperty("count")
    private Integer count;
    @JsonProperty("totalOfSource")
    private Integer totalOfSource;
    @JsonProperty("summonType")
    private Object summonType;
    @JsonProperty("chance")
    private Integer chance;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("Type")
    public Integer getType() {
        return type;
    }

    @JsonProperty("Type")
    public void setType(Integer type) {
        this.type = type;
    }

    @JsonProperty("sourceId")
    public Integer getSourceId() {
        return sourceId;
    }

    @JsonProperty("sourceId")
    public void setSourceId(Integer sourceId) {
        this.sourceId = sourceId;
    }

    @JsonProperty("sourceName")
    public String getSourceName() {
        return sourceName;
    }

    @JsonProperty("sourceName")
    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }

    @JsonProperty("targetId")
    public Integer getTargetId() {
        return targetId;
    }

    @JsonProperty("targetId")
    public void setTargetId(Integer targetId) {
        this.targetId = targetId;
    }

    @JsonProperty("targetName")
    public String getTargetName() {
        return targetName;
    }

    @JsonProperty("targetName")
    public void setTargetName(String targetName) {
        this.targetName = targetName;
    }

    @JsonProperty("count")
    public Integer getCount() {
        return count;
    }

    @JsonProperty("count")
    public void setCount(Integer count) {
        this.count = count;
    }

    @JsonProperty("totalOfSource")
    public Integer getTotalOfSource() {
        return totalOfSource;
    }

    @JsonProperty("totalOfSource")
    public void setTotalOfSource(Integer totalOfSource) {
        this.totalOfSource = totalOfSource;
    }

    @JsonProperty("summonType")
    public Object getSummonType() {
        return summonType;
    }

    @JsonProperty("summonType")
    public void setSummonType(Object summonType) {
        this.summonType = summonType;
    }

    @JsonProperty("chance")
    public Integer getChance() {
        return chance;
    }

    @JsonProperty("chance")
    public void setChance(Integer chance) {
        this.chance = chance;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
