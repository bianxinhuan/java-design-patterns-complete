/**
 * 猫砂盆
 *
 * @author bianxinhuan
 */
public class CatLitterBox {

    /**
     * 产品名称
     */
    private String productName;

    /**
     * 型号
     */
    private String model;

    /**
     * 商标
     */
    private String brandName;

    /**
     * 材料
     */
    private String material;

    /**
     * 大小
     */
    private String size;

    /**
     * 包装大小
     */
    private String packageSize;

    /**
     * 颜色
     */
    private String color;

    private CatLitterBox(Builder builder) {
        this.productName = builder.productName;
        this.model = builder.model;
        this.brandName = builder.brandName;
        this.material = builder.material;
        this.size = builder.size;
        this.packageSize = builder.packageSize;
        this.color = builder.color;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getPackageSize() {
        return packageSize;
    }

    public void setPackageSize(String packageSize) {
        this.packageSize = packageSize;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static class Builder {
        private String productName;
        private String model;
        private String brandName;
        private String material;
        private String size;
        private String packageSize;
        private String color;

        public Builder(String productName) {
            if (productName == null) {
                throw new IllegalArgumentException("productName and model can not be null");
            }
            this.productName = productName;
        }

        public Builder model(String model) {
            this.model = model;
            return this;
        }

        public Builder brandName(String brandName) {
            this.brandName = brandName;
            return this;
        }

        public Builder material(String material) {
            this.material = material;
            return this;
        }

        public Builder size(String size) {
            this.size = size;
            return this;
        }

        public Builder packageSize(String packageSize) {
            this.packageSize = packageSize;
            return this;
        }

        public Builder color(String color) {
            this.color = color;
            return this;
        }

        public CatLitterBox build() {
            return new CatLitterBox(this);
        }
    }
}
