package cn.edu.xust.communication.enums;

/**
 * 设备状态枚举
 *
 * @author ：huangxin
 * @modified ：
 * @since ：2020/03/23 22:04
 */
public enum AmmeterStatusEnum {

    /**
     * 成功
     */
    OK(200, "SUCCESS"),

    /**
     *   网络故障
     */
    NETWORK_ERROR(400, "Network failure"),

    /**
     *  设备故障
     */
    DEVICE_ERROR(500, "Equipment failure");



    private final Integer code;
    private final String message;

    private AmmeterStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
