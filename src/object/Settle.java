package object;

import java.util.Objects;

public class Settle {
	private String bssecName;
	private String businessTypeClassName;
	private String projectName;
	private long index;
	private String region;

	public String getBssecName() {
		return bssecName;
	}

	public void setBssecName(String bssecName) {
		this.bssecName = bssecName;
	}

	public String getBusinessTypeClassName() {
		return businessTypeClassName;
	}

	public void setBusinessTypeClassName(String businessTypeClassName) {
		this.businessTypeClassName = businessTypeClassName;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public long getIndex() {
		return index;
	}

	public void setIndex(long index) {
		this.index = index;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public Settle() {
	}

	public String getBssecNameNullEmpty() {
		if (Objects.isNull(getBssecName())) {
			return "";
		}
		return getBssecName();
	}

	public String getBusinessTypeClassNameNullEmpty() {
		if (Objects.isNull(getBusinessTypeClassName())) {
			return "";
		}
		return getBusinessTypeClassName();
	}

	public String getRegionNullEmpty() {
		if (Objects.isNull(getRegion())) {
			return "";
		}
		return getRegion();
	}

	@Override
	public String toString() {
		return "事業所：" + getBssecName() + " 事業中分類：" + getBusinessTypeClassName()
				+ " 収益認識基準：" + getRegion() + " 表示順：" + getIndex();
	}
}
