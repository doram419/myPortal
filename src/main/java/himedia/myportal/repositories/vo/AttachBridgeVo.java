package himedia.myportal.repositories.vo;

public class AttachBridgeVo {
	// field
	private Long postNo;
	private Long attachNo;
	
	// constructor
	public AttachBridgeVo() {
	}

	public AttachBridgeVo(Long postNo, Long attachNo) {
		super();
		this.postNo = postNo;
		this.attachNo = attachNo;
	}
	
	// Getters / Setters
	public Long getPostNo() {
		return postNo;
	}

	public void setPostNo(Long postNo) {
		this.postNo = postNo;
	}

	public Long getAttachNo() {
		return attachNo;
	}

	public void setAttachNo(Long attachNo) {
		this.attachNo = attachNo;
	}

	// toString
	@Override
	public String toString() {
		return "AttachBridgeVo [postNo=" + postNo + ", attachNo=" + attachNo + "]";
	}
	
	
	
}
