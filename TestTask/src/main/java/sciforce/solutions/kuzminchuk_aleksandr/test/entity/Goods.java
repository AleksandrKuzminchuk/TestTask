package sciforce.solutions.kuzminchuk_aleksandr.test.entity;

public class Goods {

	private String productUuid;
	private String productName;
	private int amount;

	public Goods() {
		super();
	}

	public String getProductUuid() {
		return productUuid;
	}

	public void setProductUuid(String productUuid) {
		this.productUuid = productUuid;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + amount;
		result = prime * result + ((productName == null) ? 0 : productName.hashCode());
		result = prime * result + ((productUuid == null) ? 0 : productUuid.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Goods other = (Goods) obj;
		if (amount != other.amount)
			return false;
		if (productName == null) {
			if (other.productName != null)
				return false;
		} else if (!productName.equals(other.productName))
			return false;
		if (productUuid == null) {
			if (other.productUuid != null)
				return false;
		} else if (!productUuid.equals(other.productUuid))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "[productUuid=" + productUuid + ", productName=" + productName + ", amount=" + amount + "]";
	}
	
	

}
