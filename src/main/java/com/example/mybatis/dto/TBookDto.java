package com.example.mybatis.dto;

import com.example.mybatis.entity.TBook;
import com.example.mybatis.entity.TImage;

/**
 * @Author zp
 * @create 2019/11/22 15:15
 */
public class TBookDto extends TBook {
    // 如果定义为一个对象，则驼峰设置不会生效，xml里需要写resultMap
    private TImage image;

    public TImage getImage() {
        return image;
    }

    public void setImage(TImage image) {
        this.image = image;
    }
}
