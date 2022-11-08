
package com.geekstack.demo.model.tempo;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "self",
    "tempoWorklogId",
    "issue",
    "timeSpentSeconds",
    "billableSeconds",
    "startDate",
    "startTime",
    "description",
    "createdAt",
    "updatedAt",
    "author",
    "attributes"
})
@Generated("jsonschema2pojo")
public class Result {

    @JsonProperty("self")
    private String self;
    @JsonProperty("tempoWorklogId")
    private int tempoWorklogId;
    @JsonProperty("issue")
    private Issue issue;
    @JsonProperty("timeSpentSeconds")
    private int timeSpentSeconds;
    @JsonProperty("billableSeconds")
    private int billableSeconds;
    @JsonProperty("startDate")
    private String startDate;
    @JsonProperty("startTime")
    private String startTime;
    @JsonProperty("description")
    private String description;
    @JsonProperty("createdAt")
    private String createdAt;
    @JsonProperty("updatedAt")
    private String updatedAt;
    @JsonProperty("author")
    private Author author;
    @JsonProperty("attributes")
    private Attributes attributes;

    @JsonProperty("self")
    public String getSelf() {
        return self;
    }

    @JsonProperty("self")
    public void setSelf(String self) {
        this.self = self;
    }

    @JsonProperty("tempoWorklogId")
    public int getTempoWorklogId() {
        return tempoWorklogId;
    }

    @JsonProperty("tempoWorklogId")
    public void setTempoWorklogId(int tempoWorklogId) {
        this.tempoWorklogId = tempoWorklogId;
    }

    @JsonProperty("issue")
    public Issue getIssue() {
        return issue;
    }

    @JsonProperty("issue")
    public void setIssue(Issue issue) {
        this.issue = issue;
    }

    @JsonProperty("timeSpentSeconds")
    public int getTimeSpentSeconds() {
        return timeSpentSeconds;
    }

    @JsonProperty("timeSpentSeconds")
    public void setTimeSpentSeconds(int timeSpentSeconds) {
        this.timeSpentSeconds = timeSpentSeconds;
    }

    @JsonProperty("billableSeconds")
    public int getBillableSeconds() {
        return billableSeconds;
    }

    @JsonProperty("billableSeconds")
    public void setBillableSeconds(int billableSeconds) {
        this.billableSeconds = billableSeconds;
    }

    @JsonProperty("startDate")
    public String getStartDate() {
        return startDate;
    }

    @JsonProperty("startDate")
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    @JsonProperty("startTime")
    public String getStartTime() {
        return startTime;
    }

    @JsonProperty("startTime")
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("createdAt")
    public String getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("createdAt")
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    @JsonProperty("updatedAt")
    public String getUpdatedAt() {
        return updatedAt;
    }

    @JsonProperty("updatedAt")
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    @JsonProperty("author")
    public Author getAuthor() {
        return author;
    }

    @JsonProperty("author")
    public void setAuthor(Author author) {
        this.author = author;
    }

    @JsonProperty("attributes")
    public Attributes getAttributes() {
        return attributes;
    }

    @JsonProperty("attributes")
    public void setAttributes(Attributes attributes) {
        this.attributes = attributes;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Result.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("self");
        sb.append('=');
        sb.append(((this.self == null)?"<null>":this.self));
        sb.append(',');
        sb.append("tempoWorklogId");
        sb.append('=');
        sb.append(this.tempoWorklogId);
        sb.append(',');
        sb.append("issue");
        sb.append('=');
        sb.append(((this.issue == null)?"<null>":this.issue));
        sb.append(',');
        sb.append("timeSpentSeconds");
        sb.append('=');
        sb.append(this.timeSpentSeconds);
        sb.append(',');
        sb.append("billableSeconds");
        sb.append('=');
        sb.append(this.billableSeconds);
        sb.append(',');
        sb.append("startDate");
        sb.append('=');
        sb.append(((this.startDate == null)?"<null>":this.startDate));
        sb.append(',');
        sb.append("startTime");
        sb.append('=');
        sb.append(((this.startTime == null)?"<null>":this.startTime));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("createdAt");
        sb.append('=');
        sb.append(((this.createdAt == null)?"<null>":this.createdAt));
        sb.append(',');
        sb.append("updatedAt");
        sb.append('=');
        sb.append(((this.updatedAt == null)?"<null>":this.updatedAt));
        sb.append(',');
        sb.append("author");
        sb.append('=');
        sb.append(((this.author == null)?"<null>":this.author));
        sb.append(',');
        sb.append("attributes");
        sb.append('=');
        sb.append(((this.attributes == null)?"<null>":this.attributes));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
