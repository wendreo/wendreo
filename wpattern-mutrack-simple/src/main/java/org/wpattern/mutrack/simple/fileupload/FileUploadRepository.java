package org.wpattern.mutrack.simple.fileupload;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FileUploadRepository extends JpaRepository<FileUpload, Long> {

	FileUpload findByFilename(String filename);

}
