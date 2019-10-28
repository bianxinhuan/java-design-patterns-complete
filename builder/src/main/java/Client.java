import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * -
 *
 * @author bianxinhuan
 */
public class Client {

    public static void main(String[] args) {
        CatLitterBox catLitterBox = new CatLitterBox.Builder("奶猫猫砂盆")
                .model("BS-001")
                .brandName("BS")
                .material("PP塑料")
                .color("粉色")
                .size("53*39*13cm")
                .packageSize("57*40*55cm")
                .build();

        System.out.println(ToStringBuilder.reflectionToString(catLitterBox, ToStringStyle.MULTI_LINE_STYLE));
    }
}
