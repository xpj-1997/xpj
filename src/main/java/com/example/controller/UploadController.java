package com.example.controller;

import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URLEncoder;

/**
 * @Title javaProject
 * @Package com.example.controller
 * @ClassName UploadAction
 * @Author Lenovo
 * @Date 2021/5/24 下午 3:15:15
 * @Description TODO
 * @Version 1.0
 **/
@SuppressWarnings("all")
@Controller
@RequestMapping("/file")
public class UploadController {

    @RequestMapping("/upload")
    public String upload(
            MultipartFile upload,
            HttpServletRequest request
    ) throws IOException {
        String realPath = request.getRealPath("/upload");
        upload.transferTo(new File(realPath,upload.getOriginalFilename()));
        return "success";
    }

    @RequestMapping("/download")
    public String down(
            HttpServletRequest request,
            String fileName,
            HttpServletResponse response
    ) throws IOException {
        String realPath = request.getRealPath("/upload");
        FileInputStream stream = new FileInputStream(new File(realPath, fileName));
        ServletOutputStream out = response.getOutputStream();
        response.setHeader("content-disposition","attachment;fileName"+ URLEncoder.encode(fileName,"UTF-8"));
        IOUtils.copy(stream,out);
        IOUtils.closeQuietly(stream);
        IOUtils.closeQuietly(out);
        return "success";
    }
}
