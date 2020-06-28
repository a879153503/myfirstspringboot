package com.javaboy.example.fileupload;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

@RestController
public class FileuploadController {


    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

    @PostMapping("/uploads")
    public String uploads(MultipartFile[] files, HttpServletRequest req){

        String foramt = sdf.format(new Date());

        String realPath = req.getServletContext().getRealPath("/img/")+foramt;
        File folder = new File(realPath);

        if (!folder.exists()){
            folder.mkdirs();
        }

        for (MultipartFile file:files) {
            String oladName = file.getOriginalFilename();
            String newName = UUID.randomUUID().toString()+oladName.substring(oladName.lastIndexOf("."));
            try {
                file.transferTo(new File(folder,newName));
                String url = req.getScheme()+"://"+req.getServerName()+":"+req.getServerPort()+"/img/"+foramt+"/"+newName;
                System.out.println(url);
            }catch (IOException e){
                e.printStackTrace();
            }
        }
        return "success";
    }
}
