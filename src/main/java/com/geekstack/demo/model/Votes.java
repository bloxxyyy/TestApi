
package com.geekstack.demo.model;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "self",
    "votes",
    "hasVoted"
})
@Generated("jsonschema2pojo")
public class Votes {

    @JsonProperty("self")
    private String self;
    @JsonProperty("votes")
    private int votes;
    @JsonProperty("hasVoted")
    private boolean hasVoted;

    @JsonProperty("self")
    public String getSelf() {
        return self;
    }

    @JsonProperty("self")
    public void setSelf(String self) {
        this.self = self;
    }

    @JsonProperty("votes")
    public int getVotes() {
        return votes;
    }

    @JsonProperty("votes")
    public void setVotes(int votes) {
        this.votes = votes;
    }

    @JsonProperty("hasVoted")
    public boolean isHasVoted() {
        return hasVoted;
    }

    @JsonProperty("hasVoted")
    public void setHasVoted(boolean hasVoted) {
        this.hasVoted = hasVoted;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Votes.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("self");
        sb.append('=');
        sb.append(((this.self == null)?"<null>":this.self));
        sb.append(',');
        sb.append("votes");
        sb.append('=');
        sb.append(this.votes);
        sb.append(',');
        sb.append("hasVoted");
        sb.append('=');
        sb.append(this.hasVoted);
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
