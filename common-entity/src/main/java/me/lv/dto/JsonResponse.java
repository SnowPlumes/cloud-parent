package me.lv.dto;

/**
 * @author lv
 */
public class JsonResponse {

    private Integer code;
    private String msg;
    private Object results;

    public JsonResponse() {
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getResults() {
        return results;
    }

    public void setResults(Object results) {
        this.results = results;
    }

    @Override
    public String toString() {
        return "JsonResponse{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", results=" + results +
                '}';
    }
}
