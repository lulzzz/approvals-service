package com.logistimo.approval.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.validation.constraints.Future;
import javax.validation.constraints.NotNull;
import lombok.Data;

/**
 * Created by nitisha.khandelwal on 10/05/17.
 */

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ApprovalRequest {

  @NotNull(message = "error.type.notnull")
  private String type;

  @NotNull(message = "error.typeId.notnull")
  private String typeId;

  @NotNull(message = "error.requesterId.notnull")
  private String requesterId;

  private Long sourceDomainId;

  private List<Long> domains;

  private String message;

  @Future
  @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss")
  private Date expireAt;

  private Map<String, String> attributes;

  private List<Approver> approvers;
}
