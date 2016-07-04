package md5698d32be5405b5d2b10017c1999016ac;


public class ToDoItemWrapper
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("ActiveDisco.ToDoItemWrapper, ActiveDisco, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", ToDoItemWrapper.class, __md_methods);
	}


	public ToDoItemWrapper () throws java.lang.Throwable
	{
		super ();
		if (getClass () == ToDoItemWrapper.class)
			mono.android.TypeManager.Activate ("ActiveDisco.ToDoItemWrapper, ActiveDisco, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
