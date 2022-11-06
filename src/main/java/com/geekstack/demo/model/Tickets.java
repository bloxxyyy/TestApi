
package com.geekstack.demo.model;

import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "expand",
    "startAt",
    "maxResults",
    "total",
    "issues"
})
@Generated("jsonschema2pojo")
public class Tickets {

    @JsonProperty("expand")
    private String expand;
    @JsonProperty("startAt")
    private int startAt;
    @JsonProperty("maxResults")
    private int maxResults;
    @JsonProperty("total")
    private int total;
    @JsonProperty("issues")
    private List<Issue> issues = null;

    @JsonProperty("expand")
    public String getExpand() {
        return expand;
    }

    @JsonProperty("expand")
    public void setExpand(String expand) {
        this.expand = expand;
    }

    @JsonProperty("startAt")
    public int getStartAt() {
        return startAt;
    }

    @JsonProperty("startAt")
    public void setStartAt(int startAt) {
        this.startAt = startAt;
    }

    @JsonProperty("maxResults")
    public int getMaxResults() {
        return maxResults;
    }

    @JsonProperty("maxResults")
    public void setMaxResults(int maxResults) {
        this.maxResults = maxResults;
    }

    @JsonProperty("total")
    public int getTotal() {
        return total;
    }

    @JsonProperty("total")
    public void setTotal(int total) {
        this.total = total;
    }

    @JsonProperty("issues")
    public List<Issue> getIssues() {
        return issues;
    }

    @JsonProperty("issues")
    public void setIssues(List<Issue> issues) {
        this.issues = issues;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Tickets.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("expand");
        sb.append('=');
        sb.append(((this.expand == null)?"<null>":this.expand));
        sb.append(',');
        sb.append("startAt");
        sb.append('=');
        sb.append(this.startAt);
        sb.append(',');
        sb.append("maxResults");
        sb.append('=');
        sb.append(this.maxResults);
        sb.append(',');
        sb.append("total");
        sb.append('=');
        sb.append(this.total);
        sb.append(',');
        sb.append("issues");
        sb.append('=');
        sb.append(((this.issues == null)?"<null>":this.issues));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
