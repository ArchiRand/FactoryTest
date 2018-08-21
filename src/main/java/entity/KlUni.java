package entity;

public class KlUni {
    private Integer type;
    private Integer code;

    public KlUni(Integer type, Integer code) {
        this.type = type;
        this.code = code;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "KlUni{" +
                "type=" + type +
                ", code=" + code +
                '}';
    }
}
