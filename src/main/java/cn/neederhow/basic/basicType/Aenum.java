package cn.neederhow.basic.basicType;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public enum Aenum {
    CLOUND("云计算",1),
    BIG_DATA("大数据",2),
    IOT("物联网",3),
    ICT("ICT专业",4),
    CARRIER_BUSINESS_SALES("运营商业务销售",5),
    COMMERCIAL_BUSINESS_SALES("商企业务销售",6),
    OVERSEAS_FRONTLINE("海外一线",7);

    private String name;
    private Integer code;

    private static final Map<String,Aenum> STRING_AENUM;
    private static final Map<Integer,Aenum> INTEGER_AENUM;

    private Aenum(String name, Integer code) {
        this.name = name;
        this.code = code;
    }

    static{
        Map<String,Aenum> str_map = new ConcurrentHashMap<String,Aenum>();
        Map<Integer,Aenum> int_map = new ConcurrentHashMap<Integer,Aenum>();
        for (Aenum a : values()){
            str_map.put(a.getName(),a);
            int_map.put(a.getCode(), a);
        }
        STRING_AENUM = str_map;
        INTEGER_AENUM = int_map;
    }

    public String getName() {
        return name;
    }

    public Integer getCode() {
        return code;
    }

    public static Aenum getElement(Object index){
        if (index instanceof String) {
            return STRING_AENUM.get(index);
        }else if (index instanceof Integer) {
            return INTEGER_AENUM.get(index);
        }
        return null;
    }	
}
