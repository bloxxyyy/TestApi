
package com.geekstack.demo.model;

import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "statuscategorychangedate",
    "issuetype",
    "timespent",
    "project",
    "fixVersions",
    "aggregatetimespent",
    "resolution",
    "customfield_10027",
    "customfield_10028",
    "customfield_10029",
    "resolutiondate",
    "workratio",
    "lastViewed",
    "watches",
    "created",
    "customfield_10020",
    "customfield_10021",
    "customfield_10022",
    "customfield_10023",
    "priority",
    "customfield_10024",
    "customfield_10025",
    "customfield_10026",
    "labels",
    "customfield_10016",
    "customfield_10017",
    "customfield_10018",
    "customfield_10019",
    "timeestimate",
    "aggregatetimeoriginalestimate",
    "versions",
    "issuelinks",
    "assignee",
    "updated",
    "status",
    "components",
    "timeoriginalestimate",
    "description",
    "customfield_10010",
    "customfield_10014",
    "customfield_10015",
    "customfield_10005",
    "customfield_10006",
    "security",
    "customfield_10007",
    "customfield_10008",
    "aggregatetimeestimate",
    "customfield_10009",
    "summary",
    "creator",
    "subtasks",
    "reporter",
    "aggregateprogress",
    "customfield_10001",
    "customfield_10002",
    "customfield_10003",
    "customfield_10004",
    "environment",
    "duedate",
    "progress",
    "votes"
})
@Generated("jsonschema2pojo")
public class Fields {

    @JsonProperty("statuscategorychangedate")
    private String statuscategorychangedate;
    @JsonProperty("issuetype")
    private Issuetype issuetype;
    @JsonProperty("timespent")
    private Object timespent;
    @JsonProperty("project")
    private Project project;
    @JsonProperty("fixVersions")
    private List<Object> fixVersions = null;
    @JsonProperty("aggregatetimespent")
    private Object aggregatetimespent;
    @JsonProperty("resolution")
    private Object resolution;
    @JsonProperty("customfield_10027")
    private Object customfield10027;
    @JsonProperty("customfield_10028")
    private Object customfield10028;
    @JsonProperty("customfield_10029")
    private Object customfield10029;
    @JsonProperty("resolutiondate")
    private Object resolutiondate;
    @JsonProperty("workratio")
    private int workratio;
    @JsonProperty("lastViewed")
    private String lastViewed;
    @JsonProperty("watches")
    private Watches watches;
    @JsonProperty("created")
    private String created;
    @JsonProperty("customfield_10020")
    private List<Customfield10020> customfield10020 = null;
    @JsonProperty("customfield_10021")
    private Object customfield10021;
    @JsonProperty("customfield_10022")
    private Object customfield10022;
    @JsonProperty("customfield_10023")
    private Object customfield10023;
    @JsonProperty("priority")
    private Priority priority;
    @JsonProperty("customfield_10024")
    private Object customfield10024;
    @JsonProperty("customfield_10025")
    private Object customfield10025;
    @JsonProperty("customfield_10026")
    private Object customfield10026;
    @JsonProperty("labels")
    private List<Object> labels = null;
    @JsonProperty("customfield_10016")
    private Object customfield10016;
    @JsonProperty("customfield_10017")
    private Object customfield10017;
    @JsonProperty("customfield_10018")
    private Customfield10018 customfield10018;
    @JsonProperty("customfield_10019")
    private String customfield10019;
    @JsonProperty("timeestimate")
    private Object timeestimate;
    @JsonProperty("aggregatetimeoriginalestimate")
    private Object aggregatetimeoriginalestimate;
    @JsonProperty("versions")
    private List<Object> versions = null;
    @JsonProperty("issuelinks")
    private List<Object> issuelinks = null;
    @JsonProperty("assignee")
    private Assignee assignee;
    @JsonProperty("updated")
    private String updated;
    @JsonProperty("status")
    private Status status;
    @JsonProperty("components")
    private List<Object> components = null;
    @JsonProperty("timeoriginalestimate")
    private Object timeoriginalestimate;
    @JsonProperty("description")
    private Object description;
    @JsonProperty("customfield_10010")
    private Object customfield10010;
    @JsonProperty("customfield_10014")
    private Object customfield10014;
    @JsonProperty("customfield_10015")
    private Object customfield10015;
    @JsonProperty("customfield_10005")
    private Object customfield10005;
    @JsonProperty("customfield_10006")
    private Object customfield10006;
    @JsonProperty("security")
    private Object security;
    @JsonProperty("customfield_10007")
    private Object customfield10007;
    @JsonProperty("customfield_10008")
    private Object customfield10008;
    @JsonProperty("aggregatetimeestimate")
    private Object aggregatetimeestimate;
    @JsonProperty("customfield_10009")
    private Object customfield10009;
    @JsonProperty("summary")
    private String summary;
    @JsonProperty("creator")
    private Creator creator;
    @JsonProperty("subtasks")
    private List<Object> subtasks = null;
    @JsonProperty("reporter")
    private Reporter reporter;
    @JsonProperty("aggregateprogress")
    private Aggregateprogress aggregateprogress;
    @JsonProperty("customfield_10001")
    private Object customfield10001;
    @JsonProperty("customfield_10002")
    private Object customfield10002;
    @JsonProperty("customfield_10003")
    private Object customfield10003;
    @JsonProperty("customfield_10004")
    private Object customfield10004;
    @JsonProperty("environment")
    private Object environment;
    @JsonProperty("duedate")
    private Object duedate;
    @JsonProperty("progress")
    private Progress progress;
    @JsonProperty("votes")
    private Votes votes;

    @JsonProperty("statuscategorychangedate")
    public String getStatuscategorychangedate() {
        return statuscategorychangedate;
    }

    @JsonProperty("statuscategorychangedate")
    public void setStatuscategorychangedate(String statuscategorychangedate) {
        this.statuscategorychangedate = statuscategorychangedate;
    }

    @JsonProperty("issuetype")
    public Issuetype getIssuetype() {
        return issuetype;
    }

    @JsonProperty("issuetype")
    public void setIssuetype(Issuetype issuetype) {
        this.issuetype = issuetype;
    }

    @JsonProperty("timespent")
    public Object getTimespent() {
        return timespent;
    }

    @JsonProperty("timespent")
    public void setTimespent(Object timespent) {
        this.timespent = timespent;
    }

    @JsonProperty("project")
    public Project getProject() {
        return project;
    }

    @JsonProperty("project")
    public void setProject(Project project) {
        this.project = project;
    }

    @JsonProperty("fixVersions")
    public List<Object> getFixVersions() {
        return fixVersions;
    }

    @JsonProperty("fixVersions")
    public void setFixVersions(List<Object> fixVersions) {
        this.fixVersions = fixVersions;
    }

    @JsonProperty("aggregatetimespent")
    public Object getAggregatetimespent() {
        return aggregatetimespent;
    }

    @JsonProperty("aggregatetimespent")
    public void setAggregatetimespent(Object aggregatetimespent) {
        this.aggregatetimespent = aggregatetimespent;
    }

    @JsonProperty("resolution")
    public Object getResolution() {
        return resolution;
    }

    @JsonProperty("resolution")
    public void setResolution(Object resolution) {
        this.resolution = resolution;
    }

    @JsonProperty("customfield_10027")
    public Object getCustomfield10027() {
        return customfield10027;
    }

    @JsonProperty("customfield_10027")
    public void setCustomfield10027(Object customfield10027) {
        this.customfield10027 = customfield10027;
    }

    @JsonProperty("customfield_10028")
    public Object getCustomfield10028() {
        return customfield10028;
    }

    @JsonProperty("customfield_10028")
    public void setCustomfield10028(Object customfield10028) {
        this.customfield10028 = customfield10028;
    }

    @JsonProperty("customfield_10029")
    public Object getCustomfield10029() {
        return customfield10029;
    }

    @JsonProperty("customfield_10029")
    public void setCustomfield10029(Object customfield10029) {
        this.customfield10029 = customfield10029;
    }

    @JsonProperty("resolutiondate")
    public Object getResolutiondate() {
        return resolutiondate;
    }

    @JsonProperty("resolutiondate")
    public void setResolutiondate(Object resolutiondate) {
        this.resolutiondate = resolutiondate;
    }

    @JsonProperty("workratio")
    public int getWorkratio() {
        return workratio;
    }

    @JsonProperty("workratio")
    public void setWorkratio(int workratio) {
        this.workratio = workratio;
    }

    @JsonProperty("lastViewed")
    public String getLastViewed() {
        return lastViewed;
    }

    @JsonProperty("lastViewed")
    public void setLastViewed(String lastViewed) {
        this.lastViewed = lastViewed;
    }

    @JsonProperty("watches")
    public Watches getWatches() {
        return watches;
    }

    @JsonProperty("watches")
    public void setWatches(Watches watches) {
        this.watches = watches;
    }

    @JsonProperty("created")
    public String getCreated() {
        return created;
    }

    @JsonProperty("created")
    public void setCreated(String created) {
        this.created = created;
    }

    @JsonProperty("customfield_10020")
    public List<Customfield10020> getCustomfield10020() {
        return customfield10020;
    }

    @JsonProperty("customfield_10020")
    public void setCustomfield10020(List<Customfield10020> customfield10020) {
        this.customfield10020 = customfield10020;
    }

    @JsonProperty("customfield_10021")
    public Object getCustomfield10021() {
        return customfield10021;
    }

    @JsonProperty("customfield_10021")
    public void setCustomfield10021(Object customfield10021) {
        this.customfield10021 = customfield10021;
    }

    @JsonProperty("customfield_10022")
    public Object getCustomfield10022() {
        return customfield10022;
    }

    @JsonProperty("customfield_10022")
    public void setCustomfield10022(Object customfield10022) {
        this.customfield10022 = customfield10022;
    }

    @JsonProperty("customfield_10023")
    public Object getCustomfield10023() {
        return customfield10023;
    }

    @JsonProperty("customfield_10023")
    public void setCustomfield10023(Object customfield10023) {
        this.customfield10023 = customfield10023;
    }

    @JsonProperty("priority")
    public Priority getPriority() {
        return priority;
    }

    @JsonProperty("priority")
    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    @JsonProperty("customfield_10024")
    public Object getCustomfield10024() {
        return customfield10024;
    }

    @JsonProperty("customfield_10024")
    public void setCustomfield10024(Object customfield10024) {
        this.customfield10024 = customfield10024;
    }

    @JsonProperty("customfield_10025")
    public Object getCustomfield10025() {
        return customfield10025;
    }

    @JsonProperty("customfield_10025")
    public void setCustomfield10025(Object customfield10025) {
        this.customfield10025 = customfield10025;
    }

    @JsonProperty("customfield_10026")
    public Object getCustomfield10026() {
        return customfield10026;
    }

    @JsonProperty("customfield_10026")
    public void setCustomfield10026(Object customfield10026) {
        this.customfield10026 = customfield10026;
    }

    @JsonProperty("labels")
    public List<Object> getLabels() {
        return labels;
    }

    @JsonProperty("labels")
    public void setLabels(List<Object> labels) {
        this.labels = labels;
    }

    @JsonProperty("customfield_10016")
    public Object getCustomfield10016() {
        return customfield10016;
    }

    @JsonProperty("customfield_10016")
    public void setCustomfield10016(Object customfield10016) {
        this.customfield10016 = customfield10016;
    }

    @JsonProperty("customfield_10017")
    public Object getCustomfield10017() {
        return customfield10017;
    }

    @JsonProperty("customfield_10017")
    public void setCustomfield10017(Object customfield10017) {
        this.customfield10017 = customfield10017;
    }

    @JsonProperty("customfield_10018")
    public Customfield10018 getCustomfield10018() {
        return customfield10018;
    }

    @JsonProperty("customfield_10018")
    public void setCustomfield10018(Customfield10018 customfield10018) {
        this.customfield10018 = customfield10018;
    }

    @JsonProperty("customfield_10019")
    public String getCustomfield10019() {
        return customfield10019;
    }

    @JsonProperty("customfield_10019")
    public void setCustomfield10019(String customfield10019) {
        this.customfield10019 = customfield10019;
    }

    @JsonProperty("timeestimate")
    public Object getTimeestimate() {
        return timeestimate;
    }

    @JsonProperty("timeestimate")
    public void setTimeestimate(Object timeestimate) {
        this.timeestimate = timeestimate;
    }

    @JsonProperty("aggregatetimeoriginalestimate")
    public Object getAggregatetimeoriginalestimate() {
        return aggregatetimeoriginalestimate;
    }

    @JsonProperty("aggregatetimeoriginalestimate")
    public void setAggregatetimeoriginalestimate(Object aggregatetimeoriginalestimate) {
        this.aggregatetimeoriginalestimate = aggregatetimeoriginalestimate;
    }

    @JsonProperty("versions")
    public List<Object> getVersions() {
        return versions;
    }

    @JsonProperty("versions")
    public void setVersions(List<Object> versions) {
        this.versions = versions;
    }

    @JsonProperty("issuelinks")
    public List<Object> getIssuelinks() {
        return issuelinks;
    }

    @JsonProperty("issuelinks")
    public void setIssuelinks(List<Object> issuelinks) {
        this.issuelinks = issuelinks;
    }

    @JsonProperty("assignee")
    public Assignee getAssignee() {
        return assignee;
    }

    @JsonProperty("assignee")
    public void setAssignee(Assignee assignee) {
        this.assignee = assignee;
    }

    @JsonProperty("updated")
    public String getUpdated() {
        return updated;
    }

    @JsonProperty("updated")
    public void setUpdated(String updated) {
        this.updated = updated;
    }

    @JsonProperty("status")
    public Status getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(Status status) {
        this.status = status;
    }

    @JsonProperty("components")
    public List<Object> getComponents() {
        return components;
    }

    @JsonProperty("components")
    public void setComponents(List<Object> components) {
        this.components = components;
    }

    @JsonProperty("timeoriginalestimate")
    public Object getTimeoriginalestimate() {
        return timeoriginalestimate;
    }

    @JsonProperty("timeoriginalestimate")
    public void setTimeoriginalestimate(Object timeoriginalestimate) {
        this.timeoriginalestimate = timeoriginalestimate;
    }

    @JsonProperty("description")
    public Object getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(Object description) {
        this.description = description;
    }

    @JsonProperty("customfield_10010")
    public Object getCustomfield10010() {
        return customfield10010;
    }

    @JsonProperty("customfield_10010")
    public void setCustomfield10010(Object customfield10010) {
        this.customfield10010 = customfield10010;
    }

    @JsonProperty("customfield_10014")
    public Object getCustomfield10014() {
        return customfield10014;
    }

    @JsonProperty("customfield_10014")
    public void setCustomfield10014(Object customfield10014) {
        this.customfield10014 = customfield10014;
    }

    @JsonProperty("customfield_10015")
    public Object getCustomfield10015() {
        return customfield10015;
    }

    @JsonProperty("customfield_10015")
    public void setCustomfield10015(Object customfield10015) {
        this.customfield10015 = customfield10015;
    }

    @JsonProperty("customfield_10005")
    public Object getCustomfield10005() {
        return customfield10005;
    }

    @JsonProperty("customfield_10005")
    public void setCustomfield10005(Object customfield10005) {
        this.customfield10005 = customfield10005;
    }

    @JsonProperty("customfield_10006")
    public Object getCustomfield10006() {
        return customfield10006;
    }

    @JsonProperty("customfield_10006")
    public void setCustomfield10006(Object customfield10006) {
        this.customfield10006 = customfield10006;
    }

    @JsonProperty("security")
    public Object getSecurity() {
        return security;
    }

    @JsonProperty("security")
    public void setSecurity(Object security) {
        this.security = security;
    }

    @JsonProperty("customfield_10007")
    public Object getCustomfield10007() {
        return customfield10007;
    }

    @JsonProperty("customfield_10007")
    public void setCustomfield10007(Object customfield10007) {
        this.customfield10007 = customfield10007;
    }

    @JsonProperty("customfield_10008")
    public Object getCustomfield10008() {
        return customfield10008;
    }

    @JsonProperty("customfield_10008")
    public void setCustomfield10008(Object customfield10008) {
        this.customfield10008 = customfield10008;
    }

    @JsonProperty("aggregatetimeestimate")
    public Object getAggregatetimeestimate() {
        return aggregatetimeestimate;
    }

    @JsonProperty("aggregatetimeestimate")
    public void setAggregatetimeestimate(Object aggregatetimeestimate) {
        this.aggregatetimeestimate = aggregatetimeestimate;
    }

    @JsonProperty("customfield_10009")
    public Object getCustomfield10009() {
        return customfield10009;
    }

    @JsonProperty("customfield_10009")
    public void setCustomfield10009(Object customfield10009) {
        this.customfield10009 = customfield10009;
    }

    @JsonProperty("summary")
    public String getSummary() {
        return summary;
    }

    @JsonProperty("summary")
    public void setSummary(String summary) {
        this.summary = summary;
    }

    @JsonProperty("creator")
    public Creator getCreator() {
        return creator;
    }

    @JsonProperty("creator")
    public void setCreator(Creator creator) {
        this.creator = creator;
    }

    @JsonProperty("subtasks")
    public List<Object> getSubtasks() {
        return subtasks;
    }

    @JsonProperty("subtasks")
    public void setSubtasks(List<Object> subtasks) {
        this.subtasks = subtasks;
    }

    @JsonProperty("reporter")
    public Reporter getReporter() {
        return reporter;
    }

    @JsonProperty("reporter")
    public void setReporter(Reporter reporter) {
        this.reporter = reporter;
    }

    @JsonProperty("aggregateprogress")
    public Aggregateprogress getAggregateprogress() {
        return aggregateprogress;
    }

    @JsonProperty("aggregateprogress")
    public void setAggregateprogress(Aggregateprogress aggregateprogress) {
        this.aggregateprogress = aggregateprogress;
    }

    @JsonProperty("customfield_10001")
    public Object getCustomfield10001() {
        return customfield10001;
    }

    @JsonProperty("customfield_10001")
    public void setCustomfield10001(Object customfield10001) {
        this.customfield10001 = customfield10001;
    }

    @JsonProperty("customfield_10002")
    public Object getCustomfield10002() {
        return customfield10002;
    }

    @JsonProperty("customfield_10002")
    public void setCustomfield10002(Object customfield10002) {
        this.customfield10002 = customfield10002;
    }

    @JsonProperty("customfield_10003")
    public Object getCustomfield10003() {
        return customfield10003;
    }

    @JsonProperty("customfield_10003")
    public void setCustomfield10003(Object customfield10003) {
        this.customfield10003 = customfield10003;
    }

    @JsonProperty("customfield_10004")
    public Object getCustomfield10004() {
        return customfield10004;
    }

    @JsonProperty("customfield_10004")
    public void setCustomfield10004(Object customfield10004) {
        this.customfield10004 = customfield10004;
    }

    @JsonProperty("environment")
    public Object getEnvironment() {
        return environment;
    }

    @JsonProperty("environment")
    public void setEnvironment(Object environment) {
        this.environment = environment;
    }

    @JsonProperty("duedate")
    public Object getDuedate() {
        return duedate;
    }

    @JsonProperty("duedate")
    public void setDuedate(Object duedate) {
        this.duedate = duedate;
    }

    @JsonProperty("progress")
    public Progress getProgress() {
        return progress;
    }

    @JsonProperty("progress")
    public void setProgress(Progress progress) {
        this.progress = progress;
    }

    @JsonProperty("votes")
    public Votes getVotes() {
        return votes;
    }

    @JsonProperty("votes")
    public void setVotes(Votes votes) {
        this.votes = votes;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Fields.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("statuscategorychangedate");
        sb.append('=');
        sb.append(((this.statuscategorychangedate == null)?"<null>":this.statuscategorychangedate));
        sb.append(',');
        sb.append("issuetype");
        sb.append('=');
        sb.append(((this.issuetype == null)?"<null>":this.issuetype));
        sb.append(',');
        sb.append("timespent");
        sb.append('=');
        sb.append(((this.timespent == null)?"<null>":this.timespent));
        sb.append(',');
        sb.append("project");
        sb.append('=');
        sb.append(((this.project == null)?"<null>":this.project));
        sb.append(',');
        sb.append("fixVersions");
        sb.append('=');
        sb.append(((this.fixVersions == null)?"<null>":this.fixVersions));
        sb.append(',');
        sb.append("aggregatetimespent");
        sb.append('=');
        sb.append(((this.aggregatetimespent == null)?"<null>":this.aggregatetimespent));
        sb.append(',');
        sb.append("resolution");
        sb.append('=');
        sb.append(((this.resolution == null)?"<null>":this.resolution));
        sb.append(',');
        sb.append("customfield10027");
        sb.append('=');
        sb.append(((this.customfield10027 == null)?"<null>":this.customfield10027));
        sb.append(',');
        sb.append("customfield10028");
        sb.append('=');
        sb.append(((this.customfield10028 == null)?"<null>":this.customfield10028));
        sb.append(',');
        sb.append("customfield10029");
        sb.append('=');
        sb.append(((this.customfield10029 == null)?"<null>":this.customfield10029));
        sb.append(',');
        sb.append("resolutiondate");
        sb.append('=');
        sb.append(((this.resolutiondate == null)?"<null>":this.resolutiondate));
        sb.append(',');
        sb.append("workratio");
        sb.append('=');
        sb.append(this.workratio);
        sb.append(',');
        sb.append("lastViewed");
        sb.append('=');
        sb.append(((this.lastViewed == null)?"<null>":this.lastViewed));
        sb.append(',');
        sb.append("watches");
        sb.append('=');
        sb.append(((this.watches == null)?"<null>":this.watches));
        sb.append(',');
        sb.append("created");
        sb.append('=');
        sb.append(((this.created == null)?"<null>":this.created));
        sb.append(',');
        sb.append("customfield10020");
        sb.append('=');
        sb.append(((this.customfield10020 == null)?"<null>":this.customfield10020));
        sb.append(',');
        sb.append("customfield10021");
        sb.append('=');
        sb.append(((this.customfield10021 == null)?"<null>":this.customfield10021));
        sb.append(',');
        sb.append("customfield10022");
        sb.append('=');
        sb.append(((this.customfield10022 == null)?"<null>":this.customfield10022));
        sb.append(',');
        sb.append("customfield10023");
        sb.append('=');
        sb.append(((this.customfield10023 == null)?"<null>":this.customfield10023));
        sb.append(',');
        sb.append("priority");
        sb.append('=');
        sb.append(((this.priority == null)?"<null>":this.priority));
        sb.append(',');
        sb.append("customfield10024");
        sb.append('=');
        sb.append(((this.customfield10024 == null)?"<null>":this.customfield10024));
        sb.append(',');
        sb.append("customfield10025");
        sb.append('=');
        sb.append(((this.customfield10025 == null)?"<null>":this.customfield10025));
        sb.append(',');
        sb.append("customfield10026");
        sb.append('=');
        sb.append(((this.customfield10026 == null)?"<null>":this.customfield10026));
        sb.append(',');
        sb.append("labels");
        sb.append('=');
        sb.append(((this.labels == null)?"<null>":this.labels));
        sb.append(',');
        sb.append("customfield10016");
        sb.append('=');
        sb.append(((this.customfield10016 == null)?"<null>":this.customfield10016));
        sb.append(',');
        sb.append("customfield10017");
        sb.append('=');
        sb.append(((this.customfield10017 == null)?"<null>":this.customfield10017));
        sb.append(',');
        sb.append("customfield10018");
        sb.append('=');
        sb.append(((this.customfield10018 == null)?"<null>":this.customfield10018));
        sb.append(',');
        sb.append("customfield10019");
        sb.append('=');
        sb.append(((this.customfield10019 == null)?"<null>":this.customfield10019));
        sb.append(',');
        sb.append("timeestimate");
        sb.append('=');
        sb.append(((this.timeestimate == null)?"<null>":this.timeestimate));
        sb.append(',');
        sb.append("aggregatetimeoriginalestimate");
        sb.append('=');
        sb.append(((this.aggregatetimeoriginalestimate == null)?"<null>":this.aggregatetimeoriginalestimate));
        sb.append(',');
        sb.append("versions");
        sb.append('=');
        sb.append(((this.versions == null)?"<null>":this.versions));
        sb.append(',');
        sb.append("issuelinks");
        sb.append('=');
        sb.append(((this.issuelinks == null)?"<null>":this.issuelinks));
        sb.append(',');
        sb.append("assignee");
        sb.append('=');
        sb.append(((this.assignee == null)?"<null>":this.assignee));
        sb.append(',');
        sb.append("updated");
        sb.append('=');
        sb.append(((this.updated == null)?"<null>":this.updated));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("components");
        sb.append('=');
        sb.append(((this.components == null)?"<null>":this.components));
        sb.append(',');
        sb.append("timeoriginalestimate");
        sb.append('=');
        sb.append(((this.timeoriginalestimate == null)?"<null>":this.timeoriginalestimate));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("customfield10010");
        sb.append('=');
        sb.append(((this.customfield10010 == null)?"<null>":this.customfield10010));
        sb.append(',');
        sb.append("customfield10014");
        sb.append('=');
        sb.append(((this.customfield10014 == null)?"<null>":this.customfield10014));
        sb.append(',');
        sb.append("customfield10015");
        sb.append('=');
        sb.append(((this.customfield10015 == null)?"<null>":this.customfield10015));
        sb.append(',');
        sb.append("customfield10005");
        sb.append('=');
        sb.append(((this.customfield10005 == null)?"<null>":this.customfield10005));
        sb.append(',');
        sb.append("customfield10006");
        sb.append('=');
        sb.append(((this.customfield10006 == null)?"<null>":this.customfield10006));
        sb.append(',');
        sb.append("security");
        sb.append('=');
        sb.append(((this.security == null)?"<null>":this.security));
        sb.append(',');
        sb.append("customfield10007");
        sb.append('=');
        sb.append(((this.customfield10007 == null)?"<null>":this.customfield10007));
        sb.append(',');
        sb.append("customfield10008");
        sb.append('=');
        sb.append(((this.customfield10008 == null)?"<null>":this.customfield10008));
        sb.append(',');
        sb.append("aggregatetimeestimate");
        sb.append('=');
        sb.append(((this.aggregatetimeestimate == null)?"<null>":this.aggregatetimeestimate));
        sb.append(',');
        sb.append("customfield10009");
        sb.append('=');
        sb.append(((this.customfield10009 == null)?"<null>":this.customfield10009));
        sb.append(',');
        sb.append("summary");
        sb.append('=');
        sb.append(((this.summary == null)?"<null>":this.summary));
        sb.append(',');
        sb.append("creator");
        sb.append('=');
        sb.append(((this.creator == null)?"<null>":this.creator));
        sb.append(',');
        sb.append("subtasks");
        sb.append('=');
        sb.append(((this.subtasks == null)?"<null>":this.subtasks));
        sb.append(',');
        sb.append("reporter");
        sb.append('=');
        sb.append(((this.reporter == null)?"<null>":this.reporter));
        sb.append(',');
        sb.append("aggregateprogress");
        sb.append('=');
        sb.append(((this.aggregateprogress == null)?"<null>":this.aggregateprogress));
        sb.append(',');
        sb.append("customfield10001");
        sb.append('=');
        sb.append(((this.customfield10001 == null)?"<null>":this.customfield10001));
        sb.append(',');
        sb.append("customfield10002");
        sb.append('=');
        sb.append(((this.customfield10002 == null)?"<null>":this.customfield10002));
        sb.append(',');
        sb.append("customfield10003");
        sb.append('=');
        sb.append(((this.customfield10003 == null)?"<null>":this.customfield10003));
        sb.append(',');
        sb.append("customfield10004");
        sb.append('=');
        sb.append(((this.customfield10004 == null)?"<null>":this.customfield10004));
        sb.append(',');
        sb.append("environment");
        sb.append('=');
        sb.append(((this.environment == null)?"<null>":this.environment));
        sb.append(',');
        sb.append("duedate");
        sb.append('=');
        sb.append(((this.duedate == null)?"<null>":this.duedate));
        sb.append(',');
        sb.append("progress");
        sb.append('=');
        sb.append(((this.progress == null)?"<null>":this.progress));
        sb.append(',');
        sb.append("votes");
        sb.append('=');
        sb.append(((this.votes == null)?"<null>":this.votes));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
