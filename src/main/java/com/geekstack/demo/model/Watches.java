
package com.geekstack.demo.model;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "self",
    "watchCount",
    "isWatching"
})
@Generated("jsonschema2pojo")
public class Watches {

    @JsonProperty("self")
    private String self;
    @JsonProperty("watchCount")
    private int watchCount;
    @JsonProperty("isWatching")
    private boolean isWatching;

    @JsonProperty("self")
    public String getSelf() {
        return self;
    }

    @JsonProperty("self")
    public void setSelf(String self) {
        this.self = self;
    }

    @JsonProperty("watchCount")
    public int getWatchCount() {
        return watchCount;
    }

    @JsonProperty("watchCount")
    public void setWatchCount(int watchCount) {
        this.watchCount = watchCount;
    }

    @JsonProperty("isWatching")
    public boolean isIsWatching() {
        return isWatching;
    }

    @JsonProperty("isWatching")
    public void setIsWatching(boolean isWatching) {
        this.isWatching = isWatching;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Watches.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("self");
        sb.append('=');
        sb.append(((this.self == null)?"<null>":this.self));
        sb.append(',');
        sb.append("watchCount");
        sb.append('=');
        sb.append(this.watchCount);
        sb.append(',');
        sb.append("isWatching");
        sb.append('=');
        sb.append(this.isWatching);
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
