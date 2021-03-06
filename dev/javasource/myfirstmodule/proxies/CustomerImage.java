// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package myfirstmodule.proxies;

public class CustomerImage extends system.proxies.Image
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "MyFirstModule.CustomerImage";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		FileType("FileType"),
		PublicThumbnailPath("PublicThumbnailPath"),
		FileID("FileID"),
		Name("Name"),
		DeleteAfterDownload("DeleteAfterDownload"),
		Contents("Contents"),
		HasContents("HasContents"),
		CustomerImage_Customer("MyFirstModule.CustomerImage_Customer");

		private java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public CustomerImage(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "MyFirstModule.CustomerImage"));
	}

	protected CustomerImage(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject customerImageMendixObject)
	{
		super(context, customerImageMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("MyFirstModule.CustomerImage", customerImageMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a MyFirstModule.CustomerImage");
	}

	/**
	 * @deprecated Use 'CustomerImage.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static myfirstmodule.proxies.CustomerImage initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return myfirstmodule.proxies.CustomerImage.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.getSudoContext() can be used to obtain sudo access).
	 */
	public static myfirstmodule.proxies.CustomerImage initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new myfirstmodule.proxies.CustomerImage(context, mendixObject);
	}

	public static myfirstmodule.proxies.CustomerImage load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return myfirstmodule.proxies.CustomerImage.initialize(context, mendixObject);
	}

	public static java.util.List<myfirstmodule.proxies.CustomerImage> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<myfirstmodule.proxies.CustomerImage> result = new java.util.ArrayList<myfirstmodule.proxies.CustomerImage>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//MyFirstModule.CustomerImage" + xpathConstraint))
			result.add(myfirstmodule.proxies.CustomerImage.initialize(context, obj));
		return result;
	}

	/**
	 * @return value of FileType
	 */
	public final String getFileType()
	{
		return getFileType(getContext());
	}

	/**
	 * @param context
	 * @return value of FileType
	 */
	public final String getFileType(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.FileType.toString());
	}

	/**
	 * Set value of FileType
	 * @param filetype
	 */
	public final void setFileType(String filetype)
	{
		setFileType(getContext(), filetype);
	}

	/**
	 * Set value of FileType
	 * @param context
	 * @param filetype
	 */
	public final void setFileType(com.mendix.systemwideinterfaces.core.IContext context, String filetype)
	{
		getMendixObject().setValue(context, MemberNames.FileType.toString(), filetype);
	}

	/**
	 * @return value of CustomerImage_Customer
	 */
	public final myfirstmodule.proxies.Customer getCustomerImage_Customer() throws com.mendix.core.CoreException
	{
		return getCustomerImage_Customer(getContext());
	}

	/**
	 * @param context
	 * @return value of CustomerImage_Customer
	 */
	public final myfirstmodule.proxies.Customer getCustomerImage_Customer(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		myfirstmodule.proxies.Customer result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.CustomerImage_Customer.toString());
		if (identifier != null)
			result = myfirstmodule.proxies.Customer.load(context, identifier);
		return result;
	}

	/**
	 * Set value of CustomerImage_Customer
	 * @param customerimage_customer
	 */
	public final void setCustomerImage_Customer(myfirstmodule.proxies.Customer customerimage_customer)
	{
		setCustomerImage_Customer(getContext(), customerimage_customer);
	}

	/**
	 * Set value of CustomerImage_Customer
	 * @param context
	 * @param customerimage_customer
	 */
	public final void setCustomerImage_Customer(com.mendix.systemwideinterfaces.core.IContext context, myfirstmodule.proxies.Customer customerimage_customer)
	{
		if (customerimage_customer == null)
			getMendixObject().setValue(context, MemberNames.CustomerImage_Customer.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.CustomerImage_Customer.toString(), customerimage_customer.getMendixObject().getId());
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final myfirstmodule.proxies.CustomerImage that = (myfirstmodule.proxies.CustomerImage) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return "MyFirstModule.CustomerImage";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@Override
	@Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
