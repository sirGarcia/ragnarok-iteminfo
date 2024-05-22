
package com.alticelabs.ccp.exagon.divine_pride.model;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.ToString;

import javax.annotation.processing.Generated;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "classNum",
    "sets",
    "soldBy",
    "id",
    "name",
    "description",
    "slots",
    "setname",
    "itemTypeId",
    "itemSubTypeId",
    "itemSummonInfoContainedIn",
    "itemSummonInfoContains",
    "attack",
    "defense",
    "weight",
    "requiredLevel",
    "limitLevel",
    "itemLevel",
    "job",
    "compositionPos",
    "attribute",
    "location"
})

@Generated("jsonschema2pojo")
@ToString
public class DivinePrideItemResponse {

    @JsonProperty("classNum")
    private Integer classNum;
    @JsonProperty("sets")
    private List<Object> sets;
    @JsonProperty("soldBy")
    private List<Object> soldBy;
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("description")
    private String description;
    @JsonProperty("slots")
    private Integer slots;
    @JsonProperty("setname")
    private Object setname;
    @JsonProperty("itemTypeId")
    private Integer itemTypeId;
    @JsonProperty("itemSubTypeId")
    private Integer itemSubTypeId;
    @JsonProperty("itemSummonInfoContainedIn")
    private List<ItemSummonInfoContainedIn> itemSummonInfoContainedIn;
    @JsonProperty("itemSummonInfoContains")
    private List<Object> itemSummonInfoContains;
    @JsonProperty("attack")
    private Object attack;
    @JsonProperty("defense")
    private Integer defense;
    @JsonProperty("weight")
    private Integer weight;
    @JsonProperty("requiredLevel")
    private Object requiredLevel;
    @JsonProperty("limitLevel")
    private Object limitLevel;
    @JsonProperty("itemLevel")
    private Object itemLevel;
    @JsonProperty("job")
    private Integer job;
    @JsonProperty("compositionPos")
    private Object compositionPos;
    @JsonProperty("attribute")
    private Object attribute;
    @JsonProperty("location")
    private String location;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("classNum")
    public Integer getClassNum() {
        return classNum;
    }

    @JsonProperty("classNum")
    public void setClassNum(Integer classNum) {
        this.classNum = classNum;
    }

    @JsonProperty("sets")
    public List<Object> getSets() {
        return sets;
    }

    @JsonProperty("sets")
    public void setSets(List<Object> sets) {
        this.sets = sets;
    }

    @JsonProperty("soldBy")
    public List<Object> getSoldBy() {
        return soldBy;
    }

    @JsonProperty("soldBy")
    public void setSoldBy(List<Object> soldBy) {
        this.soldBy = soldBy;
    }

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("slots")
    public Integer getSlots() {
        return slots;
    }

    @JsonProperty("slots")
    public void setSlots(Integer slots) {
        this.slots = slots;
    }

    @JsonProperty("setname")
    public Object getSetname() {
        return setname;
    }

    @JsonProperty("setname")
    public void setSetname(Object setname) {
        this.setname = setname;
    }

    @JsonProperty("itemTypeId")
    public Integer getItemTypeId() {
        return itemTypeId;
    }

    @JsonProperty("itemTypeId")
    public void setItemTypeId(Integer itemTypeId) {
        this.itemTypeId = itemTypeId;
    }

    @JsonProperty("itemSubTypeId")
    public Integer getItemSubTypeId() {
        return itemSubTypeId;
    }

    @JsonProperty("itemSubTypeId")
    public void setItemSubTypeId(Integer itemSubTypeId) {
        this.itemSubTypeId = itemSubTypeId;
    }

    @JsonProperty("itemSummonInfoContainedIn")
    public List<ItemSummonInfoContainedIn> getItemSummonInfoContainedIn() {
        return itemSummonInfoContainedIn;
    }

    @JsonProperty("itemSummonInfoContainedIn")
    public void setItemSummonInfoContainedIn(List<ItemSummonInfoContainedIn> itemSummonInfoContainedIn) {
        this.itemSummonInfoContainedIn = itemSummonInfoContainedIn;
    }

    @JsonProperty("itemSummonInfoContains")
    public List<Object> getItemSummonInfoContains() {
        return itemSummonInfoContains;
    }

    @JsonProperty("itemSummonInfoContains")
    public void setItemSummonInfoContains(List<Object> itemSummonInfoContains) {
        this.itemSummonInfoContains = itemSummonInfoContains;
    }

    @JsonProperty("attack")
    public Object getAttack() {
        return attack;
    }

    @JsonProperty("attack")
    public void setAttack(Object attack) {
        this.attack = attack;
    }

    @JsonProperty("defense")
    public Integer getDefense() {
        return defense;
    }

    @JsonProperty("defense")
    public void setDefense(Integer defense) {
        this.defense = defense;
    }

    @JsonProperty("weight")
    public Integer getWeight() {
        return weight;
    }

    @JsonProperty("weight")
    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    @JsonProperty("requiredLevel")
    public Object getRequiredLevel() {
        return requiredLevel;
    }

    @JsonProperty("requiredLevel")
    public void setRequiredLevel(Object requiredLevel) {
        this.requiredLevel = requiredLevel;
    }

    @JsonProperty("limitLevel")
    public Object getLimitLevel() {
        return limitLevel;
    }

    @JsonProperty("limitLevel")
    public void setLimitLevel(Object limitLevel) {
        this.limitLevel = limitLevel;
    }

    @JsonProperty("itemLevel")
    public Object getItemLevel() {
        return itemLevel;
    }

    @JsonProperty("itemLevel")
    public void setItemLevel(Object itemLevel) {
        this.itemLevel = itemLevel;
    }

    @JsonProperty("job")
    public Integer getJob() {
        return job;
    }

    @JsonProperty("job")
    public void setJob(Integer job) {
        this.job = job;
    }

    @JsonProperty("compositionPos")
    public Object getCompositionPos() {
        return compositionPos;
    }

    @JsonProperty("compositionPos")
    public void setCompositionPos(Object compositionPos) {
        this.compositionPos = compositionPos;
    }

    @JsonProperty("attribute")
    public Object getAttribute() {
        return attribute;
    }

    @JsonProperty("attribute")
    public void setAttribute(Object attribute) {
        this.attribute = attribute;
    }

    @JsonProperty("location")
    public String getLocation() {
        return location;
    }

    @JsonProperty("location")
    public void setLocation(String location) {
        this.location = location;
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
