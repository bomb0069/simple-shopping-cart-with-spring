package com.bomb0069.shopping.product;

public class ProductErrorResponse {
    Integer productId;
    String errorCode = "PD00001";
    String errorMessage = "Product Not Found at ID : ";

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public ProductErrorResponse() {
    }

    public ProductErrorResponse(Integer productId) {
        this.productId = productId;
    }

    @Override
    public boolean equals(Object product) {

        if (product == this)
            return true;

        if (!(product instanceof ProductErrorResponse))
            return false;

        ProductErrorResponse productResponse = (ProductErrorResponse) product;

        return productResponse.getProductId() == this.getProductId();
    }

    @Override
    public int hashCode() {
        return productId != null ? productId.hashCode() : 0;
    }

    @Override
    public String toString() {
        return getErrorMessage() + getProductId();
    }
}
