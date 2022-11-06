
package com.geekstack.demo.model;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "progress",
    "total"
})
@Generated("jsonschema2pojo")
public class Aggregateprogress {

    @JsonProperty("progress")
    private int progress;
    @JsonProperty("total")
    private int total;

    @JsonProperty("progress")
    public int getProgress() {
        return progress;
    }

    @JsonProperty("progress")
    public void setProgress(int progress) {
        this.progress = progress;
    }

    @JsonProperty("total")
    public int getTotal() {
        return total;
    }

    @JsonProperty("total")
    public void setTotal(int total) {
        this.total = total;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Aggregateprogress.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("progress");
        sb.append('=');
        sb.append(this.progress);
        sb.append(',');
        sb.append("total");
        sb.append('=');
        sb.append(this.total);
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
