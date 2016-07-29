package demo.model;

import java.util.List;

public class Node {
	private Integer id;

	private String name;

	private Integer folder;

	private Integer pid;

	private List<Node> children;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}

	public Integer getFolder() {
		return folder;
	}

	public void setFolder(Integer folder) {
		this.folder = folder;
	}

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public List<Node> getChildren() {
		return children;
	}

	public void setChildren(List<Node> children) {
		this.children = children;
	}

	@Override
	public String toString() {
		return this.id + "," + this.name;
	}
}