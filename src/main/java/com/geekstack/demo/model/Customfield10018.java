
package com.geekstack.demo.model;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "hasEpicLinkFieldDependency",
    "showField",
    "nonEditableReason"
})
@Generated("jsonschema2pojo")
public class Customfield10018 {

    @JsonProperty("hasEpicLinkFieldDependency")
    private boolean hasEpicLinkFieldDependency;
    @JsonProperty("showField")
    private boolean showField;
    @JsonProperty("nonEditableReason")
    private NonEditableReason nonEditableReason;

    @JsonProperty("hasEpicLinkFieldDependency")
    public boolean isHasEpicLinkFieldDependency() {
        return hasEpicLinkFieldDependency;
    }

    @JsonProperty("hasEpicLinkFieldDependency")
    public void setHasEpicLinkFieldDependency(boolean hasEpicLinkFieldDependency) {
        this.hasEpicLinkFieldDependency = hasEpicLinkFieldDependency;
    }

    @JsonProperty("showField")
    public boolean isShowField() {
        return showField;
    }

    @JsonProperty("showField")
    public void setShowField(boolean showField) {
        this.showField = showField;
    }

    @JsonProperty("nonEditableReason")
    public NonEditableReason getNonEditableReason() {
        return nonEditableReason;
    }

    @JsonProperty("nonEditableReason")
    public void setNonEditableReason(NonEditableReason nonEditableReason) {
        this.nonEditableReason = nonEditableReason;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Customfield10018 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("hasEpicLinkFieldDependency");
        sb.append('=');
        sb.append(this.hasEpicLinkFieldDependency);
        sb.append(',');
        sb.append("showField");
        sb.append('=');
        sb.append(this.showField);
        sb.append(',');
        sb.append("nonEditableReason");
        sb.append('=');
        sb.append(((this.nonEditableReason == null)?"<null>":this.nonEditableReason));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
