package org.wpattern.mutrack.simple.fileupload;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.Table;

import org.wpattern.mutrack.simple.utils.BaseEntity;


@Entity
@Table(name = "tb_file_upload")
@AttributeOverride(name = "id", column = @Column(name = "id_file_upload") )
public class FileUpload extends BaseEntity<Long> {


	//private static final long serialVersionUID = 1L;
	private static final long serialVersionUID = 201505091506L;

	@Column(name = "tb_filename", nullable = true)
	String filename; 
	@Lob
	private byte[] file;
	
	@Column(name = "mime_type", nullable = true)
	private String mimeType;

	public FileUpload() {

	}
	
	

	


	public FileUpload(String filename, byte[] file, String mimeType) {
		super();
		this.filename = filename;
		this.file = file;
		this.mimeType = mimeType;
	}






	public String getFilename() {
		return filename;
	}



	public void setFilename(String filename) {
		this.filename = filename;
	}





	public byte[] getFile() {
		return file;
	}

	public void setFile(byte[] file) {
		this.file = file;
	}

	public String getMimeType() {
		return mimeType;
	}

	public void setMimeType(String mimeType) {
		this.mimeType = mimeType;
	}

	

}
