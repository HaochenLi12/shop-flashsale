package cn.wolfcode.common.domain;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;


@Setter@Getter
public class UserInfo implements Serializable {
    private Long  phone;
    private String nickName;
    private String head;
    private String birthDay;
    private String info;
    private String loginIp;
}
