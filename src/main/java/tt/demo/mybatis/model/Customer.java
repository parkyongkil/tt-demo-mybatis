package tt.demo.mybatis.model;

public class Customer {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column customer.id
	 * @mbggenerated  Fri Aug 12 01:10:08 KST 2016
	 */
	private String id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column customer.name
	 * @mbggenerated  Fri Aug 12 01:10:08 KST 2016
	 */
	private String name;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column customer.id
	 * @return  the value of customer.id
	 * @mbggenerated  Fri Aug 12 01:10:08 KST 2016
	 */
	public String getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column customer.id
	 * @param id  the value for customer.id
	 * @mbggenerated  Fri Aug 12 01:10:08 KST 2016
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column customer.name
	 * @return  the value of customer.name
	 * @mbggenerated  Fri Aug 12 01:10:08 KST 2016
	 */
	public String getName() {
		return name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column customer.name
	 * @param name  the value for customer.name
	 * @mbggenerated  Fri Aug 12 01:10:08 KST 2016
	 */
	public void setName(String name) {
		this.name = name;
	}
}