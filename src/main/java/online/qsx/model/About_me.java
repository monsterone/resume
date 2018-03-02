package online.qsx.model;

import java.io.Serializable;
import java.util.Date;

public class About_me implements Serializable {
    private Long id;

    private Date createtime;

    private String language;

    private String name;

    private String gender;

    private Date birthday;

    private String motto;

    private String residence;

    private String email;

    private String mobile;

    private String workingyears;

    private Long educationDegreeId;

    private Long workingStatusId;

    private String resumefile;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language == null ? null : language.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getMotto() {
        return motto;
    }

    public void setMotto(String motto) {
        this.motto = motto == null ? null : motto.trim();
    }

    public String getResidence() {
        return residence;
    }

    public void setResidence(String residence) {
        this.residence = residence == null ? null : residence.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getWorkingyears() {
        return workingyears;
    }

    public void setWorkingyears(String workingyears) {
        this.workingyears = workingyears == null ? null : workingyears.trim();
    }

    public Long getEducationDegreeId() {
        return educationDegreeId;
    }

    public void setEducationDegreeId(Long educationDegreeId) {
        this.educationDegreeId = educationDegreeId;
    }

    public Long getWorkingStatusId() {
        return workingStatusId;
    }

    public void setWorkingStatusId(Long workingStatusId) {
        this.workingStatusId = workingStatusId;
    }

    public String getResumefile() {
        return resumefile;
    }

    public void setResumefile(String resumefile) {
        this.resumefile = resumefile == null ? null : resumefile.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", createtime=").append(createtime);
        sb.append(", language=").append(language);
        sb.append(", name=").append(name);
        sb.append(", gender=").append(gender);
        sb.append(", birthday=").append(birthday);
        sb.append(", motto=").append(motto);
        sb.append(", residence=").append(residence);
        sb.append(", email=").append(email);
        sb.append(", mobile=").append(mobile);
        sb.append(", workingyears=").append(workingyears);
        sb.append(", educationDegreeId=").append(educationDegreeId);
        sb.append(", workingStatusId=").append(workingStatusId);
        sb.append(", resumefile=").append(resumefile);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}