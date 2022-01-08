package com.example.demo.log;


import io.micrometer.core.instrument.util.StringUtils;

public class BasicException extends BaseException {

    private static final long serialVersionUID = 9143103492388704120L;

    public BasicException(BasicExceptionEnum ex) {
        this.code = ex.getKey();
        this.msg = ex.getValue();
    }

    public BasicException(String message) {
        this.code = ServiceConstants.RES_SYSTEM_ERROR_CODE;
        this.msg = message;
    }

    public BasicException(String code, String message) {
        this.code = code;
        this.msg = message;
    }

    @Override
    public String getMsg() {
        if (StringUtils.isNotEmpty(super.getMsg())) {
            return super.getMsg();
        } else {
            return BasicExceptionEnum.getByKey(this.code).getValue();
        }
    }

    @Override
    public String getMessage() {
        if (StringUtils.isNotEmpty(this.msg)) {
            return this.msg;
        } else {
          //  return BaseCoreExceptionEnum.getByKey(this.code).getValue();
            return null;
        }
    }
}
