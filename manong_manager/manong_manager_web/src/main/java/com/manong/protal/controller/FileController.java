package com.manong.protal.controller;

import com.manong.fastdfs.FastDFSClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

/**
 * @Author: Topy
 * @Date: 2019/5/18 15:57
 */
@Controller
public class FileController {
    @RequestMapping(value = "uploadfile",method = RequestMethod.POST)
    @ResponseBody
    public String fileupload(@RequestParam MultipartFile uploadfile) throws IOException {
        String fileID = FastDFSClient.uploadFile(uploadfile.getInputStream(), uploadfile.getOriginalFilename());
        if(fileID != null){
            System.out.println("上传文件成功！");
        }
        return fileID ;
    }
}
