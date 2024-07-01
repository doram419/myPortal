package himedia.myportal.repositories.vo;

public class AttachVo {
	// field
	private Long no;
	private Long postNo;
	private String fileName;
	
	// constructor
	public AttachVo() {
	}

	public AttachVo(Long postNo, String fileName) {
		super();
		this.postNo = postNo;
		this.fileName = fileName;
	}

	public AttachVo(Long no, Long postNo, String fileName) {
		super();
		this.no = no;
		this.postNo = postNo;
		this.fileName = fileName;
	}
	
	// Getters/Setters
	public Long getNo() {
		return no;
	}

	public void setNo(Long no) {
		this.no = no;
	}

	public Long getPostNo() {
		return postNo;
	}

	public void setPostNo(Long postNo) {
		this.postNo = postNo;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	// toString()
	@Override
	public String toString() {
		return "AttachVo [no=" + no + ", postNo=" + postNo + ", fileName=" + fileName + "]";
	}
	
	
}
