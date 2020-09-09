//■ https://blog.okazuki.jp/entry/2015/07/17/202941

package com.example.domain;

import org.springframework.web.multipart.MultipartFile;

public class FileUploadForm {
    private MultipartFile fileData;

    public MultipartFile getFileData() {
        return fileData;
    }

    public void setFileData(MultipartFile fileData) {
        this.fileData = fileData;
    }

}