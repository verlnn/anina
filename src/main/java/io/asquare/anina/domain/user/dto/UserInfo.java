package io.asquare.anina.domain.user.dto;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
public class UserInfo {
    private String userId;
    private String userPassword;
    private String userName;
    private Date enterSiteDate;
    private Date terminateDate;

    private Boolean checkId;
    private Boolean matchInfo;

}
