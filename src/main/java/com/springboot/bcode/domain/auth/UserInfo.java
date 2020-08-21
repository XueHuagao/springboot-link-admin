package com.springboot.bcode.domain.auth;

import java.util.Date;
import java.util.List;

import com.springboot.core.jdbc.annotation.Columns;
import com.springboot.core.jdbc.annotation.Tables;
import com.springboot.core.web.mvc.JqGridParam;

@Tables(table = "t_sys_user")
public class UserInfo extends JqGridParam {

	@Columns(column = "uid", primaryKey = true, autoIncrement = false)
	private String uid;
	@Columns(column = "name")
	private String name;
	@Columns(column = "password")
	private String password;
	@Columns(column = "vsername")
	private String vserName;
	@Columns(column = "mobile")
	private String mobile;
	@Columns(column = "createTime")
	private Date createTime;
	@Columns(column = "state")
	private Integer state;// 用户状态1:正常;0:禁用
	@Columns(column = "deptid")
	private Integer deptid;// 部门id
	@Columns(column = "jobid")
	private Integer jobid;// 岗位id
	@Columns(column = "email")
	private String email;
	private String avatar = "pic";
	private String introduction = "hello word";

	private String token;

	private Integer companyId;// 公司id
	private String companyName;// 部门对应的总节点部门（分公司，，集团）
	private String deptName;// 部门名称
	private String jobName;// 岗位名称
	// 角色
	private List<Role> roles;

	// 用户的菜单
	private List<MenuVO> menus;
	// 用户拥有的权限
	private List<Permission> permissions;

	// 数据权限范围（1：全部数据权限 2：自定数据权限 3：本部门及以下数据权限4：本部门数据权限 5：本人）
	private Integer datascopeType;
	// 户拥有的数据权限[用户id]
	private List<String> datascopes;

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getVserName() {
		return vserName;
	}

	public void setVserName(String vserName) {
		this.vserName = vserName;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getDeptid() {
		return deptid;
	}

	public void setDeptid(Integer deptid) {
		this.deptid = deptid;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public List<MenuVO> getMenus() {
		return menus;
	}

	public void setMenus(List<MenuVO> menus) {
		this.menus = menus;
	}

	public List<Permission> getPermissions() {
		return permissions;
	}

	public void setPermissions(List<Permission> permissions) {
		this.permissions = permissions;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public String getIntroduction() {
		return introduction;
	}

	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}

	public Integer getJobid() {
		return jobid;
	}

	public void setJobid(Integer jobid) {
		this.jobid = jobid;
	}

	public String getJobName() {
		return jobName;
	}

	public void setJobName(String jobName) {
		this.jobName = jobName;
	}

	public Integer getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public Integer getDatascopeType() {
		return datascopeType;
	}

	public void setDatascopeType(Integer datascopeType) {
		this.datascopeType = datascopeType;
	}

	public List<String> getDatascopes() {
		return datascopes;
	}

	public void setDatascopes(List<String> datascopes) {
		this.datascopes = datascopes;
	}

}
